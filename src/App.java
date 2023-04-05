import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Exercício 13.

        //Entrada
        Double altura, pesoidealH, pesoidealM;
        Scanner teclado;

        System.out.println("Digite sua altura em metros ");
        teclado = new Scanner(System.in);
        altura = teclado.nextDouble();

        teclado.close();

        //Processamento
        pesoidealH = ((72.7 * (altura)) - 58);
        pesoidealM = ((62.1 * altura) - 44.7);

        //Saída
        System.out.println("Caso você seja homem, seu peso ideal é de: " + pesoidealH);
        System.out.println();
        System.out.println("Agora, se você for uma mulher, seu peso ideal é de: " + pesoidealM);

    }
}
