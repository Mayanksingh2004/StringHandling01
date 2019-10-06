package Q11;

public class Define11 {
    private String string;
    private char ch;

    public Define11(String string, char ch) {
        this.string = string;
        this.ch = ch;
        index();
    }
    public void index() {
        int c = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                System.out.println(i);
            }

        }
    }
}
