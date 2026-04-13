public class AttendanceManagement {
    private String studentName;
    private String registerNumber;
    private String courseName;
    private String department;
    private double attendancePercentage;
    private int classesAttended;
    private int classesTotal;
    private String attendanceStatus;
    private String date;

    public AttendanceManagement(String studentName, String registerNumber, String courseName,
                                String department, int classesAttended, int classesTotal) {
        this.studentName = studentName;
        this.registerNumber = registerNumber;
        this.courseName = courseName;
        this.department = department;
        this.classesAttended = classesAttended;
        this.classesTotal = classesTotal;
        this.attendancePercentage = (double) classesAttended / classesTotal * 100;
        this.attendanceStatus = attendancePercentage >= 75 ? "Present" : "Absent";
        this.date = new java.time.LocalDate.now().toString();
    }

    public void displayAttendance() {
        System.out.println("===================================");
        System.out.println("ATTENDANCE MANAGEMENT SYSTEM");
        System.out.println("===================================");
        System.out.println("Student Name: " + studentName);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Course Name: " + courseName);
        System.out.println("Department: " + department);
        System.out.println("Classes Conducted: " + classesTotal);
        System.out.println("Classes Attended: " + classesAttended);
        System.out.println("Attendance Percentage: " + String.format("%.2f", attendancePercentage) + "%");
        System.out.println("Attendance Status: " + attendanceStatus);
        System.out.println("Date: " + date);
        System.out.println("===================================");
        System.out.println("Message: Attendance Build Successful");
        System.out.println("===================================");
    }

    public static void main(String[] args) {
        // Create an attendance record
        AttendanceManagement attendance = new AttendanceManagement(
            "John Doe",
            "146289",
            "Java Programming",
            "Computer Science",
            40,
            50
        );

        // Display the attendance details
        attendance.displayAttendance();
    }
}
