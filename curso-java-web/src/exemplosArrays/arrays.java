package exemplosArrays;
import java.util.ArrayList;


import javax.swing.JOptionPane;

public class arrays {

	public static void main(String[] args) {
		ArrayList<String> stringsArray = new ArrayList<String>();
		int stringQuantity = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de Strings que vc deseja adicionar na Array?"));
		for (int i = 1; i <= stringQuantity; i++) {
			String inputString = JOptionPane.showInputDialog("String n�mero #" + i + ": ");
			stringsArray.add(inputString);
		}
		
		System.out.println("Voc� adicionou " + stringsArray.size() + " strings na Array. Elas s�o:");
		for (String string : stringsArray) {
			System.out.println(string);			
		}

	}

}
