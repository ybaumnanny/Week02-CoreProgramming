abstract class Course {
    private String courseName;
    private int duration; 
    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    // Getter methods
    public String getCourseName() {
        return courseName;
    }
    public int getDuration() {
        return duration;
    }
    public abstract String getCourseDetails();
}
// Subclass OnlineCourse created 
class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded; // True if recorded, false if live
    // Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Calls the constructor of Course
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    // Getter methods
    public String getPlatform() {
        return platform;
    }
    public boolean isRecorded() {
        return isRecorded;
    }
    @Override
    public String getCourseDetails() {
        return "Course: " + getCourseName() + "\nDuration: " + getDuration() + " hours\nPlatform: " + platform +
               "\nRecorded: " + (isRecorded ? "Yes" : "No");
    }
}
// Subclass PaidOnlineCourse created
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // Discount as a percentage
    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Calls the constructor of OnlineCourse
        this.fee = fee;
        this.discount = discount;
    }
    // Getter methods
    public double getFee() {
        return fee;
    }
    public double getDiscount() {
        return discount;
    }
    @Override
    public String getCourseDetails() {
        double discountedPrice = fee - (fee * discount / 100);
        return super.getCourseDetails() + "\nFee: $" + fee + "\nDiscount: " + discount + "%\nFinal Price: $" + discountedPrice;
    }
}
public class CourseManagement {
    public static void main(String[] args) {
        // Creating objects of each class
        Course course = new OnlineCourse("Java Programming", 40, "Udemy", true);
        OnlineCourse onlineCourse = new OnlineCourse("Python for Data Science", 30, "Coursera", false);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Machine Learning", 50, "edX", true, 200, 15);
        // Displaying course details for each type of course
        System.out.println("Course 1 Details:\n" + course.getCourseDetails());
        System.out.println("\nCourse 2 Details:\n" + onlineCourse.getCourseDetails());
        System.out.println("\nCourse 3 Details:\n" + paidCourse.getCourseDetails());
    }
}
