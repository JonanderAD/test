package enunciadosEDE;

/* Plantea un Traductor de castellano � ingl�s. El programa tiene un array de  arrays que,
en su primera posici�n, tiene  otro array de Strings de 10 palabras en  castellano; en su
segunda posici�n, tiene otro array de Strings con 10 palabras en ingl�s. Las palabras de
cada array est�n emparejadas: en la posici�n 4 del primer array dice �casa� y en el del
segundo array dice �coche�. Este Array tan extra�o no hace falta que lo definas t�. Al
ejecutar un programa, se ofrecen tres opciones: castellano-ingl�s, ingl�s castellano, salir.
Si se escoge una de las dos primeras, se pide una palabra, se comprueba si existe en su
correspondiente array, y si existe se muestra su traducci�n. Si no, se muestra un mensaje
de �No encontrado�. El programa s�lo termina si se escoge salir. */

import java.util.Scanner;

public class traductor {

    public static int mostrarMenu (Scanner teclado) {
        int ret = 0;
        System.out.print("Elige [1, 2 o 0] para [traducci�n castellano-ingl�s, ingl�s-castellano o SALIR]: ");
        ret = teclado.nextInt();
        return ret;
    }
    
    public static int pedirPalabra (Scanner teclado, int palabra) {
        int ret = 0;
        if (palabra == 1) {
            System.out.print("Palabra: ");
            ret = teclado.nextInt();
        } else if (palabra == 2) {
            System.out.print("Palabra: ");
            ret = teclado.nextInt();
        }
        return ret;
    }
    
    public static void comprobarArray (String palabra) {
        String[][] matriz = { {"casa", "coche", "cielo", "�rbol", "sol"}, {"house", "car", "sky", "tree", "sun"} };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == palabra) {
                    
                }
            }
        }
    }
    
    public static void mostrarTraduccion () {
        
    }
    
    public static void noTraduccionError () {
        
    }
    
    
    public static void main(String[] args) {

        
        int menu = 0;
        int palabra = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        do {
            
            menu = mostrarMenu (teclado);
            
            palabra = pedirPalabra (teclado, menu);
            
            if (menu == 0) {
                System.out.println("chao pescao");
                break;
            }
            
        } while (menu != 0);
    
        teclado.close();
        
    }

}


