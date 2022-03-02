package cursopacote.executavel;

import javax.swing.JOptionPane;

//importando classe boletim
import classes.Boletim;

public class MediaAluno {

	public static void main(String[] args) {
		
		//new Boletim() é uma nova instancia de boletim
		//boletim1 é a referencia para o objeto Boletim
		Boletim boletim1 = new Boletim();
		
		//Atribuindo ao objeto boletim o atributo nomeAluno
		boletim1.nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
		
		//atribuindo ao objeto boletim os atributos de nota por bimestre
		//Convertendo string para double
		boletim1.primeiroBimestre = Double.parseDouble (JOptionPane.showInputDialog("Digite a primeira nota:"));
		boletim1.segundoBimestre = Double.parseDouble (JOptionPane.showInputDialog("Digite a primeira nota:"));
		boletim1.terceiroBimestre = Double.parseDouble (JOptionPane.showInputDialog("Digite a primeira nota:"));
		boletim1.quartoBimestre = Double.parseDouble (JOptionPane.showInputDialog("Digite a primeira nota:"));
		
		
		/*String nota2 = JOptionPane.showInputDialog("Digite a segunda nota:");
		String nota3 = JOptionPane.showInputDialog("Digite a terceira nota:");
		String nota4 = JOptionPane.showInputDialog("Digite a quarta nota:");*/
		
		/*double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);*/
		
		//double media = (dNota1 + dNota2 + dNota3 + dNota4)/4;
		
		double media = (boletim1.primeiroBimestre + boletim1.segundoBimestre + boletim1.terceiroBimestre + boletim1.quartoBimestre)/4;
		
		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "O aluno "+ boletim1.nomeAluno +" está aprovado com a média: "+ media);
			} else {
				JOptionPane.showMessageDialog(null, "O aluno "+ boletim1.nomeAluno +" em recuperação com a média: "+ media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "O aluno "+ boletim1.nomeAluno + " está reprovado com a média: "+ media);
		}
	}

}
