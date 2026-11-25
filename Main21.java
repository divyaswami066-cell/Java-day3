/*public class Main21 {
    public static void main(String[]args){
        String str=null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
    
    }
    
}*/

class main21{
    public static void main(String[]args){
        int arr[]={1,2,3,4};
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    
    }
}
