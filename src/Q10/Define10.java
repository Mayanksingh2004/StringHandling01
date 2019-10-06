package Q10;

public class Define10 {
    private String string;
    private char ch;

    public Define10(String string, char ch) {
        this.string = string;
        this.ch = ch;
        count();
    }
    public void count(){
        int c =0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)==ch){
                c++;
            }

        }
        System.out.println(c);
    }
}
