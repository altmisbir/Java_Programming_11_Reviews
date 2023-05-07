package src.week_12;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name) {
        setName(name);
    }

    public Person(int age) {
        setAge(age);
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        boolean isValidName = true;
        for (char c :name.toCharArray()){
            if (Character.isLetter(c)) {
                isValidName = false;
                break;
            }
        }
        if (isValidName) {
            this.name = name;
        }else {
            System.out.println("Your name is not valid");
            System.exit(0);
        }

    }

    public void setAge(int age) {

        if (age < 0) {
            System.out.println("You can not assign negative numbers in age ");
            System.exit(0);
        }else {
            this.age = age;
        }
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
