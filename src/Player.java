import java.util.Random;

/**
 * Класс, представляющий игрока на футбольном поле.
 */
public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    /**
     * Конструктор класса Player.
     * Генерирует случайное значение выносливости от 90 до 100 и увеличивает счетчик игроков на поле.
     */
    public Player() {
        Random random = new Random();
        this.stamina = random.nextInt(11) + 90;
        countPlayers++;
    }

    /**
     * Возвращает текущую выносливость игрока.
     *
     * @return текущая выносливость игрока
     */
    public int getStamina() {
        return stamina;
    }

    /**
     * Метод, который уменьшает выносливость игрока на 1 при каждом вызове.
     * Если выносливость достигает 0, игрок уходит с поля.
     */
    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
                System.out.println("Игрок устал и ушел с поля.");
            }
        }
    }

    /**
     * Статический метод, который выводит информацию о количестве свободных мест на поле.
     */
    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    /**
     * Статический метод, возвращающий количество игроков на поле.
     *
     * @return количество игроков на поле
     */
    public static int getCountPlayers() {
        return countPlayers;
    }
}
