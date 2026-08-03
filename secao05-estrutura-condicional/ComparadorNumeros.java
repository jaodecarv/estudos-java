import java.util.Scanner;

public class ComparadorNumeros {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();
        
        int highest;
        
        if (num1 > num2 && num1 > num3) {
            highest = num1;
        } else if (num2 > num3) {
            highest = num2;
        } else {
            highest = num3;
        }
        
        System.out.println("Maior número: " + highest);
        
        sc.close();
    }
}