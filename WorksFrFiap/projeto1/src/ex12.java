import java.text.DecimalFormat;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double total, totalDesconto, valorEconomizada;

        System.out.println("Valor total da compra R$");
        total = sc.nextDouble();
        if(total > 1000){
            totalDesconto = total * 0.85;

        }
    }
}