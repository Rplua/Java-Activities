package Module8.properEn;

public class EnhancedPlayer {

    private String fullName;
    private int healthPercenntage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName,  100,  "Sword");
    }
    public EnhancedPlayer(String fullName, int healthPercenntage, String weapon) {
        this.fullName = fullName;
        setHealthPercenntage(healthPercenntage);
        this.weapon = weapon;
    }

    public void setHealthPercenntage(int healthPercenntage) {
        if(healthPercenntage <= 0) {
            this.healthPercenntage = 0;
            return;
        }
        if(healthPercenntage >= 100) {
            this.healthPercenntage = 100;
            return;
        }
        this.healthPercenntage = healthPercenntage;
    }

    public void loseHealth(int damage) {
        healthPercenntage -= damage;
        if(healthPercenntage <= 0) {
            System.out.println("Player dead");
        }
    }

    public int healtRemain() {
        return healthPercenntage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercenntage += extraHealth;
        if(healthPercenntage >= 100) {
            System.out.println("Player restored");
            healthPercenntage = 100;
        }
    }
}
