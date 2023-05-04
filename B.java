public interface B extends A{
    @Override
    default void tar(){
        A.super.tar();
        System.out.println("my name is alphaboss");
    }
    
}
