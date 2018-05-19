
package projetolivro;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public void FazerAniver(){
        this.idade++;
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
}
