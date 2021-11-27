package classes.objetos;

public class CadastroDeAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Athos", "Franco", "02/09/1995", "17/11/2021", "23942834", "607.198.163-86",
				"Márcio Passos Feitosa", "Marcenia Monroe Franco de Sá", 26);
		aluno1.setNota1(7.5);
		aluno1.setNota2(2);
		aluno1.setNota3(8);
		aluno1.setNota4(2.5);

		System.out.println(aluno1.getMediaNota());

		System.out.println(aluno1.resultado());
	}

}
