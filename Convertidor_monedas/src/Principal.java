import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaValorMoneda consultaValorMoneda = new ConsultaValorMoneda();
        int opcion = 0;
        while (opcion != 10) {
            System.out.println("**********************************\n" +
                    "Bienvenido/a ingresa una opción\n" +
                    "1.Dolar a Peso Argentino\n" +
                    "2.Peso Argentino a Dolar\n" +
                    "3.Dolar a Real Brasilero\n" +
                    "4.Real Brasilero a Dolar\n" +
                    "5.Dolar a Peso Colombiano\n" +
                    "6.Peso Colombiano a Dolar\n" +
                    "7.Dolar a Peso Chileno\n" +
                    "8.Peso Chileno a Dolar\n" +
                    "9.Otra moneda\n" +
                    "10.Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consultaValorMoneda, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARG", "USD", consultaValorMoneda, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consultaValorMoneda, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consultaValorMoneda, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consultaValorMoneda, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consultaValorMoneda, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertir("USD", "CLP", consultaValorMoneda, lectura);
                    break;
                case 8:
                    ConvertirMoneda.convertir("CLP", "USD", consultaValorMoneda, lectura);
                    break;
                case 9:
                    ConvertirMoneda.convertirOtraMoneda(consultaValorMoneda, lectura);
                    break;
                case 10:
                    System.out.println("Gracias por su preferencia, hasta luego...\n");
                    System.out.println("**********************************");
                    break;
                default:
                    System.out.println("opción no valida");
                    break;
            }
        }
    }
}
