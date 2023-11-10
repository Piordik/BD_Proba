import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String selectTable = "select * from audit_department";
        Connect myConnection = new Connect();
        Map<String, List<String>> result = myConnection.executeSelect(selectTable);

        System.out.println("Ревизионный номер   Тип изделия         Адрес расположения");

        for(Map.Entry<String, List<String>> entry : result.entrySet()) {
            String key = entry.getKey();
            System.out.printf("%-20s", key);
            List<String> valueList = entry.getValue();

            for (String s : valueList) {
                System.out.printf("%-20s", s);
            }
            System.out.println();
        }

    }
}