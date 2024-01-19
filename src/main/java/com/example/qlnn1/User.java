/*package com.example.qlnn1;
import java.util.List;
import java.sql.DatabaseMetaData;
import java.sql.SQLData;
public class User {

    private String username;

    private String password;

    private boolean is_admin;

    public User() {
    }

    public User(String username, String password, boolean is_admin) {
        this.username = username;
        this.password = password;
        this.is_admin = is_admin;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public static boolean isUserAdmin(User user) {
        List<User> users = User.isUserAdmin(User user );
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(user.getUsername())) {
                if (users.get(i).getPassword().equals(user.getPassword())) {
                    if (users.get(i).isIs_admin() == true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", is_admin=" + is_admin + '}';
    }
}
*/