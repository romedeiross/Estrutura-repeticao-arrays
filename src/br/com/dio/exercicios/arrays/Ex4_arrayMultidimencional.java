package br.com.dio.exercicios.arrays;
import java.util.Random;

public class Ex4_arrayMultidimencional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] Matriz = new int[4][4];

        for (int linha = 0; linha < Matriz.length; linha++) {
            for (int coluna = 0; coluna < Matriz[linha].length; coluna++) {
                Matriz[linha][coluna] = random.nextInt(10);
            }

        }
        System.out.println("Matriz: ");
        for (int[] l : Matriz) {
            for (int elementoDaColuna : l) {
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();

        }
    }
}
