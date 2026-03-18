package calculadora;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.gov.sp.cps.aulaForm.TelaCadastroCliente;
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
		 
		 JLabel lblTitulo = new JLabel("Calculadora safada");
		 lblTitulo.setBounds(170,10,200,30);
		 add(lblTitulo);
	 
		 
		 lblNum1 = new JLabel("Valor 1");
	     lblNum1.setBounds(30, 50, 100, 25);
	     add(lblNum1);
	     txtNum1 = new JTextField();
	     txtNum1.setBounds(70, 50, 100, 25);
	     add(txtNum1);
	     lblOperacao = new JLabel("+");
	     lblOperacao.setBounds(175, 50, 100, 25);
	     add (lblOperacao);
	     
	     lblNum2 = new JLabel("Valor 2");
	     lblNum2.setBounds(185, 50, 100, 25);
	     add(lblNum2);
	     txtNum2 = new JTextField();
	     txtNum2.setBounds(225, 50, 100, 25);
	     add(txtNum2);
	     
	     lblResultado = new JLabel("Resultado");
	     lblResultado.setBounds(230, 50, 350, 25);
	     add(lblResultado);
	     
	     

	     btnLimpar = new JButton("Limpar");
	     btnLimpar.setBounds(10, 300, 100, 30);
	     add(btnLimpar);



	     btnSair = new JButton("Sair");
	     btnSair.setBounds(120, 300, 100, 30);
	     add(btnSair);
	     
	     btnCalcular = new JButton("Resultado");
	     btnCalcular.setBounds(230, 300, 100, 30);
	     add(btnCalcular);
	     }

	     
	     public static void main(String[] args) {

	      
	         CalculadoraTela tela = new CalculadoraTela();

	        
	         tela.setVisible(true);
	     }
	    {
	     }}
		


	