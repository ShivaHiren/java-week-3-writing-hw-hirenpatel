package week3writinghw;

public class Programme_11_DividedByThreeAndFive {
    public static void main (String [] args) {
        System.out.println("Numbers divisible by 2 are:  ");
        for (int i = 1; i <= 100; i++) {
            divideByThree(i);
        }
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("Number divisible by 5 are:  ");
        int x;
        for (x = 1; x <= 100; x++) ;
        divideByFive(x);
    }
    //Divide By three method
    public static void divideByThree(int number){
        if (number %3 == 0 ){
            System.out.println(number + ",");
        }
    }
    //Divide by five method
    public static void divideByFive(int number){
        if (number %5 ==0){

        }
    }
}
