package lt.vcs.moksys.users;

public abstract class User {
    private String  userName;
    private String  firstName;
    private String lastName;
    private String password;
    private Role role;

    User(String userName, String firstName, String lastName, String password, Role role) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.role = role;
    }
}