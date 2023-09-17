package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import calc.Calculo;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class ViewCalculo extends JFrame {
	private JTextField txtItem;
	private JTextField txtPotencia;
	private JTextField txtValorKwh;
	private JTextField txtTempoUso;

	public ViewCalculo() {
		getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		setTitle("Calculadora");
		getContentPane().setLayout(null);

		JPanel mainPanelCalc = new JPanel();
		mainPanelCalc.setBounds(0, 0, 434, 60);
		mainPanelCalc.setBackground(UIManager.getColor("ComboBox.selectionBackground"));
		getContentPane().add(mainPanelCalc);
		mainPanelCalc.setLayout(null);

		JLabel lbCalculadora = new JLabel("Calculadora");
		lbCalculadora.setForeground(UIManager.getColor("ComboBox.buttonBackground"));
		lbCalculadora.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		lbCalculadora.setBounds(64, 22, 148, 27);
		mainPanelCalc.add(lbCalculadora);

		JLabel lbItens = new JLabel("Item:");
		lbItens.setToolTipText("Nome do item");
		lbItens.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lbItens.setBounds(24, 90, 62, 22);
		getContentPane().add(lbItens);

		txtItem = new JTextField();
		txtItem.setBounds(66, 83, 192, 29);
		getContentPane().add(txtItem);
		txtItem.setColumns(10);

		JLabel lbQtdConsumoItem = new JLabel("Potência (Watts):");
		lbQtdConsumoItem.setToolTipText("Você pode encontrar o Watts na embalagem do produto ou no produto");
		lbQtdConsumoItem.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lbQtdConsumoItem.setBounds(24, 172, 131, 20);
		getContentPane().add(lbQtdConsumoItem);

		txtPotencia = new JTextField();
		txtPotencia.setColumns(10);
		txtPotencia.setBounds(148, 164, 110, 29);
		getContentPane().add(txtPotencia);

		JLabel lbValorKwh = new JLabel("Valor (kWh):");
		lbValorKwh.setToolTipText("Você pode encontrar o valor na sua conta de luz");
		lbValorKwh.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lbValorKwh.setBounds(24, 133, 101, 20);
		getContentPane().add(lbValorKwh);

		txtValorKwh = new JTextField();
		txtValorKwh.setColumns(10);
		txtValorKwh.setBounds(148, 123, 110, 29);
		getContentPane().add(txtValorKwh);

		JButton btnCalculo = new JButton("Calcular");
		btnCalculo.setToolTipText("Calcular o Consumo");
		btnCalculo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo calculo = new Calculo();
				try {
					double potencia = Double.parseDouble(txtPotencia.getText());
					double tempoUso = Double.parseDouble(txtTempoUso.getText());
					double precoKwh = Double.parseDouble(txtValorKwh.getText());
					String nomeItem = txtItem.getText();

					calculo.calculoConsumoEnergia(potencia, tempoUso, precoKwh, nomeItem);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(ViewCalculo.this, "Erro no metodo calculo");
				}
			}
		});
		
		btnCalculo.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		btnCalculo.setBounds(70, 250, 143, 34);
		getContentPane().add(btnCalculo);

		JLabel lbTempoUso = new JLabel("Tempo Uso (HR):");
		lbTempoUso.setToolTipText("Tempo estimado do uso no dia");
		lbTempoUso.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lbTempoUso.setBounds(24, 213, 121, 20);
		getContentPane().add(lbTempoUso);

		txtTempoUso = new JTextField();
		txtTempoUso.setColumns(10);
		txtTempoUso.setBounds(148, 204, 110, 29);
		getContentPane().add(txtTempoUso);
	}
}
