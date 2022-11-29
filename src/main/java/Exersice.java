import java.security.SecureRandom;
import java.util.*;


public class Exersice {

    public static List<String> vectorGet = Arrays.asList(
            "knee",
            "hip",
            "vertpush",
            "horpush",
            "vertpull",
            "horpull",
            "core",
            "motion",
            "jump"
    );


    public static List<String> vector = Arrays.asList(
            "Колено",
            "Таз",
            "Жимы верт",
            "Жимы гор",
            "Тяги верт",
            "Тяги гор",
            "Кор",
            "Бёрпи",
            "Прыжки"
    );

    public static List<String> technique = Arrays.asList(
            "ТАшка",
            "Гимнастика"
    );

    public static List<String> strenght = Arrays.asList(
            "Ноги",
            "Руки"
    );

    public static List<String> knee = Arrays.asList(
            "Присед на спине",
            "Присед фронт",
            "Сплит присед",
            "Прыгающий присед",
            "Выпады",
            "Зашагивания",
            "Рывок штанги в сед",
            "Взятие штанги в сед",
            "Прыгающий выпад",
            "Прыжки на тумбу",
            "Прыжки через тумбу",
            "Броски мяча",
            "Трастер с гантелями",
            "Трастер со штангой"
    );

    public static List<String> hip = Arrays.asList(
            "Взятие штанги в стойку",
            "Рывок в стойку",
            "Становая тяга",
            "Махи гирей Россия",
            "Махи гирей Америка",
            "Кор",
            "Локомоции"
    );

    public static List<String> vertpush = Arrays.asList(
            "Жим стоя",
            "Жимовой швунг",
            "Рывок гантели с виса",
            "Рывок гантели с пола",
            "Рывок гири",
            "ХСПУ",
            "Швунг толчковый",
            "Wall Walk"
    );

    public static List<String> horpush = Arrays.asList(
            "Релиз отжимания",
            "Отжимания на брусьях",
            "Выходы на брусьях",
            "Жимы гор",
            "Тяги верт",
            "Тяги гор",
            "Кор",
            "Локомоции"
    );

    public static List<String> vertpull = Arrays.asList(
            "Колено",
            "Таз",
            "Жимы верт",
            "Жимы гор",
            "Тяги верт",
            "Тяги гор",
            "Кор",
            "Локомоции"
    );

    public static List<String> horpull = Arrays.asList(
            "Под",
            "Таз",
            "Жимы верт",
            "Жимы гор",
            "Тяги верт",
            "Тяги гор",
            "Кор",
            "Локомоции"
    );

    public static List<String> core = Arrays.asList(
            "Ситапы",
            "НКП",
            "ГХД",
            "X-складка",
            "V-складка",
            "Холлоу",
            "Турецкие ситапы",
            "Локомоции"
    );

    public static List<String> motion = Arrays.asList(
            "Бёрпи",
            "Бёрпи на диск",
            "Бёрпи боком",
            "Бёрпи фронт",
            "Бёрпи турник",
            "Жимы дьявола"
    );

    public static List<String> jump = Arrays.asList(
            "Двойные прыжки",
            "Джампинг Джекки",
            "Прыжки через гантель боком"
    );

    public static void printList(List<String> list) {
        System.out.println("Выбери вектор упражнения");
        for (String s : list) {
            System.out.println((list.indexOf(s) + 1) + "." + s);
        }
        System.out.println();
    }


    // TODO: 29.11.2022 Выбрать рандомый элемент из списка * рабочий метод
    public static String randomElements(List<String> i) {
        var random = new SecureRandom();
        var randomElement = i.get(random.nextInt(i.size()));
        return randomElement;
    }

    // TODO: 29.11.2022 попробовать шлёпнуть циклом и как-то передать туда
    //  элементы например из списка
    public static void randomChoice() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                randomElements(knee);
                break;
            case 2:
                randomElements(hip);
                break;
            case 3:
                randomElements(vertpush);
                break;
            case 4:
                randomElements(horpush);
                break;
            case 5:
                randomElements(vertpull);
                break;
            case 6:
                randomElements(horpull);
                break;
            case 7:
                randomElements(core);
                break;
            case 8:
                randomElements(motion);
                break;
            case 9:
                randomElements(jump);
                break;
        }
    }




}
