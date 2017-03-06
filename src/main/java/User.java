/**
 * Created by dieterp on 6/03/2017.
 */
public class User {
    private String name;
    private Candy candy;

    public User(String name, Candy candy) {
        this.name = name;
        this.candy = candy;
    }

    public String getName() {
        return name;
    }

    public Candy getCandy() {
        return candy;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", candy=" + candy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return candy != null ? candy.equals(user.candy) : user.candy == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (candy != null ? candy.hashCode() : 0);
        return result;
    }
}
