public class ExemploForEachArray {
    public static void main(String[] args) {

        //Indice de elementos começa em Zero
        String alunos[] = { "Joaquim", "Paulo", "Livia", "Lavinia" };

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é " + aluno);
        }

    }
}