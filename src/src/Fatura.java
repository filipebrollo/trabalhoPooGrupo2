import java.math.BigDecimal;

public class Fatura {
    private Integer id;
    private BigDecimal valor;
    private Integer idPaciente;

    public Fatura() {}

    public int getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public Integer getIdPaciente() {
        return idPaciente;
    }
    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
