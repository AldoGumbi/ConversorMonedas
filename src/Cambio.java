import java.util.Scanner;

public class Cambio{
        double cantidadCambiar;

    //cambio es el valor de lo que cuesta cambiar una moneda
    public double Cambio(double cambio){

        //Scanner para poder capturar el teclado
        Scanner lectura = new Scanner(System.in);

        //Var que guarda la cantidad de moneda base que queremos convetir
        double cantidad=0;

        System.out.println("Ingresa la cantidad para convertir:");

        //cantidad tomara el valor en double de lo que se captura
        cantidad=Double.valueOf(lectura.nextLine());

        //Se modifica el valor cantidadCambiar para acceder a este desde fuera de la clase
        this.cantidadCambiar=cantidad;

        System.out.println("( "+cantidad+" * "+ cambio +" )");

        //Se retorna el valor de cantidad por el valor de cambio de la moneda a cambiar
        return (cantidad*cambio);

    }

}
