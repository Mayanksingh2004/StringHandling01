package Q4;

public class Define04 {
    private String str;
    private String strNew;
    private String strLower;

    public Define04(String str01) {
        this.str = str01;
        strNew=str01;
        strLower=str01.toLowerCase();
    }

    @Override
    public String toString() {
        int c=0;
        for (int i = 0; i < str.length(); i++) {
            if(strLower.charAt(i)=='a'||strLower.charAt(i)=='e'||strLower.charAt(i)=='i'||strLower.charAt(i)=='o'||strLower.charAt(i)=='u'){
                if(c==0) {
                    strNew = strNew.replace(str.charAt(i), '*');
                    c++;
                }
                else if(c==1){
                    strNew = strNew.replace(str.charAt(i), '^');
                    c++;
                }
                else{
                    strNew = strNew.replace(str.charAt(i), '!');
                    c=0;
                }

            }
        }
        return strNew;
    }
}
