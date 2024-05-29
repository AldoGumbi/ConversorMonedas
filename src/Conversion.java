import java.time.LocalDateTime;

public class Conversion {


    public String conversionMoneda(String monedaBase, String monedaCambio){

        //Consulta a la Api para poder usar el metodo obtenerMonedas
        ConsultaApi consulta = new ConsultaApi();

        //String para guardar el resultado de la conversion
        String conversion;

        /*Var de tipo Cambio para porder usar el metodo Cambio que genera la operacion para retornar el resultado
        de multiplicar la cantidad de monedas que queremos cambiar por la conversion de moneda*/
        Cambio cambiar = new Cambio();

        //String que usaremos para retornar y poder guardarla en un ArrayList
        String registroHistorial;

        //Moneda para poder obtener los atributos result y convresion_rate del JSON del API
        Moneda moneda = consulta.obtenerMonedas(monedaBase, monedaCambio);

        //If donde si moneda.result es igual a success (igual a que si funciono la consulta) ejecuta la operaicon
        if (moneda.result().equals("success")) {

            //Conversion toma el valor de la operacion de cantidad*cambio que es el valor de cambiar las monedas
            conversion = String.format("%.2f", cambiar.Cambio(moneda.conversion_rate()));

            System.out.println("\t El resultado es: " + conversion + monedaCambio+".\n");

            //registroHistorial genera un String en formato para mostrar Fecha_Hora y el resultado en el ArrayList
            registroHistorial = (LocalDateTime.now() + "\n" +
                    "[" + String.format("%.1f", cambiar.cantidadCambiar) + " "+monedaBase+"] = [" + conversion + " "+monedaCambio+"]\n\n");
            return registroHistorial;
        }
        else {
            System.out.println("[!]Error: No se encontraron las monedas");
            registroHistorial = (LocalDateTime.now() + "\n" +
                    "[!] Monedas no encontradas\n\n");
            return registroHistorial;
        }
    }
}
