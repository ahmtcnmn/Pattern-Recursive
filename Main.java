import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    static void model(){
        Scanner input=new Scanner(System.in);
        int a,b;
        out.println("");
        out.print("Sayıyı giriniz : ");
        a= input.nextInt();
        b=a;
        if (a>0){
            do {
                a=cik(a);
                out.print(a+" ");
                if (a<=0) break;
            }while (true);
        }
        if (a<=0){
            do {
                a=top(a);
                out.print(a+" ");
                if (a==b) break;
            }while (true);
        }
        model();
    }
    static int top(int x){
        x= x+5;
        return x;

    }
    static int cik(int y){
        y=y-5;
        return y;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        out.println("Kurallı model oluşturma.");
        model();
    }
}
