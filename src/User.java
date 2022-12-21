public class User implements Comparable<User> {
    private Personal staff = new Personal();
    private String firstName;
    private String lastName;
    private int age;

    public User(Personal staff, String firstName, String lastName, int age) {
        this(firstName, lastName, age);
        this.staff = staff;
    }
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Personal getStaff() {
        return staff;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", this.getFirstName(), this.getLastName(), this.getAge());
    }

    @Override
    public int compareTo(User o) {
        String thisFullName = this.firstName + this.lastName;
        String oFullName = o.firstName + o.lastName;
        if (thisFullName.equals(oFullName)) {
            return this.age - o.age;
        }
        return thisFullName.compareTo(oFullName);
    }
}
