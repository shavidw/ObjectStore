
public interface Store {
    void store(String id,Object x);
    Object retrieve(String name);
    void clear();
}
