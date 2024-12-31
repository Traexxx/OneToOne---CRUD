package com.onetoone.onetoone.model.pessoa;

import com.onetoone.onetoone.model.endereco.EnderecoModel;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pessoa")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class PessoaModel {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") 
    private Long id;

    private String nome;
    private String idade;
    

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private EnderecoModel endereco;


    public PessoaModel(String nome, String idade, EnderecoModel endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

}
