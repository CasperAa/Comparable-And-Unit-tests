public class Person implements Comparable <Person>{
    /*
    Create a class called Person Each person has the following attributes:
    Name,height & age.
    Implement the comparable interface, with a natural ordering such that:

        •An older person is sorted higher in the natural ordering
        •If two persons are the same age, the taller person is sorted higher in the natural ordering

        Create a list of persons Print them from lowest to highest in the natural ordering
    */

    String name;
    double height;
    int age;

    public Person(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{ Person - " + name +' '+  height +
                " Age " + age + '}';
    }

    @Override
    public int compareTo(Person otherPerson){
        if(this.age > otherPerson.getAge()){
            return 1;
        }
        else if (this.age < otherPerson.getAge()){
            return -1;
        }
        else if (this.age == otherPerson.getAge())
            if (this.height > otherPerson.getHeight()){
                return 1;
        } else {
                return -1;
            }
        else {
            return 0;
        }
    }
}
