/* 12.- Escriba un diagrama que muestre 100 asteriscos, uno por uno. Después de cada décimo asterisco, su diagrama deberá imprimir un carácter de nueva línea. 
Sacchetti, Maria Giselle C2*/

public class Main {
  public static void main(String[] args) {
   
    int i = 0;
    while (i < 100){
      System.out.print("* ");
      i++;
      if (i % 10 == 0){
        System.out.println("\n");
      }
    }

  }
}