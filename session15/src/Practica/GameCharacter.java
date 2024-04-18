package Practica;

public class GameCharacter {
    private Weapon weapon;

    GameCharacter(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void attack() {
        weapon.use();
    }
}
