package openclose;

public class EmployeeFullTime {
    private String fullname;
    private int hoursWorked;

    public EmployeeFullTime(String fullname, int hoursWorked) {
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
