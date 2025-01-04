import java.util.Scanner;

public class SolucaoForExtremidades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua senha com 4 dígitos positivos");
        int senha = sc.nextInt();
        int numeroTentativas = 0;
        int valorMinimo = 0;
        int valorMaximo = 9999;

        long initialTimeMili = System.currentTimeMillis();


        for (int i = 0; i <=9999 ; i++) {
            numeroTentativas ++;
            if(senha == valorMinimo){
                System.out.println("A sua senha é: " + senha);
                System.out.println("O número de tentativas foi de: " + numeroTentativas);
                break;
            }else if(senha == valorMaximo){
                System.out.println("A sua senha é: " + senha);
                System.out.println("O número de tentativas foi de: " + numeroTentativas);
                break;
            }
            valorMinimo++;
            valorMaximo--;
        }

        long finalTimeMili = System.currentTimeMillis();
        var totalTimeMili = finalTimeMili - initialTimeMili;
        System.out.println("O tempo gasto para descobrir a senha foi de: " + totalTimeMili);
    }

}
