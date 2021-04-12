
public class staff {
    private String fname;
    private String sur;
    private String cont;
    private String ro;

    public staff(String firstName, String surname, String contract, String role) {
        this.fname = firstName;
        this.sur = surname;
        this.cont = contract;
        this.ro = role;
    }

    // Getters below
    public String getMember() {
        return fname + sur;
    }

    public String getContract() {
        return cont;
    }

    public String getRole() {
        return ro;
    }
    // End of getters

    // Setters below
    // overloaded setName, if only 1 parameter first name changed. Need both
    // parameters if you want to change only surname.
    public void setName(String newFName) {
        fname = newFName;
    }

    public void setName(String newFName, String newSName) {
        fname = newFName;
        sur = newSName;
    }
    // end

    public void setContract(String newContract) {
        cont = newContract;
    }

    public void setRole(String newRole) {
        ro = newRole;
    }
    // End of setters

}
