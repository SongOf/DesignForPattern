package singleton_pattern.s5;

public class Single {
    private Single(){}
    private static class SingleInstance{
        public static final Single instance=new Single();
    }
    public static Single getInstance(){
        return SingleInstance.instance;
    }
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //测试一 多线程测试
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                System.out.println(Single.getInstance().hashCode());
            }).start();
        }
    }
}
