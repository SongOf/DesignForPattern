package singleton_pattern.s2;

public enum Single {
    INSTANCE;
    private Single(){}

    public static Single getInstance(){
        return INSTANCE;
    }
}
