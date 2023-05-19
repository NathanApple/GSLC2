import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Weclome to Faloran Library!");
        System.out.println("Check every description and detail for this newest game called 'Faloran'");
        System.out.println("Choose Category!");
        System.out.println("AGENT | GUN");
        String inp = input.next();
        switch (inp) {
            case "AGENT":
                System.out.println("[AGENT]");
                System.out.println("Choose Agent!");
                System.out.println("JETT | YORU | PHOENIX");
                String inp2 = input.next();

                switch (inp2) {
                    case "JETT":
                        Jett agent = new Jett();
                        System.out.println("Passive:");
                        agent.agentPassive();
                        System.out.println();
                        System.out.println("Ability:");
                        agent.agentAbility();
                        System.out.println();

                        System.out.println("Signature");
                        agent.agentSignature();
                        System.out.println();

                        System.out.println("Ultimate");
                        agent.agentUltimate();
                        break;
                    case "YORU":
                        Yoru yoru = new Yoru();
                        System.out.println("Ability:");
                        yoru.agentAbility();
                        System.out.println();
                        System.out.println("Signature");
                        yoru.agentSignature();
                        System.out.println();
                        System.out.println("Ultimate");
                        yoru.agentUltimate();
                    case "PHOENIX":
                        Phoenix phoenix = new Phoenix();
                        System.out.println("Ability:");
                        phoenix.agentAbility();
                        System.out.println();
                        System.out.println("Signature");
                        phoenix.agentSignature();
                        System.out.println();
                        System.out.println("Ultimate");
                        phoenix.agentUltimate();
                    default:
                        break;
                }

                break;

            case "GUN":
                System.out.println("[AGENT]");
                System.out.println("Choose Gun!");
                System.out.println("VANDAL | SPECTRE | GHOST");
                String inpGun = input.next();

                System.out.println("Choose Action");
                System.out.println("[1] Test how long to kill");
                System.out.println("[2] View description");
                int inpOption = input.nextInt();

                if (inpOption == 1) {
                    System.out.println("Input target");
                    System.out.println("HEAD | BODY | LEG");
                    String inpTarget = input.next();

                    System.out.println("Input Health Number");
                    double inpHealth = input.nextDouble();

                    switch (inpGun) {
                        case "VANDAL":
                            Vandal vandal = new Vandal();
                            vandal.calculateTimeToKill(inpTarget, inpHealth);
                            break;
                        case "SPECTRE":
                            Spectre spectre = new Spectre();
                            spectre.calculateTimeToKill(inpTarget, inpHealth);
                            break;
                        case "GHOST":
                            Ghost ghost = new Ghost();
                            ghost.calculateTimeToKill(inpTarget, inpHealth);
                            break;
                        default:
                            break;
                    }
                } else {
                    switch (inpGun) {
                        case "VANDAL":
                            Vandal vandal = new Vandal();
                            vandal.printDescription();
                            break;
                        case "SPECTRE":
                            Spectre spectre = new Spectre();
                            spectre.printDescription();
                            break;
                        case "GHOST":
                            Ghost ghost = new Ghost();
                            ghost.printDescription();
                            break;
                        default:
                            break;
                    }
                }

                break;
            default:
                break;
        }

        input.close();
    }
}
