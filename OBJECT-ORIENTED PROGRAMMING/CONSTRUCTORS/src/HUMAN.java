public class HUMAN {

    String name;
    int age;
    double weight;
    HUMAN(String name,int age,double weight)
    {
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    void eat()
    {
        System.out.println(this.name+" is eating");
    }

    void drink()
    {
        System.out.println(this.name+" is drinking");
    }

    void age()
    {
        System.out.println(this.name+" is "+this.age+" years old");
    }

    void weight()
    {
        System.out.println(this.name+"'s weight is "+this.weight);
    }

}
