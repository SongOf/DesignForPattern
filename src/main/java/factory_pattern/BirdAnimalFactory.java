package factory_pattern;

public class BirdAnimalFactory extends AbstractAnimalFactory {
    @Override
    public AbstractAnimal create() {
        return new Bird();
    }

    public static void main(String[] args) {
        BirdAnimalFactory birdAnimalFactory=new BirdAnimalFactory();
        CatAnimalFactory catAnimalFactory=new CatAnimalFactory();
        System.out.println("create a bird object--"+birdAnimalFactory.create());
        System.out.println("create a bird object--"+catAnimalFactory.create());
        System.out.println("create a bird object--"+birdAnimalFactory.create());
    }
}
