public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Test test = new Test();
        Test test1 = new Test();
        test.sendMes();
        test.send();
        Person person = new Test();
        Person person1 = new Person();
        //person.toString();
        person.send();
        person1.send();
        test.setName("Piter");
        test.setAge(25);
        test1.setName("Piter");
        test1.setAge(25);
        /*test.getName();
        test.getAge();*/
        System.out.println(test.getName()+" "+test.getAge());
        System.out.println(test1.getName()+" "+test1.getAge());
        System.out.println(test);
        System.out.println(person);
        System.out.println(person.toString());
        System.out.println(person1);
        System.out.println(person1.toString());
        System.out.println(test==test1);
        System.out.println(test.equals(test1));
    }
}