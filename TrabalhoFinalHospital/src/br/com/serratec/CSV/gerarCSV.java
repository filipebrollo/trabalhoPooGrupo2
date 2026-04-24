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

            writer.append("Paciente;Valor;ISS;PIS;COFINS;IRPJ;CSLL\n");

            writer.append(nota.getPaciente().getNome() + ";");
            writer.append(nota.getValor().setScale(2, java.math.RoundingMode.HALF_UP) + ";");
            writer.append(nota.valorISS().setScale(2, java.math.RoundingMode.HALF_UP) + ";");
            writer.append(nota.valorPIS().setScale(2, java.math.RoundingMode.HALF_UP) + ";");
            writer.append(nota.valorCOFINS().setScale(2, java.math.RoundingMode.HALF_UP) + ";");
            writer.append(nota.valorIRPJ().setScale(2, java.math.RoundingMode.HALF_UP) + ";");
            writer.append(nota.valorCSLL().setScale(2, java.math.RoundingMode.HALF_UP) + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}