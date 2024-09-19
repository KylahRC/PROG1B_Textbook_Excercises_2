package Ex6;

public class Student {
    private String studentID;
    private CollegeCourse[] courses;

    public Student() {
        courses = new CollegeCourse[5];
    }

    // Getter and Setter for studentID
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Getter for a specific CollegeCourse
    public CollegeCourse getCourse(int index) {
        if (index >= 0 && index < courses.length) {
            return courses[index];
        } else {
            return null;
        }
    }

    // Setter for a specific CollegeCourse
    public void setCourse(CollegeCourse course, int index) {
        if (index >= 0 && index < courses.length) {
            courses[index] = course;
        }
    }
}
