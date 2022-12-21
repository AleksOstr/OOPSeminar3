import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Alex", "Petrov", 28))
                .addUser(new User("Alex", "Petrov", 18))
                .addUser(new User("Andrey", "Hvatov", 35))
                .addUser(new User("Anton", "Krutov", 28));
        for (User user : personal) {
            System.out.println(user);
        }
        Collections.sort(personal.getUsers());
        personal.forEach(System.out::println);

        User bigBoss = new User(personal, "Vasya", "Ivanov", 45);
        Company company = new Company(bigBoss);
        company.forEach(System.out::println);

    }
}

