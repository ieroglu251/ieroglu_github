package Cybertek_Class_Notes;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();

        // Your code here
        //------------------------------------------------

        if(n1.length() < 8)
            System.out.println( "Password should contain minimum 8 characters ");
        for(int i = 0; i< n1.length(); i++){
            if(n1.charAt(i) < 'A' && n1.charAt(i)>'Z'){
                System.out.println("Password should contain at least 1 uppercase number \n" );
            }

            if(n1.charAt(i) < 'a' && n1.charAt(i)>'z'){
                System.out.println(  "Password should contain at least 1 lowercase number ");

            }

            if( n1.charAt(i) < 1 && n1.charAt(i)>9){
                System.out.println( "Password should contain at least 1 digit");
            }
        }



        System.out.println( n1);

    }
}
