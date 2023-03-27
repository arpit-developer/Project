public class PrimeCheck
{
  public static void prime (int num)
  {
    int temp = 0;
    if (num == 0 || num == 1)
      {
	System.out.println (num + " is not prime number");
      }
    else
      {
	for (int i = 2; i < num - 1; i++)
	  {
	    if (num % i == 0)
	      {
		System.out.println (num + " is a prime number");
		temp = 1;
		break;
	      }
	  }
      }
    if (temp == 0)
      {
	System.out.println (num + " is a Prime Number");
      }
  }
  public static void main (String[]args)
  {
//              Scanner sc = new Scanner(System.in);
//              int num = sc.nextInt();
    prime (1);
    prime (3);
    prime (17);
    prime (20);
  }
}
