//trees-arranged row-wise-mango trees in first and last column and first row-find if a tree is mango
import java.util.*;
public class Main {
  public static void main(String[] args) {
  	int r,c,t;
    Scanner s=new Scanner(System.in);
    r=s.nextInt();
    c=s.nextInt();
    t=s.nextInt();
    if((t<=r && t>0)||(t%r==1)||(t>r*(c-1) && t<=r*c)){
    System.out.println("Mango");}
    else{
    System.out.println("Not mango");
  }
}
}
