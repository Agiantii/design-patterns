public class Queen extends Character {
    public Queen() {
        this.weaponBehavior = new KnifeBehavior();
    }
    public void fight() {
        System.out.println("I'm a Queen!");
        weaponBehavior.useWeapon();
    }
}
