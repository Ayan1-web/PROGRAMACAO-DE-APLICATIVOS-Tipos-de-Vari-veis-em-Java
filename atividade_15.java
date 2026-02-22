import java.util.Scanner;

public class atividade_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();
        float media = (nota1 + nota2) / 2;
        
        //RESULTADO
        System.out.println("Olá, o aluno "+nome+" teve "+nota1+" como primeira nota, "+nota2+" como segunda nota e "+media+" como média final das notas.");
        sc.close();
    }
}
