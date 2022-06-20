public class SmartPhone extends Phone implements Camera,Clock {


    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void photograph() {
        System.out.println("Se está haciendo una foto");
    }

    @Override
    public void alarm() {
        System.out.println("Está sonando la alarma");
    }
}
