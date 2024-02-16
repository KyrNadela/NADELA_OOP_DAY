package nadela.lab.activity.pkg1.pkg2;

import java.util.Scanner;


public class NadelaLabActivity12 {

    static Scanner Haha = new Scanner (System.in);
    public static void main(String[] args) {
            
            System.out.print("Enter the message: ");
        String cute = Haha.nextLine();

        String[] si = cute.split("\s+");

        boolean wala = false;

        for(String word: si){
            for(int i = 1; i < word.length(); i++){
                if(Character.isUpperCase(word.charAt(i))){ 
                    wala = true;
                    break;
                }
            }
        }

        if(wala){
            System.out.println("JEJE!");
        } else{
            System.out.println("uWu");
            }
                  
        }
    }
}
