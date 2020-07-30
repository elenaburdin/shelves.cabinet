package Things;

public class Tablet extends Thing{
    String name;
    
    public Tablet(String name) {
    	setName(name);
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;

    }

}