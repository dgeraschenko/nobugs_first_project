package practice_4;

public class GameSettings {

    // поля класса
    static int maxPlayers = 30;

    final String gameName;

    int currentPlayers;

    // конструктор
    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }



    // геттеры



    // сеттеры


    // методы
    static void setMaxPlayers(int maxPlayers) {
        GameSettings.maxPlayers = maxPlayers;
    }

    void addPlayer() {
        currentPlayers++;
    }

    void printGameStatus() {
        System.out.println("gameName: " + gameName);
        System.out.println("maxPlayers: " + maxPlayers);
        System.out.println("currentPlayers: " + currentPlayers);
        System.out.println();
    }



}
