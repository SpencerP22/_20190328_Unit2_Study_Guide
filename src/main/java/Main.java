import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zombie kenneth = new Zombie("Kenneth", 8.5);
        Zombie suzan = new Zombie("Suzan");
        //initializes hoard array
        Zombie[] hoard = new Zombie[100];
        for(int i=0; i<hoard.length; i++)
            hoard[i] = new Zombie();
        hoard[0] = kenneth;
        hoard[1] = suzan;

        ArrayList<Zombie> mob = new ArrayList<>();
        mob.add(kenneth);
        mob.add(suzan);
        mob.add(new Zombie());

        System.out.printf("------- %d Zombies in mob -------\n", mob.size());
        for(Zombie zombie : mob) {
            System.out.println(zombie);
        }

        printHoard(hoard, hoard.length);
        System.out.println("Done");
    }
    public static void printHoard(Zombie[] hoard, int n) {
        System.out.printf("------- %d Zombies in hoard -------\n", n);
        for(int i=0; i<n; i++) {
            System.out.println(hoard[i]);
        }
    }
}
