/**
 * @author  6510450569 Panithan Champahom
 */

package designPrinc;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public String getEmail() { return this.email; }

}
