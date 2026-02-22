import java.util.Scanner;
public class atividade_6 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.println(media);
        sc.close();
    }
}
