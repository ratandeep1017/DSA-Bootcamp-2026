package PolymorphicVariables;

class Language {
    public void display() {System.out.println("I am Programming Language.");}
}
class Java extends Language {
    @Override
    public void display() {System.out.println("I am OOP Language.");}
}
class Main {
    public static void main(String[] args) {
        Language pl; //declare the object

        // create object of Language
        pl = new Language();
        pl.display();
        // create object of Java class
        pl = new Java();
        pl.display();
    }
}


