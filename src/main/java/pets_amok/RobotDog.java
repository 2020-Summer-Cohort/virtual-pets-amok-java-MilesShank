package pets_amok;

public class RobotDog extends RobotPet implements WalkNeeds {

    public RobotDog(String petName, String petDescription) {
        super(petName, petDescription);
    }

    public void getsOiled() {
        int oil=this.getPetOil();
        oil++;
        this.setPetOil(oil);
    }

    @Override
    public void goesOnWalk() {
    int happiness = this.getPetHappiness();
    happiness++;
    this.setPetHappiness(happiness);
    }
}
