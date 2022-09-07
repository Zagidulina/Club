import java.util.Scanner;

public class Club {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вход в клуб с 21 года");
        System.out.println("Как вас зовут?");

        String name = scanner.nextLine();
        System.out.println("Сколько вам лет?");
        int age = scanner.nextInt();

        if (age > 21) {
            System.out.println("Уважаевый" + " " +  name + " " + "проходите");
        }
        else {
            System.out.println("Уважаемый" + " " + name + " " + "вам меньше 21 года");
        }
    }
}
