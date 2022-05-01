import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the endpoint or node url: ");
        String endpoint = sc.nextLine();
        BlockNum.getBlockNum(endpoint);
        sc.close();
    }
}
