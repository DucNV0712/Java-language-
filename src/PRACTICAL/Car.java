package PRACTICAL;



public class Car implements Vehicle{
    String name;


    public void setName(String name) {
        this.name = name;
    }

    public Car() {
    }
    @Override
    public String getName() {
        return  this.name;

    }
    @Override
    public float moveMax() {
        return 250;

    }


}
