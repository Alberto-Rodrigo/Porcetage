
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args){
        java.util.Scanner scan = new Scanner(System.in);
        
        String nome_funcionario ="";
        float salario_bruto = 0;
        float desconto = 0;
        float salario_liquido = 0;

        System.out.println("Infome o nome do funcionario: ");
        nome_funcionario = scan.next();
        System.out.println("Infome o salario bruto: ");
        salario_bruto = scan.nextFloat();
        System.out.println("Infome o desconto: ");
        desconto = scan.nextFloat();
       
        System.out.printf("Nome do funcionario: %s %n" ,nome_funcionario);
        System.out.printf("Salario bruto: %.2f %n" ,salario_bruto);
        System.out.printf("O valor do desconto foi: %.2f %n" ,desconto);

        salario_liquido = salario_bruto - desconto;
        System.out.printf("O salario liquido é: %.2f %n" ,salario_liquido);


    }    
}
