import java.text.DecimalFormat;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat( "0.00");
        double nota1, nota2, media;

        System.out.println("Digite sua primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("media final = " + df.format(media));

        if(media >= 6){
            System.out.println("Voce esta APROVADO ");


        }
        else {
            System.out.println("Se fudeu babaca ");
        };
    }
}

