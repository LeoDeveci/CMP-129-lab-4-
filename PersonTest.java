public class PersonTest
{
    public static void main(String[] args)
    {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setName("Maria Johnson");
        person1.setAge(28);
        person1.setEmail("maria@example.com");
        person2.setName("Prof Hedli");
        person2.setAge(30);
        person2.setEmail("Prof@ccm.edu");
        System.out.println("First person's name: " + person1.getName());
        System.out.println();
        person1.displayInfo();
        person2.displayInfo();
    }
}