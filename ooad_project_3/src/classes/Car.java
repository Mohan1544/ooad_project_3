package classes;
import java.util.List;
public abstract class Car{
    public String name;
    public int num_days;
    
    public abstract int quotePrice();
    public abstract void onReturn(List<String> ids);
    
}