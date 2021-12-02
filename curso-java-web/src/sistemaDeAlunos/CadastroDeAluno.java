package sistemaDeAlunos;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class CadastroDeAluno {
	// ROTINA DE CADASTRO DE ALUNO
	public static void main(String[] args) {

		// Criando uma ArrayList para adicionar os alunos
		ArrayList<Aluno> arrayAlunos = new ArrayList<Aluno>();

		// Instanciando o boleano de cadastro
		boolean encerrarCadastro = false;

		while (!encerrarCadastro) {
			int qtdCadastros = Integer
					.parseInt(JOptionPane.showInputDialog("Quantos alunos você deseja cadastrar no sistema?"));
			for (int i = 1; i <= qtdCadastros; i++) {
				Aluno aluno1 = new Aluno(); // Instanciando o Objeto "aluno"

				// CONFIG DADOS DO ALUNO
				int decisaoDadosAluno = JOptionPane.showConfirmDialog(null,
						"(" + i + "/" + qtdCadastros + ") " + "Deseja configurar os dados do aluno #" + i + " ?");
				if (decisaoDadosAluno == 0) {
					String nomeInput = JOptionPane.showInputDialog("Qual o nome do aluno?");
					String sobrenomeInput = JOptionPane.showInputDialog("Qual o sobrenome do aluno?");
					String dataNascimentoInput = JOptionPane.showInputDialog("Qual a data de nascimento?");
					String dataMatriculaInput = JOptionPane.showInputDialog("Qual a data da matrícula?");
					String rgInput = JOptionPane.showInputDialog("Qual o registro geral (RG) do aluno?");
					String cpfInput = JOptionPane.showInputDialog("Qual o Cadastro de Pessoa Física (CPF) do aluno?");
					String nomePaiInput = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
					String nomeMaeInput = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?");
					int idadeInput = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno?"));

					aluno1.setAllInfo(nomeInput, sobrenomeInput, dataNascimentoInput, dataMatriculaInput, rgInput,
							cpfInput, nomePaiInput, nomeMaeInput, idadeInput);
					System.out.println("OBS: Dados do aluno gerados pelo usuário.");
				} else {
					aluno1.setAllInfo("Athos", "Franco", "02/09/1995", "17/11/2021", "8968429423", "607.198.163-86",
							"Márcio", "Marcênia", 26);
					System.out.println("OBS: Dados do aluno gerados pelo sistema.");
				}

				// CONFIG DISCIPLINAS
				int decisaoConfigDisc = JOptionPane.showConfirmDialog(null,
						"Deseja configurar as disciplinas e notas?");
				if (decisaoConfigDisc == 0) {
					// Vai perguntar ao usuário quais disciplinas serão geradas
					int qtdDisciplinas = Integer.parseInt(
							JOptionPane.showInputDialog("Digite a quantidade de disciplinas a serem registradas."));

					for (int index = 1; index <= qtdDisciplinas; index++) {
						String nomeDisciplina = JOptionPane.showInputDialog(
								"DISCIPLINA #" + index + ": Digite o NOME da " + index + "º disciplina.");
						double nota = Double.parseDouble(JOptionPane.showInputDialog("DISCIPLINA #" + index
								+ ": Digite a NOTA alcançada pelo aluno na " + index + "º disciplina."));
						Disciplina disciplina = new Disciplina(nomeDisciplina, nota);
						aluno1.getDisciplinas().add(disciplina);
					}
				} else {
					// Gera disciplinas com notas aleatórias
					Disciplina disciplina1 = new Disciplina("Front-End JavaScript",
							Math.floor(Math.random() * (10 - 0 + 1) + 0));
					Disciplina disciplina2 = new Disciplina("Back-End Java",
							Math.floor(Math.random() * (10 - 0 + 1) + 0));
					Disciplina disciplina3 = new Disciplina("Banco de Dados SQL",
							Math.floor(Math.random() * (10 - 0 + 1) + 0));
					aluno1.getDisciplinas().add(disciplina1);
					aluno1.getDisciplinas().add(disciplina2);
					aluno1.getDisciplinas().add(disciplina3);
				}

				// Imprime os dados no console
				aluno1.getInfo();

				// REMOVER DISCIPLINA
				int decisaoRemoverDisc = JOptionPane.showConfirmDialog(null, "Deseja REMOVER alguma disciplina?");
				if (decisaoRemoverDisc == 0) {
					boolean encerrarExclusao = false;
					int qtdDisciplinasExcluidas = 0;
					while (!encerrarExclusao) {
						aluno1.listarDisciplinas();
						int disciplinaRemovida = Integer.parseInt(
								JOptionPane.showInputDialog("Digite o Index da Disciplina a ser removida. (0 a "
										+ (aluno1.getDisciplinas().size() - 1) + ")"));
						aluno1.getDisciplinas().remove(disciplinaRemovida);
						qtdDisciplinasExcluidas++;
						aluno1.listarDisciplinas();
						int confirmarEncerrarExclusao = JOptionPane.showConfirmDialog(null, "Você excluiu "
								+ qtdDisciplinasExcluidas + " disciplina(s). Continuar excluindo disciplinas?");
						if (confirmarEncerrarExclusao != 0)
							encerrarExclusao = true;
					}
					aluno1.listarDisciplinas();
					System.out.println("---------CÁLCULO DE MÉDIA ATUALIZADO--------------");
					System.out.println("A média do aluno agora ficou " + aluno1.getMediaNota() + ". Ele está "
							+ aluno1.getAnalise());

				}
				arrayAlunos.add(aluno1);

			}
			int encerrarOuVisualizarLista = Integer.parseInt(JOptionPane.showInputDialog("O cadastro de "
					+ arrayAlunos.size()
					+ " aluno(s) foi finalizado. Digite 0 para fechar o programa, 1 para cadastrar mais alunos e 2 para visualizar a lista de alunos."));
			if (encerrarOuVisualizarLista == 0) {
				System.out.println("SISTEMA ENCERRADO.");
				encerrarCadastro = true;
			} else if (encerrarOuVisualizarLista == 2) {
				for (Aluno aluno : arrayAlunos) {
					System.out.println("===========================================");
					System.out.println("Nome: " + aluno.getNome() + " " + aluno.getSobrenome() + " / Média: "
							+ aluno.getMediaNota() + " (" + aluno.getAnalise() + ")");
				}
				encerrarCadastro = true;
			}

		}

	}

}
