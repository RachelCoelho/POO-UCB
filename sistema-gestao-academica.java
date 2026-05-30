package classes; 

public class Professor extends Pessoa {
    
    private int idProfessor;
    private String especialidade; 

    public Professor() {
        super(); 
    }

    public Professor(int idProfessor, String nome, String email, String especialidade) {
      
        super(); 
        this.setNome(nome);
        this.setEmail(email);
        
        this.idProfessor = idProfessor;
        this.especialidade = especialidade;
    }

  
    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    @Override
    public String toString() {
        return "Professor{" +
                "idProfessor=" + idProfessor +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
