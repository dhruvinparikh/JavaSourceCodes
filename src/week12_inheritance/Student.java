/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12_inheritance;

/**
 *
 * @author imsil
 */
public class Student extends Person{
    private String studentId;
    private String course;
    private String teacherName;

    public Student(String studentId, String course, String teacherName, String firstName, String lastName) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.course = course;
        this.teacherName = teacherName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    
    public String displayDetails(){
        return super.displayDetails()+"StudentID : " + studentId+"\nCourse : " + course + "\nTeacher's Name : " + teacherName +"\n";
    }    
}
