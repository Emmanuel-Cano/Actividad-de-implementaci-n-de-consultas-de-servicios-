
public class Fibonacci {
    public static void main(String[] args) {
/*         System.out.println("¿Cuántos números de Fibonacci quieres mostrar?");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();*/
        int n = 5; 

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println(); 


    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}