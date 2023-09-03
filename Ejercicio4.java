import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        // Escriba una sentencia de Java que imprima true (verdadero), si numA y numB tienen el mismo signo (+/-)
        Scanner in = new Scanner(System.in);
        int n1,n2;
        System.out.println("Ingrese un número: ");
        n1=in.nextInt();
        System.out.println("Ingrese otro número: ");
        n2=in.nextInt();
        if (n1>=0 && n2>=0 || n1<0 && n2<0)
            System.out.println("TRUE");
    }
}

