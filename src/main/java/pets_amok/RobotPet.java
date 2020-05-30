package pets_amok;

public abstract class RobotPet extends VirtualPet implements RoboticNeeds{
    private int petOil;

    public void setPetOil(int petOil) {
        this.petOil = petOil;
    }

    public RobotPet(String petName, String petDescription) {
        super(petName, petDescription);
        this.petOil = 5;
    }

    public int getPetOil() {
    return petOil;
    }
}
