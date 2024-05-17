package start.ladypower.dto;


import start.ladypower.models.Vitima;

public class VitimaDTO {

        private Long id;
        private String nome;
        private int idade;

        
        public VitimaDTO() {
        }


        public VitimaDTO(Long id, String nome, int idade) {
            this.id = id;
            this.nome = nome;
            this.idade = idade;
        }
        
        public VitimaDTO(Vitima vitima) {
            this.id = vitima.getId();
            this.nome = vitima.getNome();
            this.idade = vitima.getIdade();
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

}
