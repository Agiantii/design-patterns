public class Troll extends Character {
    public Troll() {
        this.weaponBehavior = new BowAndArrowBehavior();
    }

    public void fight() {
        System.out.println("I'm a Troll!");
        weaponBehavior.useWeapon();
    }
}
