
import java.util.Scanner;

public class MaiorSomaExerc02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 4 números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int maior = max (a, b, c, d);
        int soma = a + b + c + d;
        showResult (maior);

        System.out.println("Soma: " + soma);

        sc.close();
    }

    public static int max (int x, int y, int z, int w) {

        int aux;
        if (x > y && x > z && x > w) {
            aux = x;
        } else if (y > z && y > w) {
            aux = y;
        }else if (z > w ) {
                aux = z;
        } else {
            aux = w;
        }
        return aux;


    }

    public static void showResult (int value) {
        System.out.println("Maior número: " + value);
    }

}