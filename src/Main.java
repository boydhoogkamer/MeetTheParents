

public class Main {
    public static void main(String[] args){


/*        Person p1 = new Person();
        //  p1.setYear();

        //p1.name = "henk";
        //System.out.println(p1.name);

        p1.setName("Erwin");
        System.out.println(p1.getName());



        Student s1 = new Student();
        s1.setName("Henk");



        Person[] people = {
                new Teacher(),
                new Student()

        };
        Teacher t = (Teacher)people[0];
        t.setName("Erwin");
        t.setIq(130);
        t.addDiploma("HBO gamedesign & Development (HKU)");

        Student s = (Student)people[1];
        s.setName("Hendrik");
        s.setIq(130);
        s.addCourse("PRO2");
        s.addDiploma("VMBO T");

        for (Person person : people) {
            System.out.println(person.getName() + " has an IQ of " + person.getIq() + " and has the following diplomas " + person.getDiplomas());

        }
*/
        Eerstejaars Rico = new Eerstejaars();
        Rico.setSporten("Voetbal");
        System.out.println("Rico speelt " + Rico.getSporten());

        Parent p1 = new Parent();
        p1.setSchoonmaken("bleach");
        System.out.println("p1 maakt schoon met " + p1.getSchoonmaken());
    }
}