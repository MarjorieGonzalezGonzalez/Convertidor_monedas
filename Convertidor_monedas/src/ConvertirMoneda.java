import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ConvertirMoneda {
    public static void  convertir (String baseMoneda, String targetMoneda, ConsultaValorMoneda consultaValorMoneda, Scanner lectura){
        double cantidad;
        double cantidadConvertida;
        Pais pais;
        pais=consultaValorMoneda.BuscaValor(baseMoneda, targetMoneda);
        System.out.println("La taza de conversión para hoy es de : "+baseMoneda + "="+pais.conversion_rate()+" " +targetMoneda);
        System.out.println("Ingrese la cantidad de " + baseMoneda);
        cantidad =Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * pais.conversion_rate();
        System.out.println(cantidad + " " + baseMoneda + " = " + cantidadConvertida + " " + pais.target_code());
    }

    public static void convertirOtraMoneda ( ConsultaValorMoneda consultaValorMoneda,Scanner lectura){
        System.out.println("Ingresa la moneda base");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingresa la moneda a la que deseas cambiar");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase,monedaObjetivo, consultaValorMoneda, lectura);
    }
}

