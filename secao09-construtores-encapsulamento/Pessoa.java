import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Pessoa {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String name = sc.nextLine();
        
        System.out.print("Data de nascimento (yyyy-MM-dd): ");
        String birthDate = sc.nextLine();
        
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        
        Person person = new Person(name, LocalDate.parse(birthDate), cpf);
        
        System.out.println("\n" + person);
        System.out.println("Idade: " + person.getAge() + " anos");
        
        sc.close();
    }
}

class Person {
    
    private String name;
    private LocalDate birthDate;
    private String cpf;
    
    public Person(String name, LocalDate birthDate, String cpf) {
        this.name = name;
        this.birthDate = birthDate;
        this.cpf = cpf;
    }
    
    public Person(String name, LocalDate birthDate) {
        this(name, birthDate, "000.000.000-00");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public LocalDate getBirthDate() {
        return birthDate;
    }
    
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
    
    @Override
    public String toString() {
        return "Pessoa: " + name +
               "\nNascimento: " + birthDate +
               "\nCPF: " + cpf;
    }
}