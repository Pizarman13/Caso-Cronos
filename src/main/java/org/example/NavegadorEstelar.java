package org.example;

public class NavegadorEstelar {

    public static void calcularRutas(double[][] terreno) {
        System.out.println("Rutas de exploración y expansión:");
    }


    public static void multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        System.out.println("Rutas optimas:");
    }


    public static void main(String[] args) {
        double[][] terreno = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        calcularRutas(terreno);

        int[][] matriz1 = {{1, 2}, {3, 4}};
        int[][] matriz2 = {{5, 6}, {7, 8}};

        multiplicarMatrices(matriz1, matriz2);
    }
}



