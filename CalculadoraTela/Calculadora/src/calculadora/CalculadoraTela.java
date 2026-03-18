package calculadora;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculadoraTela extends JFrame {

	private static final long serialVersionUID = 1L;

	JLabel lblNum1, lblNum2, lblResultado, lblOperacao;
	JTextField txtNum1, txtNum2;
	JButton btnCalcular, btnLimpar, btnSair;

	public CalculadoraTela() {
		setTitle("Calculadora");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblTitulo = new JLabel("Calculadora");
		lblTitulo.setBounds(180, 20, 200, 30);
		add(lblTitulo);


		lblNum1 = new JLabel("Valor 1:");
		lblNum1.setBounds(80, 80, 100, 25);
		add(lblNum1);

		txtNum1 = new JTextField();
		txtNum1.setBounds(150, 80, 150, 25);
		add(txtNum1);


		lblNum2 = new JLabel("Valor 2:");
		lblNum2.setBounds(80, 120, 100, 25);
		add(lblNum2);

		txtNum2 = new JTextField();
		txtNum2.setBounds(150, 120, 150, 25);
		add(txtNum2);


		lblOperacao = new JLabel("+");
		lblOperacao.setBounds(310, 100, 20, 25);
		add(lblOperacao);

		lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(150, 160, 200, 25);
		add(lblResultado);

		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(80, 220, 100, 30);
		add(btnCalcular);

		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(190, 220, 100, 30);
		add(btnLimpar);

		btnSair = new JButton("Sair");
		btnSair.setBounds(300, 220, 100, 30);
		add(btnSair);

		Calculadora calc = new Calculadora(txtNum1, txtNum2, lblResultado);

		btnCalcular.addActionListener(calc.acaoCalcular());
		btnLimpar.addActionListener(calc.acaoLimpar());
		btnSair.addActionListener(calc.acaoSair());
	}

	public static void main(String[] args) {
		CalculadoraTela tela = new CalculadoraTela();
		tela.setVisible(true);
	}
}