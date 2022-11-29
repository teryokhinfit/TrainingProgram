import java.util.Scanner;

public class Main extends Exersice {
    public static void main(String[] args) {



        System.out.println("Давай создадим тренировку брат");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println(
                        "1.Тренировка силы" +
                        "\n2.Тренировка техники" +
                        "\n3.Собрать меткон" +
                                "\n==> 0 <== Пойти писать самому");
                int choice = scanner.nextInt();
            if (choice ==0) {
                System.out.println("Ну иди и пиши сам еблан =)");
                break;
            }

            switch (choice) {
                case 1:
                    printList(strenght);
                    break;
                case 2:
                    printList(technique);
                    System.out.println("Выводится список веткоров");
                    break;
                case 3:
                    printList(vector);
                    randomChoice();

                    break;
            }
            break;
            }

        }
        System.out.println("Вот это дерьмо ты собрал");
    }
}
