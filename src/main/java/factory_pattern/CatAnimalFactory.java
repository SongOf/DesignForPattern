package factory_pattern;

public class CatAnimalFactory extends AbstractAnimalFactory {
    @Override
    public AbstractAnimal create() {
        return new Cat();
    }
}
