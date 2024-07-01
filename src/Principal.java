import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("""
                ******************************************
                        
                Bienvenidos al conversor de monedas Karalz
                        
                ******************************************
                        
                Tenemos las siguientes opciones para ti
                --*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                **************************************
                        1. Dólares a pesos Colombianos
                        2. Pesos Colombianos a dólares
                        3. Dólares a reales Brasil
                        4. Reales Brasil a dólares
                        5. Dolares a peso Argentino
                        6. Peso Argentino a dólares\s
                        7. Salir\s
                ************************************""");


        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        String moneda = "";
        String convertir = "";
        /*double cantidad = 0;*/
        double cantidad = 0;
        while (opcion != 7) {
            System.out.println("Ingrese la opcion con la que desea proceder: ");
            opcion = lectura.nextInt();

            if (opcion != 7) {

                System.out.println("Ingrese la cantiad a convertir: ");
                cantidad = lectura.nextInt();
                switch (opcion) {
                    case 1:
                        moneda = "USD";
                        convertir = "COP";
                        break;
                    case 2:
                        moneda = "COP";
                        convertir = "USD";
                        break;
                    case 3:
                        moneda = "USD";
                        convertir = "BRL";
                        break;
                    case 4:
                        moneda = "BRL";
                        convertir = "USD";
                        break;
                    case 5:
                        moneda = "USD";
                        convertir = "ARS";
                        break;
                    case 6:
                        moneda = "ARS";
                        convertir = "USD";
                        break;
                }
            }
            solicitudMoneda consulta = new solicitudMoneda();
            Moneda conversor = consulta.consultaMoneda(moneda, convertir, cantidad);
            System.out.println(conversor);
        }

        System.out.println(""" 
        --*---*--*----*--*--*-*--*--*-*--*
        *** *** ** ** ** ** ** ** ** ** ** 
        
        Gracias por usar nuestro servicio
        
        VUELVA PRONTO
        
        --*---*--*----*--*--*-*--*--*-*--*
        *** *** ** ** ** ** ** ** ** ** **
        """);

    }
}
