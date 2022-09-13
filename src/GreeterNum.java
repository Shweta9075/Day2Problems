public class GreeterNum {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int c=27;
        if(a>=b && a>=c){
            System.out.println(a + "  is the greatest");
        }else{
            if(b>=c && b>= a){
                System.out.println(b +  " is the greatest");
            } else if (c>=a && c>=b) {
                System.out.println(c +  " is the greatest");

            }
        }
    }
}
