package br.com.generation.lacoscond;

import javax.swing.JOptionPane;

public class Par_Impar {

	public static void main(String[] args) {
		
		int numero = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um n�mero inteiro:"));
				//JOptionPane utilizado para funcionar o parseInt
		
		if(numero % 2 == 0) {
			
			JOptionPane.showMessageDialog(null, "O N�mero � Par", "Erro" ,
							JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
		}
		
		
		else {
			JOptionPane.showMessageDialog(null, "O N�mero � Impar", "Erro",
							JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
		}

	}

}
