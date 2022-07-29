import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
max();
    }
    public static void max(){
        System.out.println("How MAny Numbers :");
        double[] numbers = new double[new Scanner(System.in).nextInt()];
        for (int i=0;i<numbers.length;i++){
            System.out.println("Numbers "+(i+1)+" :");
            numbers[i]= new Scanner(System.in).nextDouble();
        }
        if (numbers.length == 0){
            System.out.println("No Argument passed");
            return;
        }
        double result=numbers[0];
        for (int i=1;i<numbers.length;i++){
            if (numbers[i]>result){
                result=numbers[i];
            }
        }
        System.out.println("Max Number = "+result);
    }
}
