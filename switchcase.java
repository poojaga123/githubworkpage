import java.util.Scanner;
public class program3
{
  public static void main(String args[])
  {
    int choice;
    System.out.println("coose one :1.hi\n2.hello\n3.world\n");
    Scanner sc=new Scanner(System.in);
    choice=sc.nextInt();
    switch(choice)
    {
      case 1:System.out.pritnln("you choosen Hi");
        break;
         case 2:System.out.pritnln("you choosen Hello");
        break;
         case 3:System.out.pritnln("you choosen world");
        break;
      default: System.out.pritnln("invalid choice");
    }
  }
}
        
