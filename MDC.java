public class MDC{
  public static int recursivo(int a, int b) {
      if (b == 0) {
        return a;
      }
      return recursivo(b, a % b);
    } 

  public static int loop(int a, int b){
      while (b != 0) {
          int resto = a % b;
          a = b;
          b = resto;
        }
        return a;
  }

  
}

