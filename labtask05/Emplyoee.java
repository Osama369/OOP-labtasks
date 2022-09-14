public class Emplyoee {
    // use of acces modifier here
    private String empName;
    private int empId;
    private String address;
    // static member varaible
    public static String company = "microsoft";

    // use of the constructor here
    public Emplyoee(String empName, int empId, String address) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;

    }

    // getters and setters here
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emplyoee [address=" + address + ", empId=" + empId + ", empName=" + empName + "]";
    }

    public static void main(String[] args) {
        Emplyoee emp1 = new Emplyoee("OSama", 65, "karachi");
        System.out.println(emp1.toString());
    }

}
