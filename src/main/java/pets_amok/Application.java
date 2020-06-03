package pets_amok;

import java.util.Map;
import java.util.Scanner;

public class Application {

    static VirtualPetShelter myShelter = new VirtualPetShelter();


    public static void main (String[] args){
      Scanner input = new Scanner(System.in);
        shelterSetup();
        ApplicationDisplay.initialInstructions();
        ApplicationDisplay.mainMenu();
        while(true){
            int userCommand = input.nextInt();
            gameLoop(userCommand);
        }


    }
    public static void shelterSetup(){
        VirtualPet honeyFace = new OrganicCat("Honeyface","Very small, likes people");
        myShelter.addNewPet(honeyFace.getPetName(), honeyFace.getPetDescription(),"organic cat");
        VirtualPet badgerNose = new OrganicDog("BadgerNose","Eats lots of carrots ^");
        myShelter.addNewPet(badgerNose.getPetName(), badgerNose.getPetDescription(),"organic dog");
        VirtualPet bigOlBuster = new RobotCat("Big Ol' Buster","HUGE cat. Just, ginormous.");
        myShelter.addNewPet(bigOlBuster.getPetName(),bigOlBuster.getPetDescription(),"robot cat");
    }

    public static void determineAction(int userCommand){
        switch(userCommand){

            case 0:
            for(Map.Entry<String, VirtualPet> entry: myShelter.petShelter.entrySet()){
                VirtualPet thisPet = entry.getValue();
                ApplicationDisplay.displayPetStatus(thisPet);

            }
                break;

            case 1:
                feedPets();
                ApplicationDisplay.displayFeedPets();
                gameLoop();
                break;

            case 2:;
                waterPets();
                ApplicationDisplay.displayWaterPets();
                gameLoop();
                break;

            case 3:
                walkPets();
                ApplicationDisplay.displayWalkPets();
                gameLoop();
                break;

            case 4:
                ApplicationDisplay.displaySelectPet();
                String walkPetName = getUserInput();
                walkOnePet(walkPetName);
                ApplicationDisplay.displayWalkOnePet(walkPetName);
                gameLoop();
                break;
            case 5:
                oilPets();
                ApplicationDisplay.displayOilPets();
                gameLoop();
                break;
            case 6:
                cleanCages();
                ApplicationDisplay.displayCleanCages();
                gameLoop();
                break;
            case 7:
                ApplicationDisplay.displayAdoptionPrompt();
                String adoptedPet = getUserInput();

                adoptPet(adoptedPet);

                ApplicationDisplay.displayAdoptPet(adoptedPet);
                break;

            case 8:;
                ApplicationDisplay.displayNewPetNamePrompt();
                String newPetName = getUserInput();
                ApplicationDisplay.displayNewPetDescriptionPrompt();
                String newPetDescription = getUserInput();
                ApplicationDisplay.displayNewPetTypePrompt();
                String type = getUserInput();
                admitPet(newPetName,newPetDescription,type.toLowerCase());
                ApplicationDisplay.displayAdmitPet(newPetName);
                break;
            default: ApplicationDisplay.userCommandError();
                break;
        }
        ApplicationDisplay.mainMenu();
    }

    private static String getUserInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void gameLoop(){

       myShelter.tick();
    }

    public static void gameLoop(int userInput){
        determineAction(userInput);
    }

    public static void feedPets(){
        myShelter.feedAllPets();
    }

    public static void waterPets(){
        myShelter.waterAllPets();
    }
    public static void oilPets(){myShelter.oilAllPets();}
    public static void walkPets(){myShelter.walkAllPets();}
    public static void walkOnePet(String walkPetName){myShelter.walkOnePet(walkPetName);}
    public static void cleanCages(){myShelter.cleanAllCages();}



    public static void adoptPet(String petToAdopt){
        myShelter.adoptOutPet(petToAdopt);
    }
    public static void admitPet(String petName,String petDescription, String type){


        myShelter.addNewPet(petName, petDescription,type);
    }
    public static void exit(){
        System.exit(0);
    }
}
