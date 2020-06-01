package pets_amok;

public class VirtualPetShelterDisplay {

    public static void initialInstructions(){
        System.out.println("here's where the instructions are gunna go when I feel like typing them all out");

    }
    public static void mainMenu(){
        System.out.println("press 0 to view the status of your pets");
        System.out.println("press 1 to feed pets");
        System.out.println("press 2 to water pets");
        System.out.println("press 3 to walk all dogs");
        System.out.println("press 4 to walk a dog of your choosing");
        System.out.println("press 5 to Oil all Robotic pets");
        System.out.println("press 6 to clean all dog cages");
        System.out.println("press 7 to adopt out a pet");
        System.out.println("press 8 to admit a new pet to the shelter");
    }

    public static void displayPetStatus(VirtualPet thisPet){

        System.out.println(thisPet.getPetName() + "--------");
        System.out.println(thisPet.getPetDescription());
        System.out.println();
        if (thisPet instanceof RobotDog){
            displayRobotDog((RobotDog) thisPet);
        }else if (thisPet instanceof RobotCat){
            displayRobotCat((RobotCat) thisPet);

        }else if (thisPet instanceof OrganicDog){
            displayOrganicDog((OrganicDog) thisPet);
        }else{
            displayOrganicCat((OrganicCat) thisPet);
        }

    }

    private static void displayOrganicCat(OrganicCat thisPet) {
        System.out.println("FOOD BOWL " + thisPet.getPetHunger());
        System.out.println("WATER BOWL " + thisPet.getPetThirst());
        System.out.println("HAPPINESS " + thisPet.getPetHappiness());
        System.out.println("HEALTH " + thisPet.getPetHealth());
    }

    private static void displayOrganicDog(OrganicDog thisPet) {
        System.out.println("CAGE WASTE LEVEL " + thisPet.getCageWasteLevel());
        System.out.println("FOOD BOWL " + thisPet.getPetHunger());
        System.out.println("WATER BOWL " + thisPet.getPetThirst());
        System.out.println("HAPPINESS " + thisPet.getPetHappiness());
        System.out.println("HEALTH " + thisPet.getPetHealth());
    }

    private static void displayRobotDog(RobotDog thisPet) {
        System.out.println("OIL " + thisPet.getPetOil());
        System.out.println("HAPPINESS " + thisPet.getPetHappiness());
        System.out.println("HEALTH " + thisPet.getPetHealth());
    }

    private static void displayRobotCat(RobotCat thisPet) {

        System.out.println("OIL " + thisPet.getPetOil());
        System.out.println("HAPPINESS " + thisPet.getPetHappiness());
        System.out.println("Health " + thisPet.getPetHealth());
    }

    public static void displayWalkOnePet(String petName){
        System.out.println("you took " + petName + " on a long walk");
    }
    public static void displayAdoptPet(String petName){
        System.out.println("Looks like " + petName + " found their forever home. neat.");
    }
    public static void displayWalkPets(){
        System.out.println("you walked all the dogs. You cleaned up the organic poop, and pet the robot dogs");
    }
    public static void displayWaterPets(){
        System.out.println("you watered the organic pets. like plants.");
    }
    public static void displayFeedPets(){
        System.out.println("you fed the organic pets");
    }
    public static void userCommandError(){
        System.out.println("sorry, you've typed something I don't understand");
        System.out.println("please type a number between 0-8");
    }

    public static void displaySelectPet() {
        System.out.println("select your pet. eventually this command will print out pet names for you to pick from");
    }

    public static void displayAdoptionPrompt() {
        System.out.println("who is getting adopted?");
    }

    public static void displayNewPetNamePrompt() {
        System.out.println("whats the name of the pet you are admitting to the shelter?");
    }

    public static void displayNewPetDescriptionPrompt() {
        System.out.println("Please describe the new pet briefly:");
    }

    public static void displayAdmitPet(String newPetName) {
        System.out.println("I am sure that " +newPetName+ " will be very happy and safe here.");
    }

    public static void displayNewPetTypePrompt() {
        System.out.println("please enter the type of pet. This can be one of 4 types:");
        System.out.println("robot dog, robot cat, organic dog, organic cat");
        System.out.println("which type is the new pet?");
    }

    public static void displayCleanCages() {
        System.out.println("you cleaned all the filthy cages. Everyone should stay healthy now");
    }

    public static void displayOilPets() {
        System.out.println("you oiled every robot pet. They beep and boop with joy.");
    }
}
