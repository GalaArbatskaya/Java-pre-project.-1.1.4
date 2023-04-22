package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userDao = new UserServiceImpl();

        userDao.createUsersTable();

        userDao.saveUser("Галина", "Арбатская", (byte) 42);
        userDao.saveUser("Денис ", "Руднев", (byte) 48);
        userDao.saveUser("Майя", "Кощке", (byte) 8);
        userDao.saveUser("Тигра", "Собащке", (byte) 3);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();

    }
}
