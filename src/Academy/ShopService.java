package Academy;

public class ShopService {
    static ShopService service = new ShopService();
    private ShopService() {

    }
    public static ShopService getInstance() {
        return service;
    }
}
