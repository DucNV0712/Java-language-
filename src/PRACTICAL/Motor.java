package PRACTICAL;



public class Motor implements Vehicle{
    String name;

    public Motor() {
    }



    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float moveMax() {
        return 150;
    }


}
