import java.util.Scanner;

public class atividade_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        char letra = sc.next().charAt(0);
        System.out.println("A primeira letra do seu nome é: "+ letra);
        sc.close();
    }    
}
