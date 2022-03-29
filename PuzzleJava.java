import java.util.ArrayList;
import java.util.Random;

class PuzzleJava {

    public static ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random randMachine = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(randMachine.nextInt(20));
        }

        return list;
    }

    public static char getRandomLetter() {
        char myChar;
        char alphabet[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Random randMachine = new Random();
        myChar=alphabet[randMachine.nextInt(25)];
        return myChar;
    }

    public static String generatePassword() {
        String password="";
        while(password.length()<8)
        {
            password += getRandomLetter();
        }
        System.out.println(password);

        return password;
    }

    public static ArrayList<String>getNewPasswordSet(int amount) {
        ArrayList<String> list= new ArrayList<String>();
        while(list.size()<amount)
        {
            list.add(generatePassword());
        }

        return list;
    }
}