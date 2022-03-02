package cursopacote.executavel;

import javax.swing.JOptionPane;

public class MediaAluno {

	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Digite a primeira nota:");
		String nota2 = JOptionPane.showInputDialog("Digite a segunda nota:");
		String nota3 = JOptionPane.showInputDialog("Digite a terceira nota:");
		String nota4 = JOptionPane.showInputDialog("Digite a quarta nota:");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1 + dNota2 + dNota3 + dNota4)/4;
		
		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aprovado com a média: "+ media);
			} else {
				JOptionPane.showMessageDialog(null, "Recuperação com a média: "+ media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Reprovado com a média: "+ media);
		}
	}

}
