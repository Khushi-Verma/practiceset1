import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String userName="";
        String name =scanner.nextLine();
        System.out.println("Welcome,"+ name);
        scanner.close();
    }
}

