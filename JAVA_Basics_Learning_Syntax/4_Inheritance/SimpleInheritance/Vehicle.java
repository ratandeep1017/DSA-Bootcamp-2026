package SimpleInheritance;

class Vehicle {
    protected String name;

    //"name" can only access by Vehicle class
    //and class inherited by Vehicle class
    public void move() {
        System.out.println(this.name + " is Moving");
    }

    public void stop() {
        System.out.println(this.name + " is Stopped");
    }

}
