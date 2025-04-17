class Die{
    public static int roll(){
        int minValue=1;
        int maxValue=6;
        int randomNumber=(int)(Math.random()*maxValue)+minValue;
        return randomNumber;
    }
}
public class Main {
    public static String bar(int qty) {
        String output="";
        for (int b = 0; b < qty; b++) {
            output+="#";

        }
        return output;
    }

    public static void main(String[] args) {
        //3-18 are the possible results
        int[] counters = new int[16]; //16 slots 18-3
        //roll roll roll *500
        for (int i = 0; i < 500; i++) {
            int value = Die.roll() + Die.roll() + Die.roll();
            counters[value - 3]++; //++ is increase one (+1)
        }
        //print qty for each slot
        for (int s = 3; s <= 18; s++) {
            int qty = counters[s - 3];
            System.out.printf("|%s (%d:%d)\n", bar(qty),s,qty);
        }
    }
}






