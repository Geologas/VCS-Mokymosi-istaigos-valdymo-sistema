package lt.vcs.moksys.users;

public class Admin extends User{
    public Admin(String userName, String firstName, String lastName, String password, Role role) {
        super(userName,firstName,lastName,password, role.ADMIN);
    }
}
