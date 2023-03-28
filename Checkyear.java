import java.util.*;
public class Checkyear
{
  public static void main (String[]args)
  {
    System.out.println ("Enter the number");
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt ();
    sc.close();
    switch (num)
      {
      case 1: System.out.println("Jan");
      break;
      case 2: System.out.println("Feb");
      break;
      case 3: System.out.println("March");
      break;
      case 4: System.out.println("Apr");
      break;
      case 5: System.out.println("may");
      break;
      case 6: System.out.println("june");
      break;
      case 7: System.out.println("july");
      break;
      case 8: System.out.println("aug");
      break;
      case 9: System.out.println("sept");
      break;
      case 10: System.out.println("oct");
      break;
      case 11: System.out.println("nov");
      break;
      case 12: System.out.println("dec");
      break;
      default:
	System.out.println ("Not valid Input");
      }
  }
}
