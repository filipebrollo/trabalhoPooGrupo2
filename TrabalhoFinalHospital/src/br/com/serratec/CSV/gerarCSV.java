package br.com.serratec.CSV;

import br.com.serratec.Model.NotaFiscal;

import java.io.FileWriter;
import java.io.IOException;
import java.math.RoundingMode;

public class gerarCSV {

    public static void imprimirCSV(NotaFiscal nota) {

        String caminho = "nota_fiscal_" + nota.getFatura().getPaciente().getNome()+";" + nota.getFatura().getValor()+";"
                + nota.valorISS().setScale(2, java.math.RoundingMode.HALF_UP)+";"
                + nota.valorPIS().setScale(2, java.math.RoundingMode.HALF_UP)+";"
                + nota.valorCOFINS().setScale(2, java.math.RoundingMode.HALF_UP)+";"
                + nota.valorIRPJ().setScale(2, java.math.RoundingMode.HALF_UP)+";"
                + nota.valorCSLL().setScale(2, java.math.RoundingMode.HALF_UP)+";"+ ".csv";

        try (FileWriter writer = new FileWriter(caminho)) {

            writer.append("sep=;\n");

            writer.append("Nome do paciente;" + nota.getPaciente().getNome() + "\n");
            writer.append("Valor da nota;" + nota.getValor().setScale(2, RoundingMode.HALF_UP) + "\n");
            writer.append("ISS;" + nota.valorISS().setScale(2, RoundingMode.HALF_UP) + "\n");
            writer.append("PIS;" + nota.valorPIS().setScale(2, RoundingMode.HALF_UP) + "\n");
            writer.append("COFINS;" + nota.valorCOFINS().setScale(2, RoundingMode.HALF_UP) + "\n");
            writer.append("IRPJ;" + nota.valorIRPJ().setScale(2, RoundingMode.HALF_UP) + "\n");
            writer.append("CSLL;" + nota.valorCSLL().setScale(2, RoundingMode.HALF_UP) + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}