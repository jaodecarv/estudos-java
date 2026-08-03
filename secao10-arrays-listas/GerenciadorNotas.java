import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorNotas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> grades = new ArrayList<>();
        
        System.out.print("Quantas notas você deseja adicionar? ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double grade = sc.nextDouble();
            grades.add(grade);
        }
        
        double sum = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);
        
        for (Double grade : grades) {
            sum += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }
        
        double average = sum / grades.size();
        
        System.out.println("\n--- Resultado ---");
        System.out.println("Notas: " + grades);
        System.out.printf("Média: %.2f%n", average);
        System.out.printf("Maior nota: %.2f%n", highest);
        System.out.printf("Menor nota: %.2f%n", lowest);
        
        String status = average >= 7 ? "Aprovado" : "Reprovado";
        System.out.println("Status: " + status);
        
        sc.close();
    }
}