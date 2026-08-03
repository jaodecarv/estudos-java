import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculadoraIdade {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        String dateStr = sc.nextLine();
        
        LocalDate birthDate = LocalDate.parse(dateStr, formatter);
        LocalDate today = LocalDate.now();
        
        Period period = Period.between(birthDate, today);
        
        System.out.println("\n--- Resultado ---");
        System.out.println("Data de nascimento: " + birthDate.format(formatter));
        System.out.println("Data de hoje: " + today.format(formatter));
        System.out.println("Idade: " + period.getYears() + " anos, " + 
                          period.getMonths() + " meses e " + 
                          period.getDays() + " dias");
        
        LocalDateTime now = LocalDateTime.now();
        System.out.println("\nData e hora atual: " + now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        
        sc.close();
    }
}