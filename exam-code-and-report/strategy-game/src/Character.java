public abstract class Character {
    protected WeaponBehavior weaponBehavior;
    public void setWeapon(WeaponBehavior weaponBehavior){
        this.weaponBehavior=weaponBehavior;
    };
    public abstract void fight();
}
