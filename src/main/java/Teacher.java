
import java.io.Serializable;

public class Teacher implements Serializable {

    private String name;
    private int age;
    private String village;

    public Teacher(String name, int age, String village) {
        this.name = name;
        this.age = age;
        this.village = village;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", village='" + village + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

//    public Teacher(String name, int age, String village);

}
