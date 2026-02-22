import java.util.Scanner;

public class atividade_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String produto = sc.nextLine();
        System.out.print("Digite o preço do produto: ");
        float preco = sc.nextFloat();
        System.out.print("Digite quantos(as) "+produto+" foram comprados(as): ");
        int qtdeCompras = sc.nextInt();

        //TOTAL
        float total = preco * qtdeCompras;

        //RESULTADO
        System.out.println("O valor total a pagar pelo(a) "+produto+" é de "+total);
        sc.close();
    }    
}
