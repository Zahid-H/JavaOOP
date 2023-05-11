package input.oop.Polymorphism;

class Country {
    // this is a class
    public void cricketTeam() {
        System.out.println("Bangladesh Cricket Test team");
    }

    public void cricketTeam(String captain) {
        System.out.println(captain);
    }

    public void cricketTeam(int runs) {
        System.out.println(runs);
    }

    public void cricketTeam(String captain, int runs) {
        System.out.println("name:" + captain + "Career runs:" + runs);
    }
}

public class Bangladesh {
    // this is a object
    public static void main(String[] args) {
        Country cun = new Country();
        cun.cricketTeam("Shakib Al Hasan ", 10000);
    }
}
