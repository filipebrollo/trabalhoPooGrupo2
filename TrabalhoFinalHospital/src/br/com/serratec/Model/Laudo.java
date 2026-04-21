package br.com.serratec.Model;

public class Laudo {
    private Integer idLaudo;
    private String arquivo;
    private Exame exame;

    public Integer getIdLaudo() { return idLaudo; }
    public void setIdLaudo(Integer idLaudo) { this.idLaudo = idLaudo; }
    public String getArquivo() { return arquivo; }
    public void setArquivo(String arquivo) { this.arquivo = arquivo; }
    public Exame getExame() { return exame; }
    public void setExame(Exame exame) { this.exame = exame; }

    @Override
    public String toString() {
        return "Id: " + idLaudo + "\nArquivo: " + arquivo + "\nExame: " + exame;
    }

}
