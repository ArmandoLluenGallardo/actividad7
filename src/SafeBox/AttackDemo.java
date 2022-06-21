package SafeBox;

public class AttackDemo {
    public static void main(String[] args) {
        SafeManager safeManager = new SafeManager();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            Object treasure = safeManager.getTreasure(new MaliciousSafeKey());
            if (treasure != null)
                System.out.println("Tesoro encontrado: " + treasure);
        }
    }
}
