package cursopacote.executavel;

import javax.swing.JOptionPane;

public class EntradaDeDados {
	
	public static void main(String[] args){
		//String é sempre com letra maiúcula
		String variavel1 = JOptionPane.showInputDialog("Informe um um número:");
		String variavel2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		//convertendo a variável string para double
		double primeiroNumero = Double.parseDouble(variavel1);
		double segundoNumero = Double.parseDouble(variavel2);
		
		//Fazendo as operações e salvando em variáveis
		int divisao = (int) (primeiroNumero / segundoNumero);
		int resto = (int) (primeiroNumero % segundoNumero);
		
		//Exibindo as mensagens de retorno
		
		//via box
		//JOptionPane.showMessageDialog(null, "A divisão entre "+ primeiroNumero + " e "+ segundoNumero + " é: "+ divisao);
		//JOptionPane.showMessageDialog(null, "O resto da divisão é: "+ resto);
		
		//via terminal
		//System.out.println("A divisão entre "+ primeiroNumero + " e "+ segundoNumero + "é: "+ divisao);
		//System.out.println("O resto da divisão é: "+ resto);
		
		
		//via caixas de confirmação
		int resposta = JOptionPane.showConfirmDialog(null, "Ver o resultado?");
		if (resposta ==0) {
			JOptionPane.showMessageDialog(null, "A divisão entre "+ primeiroNumero + " e "+ segundoNumero + " é: "+ divisao);
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Ver o resto da divisão?");
		if (resposta ==0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é: "+ resto);
		}
	}
}
