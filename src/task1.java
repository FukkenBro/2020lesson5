
import java.util.Arrays;
import java.util.Random;

public class task1 {

//    1. Есть поле из клеток посредине которого находится робот. Робот умеет выполнять 4 команды:
//    двигаться на 1 клетку в сторону: R (right), L (left), U (up), and D (down).
//    Задана строка из движений робота например "UUDLDR".
//    Написать метод который вернет true если робот вернется в ту же клетку с которой начал.
//    Input: "UD"
//    Output: true
//    Input: "LL"
//    Output: false

    public static final Random RANDOM = new Random();
    public static final int steps = 5;

    public static void main(String[] args) {
        String path = generatePath();
        System.out.println("Path = " + path);
        System.out.println(runRobot(path));

    }

    public static String generatePath() {
        char[] ch = new char[]{'U', 'D', 'L', 'R'};
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < steps; i++) {
            sb.append(ch[RANDOM.nextInt(ch.length)]);
        }
        return sb.toString();
    }

    public static boolean runRobot(String path) {
        Robot robot = new Robot();
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            switch (dir) {
                case ('U'):
                    robot.stepUP();
                    break;
                case ('D'):
                    robot.stepDOWN();
                    break;
                case ('L'):
                    robot.stepLEFT();
                    break;
                case ('R'):
                    robot.stepRIGHT();
                    break;
            }
        }
        return Arrays.equals(robot.getLoc(), new int[]{0, 0});
    }
}
