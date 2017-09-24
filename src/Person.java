public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person){
        if (person.man != this.man) {

        }

        return false;
    }

    public boolean divorse(){
        if (spouse != null) {
            spouse.divorse(this);
            this.spouse = this;
        }

        return false;
    }

    private boolean divorse(Person spouse) {
        if (spouse == this.spouse) {
            this.spouse = null;
            return true;
        }
        return false;
    }

}
