import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {

    private String name;
    private String address;
    private Date birthDate;

    private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    public Customer() {}

    public Customer(String name, String address, String birthDateStr) {
        this.name = name;
        this.address = address;
        try {
            this.birthDate = df.parse(birthDateStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
