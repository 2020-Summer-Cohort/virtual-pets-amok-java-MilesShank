package pets_amok;

public abstract class OrganicPet extends VirtualPet  {

    private int petHunger;
    private int petThirst;
    private int petBathroomNeeds;



    public void setPetBathroomNeeds(int petBathroomNeeds) {
        this.petBathroomNeeds = petBathroomNeeds;
    }


    public void setPetHunger(int petHunger) {
        this.petHunger = petHunger;
    }

    public void setPetThirst(int petThirst) {
        this.petThirst = petThirst;
    }


    public OrganicPet(String petName, String petDescription) {
        super(petName, petDescription);
            this.petHunger = 5;
            this.petThirst = 5;
            this.petBathroomNeeds = 1;
    }

    public int getPetHunger() {
        return petHunger;
    }
    public int getPetThirst(){
        return petThirst;

    }
    public int getPetBathroomNeeds() {
        return petBathroomNeeds;
    }

    public void feed(){
        int hunger = this.getPetHunger();
        hunger--;
        this.setPetHunger(hunger);}

    public void water(){
        int thirst=this.getPetThirst();
        thirst--;
        this.setPetThirst(thirst);}
}