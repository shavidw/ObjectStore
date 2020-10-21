public class Test{

    static Store store;

    public static void main(String args[]){

        // to create in memory object store
        store = StoreFactory.getStore(StoreTypes.INMEMMORY);
        store=new InMemoryStore();

        Teacher x = new Teacher("Kamal",25,"galle");
        Teacher y = new Teacher("Nimal",25,"galle");


//store.store(x.getName(),x);

        store.store(x.getName(),x);
        store.store(y.getName(),y);

        //retrieve from the store
        Teacher m = (Teacher)store.retrieve("Nimal");
        System.out.println(m);


        //clear the store
        store.clear();
        Teacher n = (Teacher)store.retrieve("Nimal");
        System.out.println(n);



    }

}
