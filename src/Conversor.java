import java.util.Scanner;

public class Conversor {
    Scanner lectura= new Scanner(System.in);
    ConsultaMoneda consulta = new ConsultaMoneda();

    // *** Métodos *****
    public void convertir(String monedaOriginal, String monedaFinal){
        System.out.println("Ingresa el valor que deseas convertir");
        float valor = lectura.nextFloat();
        Moneda moneda = consulta.buscaMoneda(monedaOriginal);
        float resultado = (float) (valor * (moneda.conversion_rates().get(monedaFinal)));
        System.out.println("El valor " + valor + " " + monedaOriginal + " corresponde al valor final =>>> " + resultado + " " + monedaFinal);
    }

}
