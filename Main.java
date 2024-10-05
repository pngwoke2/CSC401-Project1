import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the graph:");
        int length = scanner.nextInt();

        System.out.println("Enter the width of the graph:");
        int width = scanner.nextInt();

        System.out.println("Enter the number of nodes desirable for your graph:");
        int numNodes = scanner.nextInt();

    
        Random random = new Random();
        int[][] sensorNodes = new int[numNodes][2];  // Array to store (x, y) coordinates of nodes

        System.out.println("Generating sensor nodes...");
        for (int i = 0; i < numNodes; i++) {
            int x = random.nextInt(width + 1);  // Random x-coordinate between 0 and width
            int y = random.nextInt(length + 1); // Random y-coordinate between 0 and length
            sensorNodes[i][0] = x;
            sensorNodes[i][1] = y;

     //       System.out.println("Node " + (i + 1) + ": (" + x + ", " + y + ")");  This line is probably useless.
        }

    }
}
