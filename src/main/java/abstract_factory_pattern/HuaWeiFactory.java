package abstract_factory_pattern;

public class HuaWeiFactory extends AbstractFactory {
    @Override
    public AbstractMobile createMobile() {
        return new HuaWeiMobile();
    }

    @Override
    public AbstractTV createTv() {
        return new HuaWeiTV();
    }

    public static void main(String[] args) {
        HuaWeiFactory huaWeiFactory=new HuaWeiFactory();
        System.out.println(huaWeiFactory.createMobile().name());
        System.out.println(huaWeiFactory.createTv().name());
    }
}
