package com.onetoone.onetoone.model.endereco;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "endereco")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")


public class EnderecoModel {

    // Substituir por Forkey
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String rua;
    private String numero;
    private String regiao;


    public EnderecoModel(String rua, String numero, String regiao) {
        this.rua = rua;
        this.numero = numero;
        this.regiao = regiao;
    }
}
