package start.ladypower.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "agressor")
public class Agressor {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private int idade;
        private String endereco;


        public Agressor() {
        }


        
        public Agressor(Long id, String nome, int idade, String endereco) {
            this.id = id;
            this.nome = nome;
            this.idade = idade;
            this.endereco = endereco;
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
        public int getIdade() {
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
        public String getEndereco() {
            return endereco;
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
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
            Agressor other = (Agressor) obj;
            if (id == null) {
                if (other.id != null)
                    return false;
            } else if (!id.equals(other.id))
                return false;
            return true;
        }
    
    
        
}
    

