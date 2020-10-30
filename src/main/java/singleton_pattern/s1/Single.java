package singleton_pattern.s1;

import java.lang.reflect.Constructor;

public class Single {
    private static final Single instance=new Single();
    private Single(){}
    public static Single getInstance(){
        return instance;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //测试一 多线程测试
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(Single.getInstance().hashCode());
            }).start();
        }

        //缺点一 反射修改构造函数的访问权限
        Class<?> clazz=Class.forName("singleton_pattern.s1.Single");
        Constructor<?>[] constructors=clazz.getConstructors();
        for(Constructor<?> constructor:constructors){
            constructor.setAccessible(true);
        }
        Single single1=new Single();
        Single single2=new Single();
        System.out.println(single1.hashCode()==single2.hashCode());

        //缺点二 序列化和反序列化会创建第二个实例
    }
}
