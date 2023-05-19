public abstract class Gun {
    double hsMultiplier = 4.0;
    double lsMultiplier = 0.85;
    double fireRatePerSec = 1;
    double damage = 10;

    Gun(double damage) {
        this.damage = damage;
    }

    Gun(double damage, double fireRatePerSec) {
        this.damage = damage;
        this.fireRatePerSec = fireRatePerSec;
    }

    Gun(double damage, double fireRatePerSec, double hsMultiplier) {
        this.damage = damage;
        this.fireRatePerSec = fireRatePerSec;
        this.hsMultiplier = hsMultiplier;
    }

    Gun(double damage, double fireRatePerSec, double hsMultiplier, double lsMultiplier) {
        this.damage = damage;
        this.fireRatePerSec = fireRatePerSec;
        this.hsMultiplier = hsMultiplier;
        this.lsMultiplier = lsMultiplier;
    }

    void calculateTimeToKill(String target, double health) {
        double secondPerRound = 1 / this.fireRatePerSec;
        double timeNeeded;
        switch (target) {
            case "HEAD":
                timeNeeded = secondPerRound * (Math.ceil(health / (damage * this.hsMultiplier) - 1));
                break;

            case "LEG":
                timeNeeded = secondPerRound * (Math.ceil(health / (damage * this.lsMultiplier) - 1));
                break;

            default:
                timeNeeded = secondPerRound * (Math.ceil(health / damage) - 1);
                break;
        }
        System.out.println("Time needed to kill:");
        System.out.println(Math.abs(timeNeeded));
        // double timeNeeded = ();
    }

    abstract public void printDescription();
}

class Vandal extends Gun {

    Vandal() {
        super(40, 9.75);
    }

    Vandal(double damage, double fireRatePerSec, double hsMultiplier, double lsMultiplier) {
        super(damage, fireRatePerSec, hsMultiplier, lsMultiplier);
    }

    @Override
    public void printDescription() {
        System.out.println(
                "The Vandal is a high-cost automatic rifle. One of VALORANT's best general-purpose weapons, it is most effective at picking off individual targets at longer ranges due to having no falloff, allowing it to kill any enemy with a single headshot at all ranges. ");
    }

}

class Spectre extends Gun {

    Spectre() {
        super(26, 13.33, 3);
    }

    Spectre(double damage, double fireRatePerSec, double hsMultiplier, double lsMultiplier) {
        super(damage, fireRatePerSec, hsMultiplier, lsMultiplier);
    }

    @Override
    public void printDescription() {
        System.out.println(
                "The Spectre is a moderately-priced SMG. Equipped with a large magazine and a silencer, it can be used to spam through vision blockers without much risk to the player's ammo count or positioning. ");
    }

}

class Ghost extends Gun {

    Ghost() {
        super(30, 6.75, 3.5);
    }

    Ghost(double damage, double fireRatePerSec, double hsMultiplier, double lsMultiplier) {
        super(damage, fireRatePerSec, hsMultiplier, lsMultiplier);
    }

    @Override
    public void printDescription() {
        System.out.println(
                "The Ghost is a low-cost semi-automatic pistol. Equipped with a large magazine and a silencer, it can be used to spam through vision blockers without much risk to the player's ammo count or positioning. ");
    }

}