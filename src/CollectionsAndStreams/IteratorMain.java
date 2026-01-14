package CollectionsAndStreams;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {

    public static void main(String[] args){

        Employees university = new Employees();
        university.add(new Person("John", Education.PHD));
        university.add(new Person("Adam", Education.HS));
        university.add(new Person("Jane", Education.PHD));
        university.add(new Person("Ismail", Education.BA));
        university.add(new Person("Samuel", Education.MA));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }
}
enum Education{
    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");

    private final String educationLevel;

    Education(String educationLevel){
        this.educationLevel = educationLevel;
    }
}
class Person{
    private final String name;
    private final Education education;

    public Person(String name, Education education){
        this.name = name;
        this.education = education;
    }

    public Education getEducation(){
        return education;
    }

    @Override
    public String toString(){
        return name + ", " + education;
    }
}
class Employees{
    private final List<Person> person;

    public Employees(){
        person = new ArrayList<>();
    }

    public void add(Person personToAdd){
        person.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        for(Person p: peopleToAdd)
            person.add(p);
    }

    public void print(){
        Iterator<Person> itr = person.iterator();

        while(itr.hasNext())
            System.out.println(itr.next());
    }

    public void print(Education education){

        Iterator<Person> itr = person.iterator();

        while(itr.hasNext()){
            Person nxt = itr.next();
            if(nxt.getEducation()== education)
                System.out.println(nxt);
        }
    }

    public void fire(Education education){

        Iterator<Person> itr = person.iterator();

        while(itr.hasNext()){
            if(itr.next().getEducation()==education)
                itr.remove();
        }
    }
}
