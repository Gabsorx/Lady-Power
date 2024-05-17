package start.ladypower.dto;

import javax.swing.text.html.parser.Entity;

import start.ladypower.models.Agressor;

@SuppressWarnings("unused")
public class AgressorDTO {

    private long id;
    private String nome;
    private Integer idade;
    private String endereco;

    public AgressorDTO() {
    }


    public AgressorDTO(long id, String nome, Integer idade, String endereco) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }



    public AgressorDTO(Agressor agressor) {
        this.id = agressor.getId();
        this.nome = agressor.getNome();
        this.idade = agressor.getIdade();
        this.endereco = agressor.getEndereco();
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Integer getIdade() {
        return idade;
    }


    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    
    
}
