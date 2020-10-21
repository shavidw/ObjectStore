
import java.io.*;
import java.util.HashMap;
import java.util.List;

public class InMemoryStore implements Store{

    public static HashMap employeeMap = new HashMap();

    public void store(String id,Object x){
        employeeMap.put(id,x);

    }

    public Teacher retrieve(String name){
        return (Teacher)employeeMap.get(name);

    }

    public void clear(){
        employeeMap.clear();

    }

//    public List<Teacher> query(Object o)
}
