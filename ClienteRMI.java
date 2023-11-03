import java.rmi.Naming;
import java.util.Scanner;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            ServicioOperaciones servicio = (ServicioOperaciones) Naming.lookup("rmi://localhost/ServicioOperaciones");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce primer valor:");
            float a= scanner.nextFloat();
            System.out.println("Introduce segundo valor:");
            float b= scanner.nextFloat();
            String calculo1 = servicio.calcularSuma(a,b);
            String calculo2 = servicio.calcularResta(a,b);
            String calculo3 = servicio.calcularMulti(a,b);
            String calculo4 = servicio.calcularDiv(a,b);
            System.out.println("Resultado suma:"+calculo1);
            System.out.println("Resultado resta:"+calculo2);
            System.out.println("Resultado multiplicacion:"+calculo3);
            System.out.println("Resultado division:"+calculo4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
