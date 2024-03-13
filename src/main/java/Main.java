import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Random;


  public class Main
  {
    public static void Suma()
    {
      /* Najpierw sumujemy liczby deklarowane przez użytkownika
      W dalszej części znajdować się będzie kod powodujący generowanie pięciu losowych liczb, podniesionych do kwadratu, a także wyświetlający ich sumę */
      int a = 0;
      int b = 0;

      Scanner SkanerSumy = new Scanner(System.in);
      System.out.println("Wprowadz wartosci dla zmiennych a oraz b :\n");

      try  
        {
          a = SkanerSumy.nextInt();
          b = SkanerSumy.nextInt();
        }
      catch (InputMismatchException e)
        {
          System.out.println("Wprowadzono niepoprawne dane!");
        }

      int suma = a + b;
      System.out.println("Suma wynosi: " + suma);

      // Koniec sumy wiadomych liczb, poniżej kod generujący pięć losowych liczb, podniesionych do kwadratu
      Random rand = new Random();

      int randomowa1 = rand.nextInt(100);
      int randomowa2 = rand.nextInt(100);
      int randomowa3 = rand.nextInt(100);
      int randomowa4 = rand.nextInt(100);
      int randomowa5 = rand.nextInt(100);

      double SumaRandomowychLiczb = (Math.pow((double)randomowa1)) + (Math.pow((double)randomowa2)) + (Math.pow((double)randomowa3)) + (Math.pow((double)randomowa4)) + (Math.pow((double)randomowa5));

      System.out.println("Suma randomowych liczb podniesionych do kwadratu: " + SumaRandomowychLiczb);

      //Kod jest, ale no nie dziala xD
    } 
  }