public class PersonTest
{
    public static void main(String[] args)
    {
        Person person1 =
            new Person("Maria Johnson", 28, "maria@example.com");
        Person person2 =
            new Person("Prof Hedli", 35, "Prof@ccm.edu");
        System.out.println("First persons name: " + person1.getName());
        System.out.println();
        person2.setAge(36);
        person1.displayInfo();
        person2.displayInfo();
    }
}