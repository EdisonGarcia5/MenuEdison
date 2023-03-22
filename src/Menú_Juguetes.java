import java.util.Scanner;

public class Menú_Juguetes {
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);//nos permite obtener la entrada de datos primitivos de tipo int, double, string entre otros.
        System.out.println("\nbienvenido a la tienda de juguetes.");
        System.out.println("-----------------------------------------------");
        int op1;
        boolean salir; // Un valor booleano es aquel que solo admite true (verdadero) o false (falso)
        double total = 0;
                
        do {//Do while, nos permiten ejecutar una o varias líneas de código de forma repetitiva sin necesidad de tener un valor inicial.

          System.out.println("Selecciona el numero del producto a comprar... \n");
          System.out.println("1) Juguete de accion halo $ 459.99 MXN");
          System.out.println("2) Carro de control remoto ferrari $ 1,199.99 MXN");
          System.out.println("3) Juguete infantil cubo de figuras geometricas $ 229.99 MXN");
          System.out.println("4) Legos de minecraft $ 159.99 MXN");
          System.out.println("5) Caja de carritos hot wheels $499.99 MXN");
          System.out.println("-----------------------------------------------");
          System.out.println("6) ver el costo total");
          System.out.println("7) finalizar compra\n");
          System.out.println("selecciona el numero del producto a comprar o finalizar compra:");
            
          op1 = leer.nextInt();
                
            switch(op1){ //opciones de confirmacion de la compra del producto y sumar los precios cuando seleccione 2 o mas productos.
             case 1:
             System.out.println("-----------------------------------------------");
             System.out.println("compra completa");
             System.out.println("-----------------------------------------------");
             total += 459.99;//sumará la cantidad con otra opción que el usuario seleccione.
             break;
            
             case 2:
             System.out.println("-----------------------------------------------");
             System.out.println("compra completa");
             System.out.println("-----------------------------------------------");
             total += 1199.99;
             break;
            
             case 3:
             System.out.println("-----------------------------------------------");
             System.out.println("compra completa");
             System.out.println("-----------------------------------------------");
             total += 229.99;
             break;
            
             case 4:
             System.out.println("-----------------------------------------------");
             System.out.println("compra completa");
             System.out.println("-----------------------------------------------");
             total += 159.99;
             break;
                                
             case 5:
             System.out.println("-----------------------------------------------");
             System.out.println("compra completa");
             System.out.println("-----------------------------------------------");
             total += 499.99;
             break;
    
             case 6: 
             System.out.println("-----------------------------------------------");
             System.out.println("El total a pagar es: " + total);//mostrara el total a apagar del usuario (el calculo se realiza automaticamente).
             System.out.println("-----------------------------------------------");
             break;
        
             case 7:
             salir = true;// Es true (verdadero) porque si seleccionas la opcion 7 el programa lee que si es valida la intruccion de boolean. 
             System.out.println("-----------------------------------------------");
             System.out.println("Compra finalizada.");//mensaje que comprueba que se termina el programa.
             break;

             default:// si no se selecciona ninguna opcion anterior o una incorrecta mandara un mensaje.
             System.out.println("Esta opcion no esta disponibles escoge 1 de la lista");
             break; 
            }
        } while (op1 !=7);/* finaliza cuando el usuario escoja la opcion 7, si no lo hace el programa continuara con su funcion.*/              
    } 
}
