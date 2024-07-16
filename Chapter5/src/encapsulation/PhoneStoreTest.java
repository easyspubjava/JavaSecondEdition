package encapsulation;

public class PhoneStoreTest {

    public static void main(String[] args) {
        Phone phone = new Phone("아이폰", 1000000);
        PhoneStore store = new PhoneStore(phone);
        Customer customer = new Customer("김유영", 1000000);
        customer.buyPhone(store);
    }
}