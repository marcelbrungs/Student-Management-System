package Management;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private List<Course> courses;

    public Student(String studentId, String name, int age, List<Course> list) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        System.out.println("Courses Enrolled:");
        for (Course course : courses) {
            course.displayInfo();
        }
    }

	public Object getStudentId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAge() {
		// TODO Auto-generated method stub
		return null;
	}
}
