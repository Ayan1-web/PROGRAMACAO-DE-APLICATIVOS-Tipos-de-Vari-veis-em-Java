import java.util.Scanner;

public class atividade_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite sua altura: ");
        float altura = sc.nextFloat();
        
        //RESULTADO
        System.out.println("Olá "+ nome +" fiquei sabendo que você tem "+ idade +" anos e "+ altura +" metros de altura.");
        sc.close();
    }    
}
