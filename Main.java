interface Character {
    void attack(String enemy);
    void defend(String enemy);
}
interface Mage {
    void castSpell(String spell);
}
interface Warrior {
    void useWeapon(String weapon);
}
class Player implements Character, Mage, Warrior {
    @Override
    public void attack(String enemy) {
        System.out.println("The player attacks the "+ enemy +".");
    }
    @Override
    public void defend(String enemy) {
        System.out.println("The player defends against the "+ enemy +" attack.");
    }
    @Override
    public void castSpell(String spell) {
        System.out.println("The player casts " + spell + ".");
    }
    @Override
    public void useWeapon(String weapon) {
        System.out.println("The player uses a "+ weapon +" to attack.");
    }
}
public class Main {
    public static void main(String[] args) {
        Player p = new Player();
        p.attack("orc");
        p.defend("troll");
        p.castSpell("Fire ball");
        p.useWeapon("spear");
    }
}
