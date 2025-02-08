class Person {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person pobj = new Person();
        pobj.setName("Sima");
        pobj.setAge(15);
        System.out.println("Name: " + pobj.getName());
        System.out.println("Age: " + pobj.getAge());
        pobj.setAge(-5);
    }
}
