package net.ddns.poseidonserver.todolist.user;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;
import java.time.LocalDateTime;

/*
 * após colocar dependencia lombok marven no pom.xml
 * Só getter @Getter
 * Só setter @Setter
 * @Data (Ambos)
 * Obs.: da para por em cima das variaveis 
 * o que eles sao caso queira colocar um para cada
 */
@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createAt;

}
