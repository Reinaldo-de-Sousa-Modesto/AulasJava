package cursopacote.executavel;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Disciplina;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		//crigando o objeto aluno // new aluno é uma instancia ou criação de objeto
		//Aluno (é o nome da classe) aluno (nome ou variável de referencia) = new Aluno(); (método)
		Aluno aluno = new Aluno();
		
		 aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
		 aluno.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite a idade do aluno: ")));
		 aluno.setNumeroCpf(JOptionPane.showInputDialog("Digite o CPF do aluno: "));
		 
		 for (int pos = 1; pos <= 4 ; pos++) {
			 String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da diciplina "+ pos +": " );
			 String notaDisciplina = JOptionPane.showInputDialog("Digite a nota:" + pos + ": ");
			 
			 Disciplina disciplina = new Disciplina();
			 disciplina.setDisciplina(nomeDisciplina);
			 disciplina.setNota(Double.valueOf(notaDisciplina));
			 
			 aluno.getDisciplinas().add(disciplina);
		 }
		 
		 System.out.println(aluno.getNome()+" | "+aluno.getIdade()+" | "+aluno.getNumeroCpf());		 
		 System.out.println("Media da nota é: "+ aluno.getMediaNota());
		 System.out.println("Resultado = "+ (aluno.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		 System.out.println(aluno.toString());
	}
}