package Q8;

public class Define08 {
    private String str;

    public Define08(String str) {
        this.str = str;
        upperWeight();
    }
    public void upperWeight() {
        int upperWeight=0;
        for (int i = 0; i < str.length(); i++) {
            if((int)str.charAt(i)<96 ){
                upperWeight=upperWeight+(int)str.charAt(i);
            }
        }
        System.out.println(upperWeight);
    }
}
