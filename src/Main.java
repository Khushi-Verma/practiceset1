import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String userName="";
        Scanner scanner=new Scanner(System.in);
        String name =scanner.nextLine();
        System.out.println("Welcome,"+ name);
        scanner.close();
    }
}

