package com.MOZE;
/**
 * @author: Mindaugas Ozeraitis
 * @version: 1.0 13/05/2018
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("La calificación de " + args[0] + " : ");
        System.out.println(veredicto(args[1],args[2]));
    }

    private static String veredicto(String valor1, String valor2){
        /**
         * @param el metodo veredicto, recibe 2 valores.
         *          valor1 es la nota que el alumno esperaba sacar en el examen
         *          valor2 es la nota que ha sacado.
         *           El resultado nos dice si hemos acertado en la nota,
         *           si hemos mejorado, o hemos sacado una nota menor.
         */
        if (valor1.equals(valor2)) {
            return "Perfecto. Has tenido buen criterio.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Has mejorado, o te ha llegado el éxito inesperado.";
        }
        return "Te has confiado. Falta realismo.";
    }
}
