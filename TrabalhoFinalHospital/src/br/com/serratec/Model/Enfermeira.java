package br.com.serratec.Model;

import br.com.serratec.Enumerate.Turno;

public class Enfermeira extends Pessoa {
    private Integer cre;
    private Turno turno;
    private Enfermeira enfChefe;

    public Integer getCre() {
        return cre;
    }
    public void setCre(Integer cre) {
        this.cre = cre;
    }
    public Turno getTurno() {
        return turno;
    }
    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    public Enfermeira getChefe() {
        return enfChefe;
    }
    public void setEnfSup(Enfermeira enfChefe){
        this.enfChefe = enfChefe;
    }
    @Override
    public String getDescricao() {
        return "Enfermeira: " + nome + " | CRE: " +
                cre + " | Turno: " + turno + " | Enfermeira Chefe: " + enfChefe;
    }
}
