import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero spidey = new Hero("Spider-Man", 18);
        Hero hulk = new Hero("Hulk", 49);
        Hero strange = new Hero("Doctor Strange", 42);
        
        ArrayList<Hero> heroes = new ArrayList<>();

        heroes.add(blackWidow);
        heroes.add(captainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(spidey);
        heroes.add(hulk);
        heroes.add(strange);

        thor.setAge(1501);

        Collections.shuffle(heroes);

        int maxSize = heroes.size();

        for(int i = heroes.size()-1; i>maxSize/2 -1; i--){
            heroes.remove(i);
        }

        for(Hero hero : heroes){
            System.out.println(hero.getName());
        }



        
    }
}