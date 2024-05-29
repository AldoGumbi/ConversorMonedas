import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        String monedaA;
        String monedaB;
        ArrayList<String> historialConversiones = new ArrayList<>();
        Conversion convertir = new Conversion();

        while(opcion!=8) {
            try {
                System.out.println("\n----- Conversor de monedas -----");
                System.out.println("1._ De dolar a peso mexicano [USD - MXN]");
                System.out.println("2._ De dolar a euro [USD - EUR]");
                System.out.println("3._ De peso mexicano a dolar [MXN - USD]");
                System.out.println("4._ De peso mexicano a euro [MXN - EUR]");
                System.out.println("5._ De euro a peso mexicano [EUR - MXN]");
                System.out.println("6._ De euro a dolar [EUR - USD] ");
                System.out.println("7._ Escribe tus monedas\n\t(Solo si conoces el codigo de moneda)");
                System.out.println("8._ Salir");

                System.out.println("\nIngrese una opcion:");
                opcion = Integer.valueOf(lectura.nextLine());

                switch (opcion) {
                    case 1: {
                        System.out.println("\n ----- [USD -> MXN]  -----");
                        historialConversiones.add(convertir.conversionMoneda("USD","MXN"));
                        break;
                    }
                    case 2: {
                        System.out.println("\n ----- [USD -> EUR]  -----");
                        historialConversiones.add(convertir.conversionMoneda("USD","EUR"));
                        break;
                    }
                    case 3: {
                        System.out.println("\n ----- [MXN -> USD]  -----");
                        historialConversiones.add(convertir.conversionMoneda("MXN","USD"));
                        break;
                    }
                    case 4: {
                        System.out.println("\n ----- [MXN -> EUR]  -----");
                        historialConversiones.add(convertir.conversionMoneda("MXN","EUR"));
                        break;
                    }
                    case 5: {
                        System.out.println("\n ----- [EUR -> MXN]  -----");
                        historialConversiones.add(convertir.conversionMoneda("EUR","MXN"));
                        break;
                    }
                    case 6: {
                        System.out.println("\n ----- [EUR -> USD]  -----");
                        historialConversiones.add(convertir.conversionMoneda("EUR","USD"));
                        break;
                    }
                    case 7: {
                        System.out.println("\n ----- Escribe tus monedas  -----");
                        System.out.println("Ingresa la moneda base:");
                        monedaA = lectura.nextLine();
                        System.out.println("Ingresa la moneda a cambiar:");
                        monedaB = lectura.nextLine();
                        historialConversiones.add( convertir.conversionMoneda(monedaA,monedaB));
                        break;
                    }
                    case 8: {
                        System.out.println("\n------ Historial de Conversiones ------");
                        for (String historialConversion : historialConversiones) {
                            System.out.println(historialConversion);
                        }
                        break;
                    }
                    default: {
                        System.out.println("Opcion no valida, intente de nuevo.");
                        break;
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("[!] Opcion no valida: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizamos la aplicacion");
            }
        }
        System.out.println("Finalizo el programa");
    }
}



