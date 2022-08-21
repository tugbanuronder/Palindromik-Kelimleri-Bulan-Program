import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str){

        String reverse = "";

        for(int i=str.length() - 1 ; i>=0 ; i--){

            reverse +=str.charAt(i);
        }
        if(str.equals(reverse)){

            System.out.println(str + " palindromik bir kelimedir.");
            return true;
        }
        else {

            System.out.println(str + " palindromik bir kelime değildir.");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Palindromik olup olmadığına bakmak istediğiniz kelimeyi giriniz : ");
        String word=input.nextLine();

        isPalindrome(word);


    }
}