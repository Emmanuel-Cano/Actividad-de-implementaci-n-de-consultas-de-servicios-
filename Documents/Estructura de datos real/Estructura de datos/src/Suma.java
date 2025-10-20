public class Suma{
public static int suma (int n){
    

    if (n == 0){
        return 0;
    } else {
        return n + suma(n - 1);
    }
}
public static void main(String[] args) {
    int resultado = suma(10);
    System.out.println("La suma es: " + resultado);
}
}