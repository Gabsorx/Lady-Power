package start.ladypower.dto;

import java.time.LocalDate;

import start.ladypower.models.Denuncia;

public class DenunciaDTO {

    private Long id;
    private String nome;
    private String endereco;
    private LocalDate data;
    private String descricao;

    public DenunciaDTO() {
    }

    public DenunciaDTO(Long id, String nome, String endereco, LocalDate data, String descricao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.data = data;
        this.descricao = descricao;
    }

    public DenunciaDTO(Denuncia denuncia) {
        this.id = denuncia.getId();
        this.nome = denuncia.getNome();
        this.endereco = denuncia.getEndereco();
        this.data = denuncia.getData();
        this.descricao = denuncia.getDescricao();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    
}
