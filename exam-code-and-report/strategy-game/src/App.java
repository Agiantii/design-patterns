public class App {
    public static void main(String[] args) throws Exception {
        Character character = new King();
        character.fight();
        character = new Queen();
        character.fight();
        character = new Knight();
        character.fight();
        character = new Troll();
        character.fight();
        character.setWeapon(new AxeBehavior());
        character.fight();
    }
}
