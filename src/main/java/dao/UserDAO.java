package dao;
import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;
public class UserDAO {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("Honda Nanako");
        u1.setAccount("nanako");
        u1.setEmail("nanako@hotchat.com");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(15);
        u2.setName("Yui Hatano");
        u2.setAccount("yui");
        u2.setEmail("yui@hotchat.com");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(16);
        u3.setName("Tachibana");
        u3.setAccount("tachibana");
        u2.setEmail("tachibana@hotchat.com");
        u3.setPassword("123456");
        users.add(u3);
    }

    public static User checkLogin(Login login){
        for (User u: users) {
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
