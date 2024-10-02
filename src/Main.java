import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner inpput = new Scanner(System.in);
        System.out.println("plese enter your first num");
        int x = inpput.nextInt();
        System.out.println("please enter your secound num");
        int  y = inpput.nextInt();
        if (x%y==0){
            System.out.println("this number evaltionn ");


        }else {
            System.out.println("this number not eveltion");
        }



    }
}