//base class
class Course{
    protected String courseName;
    protected int duration;

    public Course(String courseName , int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourse(){
        System.out.println("Course nam :- " + courseName);
        System.out.println("Duration : " + duration + " Weeks");
    }
}

//subclass 
class OnlineCourse extends Course{
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName , int duration , String platform , boolean isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourse(){
        super.displayCourse();
        System.out.println("Platform :-" + platform);
        System.out.println("Recorded " + (isRecorded ? "Yes" : "No"));
    }
}


//subclass Paid online course
class PaidOnlineCourse extends OnlineCourse{
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName , int duration ,String platform , boolean isRecorded , double fee , double discount){
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getDiscountedPrice(){
        return fee - (fee * discount/100);
    }

    @Override
    public void displayCourse(){
        super.displayCourse();
        System.out.println("Fee: $" + fee);
        System.out.println("Final Price After Discount : $" + getDiscountedPrice());
    }
}


public class EducationalCourseHeirarchy {
    public static void main(String[] args) {
        Course basic = new Course("Particle Physics", 3);
        Course onlineCourse = new OnlineCourse("Introduction to Java", 5, "Coursera", true);
        Course  paidCourse  = new PaidOnlineCourse("Linux For Dummies", 2, "Coursera", true, 12.99, 25);

        System.out.println("Basic Course");
        basic.displayCourse();
        System.out.println();

        System.out.println("Online Course");
        onlineCourse.displayCourse();
        System.out.println();

        System.out.println("Paid Course");
        paidCourse.displayCourse();
        System.out.println();
    }
}
