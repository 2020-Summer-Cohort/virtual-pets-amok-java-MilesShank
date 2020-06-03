package pets_amok;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void VirtualPetSuperclassShouldExist() {
        VirtualPet underTest = new RobotDog("testy", "a test pet");
        String petName = underTest.getPetName();
        assertEquals("testy", petName);
        String petDescription = underTest.getPetDescription();
        assertEquals("a test pet", petDescription);
        int petHealth = underTest.getPetHealth();
        assertEquals(5, petHealth);
        int petHappiness = underTest.getPetHappiness();
        assertEquals(5, petHappiness);
        underTest.affectHealth();

    }
    @Test
        public void setMethodsShouldWork(){
        VirtualPet underTest = new RobotDog("testy", "a test pet");
        underTest.setPetHappiness(15);
        assertEquals(15,underTest.getPetHappiness());
        underTest.setPetHealth(10);
        assertEquals(10,underTest.getPetHealth());
    }

    @Test
    public void organicSubclassExists(){
        OrganicPet underTest = new OrganicDog("test","test");
       int hunger = underTest.getPetHunger();
       int thirst = underTest.getPetThirst();
       int willHePee = underTest.getPetBathroomNeeds();
       underTest.affectHealth();
       assertEquals(4,underTest.getPetHealth());

 }
    @Test
    public void RobotSubclassExists(){
        RobotPet underTest = new RobotDog("boop","beep");
        int oil  = underTest.getPetOil();
        underTest.getsOiled();
        assertEquals(6,underTest.getPetOil());
    }
    @Test
    public void DogsAreReal(){
        RobotDog underTest = new RobotDog("blep","burp");
        assertEquals(5,underTest.getPetHappiness());
        underTest.goesOnWalk();
       assertEquals(6,underTest.getPetHappiness());
    }
    @Test
    public void poopingWorks(){
        OrganicDog underTest = new OrganicDog("grass fido","he");
        underTest.poop();
        assertEquals(1,underTest.getCageWasteLevel());
    }
    @Test
    public void catsAlsoAreReal(){
        OrganicCat underTest = new OrganicCat("mew","meow");
        RobotCat alsoTest = new RobotCat("mow","beep mew");
    }
    @Test
    public void PetHealthCalculatorExists(){
        PetHealthCalculator myCalculator = new PetHealthCalculator();
        RobotCat alsoTest = new RobotCat("mow","beep mew");
        myCalculator.calculateRoboCat(alsoTest);
        RobotDog bigTest = new RobotDog("bow","wow");
        myCalculator.calculateRoboDog(bigTest);
        OrganicCat littleTest = new OrganicCat("mow","muw");
        myCalculator.calculateOrganicCat(littleTest);
    }


    @Test
    public void petShelterShouldExist() {

        VirtualPetShelter newShelter = new VirtualPetShelter();
        Map petData = newShelter.getPetData();
        Map petShelter = newShelter.getPetShelter();
        Collection petCollection = newShelter.getAllPets();
        newShelter.addNewPet("bruce","robot","robot cat");
        VirtualPet robotPet = newShelter.getPet("bruce");
        if (robotPet instanceof RobotCat){
            assertEquals(5,((RobotCat) robotPet).getPetOil());
            newShelter.oilAllPets();
            assertEquals(6,((RobotCat) robotPet).getPetOil());
        }
        newShelter.addNewPet("bob","swell guy","organic dog");
        VirtualPet shelterPet = newShelter.getPet("bob");
        if (shelterPet instanceof OrganicDog){
        assertEquals(5, ((OrganicDog) shelterPet).getPetHunger());
        newShelter.feedAllPets();
        assertEquals(6,((OrganicDog) shelterPet).getPetHunger());
        assertEquals(5,((OrganicDog) shelterPet).getPetThirst());
        newShelter.waterAllPets();
        assertEquals(6,((OrganicDog) shelterPet).getPetThirst());


            assertEquals(1,((OrganicDog) shelterPet).getPetBathroomNeeds());
        newShelter.walkAllPets();
            assertEquals(0,((OrganicDog) shelterPet).getPetBathroomNeeds());
            ((OrganicDog) shelterPet).setPetBathroomNeeds(6);
        newShelter.tick();
        assertEquals(0,((OrganicDog) shelterPet).getPetBathroomNeeds());
        assertEquals(1,((OrganicDog) shelterPet).getCageWasteLevel());
        assertEquals(5,((OrganicDog)shelterPet).getPetHunger());
        newShelter.adoptOutPet("bob");
            System.out.println(petData);}
}
}
