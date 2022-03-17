
public class OrdemInversaExerc01 {
    public static void main(String[] args) {
        int[] vetor = {9,8,7,1,6,5,4,9};
        int contador = 0;
        System.out.println(vetor.length);
        System.out.println("Vetor: ");

        while(contador < (vetor.length)) {
            System.out.print(vetor[contador] + " ");
            contador++;
        }
        System.out.print("=========");
        for (int i = (vetor.length-1); i >= 0 ; i--) {
            System.out.print(vetor[i] + " ");

        }

    }
}
