package dependencyInversionPrinciple;

import java.util.ArrayList;
import java.util.List;

/**
 * Entities must depend on the abstraction not on the concretion. High level module should not depend on low level module.
 * But they should depend on the abstraction
 */

class Teacher{
    String subject;
    public Teacher(String subject){
        this.subject = subject;
    }
    public void setSubject(String sub){
        this.subject = sub;
    }
    public String getSubject(){
        return this.subject;
    }
}

class College{
    List<Teacher> teacherList;
    public College(List<Teacher> teacherList){
        this.teacherList = teacherList;
    }

    public void getAllSubjects(){
        for(Teacher teacher: teacherList){
            System.out.println(teacher.getSubject());
        }
    }

}
public class WithoutDependencyInversionPrinciple {
    public static void main(String[] args) {
        Teacher mathTeacher = new Teacher("Math");
        College lpu = new College(List.of(mathTeacher));
        lpu.getAllSubjects();

    }
}
