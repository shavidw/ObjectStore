
public class StoreFactory {

    //    public static InMemoryStore create() {
//
//        return new InMemoryStore();
//    }
//}
    private static StoreFactory storeFactory;

    private StoreFactory() {

    }

    public static StoreFactory getInstance() {
        if (storeFactory == null) {
            storeFactory = new StoreFactory();
        }
        return storeFactory;
    }

    public static Store getStore(StoreTypes storeTypes) {
        switch (storeTypes) {
            case  INMEMMORY:
                return new InMemoryStore();
            case INFILE:
                return new StoreInFile();

            default:
                return null;
        }
    }}
