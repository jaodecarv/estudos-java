import java.util.Scanner;

public class SomaNumeros {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos números você deseja somar? ");
        int n = sc.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int number = sc.nextInt();
            sum += number;
        }
        
        System.out.println("Soma total: " + sum);
        System.out.printf("Média: %.2f%n", (double) sum / n);
        
        sc.close();
    }
}