import java.io.*; 
import java.lang.*; 

public class RishiShah{
    
    public String getFullName(){
        return "Rishi Shah";
    }
    public String getFirstName(){
        return "Rishi";
    }
    public String getLastName(){
        return "Shah";
    }
    public String getUCInetID(){
        return "rishiss";
    }
    public int getStudentNumber(){
        return 12474679;
    }
    public String getRotatedFullName(int shift){
        
        if (shift == 0){
            return "Rishi Shah";
        }
        String name = "Rishi Shah";
        StringBuilder sb = new StringBuilder("");
        if (shift > 0){
            for (int i = shift; i < 10; ++i ){
                sb.append(name.charAt(i));
            }
            for (int i = 0; i < shift; ++i){
                sb.append(name.charAt(i));
            }
        }
        else{
            for (int i = 10 + shift; i < 10; ++i){
                sb.append(name.charAt(i));
            }
            for (int i = 0; i < Math.abs(shift); ++i){
                sb.append(name.charAt(i));
            }
        }
        return sb.toString();
    }
}