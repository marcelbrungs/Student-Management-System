package Management;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null; // needed if studend with ID is not valid or found
    }

    public void displayAllStudents() {
        for (Student student : students) {
            student.displayInfo();
            System.out.println("-------------");
        }
    }

    public void displayAllGrades1() {
        for (Student student : students) {
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Name: " + student.getName());
            System.out.println("Average Grade: " + student.calculateAverageGrade());
            System.out.println("-------------");
        }
    }
    
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        Student student1 = new Student("S001", "John", 20, null);
        Student student2 = new Student("S002", "Jane", 22, null);

        system.addStudent(student1);
        system.addStudent(student2);

        system.displayAllStudents();
    }

    public void addStudent(String string, int i, String string2) {
        // TODO: Implement this method
    }

    public void addCourse(Course course1) {
        // TODO: Implement this method
    }

    public void displayAllCourses() {
        // TODO: Implement this method
    }

	public void displayAllGrades() {
		// TODO Auto-generated method stub
		
	}
}

