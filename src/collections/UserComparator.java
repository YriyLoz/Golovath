package collections;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User User1, User User2) {

        return User1.getAge()-User2.getAge();
    }

}
