package practice_5_teacher.lections;

public class TaskSolverSwitch {

    public static void main(String[] args) {

        System.out.println(TaskSolverSwitch.dayOfWeek(5));
        System.out.println(TaskSolverSwitch.describeSeason(Season.AUTUMN));

    }

    public static String dayOfWeek(int day) {

        String dayOfWeek="";

        switch (day){
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek="Введите цифры от 1 до 7";
        }
        return dayOfWeek;
    }

    // методы называем всегда глаголами
    // для метода создаём enum(перечисление
    public static String describeSeason(Season season) {

        String description = "";

        switch (season) {
            // break не нужен если действие в одну строчку, можно записывать кратко через ->
            // перечислили 4 из 4, поэтому default не нужен
            case WINTER -> description = "Зимам - холодно и снежно";
            case SUMMER -> description = "Лето - жарко";
            case SPRING -> description = "Весна - всё цветёт";
            case AUTUMN -> description = "Осень - снова в школу";
        }

        return description;
    }


}
