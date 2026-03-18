package calculadora;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora{
	public JTextField txtNum1;
	public JTextField txtNum2;
	public JLabel lblResultado;


public Calculadora(JTextField txtNum1, JTextField txtNum2, JLabel lblResultado) {
	    this.txtNum1 = txtNum1;
	    this.txtNum2 = txtNum2;
	    this.lblResultado = lblResultado;
}

public ActionListener acaoCalcular() {
    return new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        		String numero1 = txtNum1.getText();
                String numero2 = txtNum2.getText();

                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);
                
                double resultado = num1 + num2;
                
                lblResultado.setText("Resultado: " + resultado);

            } 
        };
    };


public ActionListener acaoLimpar() {
    return new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtNum1.setText("");
            txtNum2.setText("");
            lblResultado.setText("");
            JOptionPane.showMessageDialog(null, "Campos limpos com sucesso!");
        }
    };
}

public ActionListener acaoSair() {
    return new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    };
}
}
