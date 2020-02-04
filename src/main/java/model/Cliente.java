package model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String telefone;

    private LocalDate nascimento;

    private Long getId() {
        return id;
    }

    private void setId(final Long id) {
        this.id = id;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(final String nome) {
        this.nome = nome;
    }

    private String getTelefone() {
        return telefone;
    }

    private void setTelefone(final String telefone) {
        this.telefone = telefone;
    }

    private LocalDate getNascimento() {
        return nascimento;
    }

    private void setNascimento(final LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}
