public class King extends Character {
    public King(){
        this.weaponBehavior = new SwordBehavior();
    }
    public void fight(){
        System.out.println("I'm a King");
        weaponBehavior.useWeapon();
    }
}
