package Q7;

public class Define07 {
    private String str;

    public Define07(String str) {
        this.str = str;
        asciiValue();
    }
    public void asciiValue(){
        System.out.println("inputString = "+str+";");
        System.out.print("totalWeight = ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print((int)str.charAt(i));
            if(i!=(str.length()-1)){
                System.out.print("+");
            }
        }
        System.out.println();
        System.out.println("where ASCII VALUE IS ");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+"-->"+(int)str.charAt(i));
        }
    }
}
