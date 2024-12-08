class Computer {
    public void PlayMusic() {
        System.out.println("Music Playing...");
    }

    public String getPen(int cost) {
        if (cost >= 10) {
            return "pen";
        } else {
            return "Nothing";
        }

    }
}

public class demo {
    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.PlayMusic();
        String str = obj.getPen(11);
        System.out.println(str);
    }

}
