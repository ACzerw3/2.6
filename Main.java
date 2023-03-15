import java.awt.PrintJob;

class Main {
  public static void main(String[] args) 
  {
    int a,b;
    a=0;
    System.out.println("stopnie C   stopnie F");
    for (int i=0; i<16; i++)
      {
        b = a*9/5+32;
        System.out.print("    "+a);
        System.out.println("         "+b);
        a = a + 20;
      }
  }
}