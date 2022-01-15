


import java.util.*;



public class Solution
{

    // 6.-Diseñe un método en el que se pida ingresar por teclado su genero (M o F), para luego digitar
    // su nombre que le corresponde a un varón o mujer.


    public static class Ejercicio6a {
        Scanner dato = new Scanner(System.in);
        void generos(String gn){
            gn=" ";  String nombre;
            System.out.println("Ingrese su genero ;");
            gn=dato.next();
            switch(gn){
                case "M":
                    System.out.println("Ingrese su nombre ;");
                    nombre=dato.next();  break;  case "F":  System.out.println("Ingrese su nombre ;");
                    nombre=dato.next();
                    break;
                case "":  System.out.println("Debe ingrese su GENERO ! ;");
                    break;
            }
        }
        public static void main(String[]args) {
            Ejercicio6a genero = new Ejercicio6a();
            genero.generos("");
        }
    }

}
