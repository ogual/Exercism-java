abstract class Fighter {

    @Override
    public String toString() {
        return "Fighter is a ";
    }

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    private final int DAMAGE_POINTS_IF_NOT_VULNERABLE = 6;
    private final int DAMAGE_POINTS_IF_VULNERABLE = 10;
    private final String FIGHTER_TYPE = "Warrior";

    @Override
    public String toString() {
        return super.toString() + FIGHTER_TYPE;
    }

    @Override
    int damagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? DAMAGE_POINTS_IF_VULNERABLE : DAMAGE_POINTS_IF_NOT_VULNERABLE;

    }
}

class Wizard extends Fighter {

    private final int DAMAGE_POINTS_WITH_SPELL = 12;
    private final int DAMAGE_POINTS_WITHOUT_SPELL = 3;
    private final String FIGHTER_TYPE = "Wizard";

    private Boolean spell = false;

    @Override
    public String toString() {
        return super.toString() + FIGHTER_TYPE;
    }

    @Override
    boolean isVulnerable() {
        return this.spell == false;
    }

    @Override
    int damagePoints(Fighter fighter) {
        return this.spell == true ? DAMAGE_POINTS_WITH_SPELL : DAMAGE_POINTS_WITHOUT_SPELL;
    }

    void prepareSpell() {
        this.spell = true;
    }

}
