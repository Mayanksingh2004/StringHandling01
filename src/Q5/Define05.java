package Q5;

public class Define05 {
    private  String str;
    private  String str1;
    private String str0;

    public Define05(String str0,String str,String str1) {
        this.str = str;
        this.str1=str1;
        this.str0=str0;
    }

    @Override
    public String toString() {
        return str0.replaceAll(str,str1);
    }
}
