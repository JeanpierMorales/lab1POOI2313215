import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         * 5. Utiliza la sentencia switch para escribir una sentencia de Java que imprima los siete días de la
        semana de acuerdo al número ingresado. Asegúrate de usar la clase Scanner para capturar los
        datos que ingresa el usuario a través de un dispositivo de entrada (Por ejemplo, el teclado).
         */
        
         // EMPECE EJEMPLIFICANDO LOS IF ANIDADOS COMO HIZO EN LA CLASE  

        System.out.println("INGRESE EL NUMERO PARA VER EL DÍA");
        int n;   
        n= in.nextInt();
        if (n==1){
            System.out.println("LUNES");
        } else {
            if (n==2){
                System.out.println("Martes");
            }else {
            if (n==3){
                System.out.println("Miercoles");
            }else {
            if (n==4){
                System.out.println("Jueves");
            }else {
            if (n==5){
                System.out.println("Viernes");
            }
            else {
            if (n==6){
                System.out.println("Sabado");
            }else {
            if (n==7){
                System.out.println("Domingo");
            }
            }
            }
            }
            }
            }
            }
            
            
            // LUEGO USANDO UN SWITCH


            int n2;
            System.out.println("INGRESE EL NUMERO PARA VER EL MES");
            n2= in.nextInt();
            switch (n2) {
            case 1:
                System.out.println("ENERO");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                throw new AssertionError("LO INTRODUCIDO NO ES VALIDO8");
        }
    }
}

