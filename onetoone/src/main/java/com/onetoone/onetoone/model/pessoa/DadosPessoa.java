package com.onetoone.onetoone.model.pessoa;

import com.onetoone.onetoone.model.endereco.EnderecoModel;

public record DadosPessoa(
    String nome,
    String idade,
    EnderecoModel endereco 
) {
    
}
