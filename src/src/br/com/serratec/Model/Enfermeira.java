package br.com.serratec.Model;

public class Enfermeira extends Pessoa {
    private Integer cre;
    private String turno;
    private Enfermeira enfChefe;

    public Integer getCre() {
        return cre;
    }
    public void setCre(Integer cre) {
        this.cre = cre;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public Enfermeira getChefe() {
        return enfChefe;
    }
    public void setChefe(Enfermeira enfChefe){
        this.enfChefe = enfChefe;
    }
    @Override
    public String getDescricao() {
        return "Enfermeira: " + nome + " | CRE: " +
                cre + " | Turno: " + turno;
    }
}
