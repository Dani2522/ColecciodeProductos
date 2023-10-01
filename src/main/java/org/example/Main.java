import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;


public class Main {

}
public class ProductsArray {


    public static void main(String[] args) {

        String[] product = new String[20];


        product[0] = "cebolla";
        product[1] = "tomate";
        product[2] = "pepino";
        product[3] = "manzana";
        product[4] = "uva";
        product[5] = "melon";
        product[6] = "sandia";
        product[7] = "papa";
        product[8] = "zanahoria";
        product[9] = "aguacate";
        product[10] = "papaya";
        product[11] = "banano";
        product[12] = "zapote";
        product[13] = "arandano";
        product[14] = "calabaza";
        product[15] = "oregano";
        product[16] = "mandarina";
        product[17] = "cilantro";
        product[18] = "pera";
        product[19] = "mango";


        // 4. Imprimir los nombres que empiezan con la letra "A".
        System.out.print("Nombres que empiezan con 'A': ");
        for (String name : product) {
            if (name.startsWith("m")) {
                System.out.print(name + " ");
            }
        }
        System.out.println();

        // 5. Ordenar e imprimir los nombres en orden alfabético.
        Arrays.sort(product);
        System.out.print("Nombres ordenados alfabéticamente: ");
        for (String name : product) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}