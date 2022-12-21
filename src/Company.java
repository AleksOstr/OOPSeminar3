import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User>{
    private User user;

    public Company(User user) {
        this.user = user;
    }
    private List<User> deepTree(User user) {
        List<User> result = new ArrayList<>();
        result.add(user);
        if (user.getStaff().size() == 0){
            return result;
        }
        for (User item: user.getStaff()) {
            result.addAll(deepTree(item));
        }
        return result;
    }

    @Override
    public Iterator<User> iterator() {
        List<User> employees = deepTree(user);
        return new Iterator<User>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < employees.size();
            }

            @Override
            public User next() {
                return employees.get(index++);
            }
        };
    }
}
