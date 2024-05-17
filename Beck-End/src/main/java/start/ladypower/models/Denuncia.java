package start.ladypower.models;

import java.time.LocalDate;

import jakarta.persistence.Id;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "denuncia")
public class Denuncia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;
    private String endereco;

    @ManyToOne(cascade = CascadeType.ALL)
    private Agressor agressor;

    @ManyToOne(cascade = CascadeType.ALL)
    private Vitima vitima;
    private LocalDate data;
    private String descricao;
    
    public Denuncia() {
    }

    public Denuncia(Long id, String nome, Integer idade, String endereco, Agressor agressor, Vitima vitima,
            LocalDate data, String descricao) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.agressor = agressor;
        this.vitima = vitima;
        this.data = data;
        this.descricao = descricao;
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

    public Agressor getAgressor() {
        return agressor;
    }

    public void setAgressor(Agressor agressor) {
        this.agressor = agressor;
    }

    public Vitima getVitima() {
        return vitima;
    }

    public void setVitima(Vitima vitima) {
        this.vitima = vitima;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Denuncia other = (Denuncia) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
        
    }

