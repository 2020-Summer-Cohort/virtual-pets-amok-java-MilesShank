package pets_amok;

import org.junit.jupiter.api.Test;
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
        RobotCat alsoTest = new RobotCat
    }
}
