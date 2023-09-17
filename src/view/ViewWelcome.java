package view;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class ViewWelcome {

	public static void main(String[] args) {
		// Define o Look and Feel "Metal" antes de criar a janela
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(() -> {
			createAndShowWelcomeView();
		});
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void createAndShowWelcomeView() {
		JFrame frame = new JFrame("Calculadora de Consumo de Energia");
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.getContentPane().setForeground(SystemColor.text);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 248);
		
		JLabel lbBemvindo = new JLabel("Bem-Vindo (a) à Calculadora de Consumo de Energia da Bia!");
		lbBemvindo.setForeground(UIManager.getColor("ComboBox.buttonBackground"));
		lbBemvindo.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		lbBemvindo.setBounds(25, 28, 349, 13);

		JPanel mainBluePanel = new JPanel();
		mainBluePanel.setBackground(SystemColor.textHighlight);
		mainBluePanel.setBounds(0, 0, 384, 65);
			
		JTextArea txtArea = new JTextArea("Neste aplicativo intuitivo, ajudaremos você a estimar "
				+ "o consumo \nde energia de seus dispositivos. " + "Tudo o que precisamos são \nalgumas informações essenciais: \n"
				+ "O aparelho que você deseja calcular, a potência em Watts e a \ntarifa de energia elétrica vigente em sua região.");
		txtArea.setBounds(10, 76, 364, 82);
		txtArea.setEditable(false);

		
		JButton buttonAvancar = new JButton("Avançar");
		buttonAvancar.setBackground(SystemColor.text);
		buttonAvancar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonAvancar.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		buttonAvancar.setBounds(119, 167, 143, 34);
		buttonAvancar.addActionListener(e -> {
			openCalculoView();
		});

		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lbBemvindo);
		frame.getContentPane().add(mainBluePanel);
		frame.getContentPane().add(txtArea);
		frame.getContentPane().add(buttonAvancar);

		frame.setVisible(true);
	}

	private static void openCalculoView() {
		JFrame frame = new ViewCalculo();
		frame.setSize(300, 350);
		frame.setVisible(true);
	}
}
