import java.util.*;

public class MagicSquare {

    static ArrayList<Integer> list;
    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;

    private static Scanner scn = new Scanner(System.in);
    public static void main (String [] args){
        String option;

        do {
            check();
            System.out.println("Do you want to enter new square: ");
            option = scn.next();

            if(option.equals("n")){
                System.out.println("End Process!");
            }
        }while (option.equals("y"));

    }

    private static void check(){

	list = new ArrayList<>();

        for(int x=1; x<=9; x++){

            int num;
            do {
                System.out.println("Enter Number  " + x + ":");
                while (!scn.hasNextInt()) {
                    System.out.println("Invalid Value, Enter an Integer: ");
                    scn.next();
                }
                num = scn.nextInt();
                list.add(num);
            } while (num <= 0);
        }

        System.out.println(list.get(0) +" "+ list.get(1)+" "+list.get(2));
        System.out.println(list.get(3) +" "+ list.get(4)+" "+list.get(5));
        System.out.println(list.get(6) +" "+ list.get(7)+" "+list.get(8));

        a =  list.get(0)+list.get(1)+list.get(2);
        b =  list.get(3)+list.get(4)+list.get(5);
        c =  list.get(6)+list.get(7)+list.get(8);

        d =  list.get(0)+list.get(3)+list.get(6);
        e =  list.get(1)+list.get(4)+list.get(7);
        f =  list.get(2)+list.get(5)+list.get(8);

        g =  list.get(0)+list.get(4)+list.get(8);

        if (magic()){
            System.out.println("Magic Square: " + magic());
        }else {
            System.out.println("Magic Square: " + magic());
        }

        list.sort(Comparator.naturalOrder());

        if(list.get(8) <= 9){
            System.out.println("lo shu square: " + luShu());
        }else{
            System.out.println("lo shu square: " + luShu());
        }

    }

    private static boolean magic(){
        return a == b && b == c && c == d && d == e && e == f && f == g;
    }

    private static boolean luShu(){
        return list.get(8) <= 9;
    }
}