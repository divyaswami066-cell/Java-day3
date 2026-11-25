public class Main24 {
    public static void main(String[]args){
        try{
        String num="abc";
        int number=Integer.parseInt(num);
        System.out.println(number);
    }
    catch(NumberFormatException e){
        System.out.println("NumberFormatException");
    }
    finally{
        System.out.println("Finally block executed");}
    }}    
    

