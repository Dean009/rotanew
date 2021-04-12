import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        staff dean = new staff("Dean", "Moore", "20", "CSA");

        ui uone = new ui();
        uone.createGui();

        List<staff> stafflist = new ArrayList<staff>();
        stafflist.add(dean);

        for (staff staff : stafflist) {
            // System.out.println(staff);

        }

        // String[] columnNames = { "First Name", "Last Name", "Contract Hours", "Role"
        // };
        // doesnt work
        // for (int x = 1; x <= stafflist.size(); x++) {
        // staff[][] data = { { stafflist.get(x) } };
        // System.out.println(data);

    }
}
