import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Connect {

    private static final String NAME = "postgres";
    private static final String PASSWORD = "5226208";
    private static final String URL = "jdbc:postgresql://localhost:5432/training_hw_5";

    public Map<String, List<String>> executeSelect(String select) {
        try (
                Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD);
                Statement statement = connection.createStatement()
        ) {
            ResultSet result = statement.executeQuery(select);
            Map<String, List<String>> obj = new HashMap<>();
            while (result.next()) {
                obj.put(result.getString(1), List.of(result.getString(2), result.getString(3)));
            }
            return obj;
        } catch (SQLException ex) {
            System.out.println("Cannot connect tot DB: " + ex.getMessage());
            return Map.of();
        }
    }
}

