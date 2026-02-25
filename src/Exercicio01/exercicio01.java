package Exercicio01;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = 30;

        int rm[] = new int[N];
        double nota1[] = new double[N];
        double nota2[] = new double[N];

        int n = 0;
        System.out.print("Informe o Rm ( negativo para encerrar) : ");
        int rmLido = sc.nextInt();

        for (n = 0; n < N && rmLido > 0; n++) {
            rm[n] = rmLido;

            System.out.print("Nota 1:");
            nota1[n] = sc.nextDouble();

            System.out.print("Nota 2:");
            nota2[n] = sc.nextDouble();

            System.out.print("Informe o Rm ( negativo para encerrar): ");
            rmLido = sc.nextInt();
        }

            if (n != 0) {

            double[] media = new double[n];

            for (int i = 0; i < n; i++) {

                media[i] = nota1[i] + nota2[i] / 2;
                System.out.println("Rm: " + rm[i] + "\t Media: " + media[i]);

            }
            int aprovados[] = new int[n];
            int nAp = 0;
            for (int i = 0; i < n; i++) {
                if (media[i] >= 6) {
                    aprovados[nAp] = rm[i];
                    nAp++;
                }
            }

            System.out.print("\n **** lista dos aprovadods *****");
            for (int i = 0; i < nAp; i++) {
                System.out.print(aprovados[i]);
            }


        }
    }
}




