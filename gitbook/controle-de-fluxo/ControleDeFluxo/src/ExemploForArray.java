public class ExemploForArray {
    public static void main(String[] args) {

        //Indice de elementos começa em Zero
        String alunos[] = { "Joaquim", "Paulo", "Livia", "Lavinia" };

	for (int x=0; x < alunos.length; x++) {
		System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
	    }

    }
}
