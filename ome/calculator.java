import java.util.*;
public class calculator {
    public static void main(String[] args) {
        options();   
    }
    public static void options(){
        
        int x;
        System.out.println("enter a number ");
        System.out.println("1: add \n 2: sub \n 3: mulp \n 4:divide \n 5:modulus \n 6:power \n 7: exit()  ");
        System.out.println("enter a value ");
        Scanner num=new Scanner(System.in); 
        x=num.nextInt();
        switch(x)
        {
            case 1: add();
            break;

            case 2:sub();
            break;

            case 3: multiply();
            break;

            case 4: divide();
            break;

            case 5: modulus();
            break;

            case 6: power();
            break;

            case 7:exit();
            break;

            default: System.out.println("choose the correct options ");
            break;

        }
    }
    public static void  add()
    {
        int a,b;
        System.out.println("enter two values :");
         Scanner p =new Scanner(System.in);
        a=p.nextInt();
        b=p.nextInt();
        
      System.out.println(a+b);
      options();
    }
    public static void  sub()
    {
        int a,b;
        System.out.println("enter two values :");
         Scanner p =new Scanner(System.in);
        a=p.nextInt();
        b=p.nextInt();
        
     
      System.out.println(a-b);
      options();
    }
    public static void  multiply()
    {
        int a,b;
        System.out.println("enter two values :");
         Scanner p =new Scanner(System.in);
        a=p.nextInt();
        b=p.nextInt();
        
     
      System.out.println(a*b);
      options();
    }
    
    public static void  divide()
    {
        int a,b;
        System.out.println("enter two values :");
         Scanner p =new Scanner(System.in);
        a=p.nextInt();
        b=p.nextInt();
        
     
      System.out.println(a/b);
      options();
    }

    
    public static void  modulus()
    {
        int a,b;
        System.out.println("enter two values :");
         Scanner p =new Scanner(System.in);
        a=p.nextInt();
        b=p.nextInt();
        
     
      System.out.println(a%b);
      options();
    }
    public static void  power()
    {
        double a,b;
        double result;
        System.out.println("enter two values :");
         Scanner p =new Scanner(System.in);
        a=p.nextInt();
        b=p.nextInt();
        result = Math.pow(a,b);
        System.out.println("power is "+result);
     options();
    }
    public static void exit()
    {
        int x=7;
        if(x==7)
        {
            return;
        }
    }
}
/*import java.util.Scanner;
public class switchexp {
    public static void main(String[] args) {
        int x;
        System.out.println("enter the only number between 1-7");
        Scanner p = new Scanner(System.in);
        x=p.nextInt();
        switch(x)
        {
          
            case 1:
            System.out.println("Sunday");
            break;

            case 2:
            System.out.println("Monday");
            break;

            case 3:
            System.out.println("tuesday");
            break;

            case 4:
            System.out.println("wednesday");
            break;

            case 5:
            System.out.println("Thrusday");
            break;

            case 6:
            System.out.println("Friday");
            break;

            case 7:
            System.out.println("Saturday");
            break;

            default:
            System.out.println("enter only between 1-7");
        }

    }
}

/*same switch with char
 public class SwitchExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Start of the work week");
                break;
            case FRIDAY:
                System.out.println("End of the work week");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek");
        }
    }
}

 */ 