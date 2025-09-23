class Invertir{

     public static String invertir(String cadena) {
        if (cadena.isEmpty()) {
            return cadena;
        } else {
            return invertir(cadena.substring(1)) + cadena.charAt(0);
        }

}
    public static void main(String[] args) {
        String cadena = "Hola";
        String cadenainver = invertir(cadena);
        System.out.println("La cadena original: " + cadena);
        System.out.println("La cadena invertida: " + cadenainver);
}
}
    //Hola
    //ola
    //la
    //a
    //
    //
    //a
    //al
    //alo
    //aloH
    
