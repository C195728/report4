package progexam;
public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            String str = null;
            System.out.println(str.length());


        } catch (NullPointerException e) {
            System.out.println("nullが入力されています");
            System.out.println(e.getMessage());
        }

    }
}







        


