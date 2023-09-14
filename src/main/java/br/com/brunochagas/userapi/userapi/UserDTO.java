package br.com.brunochagas.userapi.userapi;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    
    private String nome;
    private String cpf;
    private String endereço;
    private String email;
    private String telefone;
    private LocalDate dadaCadastro;
}
