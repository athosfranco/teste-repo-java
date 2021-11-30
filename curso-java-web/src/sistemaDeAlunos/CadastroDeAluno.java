package sistemaDeAlunos;

import javax.swing.JOptionPane;

public class CadastroDeAluno {
	//ROTINA DE CADASTRO DE ALUNO
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno(); // Instanciando o Objeto "aluno"

		// CONFIG DADOS DO ALUNO
		int decisaoDadosAluno = JOptionPane.showConfirmDialog(null, "Deseja configurar os dados do aluno?");
		if (decisaoDadosAluno == 0) {
			String nomeInput = JOptionPane.showInputDialog("Qual o nome do aluno?");
			String sobrenomeInput = JOptionPane.showInputDialog("Qual o sobrenome do aluno?");
			String dataNascimentoInput = JOptionPane.showInputDialog("Qual a data de nascimento?");
			String dataMatriculaInput = JOptionPane.showInputDialog("Qual a data da matr�cula?");
			String rgInput = JOptionPane.showInputDialog("Qual o registro geral (RG) do aluno?");
			String cpfInput = JOptionPane.showInputDialog("Qual o Cadastro de Pessoa F�sica (CPF) do aluno?");
			String nomePaiInput = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
			String nomeMaeInput = JOptionPane.showInputDialog("Qual o nome da m�e do aluno?");
			int idadeInput = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno?"));

			aluno1.setAllInfo(nomeInput, sobrenomeInput, dataNascimentoInput, dataMatriculaInput, rgInput, cpfInput,
					nomePaiInput, nomeMaeInput, idadeInput);
			System.out.println("OBS: Dados do aluno gerados pelo usu�rio.");
		} else {
			aluno1.setAllInfo("Athos", "Franco", "02/09/1995", "17/11/2021", "8968429423", "607.198.163-86", "M�rcio",
					"Marc�nia", 26);
			System.out.println("OBS: Dados do aluno gerados pelo sistema.");
		}

		// CONFIG DISCIPLINAS
		int decisaoConfigDisc = JOptionPane.showConfirmDialog(null, "Deseja configurar as disciplinas e notas?");
		if (decisaoConfigDisc == 0) {
			// Vai perguntar ao usu�rio quais disciplinas ser�o geradas
			int qtdDisciplinas = Integer
					.parseInt(JOptionPane.showInputDialog("Digite a quantidade de disciplinas a serem registradas."));

			for (int i = 1; i <= qtdDisciplinas; i++) {
				String nomeDisciplina = JOptionPane
						.showInputDialog("DISCIPLINA #" + i + ": Digite o NOME da " + i + "� disciplina.");
				double nota = Double.parseDouble(JOptionPane.showInputDialog(
						"DISCIPLINA #" + i + ": Digite a NOTA alcan�ada pelo aluno na " + i + "� disciplina."));
				Disciplina disciplina = new Disciplina(nomeDisciplina, nota);
				aluno1.getDisciplinas().add(disciplina);
			}
		} else {
			// Gera disciplinas com notas aleat�rias
			Disciplina disciplina1 = new Disciplina("Front-End JavaScript",
					Math.floor(Math.random() * (10 - 0 + 1) + 0));
			Disciplina disciplina2 = new Disciplina("Back-End Java", Math.floor(Math.random() * (10 - 0 + 1) + 0));
			Disciplina disciplina3 = new Disciplina("Banco de Dados SQL", Math.floor(Math.random() * (10 - 0 + 1) + 0));
			aluno1.getDisciplinas().add(disciplina1);
			aluno1.getDisciplinas().add(disciplina2);
			aluno1.getDisciplinas().add(disciplina3);
		}

		// Imprime os dados no console
		aluno1.getInfo();

		// REMOVER DISCIPLINA
		int decisaoRemoverDisc = JOptionPane.showConfirmDialog(null, "Deseja REMOVER alguma disciplina?");
		if (decisaoRemoverDisc == 0) {			
			aluno1.listarDisciplinas();
			int disciplinaRemovida = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite o Index da Disciplina a ser removida. (0 a " + (aluno1.getDisciplinas().size() - 1) + ")"));
			aluno1.getDisciplinas().remove(disciplinaRemovida);
			System.out.println("---------LISTA DE DISCIPLINAS AP�S REMO��O----------");
			aluno1.listarDisciplinas();
			System.out.println("---------C�LCULO DE M�DIA ATUALIZADO--------------");
			System.out.println("A m�dia do aluno agora ficou " + aluno1.getMediaNota() + ". Ele est� " + (aluno1.getAlunoAprovado() ? "aprovado!" : "reprovado!"));
			
		}

	}

}
