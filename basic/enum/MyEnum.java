enum Level {
    MONDAY , 
    TUESDAY , 
    WEDNESDAY ,
    THURSDAY ,
    FRIDAY ,
    SATURDAY ,
    SUNDAY
}

public class MyEnum {
    public static void main(String[] args) {
        Level mylevel = Level.FRIDAY;
        System.out.println(mylevel);
    }
}