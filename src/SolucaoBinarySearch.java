import java.util.Scanner;

public class SolucaoBinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua senha com 4 dígitos positivos");
        int senha = sc.nextInt();
        int numeroTentativas = 0;
        int valorMinimo = 0;
        int valorMaximo = 9999;

        long initialTimeMili = System.currentTimeMillis();

        while (valorMinimo <= valorMaximo) {
            int mid = (valorMinimo + valorMaximo) / 2;
            numeroTentativas++;
            if (mid == senha) {
                System.out.println("A sua senha é: " + mid);
                System.out.println("O número de tentativas foi de: " + numeroTentativas);
                break;
            } else if (mid < senha) {
                valorMinimo = mid + 1;
            } else {
                valorMaximo = mid - 1;
            }
        } if (valorMinimo > valorMaximo) {
            System.out.println("Senha não encontrada.");
        }

        long finalTimeMili = System.currentTimeMillis();
        var totalTimeMili = finalTimeMili - initialTimeMili;
        System.out.println("O tempo gasto para descobrir a senha foi de: " + totalTimeMili);
    }
}
