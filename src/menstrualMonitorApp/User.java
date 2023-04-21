package menstrualMonitorApp;

public class User {
    private String firstName;
    private String lastName;
    private String username;
    private int age;
    private String gender;
    private String  password;
    private int cycleLength;
    private int menstrualFlowDays;

    private String lastCycleDate;

    public String getLastCycleDate() {
        return lastCycleDate;
    }

    public void setLastCycleDate(String lastCycleDate) {
        this.lastCycleDate = lastCycleDate;
    }

    public int getCycleLength() {
        return cycleLength;
    }

    public void setCycleLength(int cycleLength) {
        this.cycleLength = cycleLength;
    }

    public int getMenstrualFlowDays() {
        return menstrualFlowDays;
    }

    public void setMenstrualFlowDays(int menstrualFlowDays) {
        this.menstrualFlowDays = menstrualFlowDays;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
