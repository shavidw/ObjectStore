
import java.io.*;

public class StoreInFile implements Store {


    public void store(String id, Object x) {

            try {
                FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));

                ObjectOutputStream o = new ObjectOutputStream(f);


                // Write objects to file
                o.writeObject(x);

//            o.writeObject(p2);

                o.close();
                f.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }
        }



    public Teacher retrieve(String name) {
        Teacher x=null;
        Teacher y=null;
        try {
            FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            x = (Teacher) oi.readObject();
            y = (Teacher) oi.readObject();

//            System.out.println(pr1.toString());
//            System.out.println(pr2.toString());

            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//        return pr1;
        return y;
    }


    public void clear() {

    }
}
