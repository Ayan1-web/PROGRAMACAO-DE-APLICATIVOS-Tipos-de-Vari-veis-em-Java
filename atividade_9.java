import java.util.Scanner;

public class atividade_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua cidade: ");
        String cidade = sc.nextLine();
        System.out.println("Olá "+ nome +" soube que você é de "+ cidade+".");
        sc.close();
    }    
}
