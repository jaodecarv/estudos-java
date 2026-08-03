import java.util.Locale;
import java.util.Scanner;

public class CalculoRectangulo {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a largura do retângulo: ");
        double width = sc.nextDouble();
        
        System.out.print("Informe a altura do retângulo: ");
        double height = sc.nextDouble();
        
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);
        
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimeter);
        System.out.printf("Diagonal: %.2f%n", diagonal);
        
        sc.close();
    }
}