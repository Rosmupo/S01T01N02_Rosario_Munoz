public class Phone {

    String brand;
    String Model;

    public Phone(String brand, String model) {
        this.brand = brand;
        Model = model;
    }

    public void makeACall(String phoneNumber){
        System.out.println("Está llamando al número " + phoneNumber);
    }
}
