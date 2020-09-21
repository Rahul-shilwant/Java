class person
{
    private int age;
    private String name;

    person()
    {
        this.age = 18;
        System.out.println("default age is :"+age);
    }

    person(int age , String name)
    {
        this.age = age;
        this.name = name;
    }

    void display()
    {
        System.out.println(age+" "+name);

    }

}

class Assign37{
    public static void main(String[] args) {
    person p = new person();
    person p2 = new person(101,"rahul");        
    p2.show();

    }
}