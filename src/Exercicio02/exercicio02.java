package Exercicio02;

import java.util.Scanner;

public class exercicio02 {
    static final int N = 30;

    public static void main(String[] args) {


        int rm[] = new int[N];
        double nota1[] = new double[N];
        double nota2[] = new double[N];
        int n = entradadaDeDados(rm, nota1, nota2);

        for (int i = 0; i < n; i++) {
            System.out.println(rm[i]);
        }
        double[] media = new double[n];

        cacularMedia(n, nota1, nota2, media);

        for (int i = 0; i < n; i++) {
            System.out.println("Rm: " + rm[i] + "\t Media: " + media[i]);
        }

        int aprovados[] = new int[n];
        int nAp = geraListaArpovados(n, media, rm, aprovados);

        System.out.print("\n **** lista dos aprovadods *****");
        for (int i = 0; i < nAp; i++) {
            System.out.print(aprovados[i]);
        }

    }
    public static void cacularMedia(int n, double[] nota1, double[] nota2, double[] media){

        for (int i = 0; i < n; i++) {
            media[i] = (nota1[i] + nota2[i]) / 2;
        }

    }
    public static int geraListaArpovados(int n, double[] media, int[] rm, int[] aprovados){
        int nAp = 0;

        for (int i = 0; i < n; i++) {
            if (media[i] >= 6) {
                aprovados[nAp] = rm[i];
                nAp++;
            }
        }
        return nAp;
    }

    public static int entradadaDeDados(int[] rm, double[] nota1, double[] nota2) {

        Scanner sc = new Scanner(System.in);

        int n;

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
        return n;

    }

}
