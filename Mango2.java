//trees arranged col-wise--mango trees in second column from first and last--find if a tree is mango
import java.util.*;
public class Main {
  public static void main(String[] args) {
  	int r,c,t;
    Scanner s=new Scanner(System.in);
    r=s.nextInt();
    c=s.nextInt();
    t=s.nextInt();
    if((t>r && t<=r*r)||(t>r*(c-2) && t<r*(c-1))){
    System.out.println("Mango");}
    else{
    System.out.println("Not mango");
  }
}
}
