public class Magic extends Hero {
    private int damagePlus;
    public Magic(int health, int damage, int damagePlus, String name) {
        super(health, damage, SuperAbility.BOOST, name);
        this.damagePlus = damagePlus;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++ ) {
            if (heroes[i].getHealth() > 0 ) {
                heroes[i].setDamage(heroes[i].getDamage() + this.damagePlus);

            }
        }
    }
}
