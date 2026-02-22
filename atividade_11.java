import java.util.Scanner;

public class atividade_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Você tem menos de 25 anos?[true(verdadeiro)/false(falso)] ");
        boolean opcao = sc.nextBoolean();
        System.out.println("A opção escolhida foi: "+ opcao);
        sc.close();
    }    
}
