import java.util.Scanner;

public class atividade_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome + " seja bem-vindo!");
        sc.close();
    }
    
}
