package br.com.dominiodaempresa.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users") //"ORM" que cria tal tabela no banco
//@Getter
//@Setter
public class UserModel {

    @Id //Define atributo como chave primária
    @GeneratedValue(generator = "UUID")
    private UUID id;

    //@Column(name = "usuario")
    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
