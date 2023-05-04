package TugasInheritence;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Fighter fighter = new Fighter();

        fighter.name = "Caelus";
        fighter.hp = 1500;
        fighter.atp = 800;

        fighter.attack();
        fighter.skill1();
        fighter.skill2();
        fighter.ultimate();
    }       
}
