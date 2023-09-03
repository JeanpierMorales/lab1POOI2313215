import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 3. Escriba una sentencia de Java que imprima true (verdadero), si tanto numA como numB son números positivos.
        int n1,n2;
        System.out.println("Ingrese un número: ");
        n1=in.nextInt();
        System.out.println("Ingrese otro número: ");
        n2=in.nextInt();
        if (n1>=0 && n2>=0)
            System.out.println("TRUE");
    }
}

