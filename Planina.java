import java.util.*;
import java.lang.Math;

public class Planina{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    double sum=2;
    for(int i=0 ; i<n ; i++){
        sum=sum+Math.pow(2,i);
    }
    System.out.println((int)Math.pow(sum,2));
  }
}
