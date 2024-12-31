package com.onetoone.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.onetoone.onetoone.model.endereco.EnderecoModel;
import com.onetoone.onetoone.model.pessoa.AtulizarPessoa;
import com.onetoone.onetoone.model.pessoa.PessoaModel;
import com.onetoone.onetoone.model.pessoa.PessoaRepository;

import jakarta.transaction.Transactional;

@Controller()

public class PessoaController {
    
    @Autowired
    private PessoaRepository repository;
    
    @GetMapping("/")
    public String listaPessoa(Model model) {
        model.addAttribute("pessoas", repository.findAll());
        PessoaModel pessoa = new PessoaModel();
        
        model.addAttribute("pessoa", new PessoaModel());
        pessoa.setEndereco(new EnderecoModel());
        return "lista";
    }

    @PostMapping("/")
    @Transactional

    public String cadastrar(PessoaModel pessoa) {
        repository.save(pessoa);
        return "redirect:/";
    }

    @PutMapping("/atualizar/{id}")
    @Transactional
    public String editar(@PathVariable Long id, @ModelAttribute AtulizarPessoa dados) {
        PessoaModel pessoa = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Pessoa não encontrada com ID: " + id));
        
        pessoa.setIdade(dados.idade());
        pessoa.setNome(dados.nome());

        EnderecoModel endereco = pessoa.getEndereco();
        endereco.setRua(dados.endereco().rua());
        endereco.setNumero(dados.endereco().numero());
        endereco.setRegiao(dados.endereco().regiao());

        repository.save(pessoa);
        return "redirect:/";
    }


    @DeleteMapping("/deletar/{id}")
    @Transactional
        public String deletar(@PathVariable Long id){
            repository.deleteById(id);  
            return "redirect:/";
        }
    
    
    
}
