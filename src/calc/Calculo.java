package calc;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import view.ViewCalculo;

public class Calculo {

	public void calculoConsumoEnergia(double potencia, double tempoUso, double precoKwh, String nomeItem) {
		try {
			double consumoDiario = (potencia / 1000.0) * tempoUso * precoKwh;
			double consumoMensal = consumoDiario * 30.0;
			double consumoSeisMeses = consumoDiario * 60.0;
			double consumoAnual = consumoSeisMeses * 2;

			DecimalFormat formatoMoeda = new DecimalFormat("#.##");
			String valorMensalFormatado = formatoMoeda.format(consumoMensal);
			String valorSemestreFormatado = formatoMoeda.format(consumoSeisMeses);
			String valorAnualFormatado = formatoMoeda.format(consumoAnual);

			JOptionPane.showMessageDialog(null,
					"O item " + nomeItem + "\nPossui os seguintes consumos com o valor aproximado\r\n"
							+ "Consumo Mensal R$ " + valorMensalFormatado + "\nConsumo Semestral R$ "
							+ valorSemestreFormatado + "\nConsumo Anual R$ " + valorAnualFormatado);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos.");
		}
	}

}
