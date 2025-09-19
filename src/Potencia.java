public class Potencia {
    public static int potencia(int a, int b) {
      
        if (b == 0) {
            return 1;
        }
        return a * potencia(a, b - 1);
    }

    public static void main(String[] args) {
          int a = 2;
        int b = 5;
        System.out.println("El resultado de " + a + " a la " + b + " = " + potencia(a, b));
    }
}
