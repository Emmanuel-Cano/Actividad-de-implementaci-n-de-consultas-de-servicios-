import java.util.Arrays;

public class App{
    public static void main(String[] args) {
        
        //declaración
        int[] arrA;
        //inicialización
        arrA = new int[5];

        //declaración e inicialización
        int[] arrB = new int[5];

        //declaración e inicialización con valores
        double [] arrD={2,3,4,5,6,6};
        int[] arrC = new int[]{1,2,3,4,5}; //esta desde java 10

        System.out.println(arrA[0]);
        System.out.println(arrD[4]);

        //Modificacion de un valor
        arrA[0]=10;

        // tamaño
        System.out.println(arrA.length); // es un atributo

         for(int i=0; i<arrA.length; i++){
            System.out.println(arrA[i]); 
          
        }

        int i=0;
        for (int num : arrC) {
            System.out.println(num);
            i++;
            
        }

        //Otra forma de imprimir, pero mediante el uso de la clase Arrays
        System.out.println(Arrays.toString(arrA));

        //copiar arreglos
        int[] arrE = arrA;
        arrA[0] = 5;
        System.out.println(arrE[0]);

        System.out.println(arrE[5]);

        //IndexOutOfBoundsException es igual a un indeice que no existe
}
}