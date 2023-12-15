import java.util.*;

import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Talon> queue = new LinkedList<>();
        Bank bank = new Bank();
        int count = 99;

        loop:
        while (true){
            try {
                menu(queue);
                if (count >= 1000){
                    count = 99;
                }
                switch (scanner.nextInt()){
                    case 0 -> {break loop;}
                    case 1 -> {
                        count++;
                        System.out.println(bank.perevody(count, queue));
                    }
                    case 2 -> {
                        count++;
                        System.out.println(bank.kassa(count, queue));
                    }
                    case 3 -> {
                        count++;
                        System.out.println(bank.urLits(count, queue));
                    }
                    case 4 -> System.out.println(bank.call(queue));
                    default -> System.out.println("Incorrect choice");
                }
            } catch (InputMismatchException e){
                System.out.println("enter valid integer");
            }
        }
    }
    public static void menu(Queue<Talon> queue){
        System.out.println(STR."""
                0. exit
                1. переводы
                2. касса
                3. Юр лиц
                4. вызов
                \{queue}
                """);
    }



    public static String method(String str, String object){
        if (!object.equalsIgnoreCase(str) && object.endsWith("@gmail.com") && object.length() >= 11){
            return "1";
        }
        return "0";
    }
}