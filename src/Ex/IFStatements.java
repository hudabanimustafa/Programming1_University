package Ex;

public class IFStatements {
    public static void main(String[]args){
        int x = 8 , y = 3 , z = 3;
        if (x/3>=z){
            x+=y;
            y++;
            x*=y;
            y--;
        } else {
            x%=y;
            y++;
        }
        System.out.println(x+y);
    }
}
