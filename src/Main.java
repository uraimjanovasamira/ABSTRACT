//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("120kg", 2, "female", "Lasy");
        Sheep sheep1 = new Sheep("94kg", 5, "male", "Hur");
        Sheep sheep2 = new Sheep("85kg", 7, "female", "Kill");
        Sheep sheep3 = new Sheep("95kg", 7, "female", "Kill");

        Sheep[] sheeps = new Sheep[]{sheep, sheep1, sheep2};
        Sheep[] sheeps3 = new Sheep[]{sheep3};

        Horse horse = new Horse("240kg", 6, "male", "Dari");
        Horse horse1 = new Horse("740kg", 10, "male", "Daily");
        Horse horse2 = new Horse("100kg", 15, "female", "Busy");

        Horse[] horses = new Horse[]{horse, horse1};
        Horse[] horses1 = new Horse[]{horse2};

        Cow cow = new Cow("99kg", 6, "female", "lady");
        Cow cow1 = new Cow("45kg", 1, "male", "Agy");
        Cow cow2 = new Cow("40kg", 5, "male", "Dar");
        Cow cow3 = new Cow("93kg", 6, "male", "Jily");
        Cow cow4 = new Cow("80kg", 5, "female", "Ly");
        Cow cow5 = new Cow("90kg", 0, "female", "Pilly");

        Cow[] cows = new Cow[]{cow, cow1, cow2, cow3, cow4};
        Cow[] cows1 = new Cow[]{cow5};


        Farm farm = new Farm("TALAS", cows, horses, sheeps, "RABI");
        Farm farm1 = new Farm("OSH", cows1, horses1, sheeps3, "BAIKAL");

        System.out.println("----------------------FIRST FARM------------------------" + "\n" + farm + "\n");
        System.out.println("----------------------SECOND FARM-----------------------" + "\n" + farm1 + "\n");


    }
}