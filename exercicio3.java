import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x;
        String s1,s2,s3;
        
        x = sc.nextInt();
        sc.nextLine();//macete para impedir que o nextLine consuma a próxima linha.
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Você digitou: " );
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();//recurso usado para encerrar o método Scanner.
    }
}
