package eh.java.Builder;

public class BuilderMain {
    public static void main(String[] args){
        Person Tom = new Person.Builder().id(1).name("Tom").age((short) 21).gender(Genders.MALE).build();

        Person Erica = new Person.Builder().id(2).name("Erica").age((short) 19).gender(Genders.FEMALE).build();

        System.out.println(Tom.toString()+'\n');
        System.out.println(Erica.toString());

    }
}
