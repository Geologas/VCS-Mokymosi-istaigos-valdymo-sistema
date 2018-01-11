package lt.vcs.moksys.users;

public class Lecturer extends User{

    public Lecturer(String userName, String firstName, String lastName, String password, Role role) {
        super(userName,firstName,lastName,password, role.LECTURER);
    }
}
