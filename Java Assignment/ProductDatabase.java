import java.sql.*;

public class ProductDatabase {

    private static final String DB_URL = "jdbc:mysql://localhost:8806/product_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement();

            // Create table if it doesn't exist
            String createTableSql = "CREATE TABLE IF NOT EXISTS Product ("
                    + "ProductNo INT PRIMARY KEY,"
                    + "ProductName VARCHAR(255),"
                    + "Quantity INT,"
                    + "Price DOUBLE)";
            stmt.execute(createTableSql);

            // Add a new product
            String addProductSql = "INSERT INTO Product (ProductNo, ProductName, Quantity, Price) "
                    + "VALUES (101, 'Product 1', 10, 9.99)";
            stmt.executeUpdate(addProductSql);

            // Modify the quantity of a product
            String modifyProductSql = "UPDATE Product SET Quantity = 15 WHERE ProductNo = 101";
            stmt.executeUpdate(modifyProductSql);

            // Delete a product
            String deleteProductSql = "DELETE FROM Product WHERE ProductNo = 101";
            stmt.executeUpdate(deleteProductSql);

            // Retrieve all products
            String retrieveProductsSql = "SELECT * FROM Product";
            ResultSet rs = stmt.executeQuery(retrieveProductsSql);
            while (rs.next()) {
                int productNo = rs.getInt("ProductNo");
                String productName = rs.getString("ProductName");
                int quantity = rs.getInt("Quantity");
                double price = rs.getDouble("Price");
                System.out.println(productNo + "\t" + productName + "\t" + quantity + "\t" + price);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
