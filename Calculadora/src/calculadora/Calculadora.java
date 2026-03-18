package calculadora;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora{
	public JTextField txtNum1;
	public JTextField txtNum2;


public Calculadora(JTextField txtNum12, JTextField txtNum22) {
	
}


public ActionListener acaoCalcular() {
	return new ActionListener() {
		public void actionPerformed1(ActionEvent e) {
			double num1 = Double.parseDouble(txtNum1.getText());
			double num2 = Double.parseDouble(txtNum2.getText());
			
			double resultado = num1 + num2;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		
		}
	};};


public ActionListener acaoLimpar() {
    return new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtNum1.setText("");
            txtNum2.setText("");
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
