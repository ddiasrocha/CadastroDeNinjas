package dev.java10x.cadastroDeNinjas.Ninja.Controller;

import dev.java10x.cadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity //transforma uma classe em uma entidade de um Banco de Dados... JPA é Java Persistence API
@Table(name = "tb_cadastro")
@NoArgsConstructor //Criar um construtor sem argumentos
@AllArgsConstructor //Criar um construtor com todos os argumentos
@Data   //Cria os Getters e Setters
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing Key ou Chave Estrangeira
    private MissoesModel missoes;//@ManyToOne um ninja pode ter uma unica missão, e uma missão pode ter diferentes ninjas



    /*
    public NinjaModel(){

    }

    public NinjaModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public NinjaModel(Long id, String nome, String email, int idade, MissoesModel missoes) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.missoes = missoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MissoesModel getMissoes() {
        return missoes;
    }

    public void setMissoes(MissoesModel missoes) {
        this.missoes = missoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    } */

}
