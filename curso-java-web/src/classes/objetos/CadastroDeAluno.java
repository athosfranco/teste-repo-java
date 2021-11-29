package classes.objetos;

import javax.swing.JOptionPane;

public class CadastroDeAluno {

	public static void main(String[] args) {

		String nomeInput = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String sobrenomeInput = JOptionPane.showInputDialog("Qual o sobrenome do aluno?");
		String dataNascimentoInput = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String dataMatriculaInput = JOptionPane.showInputDialog("Qual a data da matrícula?");
		String rgInput = JOptionPane.showInputDialog("Qual o registro geral (RG) do aluno?");
		String cpfInput = JOptionPane.showInputDialog("Qual o Cadastro de Pessoa Física (CPF) do aluno?");
		String nomePaiInput = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
		String nomeMaeInput = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?");
		int idadeInput = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno?"));

		String nomeDisciplina1 = JOptionPane.showInputDialog("Qual o nome da disciplina 1?");
		double nota1Input = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da disciplina 1"));

		String nomeDisciplina2 = JOptionPane.showInputDialog("Qual o nome da disciplina 2?");
		double nota2Input = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da disciplina 2?"));

		String nomeDisciplina3 = JOptionPane.showInputDialog("Qual o nome da disciplina 3?");
		double nota3Input = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da disciplina 3?"));

		String nomeDisciplina4 = JOptionPane.showInputDialog("Qual o nome da disciplina 4?");
		double nota4Input = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da disciplina 4?"));

		Aluno aluno1 = new Aluno(nomeInput, sobrenomeInput, dataNascimentoInput, dataMatriculaInput, rgInput, cpfInput,
				nomePaiInput, nomeMaeInput, idadeInput);

		aluno1.setNota1(nota1Input);
		aluno1.setDisciplina1(nomeDisciplina1);
		
		aluno1.setNota2(nota2Input);
		aluno1.setDisciplina2(nomeDisciplina2);
		
		aluno1.setNota3(nota3Input);
		aluno1.setDisciplina3(nomeDisciplina3);
		
		aluno1.setNota4(nota4Input);
		aluno1.setDisciplina4(nomeDisciplina4);
		
		aluno1.setNumeroCpf("2948234");
		aluno1.getInfo();

	}

}
