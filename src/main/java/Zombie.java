public class Zombie implements Comparable<Zombie> {
    private String name;
    private double health;

    //constructors
    public Zombie(String name, double health) {
        setName(name);
        setHealth(health);
    }
    public Zombie(String name) {
        setName(name);
        setHealth(50.0);
    }
    public Zombie() {
        setName("Zeek");
        setHealth(50.0);
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(double health) {
        if(health < 0)
            this.health = 0.0;
        else
            this.health = (health > 100) ? 100 : health;
    }

    //getters
    public String getName() {
        return name;
    }
    public double getHealth() {
        return health;
    }

    public String toString() {
        String result = String.format("%s %2.1f", name, health);
        if(!isMobile())
            result += " (Immobile)";
        return result;
    }

    public boolean isMobile() {
        return health >= 10.0;
    }

    @Override
    public int compareTo(Zombie o) {
        int result = this.name.compareToIgnoreCase(o.name);
        if (result == 0)
            result = (int)(this.health - o.health);
        return result;
    }
}
