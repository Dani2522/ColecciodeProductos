package org.example;

import java.util.Arrays;

class ProductsArray {

    public static void main(String[] args) {


        String[] products = new String[20];

        products[0] = "cebolla";
        products[1] = "tomate";
        products[2] = "pepino";
        products[3] = "manzana";
        products[4] = "uva";
        products[5] = "melon";
        products[6] = "sandia";
        products[7] = "papa";
        products[8] = "zanahoria";
        products[9] = "aguacate";
        products[10] = "papaya";
        products[11] = "banano";
        products[12] = "zapote";
        products[13] = "arandano";
        products[14] = "calabaza";
        products[15] = "oregano";
        products[16] = "mandarina";
        products[17] = "cilantro";
        products[18] = "pera";
        products[19] = "mango";


        //  Imprimir los nombres que empiezan con la letra "m"

        System.out.print("Nombres que empiezan con 'm': ");
        for (String lista : products) {
            if (lista.startsWith("m")) {
                System.out.print(lista + " ");
            }
        }
        System.out.println();

        // Ordenar e imprimir los nombres en orden alfabético.
        Arrays.sort(products);
        System.out.print("Nombres ordenados alfabéticamente: ");
        for (String lista : products) {
            System.out.print(lista + " ");
        }
        System.out.println();
    }
}
