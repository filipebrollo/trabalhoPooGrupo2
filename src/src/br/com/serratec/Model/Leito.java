package br.com.serratec.Model;

import br.com.serratec.Enumerate.StatusLeito;

public class Leito {
    private Integer idLeito;
    private StatusLeito status;
    private Ala ala;

    public Integer getIdLeito() {
        return idLeito;
    }
    public void setIdLeito(Integer idLeito) {
        this.idLeito = idLeito;
    }
    public StatusLeito getStatus() {
        return status;
    }
    public void setStatus(StatusLeito Status) {
        this.status = status;
    }
    public Ala getAla() { return  ala; }
    public void setAla(Ala ala) { this.ala = ala; }
    @Override
    public String toString() {
        return "Id: " + idLeito + " | Status: " + status + " | Ala: " + ala;
    }
}
