import java.util.Scanner;

class Main1{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        int x = sc.nextInt();
        System.out.print("");
        int y = sc.nextInt();
        int z = x + y;

        System.out.println("SOMA = "+ z); //"+ x + " e " + y + " é " + z);

        sc.close();
    }
}