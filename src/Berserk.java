public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int getDamageOfBerserk = boss.getDamage() + this.getDamage();
        boss.setHealth(boss.getHealth() - getDamageOfBerserk);
        System.out.println("Berserk dealt blocked damage: " + getDamageOfBerserk);
    }

}
