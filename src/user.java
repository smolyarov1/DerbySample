public class user {
    private String ID;
    private String FirstName;
    private String LastName;
    private String Email;
    private String City;

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getCity() {
        return City;
    }

    public user(String ID, String firstName, String lastName, String email, String city) {
        this.ID = ID;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        City = city;
    }

    public void ShowUser ()
    {
        System.out.println("the user "+ FirstName +LastName + "with the ID - " + ID + "who lives at " + City
                + "with the email " + Email + "has been created");
    }
}