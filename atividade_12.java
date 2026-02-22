import java.util.Scanner;

public class atividade_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um símbolo: ");
        char simbolo = sc.next().charAt(0);
        System.out.println("Você digitou: "+ simbolo);
        sc.close();
    }    
}
