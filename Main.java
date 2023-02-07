
import java.io.FileWriter;
import java.io.IOException;



public class Main{
    public static void main(String[] args){
        try{

            String str = null;
            System.out.println(str.length());

        }catch(NullPointerException x){
            System.out.println("壱百満");
            System.out.println(x.getMessage());
        }

        String str = "キリト";
        int value = Integer.parseInt(str);
    }

}