public class Robot {
    private int[] loc = new int[]{0, 0};

    public void stepUP() {
        loc[0]++;
    }

    public void stepDOWN() {
        loc[0]--;
    }

    public void stepLEFT() {
        loc[1]++;
    }

    public void stepRIGHT() {
        loc[1]--;
    }

    public int[] getLoc() {
        return loc;
    }
}
