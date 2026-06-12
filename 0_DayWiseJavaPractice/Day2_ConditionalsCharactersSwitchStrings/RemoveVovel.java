import java.util.Scanner;
// You are using Java
class RemoveVovel{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine().toLowerCase();
     for(int i=0; i!=str.length(); i++){
         
        if( str.charAt(i) =='a' || str.charAt(i) =='e' ||  
            str.charAt(i) =='i' || str.charAt(i) =='o' ||  
            str.charAt(i) =='u'  
          )  continue;
        else System.out.print(str.charAt(i));
    }
}}