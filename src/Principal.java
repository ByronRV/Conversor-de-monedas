import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        Conversor cambio = new Conversor();
        boolean loop = true;

        while (loop){
            System.out.println("*************************************************");
            System.out.println("Sea bienvenido/a al conversor de monedas =) \n");
            System.out.println("1) Dólar =>> Peso argentino ");
            System.out.println("2) Peso argentino =>> Dólar ");
            System.out.println("3) Dólar =>> Real brasileño ");
            System.out.println("4) Real brasileño =>> Dólar ");
            System.out.println("5) Dólar =>> Peso colombiano ");
            System.out.println("6) Peso colombiano =>> Dólar ");
            System.out.println("7) Salir ");
            System.out.println("Elija una opción válida:");
            System.out.println("*************************************************\n");
            int opcion = lectura.nextInt();

            switch (opcion){
                case 1:
                    cambio.convertir("USD", "ARS");
                    break;
                case 2:
                    cambio.convertir("ARS", "USD");
                    break;
                case 3:
                    cambio.convertir("USD", "BRL");
                    break;
                case 4:
                    cambio.convertir("BRL", "USD");
                    break;
                case 5:
                    cambio.convertir("USD", "COP");
                    break;
                case 6:
                    cambio.convertir("COP", "USD");
                    break;
                default:
                    System.out.println("Gracias por usar mi programa");
                    loop = false;
            }
        }

    }
}
