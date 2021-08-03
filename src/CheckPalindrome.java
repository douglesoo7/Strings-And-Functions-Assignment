import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean check=false;
        for (int i=0,j=str.length()-1;i<j;i++,j--){
            if (str.charAt(i)==str.charAt(j)){
                check=true;
            }
            else{
                check=false;
                break;
            }
        }
        if (check) System.out.println("Given String is Palindrome");
        else System.out.println("Given String is not Palindrome");
    }
}
