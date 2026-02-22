import java.util.Scanner;

public class atividade_7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        float produto = sc.nextFloat();
        System.out.print("Digite quantos produtos comprou: ");
        float qtdeCompras = sc.nextFloat();
        float total = produto * qtdeCompras;
        System.out.println(total);
        sc.close();
    }    
}
