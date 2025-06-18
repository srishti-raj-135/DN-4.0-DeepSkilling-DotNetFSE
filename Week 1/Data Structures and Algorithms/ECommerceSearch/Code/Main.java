public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(103, "Laptop", "Electronics"),
            new Product(101, "Shampoo", "Personal Care"),
            new Product(105, "Notebook", "Stationery"),
            new Product(102, "Mobile", "Electronics")
        };
        Product found1 = Search.linearSearch(products, 105);
        System.out.println("Linear Search Result: " + (found1 != null ? found1 : "Not Found"));
        Search.sortProductsById(products);
        Product found2 = Search.binarySearch(products, 105);
        System.out.println("Binary Search Result: " + (found2 != null ? found2 : "Not Found"));
    }
}