import java.util.*;
public class stringConvert{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";

        for(int i = 0; i<str.length(); i++){
           
            if(str.charAt(i) == 'e'){  // no duble quote can be used....
                result += "i";
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);

        
    }
}