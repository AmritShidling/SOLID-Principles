package dependencyInversionPrinciple;

import java.util.List;

interface ITeacher{
    String getSubject();

}

class MathTeacher implements ITeacher{
    String subject;

    public MathTeacher(String subject){
        this.subject = subject;
    }

    @Override
    public String getSubject(){
        return this.subject;
    }
}

class PhysicsTeacher implements ITeacher{
    private String subject;
    public PhysicsTeacher(String subject){
        this.subject = subject;
    }

    @Override
    public String getSubject(){
        return this.subject;
    }
}
interface ICollege{
    void getAllSubjects();
}
class NCI implements ICollege{
    List<ITeacher> teacherList;

    public NCI(List<ITeacher> teacherList){
        this.teacherList = teacherList;
    }

    @Override
    public void getAllSubjects() {
        for(ITeacher teacher: teacherList){
            System.out.println(teacher.getSubject());
        }
    }
}
public class DependencyInversionPrinciple {
    public static void main(String[] args) {

        ICollege nci = new NCI(List.of(new MathTeacher("Maths"), new PhysicsTeacher("Physics")));
        nci.getAllSubjects();
    }
}
