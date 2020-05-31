package pets_amok;

public class PetHealthCalculator {
    public void setHealthByType(VirtualPet myVirtualPet){
        if(myVirtualPet instanceof RobotCat){
            calculateRoboCat(((RobotCat) myVirtualPet));
        }else if (myVirtualPet instanceof RobotDog){
            calculateRoboDog((RobotDog) myVirtualPet);
        }else if(myVirtualPet instanceof  OrganicDog){
            calculateOrganicDog((OrganicDog) myVirtualPet);
        }else{
            calculateOrganicCat((OrganicCat) myVirtualPet);
        }
    }



    public void calculateRoboCat(RobotCat myRobotCat) {
            int oil = myRobotCat.getPetOil();
            int happiness = myRobotCat.getPetHappiness();
            int myRobotCatHealth = myRobotCat.getPetHealth();
            if(oil == 0){
                myRobotCatHealth--;
            }else if (oil > 5) {
                myRobotCatHealth++;
            }
            if(happiness == 0) {
                myRobotCatHealth--;
            }
            myRobotCat.setPetHealth(myRobotCatHealth);
    }

    public void calculateRoboDog(RobotDog myRobotDog) {
        int oil = myRobotDog.getPetOil();
        int happiness = myRobotDog.getPetHappiness();
        int myRobotDogHealth = myRobotDog.getPetHealth();
        if(oil == 0){
            myRobotDogHealth--;
        }else if (oil > 5) {
            myRobotDogHealth++;
        }
        if(happiness == 0) {
            myRobotDogHealth--;
        }
        myRobotDog.setPetHealth(myRobotDogHealth);
    }

    public void calculateOrganicDog(OrganicDog myOrganicDog){
        int hunger = myOrganicDog.getPetHunger();
        int thirst = myOrganicDog.getPetThirst();
        int waste = myOrganicDog.getCageWasteLevel();
        int bathroom = myOrganicDog.getPetBathroomNeeds();
        if (bathroom > 5){
            myOrganicDog.setPetBathroomNeeds(0);
            waste++;
            myOrganicDog.setCageWasteLevel(waste);
        }
        int happiness = myOrganicDog.getPetHappiness();
        int health = myOrganicDog.getPetHealth();
        int Array[] = {hunger, thirst, happiness};
        for (int i = 0; i < Array.length; i++) {
            if ( Array[i] <= 0 ){
                health--;
            }
        }
        health = health - waste;
        myOrganicDog.setPetHealth(health);
    }
    public void calculateOrganicCat(OrganicCat myOrganicCat) {
    int hunger = myOrganicCat.getPetHunger();
    int thirst = myOrganicCat.getPetThirst();
    int happiness = myOrganicCat.getPetHappiness();
    int health = myOrganicCat.getPetHealth();
    int bathroom = myOrganicCat.getPetBathroomNeeds();
    if(bathroom > 5){
        myOrganicCat.setPetBathroomNeeds(0);
    }
    int Array[] = {hunger, thirst, happiness};
    for (int i = 0; i <Array.length; i++){
        if(Array[i] <=0){
            health--;
        }
    }
    myOrganicCat.setPetHealth(health);
    }
}
