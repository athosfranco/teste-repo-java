package sistemaDeAlunos;

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



		Aluno aluno1 = new Aluno(nomeInput, sobrenomeInput, dataNascimentoInput, dataMatriculaInput, rgInput, cpfInput,
				nomePaiInput, nomeMaeInput, idadeInput);
				
		aluno1.setNumeroCpf("2948234");
		
		
		//Instanciando a lista de disciplinas 		
		Disciplina disciplina1 = new Disciplina("Banco de Dados", 7.5);
		Disciplina disciplina2 = new Disciplina("Front-End", 9.5);
		Disciplina disciplina3 = new Disciplina("Back-End", 8.0);
		Disciplina disciplina4 = new Disciplina("Java", 6.5);
		
		
		//Adicionando as disciplinas à uma ArrayList
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);
		
		aluno1.getInfo();
	}

}
