import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wysokosc trojkata [od 1 do 20] ");

        PascalTriangle pascalTriangle = new PascalTriangle(scanner.nextInt());
        scanner.close();

        pascalTriangle.printTriangle();
    }
}
