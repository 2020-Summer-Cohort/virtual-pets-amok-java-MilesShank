package pets_amok;

public abstract class VirtualPet {
    private String petName;
    private String petDescription;
    private int petHealth;
    private int petHappiness;

    public void setPetHealth(int petHealth) {
        this.petHealth = petHealth;
    }

    public void setPetHappiness(int petHappiness) {
        this.petHappiness = petHappiness;
    }
    public String getPetName() {
        return petName;
    }

    public int getPetHealth() {
        return petHealth;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public int getPetHappiness() {
        return petHappiness;
    }
    public VirtualPet(String petName, String petDescription){


        this.petName = petName;
        this.petDescription = petDescription;
        this.petHealth = 5;
        this.petHappiness = 5;
    }

    public void affectHealth() {
        petHealth--;
    }
}
