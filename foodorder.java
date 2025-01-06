import java.util.Scanner;

public class foodorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String food;

        System.out.println("Welcome to zomato!");
            System.out.println("\nAvailable Food Items: Burger, Pizza, Salad, Pasta, Fries");
            System.out.println("Burger is available at:");
                    System.out.println("Hotel maria: Location: Downtown, Rating: 4.5,  Delivery Available");
                    System.out.println("Pizza is available at:");
                    System.out.println("Hotel raj foods: Location: chennai, Rating: 4.8,  Delivery Available");
                    System.out.println("Hotel RAM: Location: tamram, Rating: 4.0,  Pickup Only");
                    System.out.println("Salad is available at:");
                    System.out.println("Hotel raj foods: Location: chennai, Rating: 4.8,  Delivery Available");
                    System.out.println("Hotel maria: Location: tamram, Rating: 3.0, Pickup Only");
                    System.out.println("Pasta is available at:");
                    System.out.println("Hotel maria: Location: tirupur, Rating: 4.8 , Delivery Available");
                    System.out.println("Hotel raj foods: Location: dsk street, Rating: 4.0 , Pickup Only");
                    System.out.println("Fries are available at:");
                    System.out.println("Hotel RAM: Location: kangayam, Rating: 4.8 , Delivery Available");
                    System.out.println("Hotel maria: Location: tirupur, Rating: 4.0 , Pickup Only");
                    System.out.print("Enter the food item to find which hotel serves it (or type 'exit' to quit): ");
                    food = scanner.nextLine();
            switch (food) {
                case "burger":
                    System.out.println("Burger is available at:");
                    System.out.println("Hotel A: Location: Downtown, Rating: 4.5, Price: 100, Delivery Available");
                    break;
                case "pizza":
                    System.out.println("Pizza is available at:");
                    System.out.println("Hotel C: Location: chennai, Rating: 4.8, Price: 12, Delivery Available");
                    System.out.println("Hotel D: Location: tamram, Rating: 4.0, Price: 10, Pickup Only");
                    break;
                case "salad":
                    System.out.println("Salad is available at:");
                    System.out.println("Hotel C: Location: chennai, Rating: 4.8, Price: 12, Delivery Available");
                    System.out.println("Hotel D: Location: tamram, Rating: 3.0, Price: 10, Pickup Only");
                    
                    break;
                case "pasta":
                    System.out.println("Pasta is available at:");
                    System.out.println("Hotel C: Location: tirupur, Rating: 4.8, Price: 12, Delivery Available");
                    System.out.println("Hotel D: Location: dsk street, Rating: 4.0, Price: 10, Pickup Only");
                    break;
                case "fries":
                    System.out.println("Fries are available at:");
                    System.out.println("Hotel C: Location: kangayam, Rating: 4.8, Price: 12, Delivery Available");
                    System.out.println("Hotel D: Location: tirupur, Rating: 4.0, Price: 10, Pickup Only");
                    break;
                
            }

           
            System.out.print("\nWould you like delivery or pickup? (Enter 'delivery' or 'pickup'): ");
            String option = scanner.nextLine();

            
            if (option.equals("delivery")) {
                System.out.println("Your food will be delivered by our delivery boy.");
            } else if (option.equals("pickup")) {
                System.out.println("You can pick up your food from the selected hotel.");
            } else {
                System.out.println("Invalid option. Please choose 'delivery' or 'pickup'.");
            }
        

        scanner.close();
    }
}
