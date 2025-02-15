import java.util.*;
public class Max_Product{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    product1 = arr[n-1]*arr[n-2]*arr[n-3];
    product2 = arr[0]*arr[1]*arr[2];
    System.out.println(product1);
    System.out.println(product2);
    
  }
}
