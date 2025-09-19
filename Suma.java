public class Suma{
public static int suma (int n){
    

    if (n == 0){
        return 0;
    } else {
        return n + suma(n - 1);
    }
}
public static void main(String[] args) {
    int resultado = suma(5);
    System.out.println("La suma es: 5 + 4 + 3 + 2 + 1 + 0 = " + resultado);
}
}