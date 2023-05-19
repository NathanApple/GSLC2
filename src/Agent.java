public interface Agent {

    void agentAbility();

    void agentSignature();


    void agentUltimate();

}

class Jett implements Agent {
    @Override
    public void agentAbility() {
        System.out.println("Cloudburst");
        System.out.println(
                "INSTANTLY throw a projectile that expands into a brief vision-blocking cloud on impact with a surface. HOLD the ability key to curve the smoke in the direction of your crosshair.");
        System.out.println("");
        System.out.println("Updraft");
        System.out.println("Q ability: INSTANTLY propel Jett high into the air.");
    }

    @Override
    public void agentSignature() {
        System.out.println("Tailwind");
        System.out.println(
                "ACTIVATE to prepare a gust of wind for a limited time. RE-USE the wind to propel Jett in the direction she is moving. If Jett is standing still, she propels forward.");
    }

    public void agentPassive() {
        System.out.println("Drift");
        System.out.println("Holding the jump button while falling allows you to glide through the air.");
    }

    @Override
    public void agentUltimate() {
        System.out.println("Blade Storm");
        System.out.println(
                "EQUIP a set of highly accurate throwing knives. FIRE to throw a single knife and recharge knives on a kill. ALTERNATE FIRE to throw all remaining daggers but does not recharge on a kill.");
    }
}

/**
 * Yoru
 */
class Yoru implements Agent {

    @Override
    public void agentAbility() {
        System.out.println("Fakeout");
        System.out.println(
                "EQUIP an echo that transforms into a mirror image of Yoru when activated. FIRE to instantly activate the mirror image and send it forward. ALT FIRE to place an inactive echo. USE to transform an inactive echo into a mirror image and send it forward. Mirror images explode in a Blinding Flash when destroyed by enemies.");
        System.out.println();
        System.out.println("Blindside");
        System.out.println(
                "EQUIP to rip an unstable dimensional fragment from reality. FIRE to throw the fragment, activating a flash that winds up once it collides with a hard surface in world.");
    }

    @Override
    public void agentSignature() {
        System.out.println("Gatecrash");
        System.out.println(
                "EQUIP a rift tether FIRE to send the tether forward ALT FIRE to place a stationary tether ACTIVATE to teleport to the tether's location USE to trigger a fake teleport.");
    }

    @Override
    public void agentUltimate() {
        System.out.println("Dimensional Drift");
        System.out.println(
                "EQUIP a mask that can see between dimensions. FIRE to drift into Yoru's dimension, unable to be affected or seen by enemies from the outside.");
    }

}

class Phoenix implements Agent {

    @Override
    public void agentAbility() {
        System.out.println("Blaze");
        System.out.println(
                "EQUIP a flame wall. FIRE to create a line of flame that moves forward, creating a wall of fire that blocks vision and damages players passing through it. HOLD FIRE to bend the wall in the direction of your crosshair.");
        System.out.println();
        System.out.println("Curveball");
        System.out.println(
                "EQUIP a flare orb that takes a curving path and detonates shortly after throwing. FIRE to curve the flare orb to the left, detonating and Blinding any player who sees the orb. ALT FIRE to curve the flare orb to the right.");
    }

    @Override
    public void agentSignature() {
        System.out.println("Hot Hands");
        System.out.println(
                "EQUIP a fireball. FIRE to throw a fireball that explodes after a set amount of time or upon hitting the ground, creating a lingering fire zone that damages enemies. ALT FIRE to lob.");
    }

    @Override
    public void agentUltimate() {
        System.out.println("Run it Back");
        System.out.println(
                "INSTANTLY place a marker at Phoenix's location. While this ability is active, dying or allowing the timer to expire will end this ability and bring Phoenix back to this location with full health and the amount of armor he had when the ability was cast.");
    }

}