package br.com.serratec.Model;

public class Ala {
    private Integer idAla;
    private String tipo;
    private Enfermeira enfChefe;
    private Integer nLeitos;

    public Integer getIdAla() {
        return idAla;
    }
    public void setIdAla(Integer idAla) {
        this.idAla = idAla;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Enfermeira getEnfChefe() {
        return enfChefe;
    }
    public void setEnfChefe(Enfermeira enfChefe) {
        this.enfChefe = enfChefe;
    }
    public Integer getNLeitos() {
        return nLeitos;
    }
    public void setNLeitos(Integer nLeitos) {
        this.nLeitos = nLeitos;
    }

    public String toString() {
        return "id: " + idAla + " | tipo: " + tipo +
               " | idEnf: " + enfChefe.getNome() + " | nLeitos: " + nLeitos;
    }
}
