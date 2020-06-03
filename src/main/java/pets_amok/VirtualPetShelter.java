package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map <String,String> petData = new HashMap<>();
    Map <String,VirtualPet> petShelter = new HashMap<>();
    PetHealthCalculator myCalculator = new PetHealthCalculator();
    public Map getPetShelter() {
        return petShelter;
    }
    public Collection getAllPets() {
        Collection<VirtualPet> allPets = petShelter.values();
        return allPets;

    }

    public Map getPetData() {
        return petData;
    }

    public VirtualPet getPet(String petName) {
        return petShelter.get(petName);
    }

    public void addNewPet(String newPetName, String newPetDescription, String type) {
        petData.put(newPetName, newPetDescription);
        VirtualPet newPet = null;
        if (type == "robot cat") {
            newPet = new RobotCat(newPetName, newPetDescription);
        }else if(type == "robot dog"){
            newPet = new RobotDog(newPetName,newPetDescription);
        }else if (type == "organic cat"){
            newPet = new OrganicCat(newPetName,newPetDescription);
        }else {
            newPet = new OrganicDog(newPetName,newPetDescription);
        }

        petShelter.put(newPetName, newPet);
    }


    public void adoptOutPet(String adoptedPet) {
        petData.remove(adoptedPet); petShelter.remove(adoptedPet);
    }

    public void feedAllPets() {
        for(Map.Entry<String, String> entry : petData.entrySet()){
            VirtualPet needyPet = getPet(entry.getKey());
            if (needyPet instanceof OrganicPet) {
                ((OrganicPet) needyPet).feed();
            }
        }
    }

    public void waterAllPets() {
        for (Map.Entry<String, String> entry : petData.entrySet()) {
            VirtualPet thirstyPet = getPet(entry.getKey());
            if (thirstyPet instanceof OrganicPet) {
                ((OrganicPet) thirstyPet).water();
            }
        }
    }
    public void oilAllPets(){
         for (Map.Entry<String, String> entry : petData.entrySet()) {
            VirtualPet robotPet = getPet(entry.getKey());
            if (robotPet instanceof RoboticNeeds) {
                ((RoboticNeeds) robotPet).getsOiled();
            }
        }
    }
    public void cleanAllCages(){
        for (Map.Entry<String, String> entry : petData.entrySet()) {
            VirtualPet organicDog = getPet(entry.getKey());
            if (organicDog instanceof OrganicDog) {
                ((OrganicDog) organicDog).setCageWasteLevel(0);
            }
        }
    }
    public void walkAllPets(){
            for (Map.Entry<String, String> entry : petData.entrySet()) {
                VirtualPet dogPets = getPet(entry.getKey());
                if (dogPets instanceof WalkNeeds) {
                    ((WalkNeeds) dogPets).goesOnWalk();
                }
            }
        }
        public void walkOnePet(String walkPetName){
        VirtualPet boredPet = getPet(walkPetName);
        if(boredPet instanceof WalkNeeds) {
            ((WalkNeeds) boredPet).goesOnWalk();
        }
    }


    public void tick() {
        for(Map.Entry<String, String> entry : petData.entrySet()){
            VirtualPet myNeedyPet = getPet(entry.getKey());
            if(myNeedyPet instanceof OrganicPet){
               int hasToPee =((OrganicPet) myNeedyPet).getPetBathroomNeeds();
               hasToPee++;
               ((OrganicPet) myNeedyPet).setPetBathroomNeeds(hasToPee);
                int hungry = ((OrganicPet) myNeedyPet).getPetHunger();
                hungry--;
                ((OrganicPet) myNeedyPet).setPetHunger(hungry);
                int thirsty = ((OrganicPet) myNeedyPet).getPetThirst();
                thirsty--;
                ((OrganicPet) myNeedyPet).setPetThirst(thirsty);
            }else if (myNeedyPet instanceof RobotPet){
               int oil = ((RobotPet) myNeedyPet).getPetOil();
               oil--;
               ((RobotPet) myNeedyPet).setPetOil(oil);
                }
            myCalculator.setHealthByType(myNeedyPet);
            }
        }

}




