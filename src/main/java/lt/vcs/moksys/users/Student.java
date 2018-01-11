package lt.vcs.moksys.users;

public class Student extends User{

    public Student(String userName, String firstName, String lastName, String password, Role role) {
        super(userName,firstName,lastName,password, role.STUDENT);
    }

}
