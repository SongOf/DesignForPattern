package singleton_pattern.s3;

public class Single {
    private static Single instance;
    private Single(){}
    public static synchronized Single getInstance(){
        if(instance==null){
            instance=new Single();
        }
        return instance;
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
