public class Main{
     public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println("O MDC Recursivo de " + a + " e " + b + " é " + MDC.recursivo(a, b));
        System.out.println("O MDC em Loop de " + a + " e " + b + " é " + MDC.loop(a, b));
    }
}