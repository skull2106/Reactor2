package mono.src;

import java.util.function.Consumer;

public class Utils {
    public static Consumer<Object> onNext(){
        return o->System.out.println("Data: " + o);
    }
    public static Consumer<Throwable> onError()
    {
        return e-> System.out.println("Error : "+e.getMessage());
    }
    public static Runnable onComplete()
    {
        return ()->System.out.println("Completed");
    }
}
