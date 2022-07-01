package eh.java.Builder;

public class Person {
    private int id;
    private String name;
    private short age;
    private Genders gender;

    public Person(int id, String name, short age, Genders gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public Genders getGender() {
        return gender;
    }

    public static class Builder{
        private int id;
        private String name;
        private short age;
        private Genders gender;


        public Builder id(int id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(short age){
            this.age = age;
            return this;
        }

        public Builder gender(Genders gender){
            this.gender = gender;
            return this;
        }

        public Person build(){
            return new Person(id,name,age,gender);
        }

    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Person: ")
                .append("\nId: ").append(this.id)
                .append("\nName: ").append(this.name)
                .append("\nAge: ").append(this.age)
                .append("\nGender: ").append(this.gender)
                .toString();
    }
}
