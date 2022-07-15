package br.com.dio.exercicios.arrays;
import java.util.Scanner;

public class ExExtra_Vogais {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            String[] vogais = new String[6];
            int qntVogal = 0;
            int cont = 0;

            do {
                System.out.println("Letra: ");
                String letra = teclado.next();

                if (!(letra.equals("b") |
                        (letra.equals("c")) |
                        (letra.equals("d")) |
                        (letra.equals("f")) |
                        (letra.equals("g")) |
                        (letra.equals("h")) |
                        (letra.equals("j")) |
                        (letra.equals("k")) |
                        (letra.equals("l")) |
                        (letra.equals("m")) |
                        (letra.equals("n")) |
                        (letra.equals("p")) |
                        (letra.equals("q")) |
                        (letra.equals("r")) |
                        (letra.equals("s")) |
                        (letra.equals("t")) |
                        (letra.equals("v")) |
                        (letra.equals("w")) |
                        (letra.equals("x")) |
                        (letra.equals("z")))) {

                    vogais[cont] = letra;
                    qntVogal++;
                }
                cont++;
            }
            while (cont < vogais.length);

            System.out.print("As vogais digitadas foram: ");
            for (String vogal : vogais) {
                if (vogal != null)
                    System.out.print(vogal + " ");

            }

        }
}


