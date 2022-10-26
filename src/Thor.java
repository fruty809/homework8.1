public class Thor  extends Hero{
    boolean thorStan;
    public Thor(int health, int damage,  String name) {
        super(health, damage, SuperAbility.STAN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        thorStan = RPG_Game.random.nextBoolean();
        if (thorStan){
            boss.setDamage(0);
            System.out.println("Boss оглушен на 1 раунд");
        }
        else {
            boss.setDamage(50);
        }
    }
}
