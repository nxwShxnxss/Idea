import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ro = sc.nextInt();
        int V = sc.nextInt();
        int F = arhimed(ro, V);
        int a = sc.nextInt() ;
        System.out.println("F = " + F +"H");
    }
    static int arhimed(int ro, int V){
        return ro*10*V;
    }

}

