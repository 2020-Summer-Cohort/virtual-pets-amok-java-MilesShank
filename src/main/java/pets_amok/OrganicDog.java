package pets_amok;




public class OrganicDog extends OrganicPet implements WalkNeeds {


private int cageWasteLevel;

    public int getCageWasteLevel() {
        return cageWasteLevel;
    }

    public void setCageWasteLevel(int cageWasteLevel) {
        this.cageWasteLevel = cageWasteLevel;
    }

    public OrganicDog(String petName, String petDescription) {
        super(petName, petDescription);
        this.cageWasteLevel = 0;


    }

    public void poop(){
      this.cageWasteLevel++;
    };

    public void feed() {
        int hunger = this.getPetHunger();
        hunger++;
        this.setPetHunger(hunger);

    }

    public void water() {
        int thirst=this.getPetThirst();
        thirst++;
        this.setPetThirst(thirst);
    }

    @Override
    public void goesOnWalk() {
        this.setPetBathroomNeeds(0);
        int happiness = this.getPetHappiness();
        happiness++;
        this.setPetHappiness(happiness);
    }

}
