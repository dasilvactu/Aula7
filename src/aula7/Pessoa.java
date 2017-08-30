/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

/**
 *
 * @author ice
 */
public class Pessoa {
    private int idade;
    private String nome;

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        String saida = "Nome: "+this.nome+ " / Idade: "+this.idade;
        return saida;
    }
    
    
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
