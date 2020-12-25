import java.util.Random;

public class Dice {
    private int val;

    public int getVal() {
        return val;
    }

    private Dice(int val){
        this.val = val;
    }
    private static Dice[] DICES = new Dice[]{
            new Dice(1), new Dice(2), new Dice(3), new Dice(4), new Dice(5), new Dice(6)
    };
    public static Dice rollTheDice(){
        Random r = new Random();
        return DICES[r.nextInt(6)];
    }
    public static void main(String[] args) {

        int[] times = new int[6];
        for(int i = 1; i <= 1000; i++){
            times[Dice.rollTheDice().getVal() - 1]++;
        }
        for(int i = 1; i <= 6; i++){
            System.out.println("值为"+i+"的面出现了"+times[i - 1] + "次");
        }
    }

}
