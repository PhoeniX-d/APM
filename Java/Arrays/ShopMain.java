import java.util.Scanner;
class Shop {
    private String shopName;
    private String shopAddress;
    private String[] products;

    public Shop(String shopName, String shopAddress, String[] products) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.products = products;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public String[] getProducts() {
        return products;
    }

    public boolean checkProductAvailability(String product_name) {
        if (product_name == null || product_name.isEmpty()) {
            return false;
        } else {
            int i = 0, j = 0;
            for (i = 0, j = products.length - 1; i <= j; i++, j--) {
                if (products[i].equalsIgnoreCase(product_name) || products[j].equalsIgnoreCase(product_name)) {
                    break;
                }
            }
            if (i > j)
                return false;
            else
                return true;
        }
    }
}

public class ShopMain {

    public static Shop getShopDetails() {
        Scanner sc = new Scanner(System.in);
        Shop s = null;
        System.out.println("Enter the shopname:");
        String shopName = sc.next();

        System.out.println("Enter the address:");
        String shopAddress = sc.next();

        System.out.println("Enter number of products:");
        int no_of_prod = sc.nextInt();
        if (no_of_prod > 0) {
            String products[] = new String[no_of_prod];
            for (int i = 0; i < products.length; i++) {
                products[i] = sc.next();
            }
            s = new Shop(shopName, shopAddress, products);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop s = getShopDetails();
        if (s != null) {
            System.out.println("Enter the product to be searched");
            String product_name = sc.next();
            boolean isAvail = s.checkProductAvailability(product_name);
            if (isAvail)
                System.out.println("Product is available at " + s.getShopName() + ", " + s.getShopAddress());
            else
                System.out.println("Product is not available at " + s.getShopName() + ", " + s.getShopAddress());
        }
        sc.close();
    }
}
