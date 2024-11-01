/**
 * Главный класс, демонстрирующий использование класса Player.
 */
public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[6];

        for (int i = 0; i < 6; i++) {
            players[i] = new Player();
        }
        Player.info();

        Player extraPlayer = new Player();
        Player.info();

        for (Player player : players) {
            while (player.getStamina() > 0) {
                player.run();
            }
        }

        System.out.println("Количество игроков на поле: " + Player.getCountPlayers());
    }
}