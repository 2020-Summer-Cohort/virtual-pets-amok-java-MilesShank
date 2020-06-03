package pets_amok;

public class OrganicCat extends OrganicPet{
    public OrganicCat(String petName, String petDescription) {
        super(petName, petDescription);
    }

    @Override
    public void feed() {
        int hunger = this.getPetHunger();
        hunger--;
        this.setPetHunger(hunger);

    }

    @Override
    public void water() {
        int thirst=this.getPetThirst();
        thirst--;
        this.setPetThirst(thirst);
    }
}
