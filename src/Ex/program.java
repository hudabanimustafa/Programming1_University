package Ex;


/*
    The program declares two integer variables, a and b, and initializes them to 10 and 20, respectively.

    The program starts with an if statement that checks if a is greater than or equal to b. Since a is not greater than or equal to b, this if statement is skipped.

    The program then moves on to the else statement, which will always execute since the previous if statement was false. The else statement prints the result of a * b, which is 200.
 */
public class program {
    public static void main(String[]args){
        int a=10, b=20;
        if (a>=b)
            if (a+5>10)
                System.out.println(a+b);
            else
                System.out.println(a-b);
        else
            System.out.println(a*b);
    }
}
