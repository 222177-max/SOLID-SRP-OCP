package openclose;

public class EmployeePartTime {
    private String fullname;
    private int hoursWorked;

    public EmployeePartTime(String fullname, int hoursWorked) {
        this.fullname = fullname;
        this.hoursWorked = hoursWorked;
    }

    public String getFullname() {
        return fullname;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
