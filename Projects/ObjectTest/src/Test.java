public class Test extends Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void sendMes(){
        send();
    }

    /*@Override
    public void send() {
        System.out.println("New Test");
    }*/
}
