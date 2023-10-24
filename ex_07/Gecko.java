public class Gecko {

    private String name;
    private int age;
    private int energy = 100;

    public Gecko(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello " + name + "!");
    }

    public Gecko() {
        this.name = "Unknown";
        System.out.println("Hello " + name + "!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void status(){
        switch (age){
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1: case 2:
                System.out.println("Baby Gecko");
                break;
            case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                System.out.println("Adult Gecko");
                break;
            case 11: case 12: case 13:
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
                break;
        }
    }

    public void hello(String name){
        System.out.println("Hello " + name + ", I'm " + this.name + "!");
    }

    public void hello(int number){
        for(int i = 0; i < number; i++)
            System.out.println("Hello, I'm " + this.name + "!");
    }

    public void eat(String food){
        switch (food.toLowerCase()){
            case "meat":
                System.out.println("Yummy!");
                setEnergy(energy + 10);
                break;
            case "vegetable":
                System.out.println("Erk!");
                setEnergy(energy - 10);
                break;
            default:
                System.out.println("I can't eat this!");
                break;
        }
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = Math.min(100, Math.max(0, energy));
    }

    public void work(){
        if(energy >= 25){
            System.out.println("I'm working T.T");
            setEnergy(energy - 9);
        }else{
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
            setEnergy(energy + 50);
        }
    }

}
