package Q9;

public class Define09 {
    private String str;
    private int upperWeight=0;
    int lowerWeight=0;

    public Define09(String str) {
        this.str = str;
        upperWeight();
        lowerWeight();;
    }
    public void upperWeight() {
        for (int i = 0; i < str.length(); i++) {
            if((int)str.charAt(i)<96 ){
                upperWeight=upperWeight+(int)str.charAt(i);
            }
        }
    }
    public void lowerWeight() {
        for (int i = 0; i < str.length(); i++) {
            if((int)str.charAt(i)>96  ){
                lowerWeight=lowerWeight+(int)str.charAt(i);
            }
        }
        System.out.println(upperWeight-lowerWeight);
    }

}
