package com.fundamentos;


import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {
        /* Desafio de criar uma calculadora simples apenas com o conteudo estudado nas aulas 
		 sem estruturas de controle do tipo IF ou qualquer outra estrutura que não foi mencionada nas aulas.*/		
		
		
		//valor do usuario 1
		String num1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
		double numero1 = Double.parseDouble(num1);
		//valor do usuario 2
		String num2 = JOptionPane.showInputDialog("Digite o segundo valor:");
		double numero2 = Double.parseDouble(num2);
		
		//operação que o usuario deseja executar
		String operador = JOptionPane.showInputDialog("Qual operação você gostaria de utilizar: \n  +   -   *   /   .");
	
		//variável para executar uma operação de soma
		double soma = numero1 + numero2;
		
		//variavel para executar uma operação de subtração
		double subtracao = numero1 - numero2;
		
		//variavel para executar uma operação de divisão
		double divisao = numero1 / numero2;
		
		//variavel para executar uma operação de multiplicação
		double multiplicacao = numero1 * numero2;
		
		// verificando qual foi a operação escolhida com o operador ternário junto com equals.
		// E para não ocorrer nenhum erro de espaços digitado pelo usuario na entrada de dados utilizei o ".trim" para remover os espaços.
		double resultado = operador.equals("/".trim()) ? divisao : operador.equals("*".trim()) ? multiplicacao : operador.equals("+".trim()) ? soma : subtracao;
		
		//resultado exibido em uma caixinha de mensagem do Joption.
		JOptionPane.showMessageDialog(null," O valor da operação é " + resultado);
	}
}
