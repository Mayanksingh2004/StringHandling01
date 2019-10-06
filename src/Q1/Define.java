package Q1;

public class Define {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Define(String name) {
        this.name = name;
        indexString();

    }
    public void indexString(){
        System.out.print("Index : ");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Chars : ");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i)+" ");
        }
    }

}
