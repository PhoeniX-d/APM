import java.util.Scanner;

public class VolumeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator volume = new VolumeCalculator();
        System.out.println("Enter the choice");
        System.out.println("1.Find Volume For Cylinder");
        System.out.println("2.Find Volume For Cuboid");
        byte choice = sc.nextByte();
        switch (choice) {
            case 1:
                {                
                    System.out.println("Enter the radius");
                    double radius = sc.nextDouble();
                    System.out.println("Enter the height");
                    double height = sc.nextDouble();
                    System.out.printf("Volume of the Cylinder is %.2f" ,volume.calculateVolume(radius, height));
                    break;
                }
            case 2:
                {
                    System.out.println("Enter the length");
                    int length  = sc.nextInt();
                    System.out.println("Enter the breadth");
                    int breadth  = sc.nextInt();
                    System.out.println("Enter the height");
                    int height = sc.nextInt();
                    System.out.printf("Volume of the Cuboid is %.2f", volume.calculateVolume(length, breadth, height));
                    break;
                }
        }
        sc.close();
    }
}
