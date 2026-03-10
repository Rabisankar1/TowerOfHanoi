package JavaMiniProject;
import java.util.Scanner;
public class TowerOfHanoi {
    public static void hanoi(int n, char source, char helper, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to helper
        hanoi(n - 1, source, destination, helper);

        // Move nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from helper to destination
        hanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        hanoi(n, 'A', 'B', 'C');

        sc.close();
    }
}
