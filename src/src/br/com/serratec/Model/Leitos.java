package br.com.serratec.Model;

public class Leitos {
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
    public void setStatus(String Status) {
        this.status = status;
    }
    public String toString() {
        return "Id: " + idLeito + " | Status: " + status;
    }
}
