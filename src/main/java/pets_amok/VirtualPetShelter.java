package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map <String,String> petData = new HashMap<>();
    Map <String,VirtualPet> petShelter = new HashMap<>();

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
        }else if(type == "organic dog"){
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
                ((OrganicPet) thirstyPet).feed();
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
            VirtualPet hungryPet = getPet(entry.getKey());
            if(hungryPet instanceof OrganicPet){
                //blah blah blah organic stuff dont forget pet waste
            }else if (hungryPet instanceof RobotPet){
                //blahblahblah maintain robot stuff
            }
        }

        }
    }


//}
