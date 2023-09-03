import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 2. Escriba una sentencia de Java que imprima true (verdadero), si num es un número impar y positivo
        int num;
        System.out.println("Ingrese un número: ");
        num=in.nextInt();
        if ((num%2) !=0 && num>0)
            System.out.println("TRUE");
    }
}
