package br.com.serratec.Model;

import java.math.BigDecimal;

public interface ImpostoCalculado {

    public BigDecimal valorISS();

    public BigDecimal valorPIS();

    public BigDecimal valorCOFINS();

    public BigDecimal valorIRPJ();

    public BigDecimal valorCSLL();

}
