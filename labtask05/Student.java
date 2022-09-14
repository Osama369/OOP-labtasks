public class Student {
    private String sName;
    private int rollNo;
    private String year;
 // contructor here
    public Student(String sName, int rollNo, String year) {
        this.sName = sName;
        this.rollNo = rollNo;
        this.year = year;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setYear(String year) {
        this.year = year;
    }
   // display the student info here
    public void displayInfo(){
        System.out.println(sName);
        System.out.println(rollNo);
        System.out.println(year);
    }




    public static void main(String[] args) {
        Student st1= new Student("Bilgates", 20, "1985");
        st1.displayInfo();
    }
}
