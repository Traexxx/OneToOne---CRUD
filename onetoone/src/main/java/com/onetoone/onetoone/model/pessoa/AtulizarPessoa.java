package com.onetoone.onetoone.model.pessoa;

import com.onetoone.onetoone.model.endereco.AtualizarEndereco;

public record AtulizarPessoa(
    Long id,
    String nome,
    String idade,
    AtualizarEndereco endereco



) {
    
}
