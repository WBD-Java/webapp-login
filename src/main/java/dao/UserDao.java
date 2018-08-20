package dao;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();

        User user1 = new User();
        user1.setAccount("john");
        user1.setPassword("123456");
        user1.setName("John");
        user1.setEmail("john@codegym.com");
        user1.setAge(20);
        users.add(user1);

        User user2 = new User();
        user2.setAccount("anh");
        user2.setPassword("120498");
        user2.setName("anh");
        user2.setEmail("anh@codegym.com");
        user2.setAge(20);
        users.add(user2);

        User user3 = new User();
        user3.setAccount("minh");
        user3.setPassword("180507");
        user3.setName("minh");
        user3.setEmail("minh@codegym.com");
        user3.setAge(12);
        users.add(user3);
    }

    public static User checkLogin(Login login) {
        for (User user : users) {
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
