import java.util.Scanner;

public class OperacoesString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String text = sc.nextLine();
        
        System.out.println("Comprimento: " + text.length());
        System.out.println("Maiúsculas: " + text.toUpperCase());
        System.out.println("Minúsculas: " + text.toLowerCase());
        
        System.out.print("Digite um caractere para buscar: ");
        char character = sc.next().charAt(0);
        
        int index = text.indexOf(character);
        if (index != -1) {
            System.out.println("Caractere encontrado na posição: " + index);
        } else {
            System.out.println("Caractere não encontrado");
        }
        
        System.out.print("Digite um índice para extrair substring (início): ");
        int start = sc.nextInt();
        System.out.print("Digite o índice final: ");
        int end = sc.nextInt();
        
        System.out.println("Substring: " + text.substring(start, end));
        
        sc.close();
    }
}