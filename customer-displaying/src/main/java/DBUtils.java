import java.util.ArrayList;
import java.util.List;

public class DBUtils {

    private static List<Customer> listCustomers = new ArrayList<>();

    static {
        initDatabase();
    }

    private static void initDatabase() {

        listCustomers.add(new Customer("Mai Van Hoan", "Ha Noi", "1983-08-20"));
        listCustomers.add(new Customer("Nguyen Van Nam", "Bac Giang", "1983-08-21"));
        listCustomers.add(new Customer("Nguyen Thai Hoa", "Ho Chi Minh", " 1983-08-22"));
    }

    public static List<Customer> queryCustomers() {
        return listCustomers;
    }
}
