import java.io.*;

public class vetorMediaFinal {
    public static void main(String[] args) {
        String[] VetNomeAluno;
        float[] VetMediaFinal;
        int ContadorAlunos;
        float AcumMedia = 0, MediaTurma;

        Console dado = System.console();
        VetNomeAluno = new String[5];
        VetMediaFinal = new float[5];
        System.out.println("*************** Sistema de Gestão Escolar ***********************");
        for (ContadorAlunos = 0; ContadorAlunos < 5; ContadorAlunos++)
        {
            System.out.println("Informe Nome do  " +(ContadorAlunos + 1) + "º aluno(a): ");
            VetNomeAluno[ContadorAlunos] = dado.readLine();

            System.out.println( "Informe sua Media Final:");
            VetMediaFinal[ContadorAlunos] = Float.parseFloat(dado.readLine());
            if (VetMediaFinal[ContadorAlunos] >= 7.0)
                System.out.println("Voce está APROVADO(A)." + VetNomeAluno[ContadorAlunos]);
            else
            if (VetMediaFinal[ContadorAlunos] >= 5.0)
                System.out.println("Voce está EM EXAME." + VetNomeAluno[ContadorAlunos]);
            else
                System.out.println("Voce está REPROVADO(A)." + VetNomeAluno[ContadorAlunos]);

            AcumMedia = AcumMedia + VetMediaFinal[ContadorAlunos];
            System.out.println();// saltar uma linha

        }
        MediaTurma = AcumMedia / ContadorAlunos;
        System.out.println("*************** Desempenho Médio Geral *******************");
        System.out.println("\n" + " Media da turma: " + MediaTurma);
        for (ContadorAlunos = 0; ContadorAlunos < 5;ContadorAlunos++)
        {
            if (VetMediaFinal[ContadorAlunos] > MediaTurma)
                System.out.println(VetNomeAluno[ContadorAlunos] + " - Media: " + VetMediaFinal[ContadorAlunos] + " - Bom Aluno(a).");
            else
            if (VetMediaFinal[ContadorAlunos] < MediaTurma)
                System.out.println(VetNomeAluno[ContadorAlunos] + " - Media:" + VetMediaFinal[ContadorAlunos] + " - Aluno(a) com baixo desempenho.");
            else
                System.out.println(VetNomeAluno[ContadorAlunos] +" - Media:" + VetMediaFinal[ContadorAlunos] +" - Bom Aluno(a).");
        }
        System.out.println("*************** Fim da Execução do Programa *******************");
    }

}
