public class Knight extends Character {
    public Knight() {
        this.weaponBehavior = new SwordBehavior();
    }

    public void fight() {
        System.out.println("I'm a Knight!");
        weaponBehavior.useWeapon();
    }
}
