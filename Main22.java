public class Main22 {
    public static void main(String[]args){
        String name="Saran";
        try{
            System.out.println(name.charAt(10));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
