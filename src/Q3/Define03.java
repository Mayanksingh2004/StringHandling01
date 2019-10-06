package Q3;

public class Define03 {
    private String str;
    private String strNew;
    private String strLower;

    public Define03(String str01) {
        this.str = str01;
        strNew=str01;
        strLower=str01.toLowerCase();
    }

    @Override
    public String toString() {
        for (int i = 0; i < str.length(); i++) {
            if(strLower.charAt(i)=='a'||strLower.charAt(i)=='e'||strLower.charAt(i)=='i'||strLower.charAt(i)=='o'||strLower.charAt(i)=='u'){
                strNew=strNew.replace(str.charAt(i),'*');
            }
        }
        System.out.println(strLower);
        return strNew;
    }
}
