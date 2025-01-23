package gr.aueb.cf.ch18.clone;

public class Trainee implements Cloneable {
    private String name;
    private City city;

    public Trainee(){

    }

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    //This is copy constructor, if we do this then we don't need implements cloneable
    public Trainee(Trainee trainee) {
        this.name = trainee.name;
        this.city = new City(trainee.getCity());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    //If we have copy constructor then we don't need to override this
    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        Trainee trainee = (Trainee) super.clone();
        trainee.setCity(new City(this.city.getDescription()));
        return trainee;
    }
}
