public class siete {
    public static void main(String[] args) {
        int x=1, y=2, z=3;
         // 7. DADA LA SIGUIENTE SENTENCIA ,ENCONTRAR EL RESULTADO 
        if(++x>y++ || x-- > 0)
            z++;
        else 
            z--;
        System.out.println(x + " " + y + " " + z); 
            // RESULTADO = 1 3 4 
    }
}
