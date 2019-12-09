package day04.test2;
@SuppressWarnings("all")
public abstract class Animal {
    private String id;
    private String name;
    public abstract void eat();
    public abstract void sleep();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
