package javaC.Schildt.Collections;

public class CustomElement {
    private String name;
    private int age;

    public CustomElement(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "CustomElement{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(CustomElement o) {

        if (this.age == o.age) {
            return 0;

        } else if (this.age < o.age) {
            return -1;

        } else {
            return 1;
        }
    }
}
