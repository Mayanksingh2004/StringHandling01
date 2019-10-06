package Q2;

public class Define02 {
    private String str;
    private int index;

    public Define02(String str, int index) {
        this.str = str;
        this.index = index;
    }

    @Override
    public String toString() {

        return str.substring(index);
    }
}
