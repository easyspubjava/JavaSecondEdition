package encapsulation;

public class PhoneStore {
    private Phone phone;

    public PhoneStore(Phone phone) {
        this.phone = phone;
    }

    public Phone sellPhone(String model, double budget) {
        String phoneModel = phone.getModel();
        if( model.equals(phoneModel) && budget >= phone.getPrice() ) {
            registerPayment();
            discountPromotion();
            saveData();
            return phone;
        }
        else return null;
    }

    private void registerPayment(){
        System.out.println("대리점: 요금제를 등록합니다. 약정을 등록합니다.");
    }

    private void discountPromotion(){
        System.out.println("대리점: 프로모션으로 할인합니다.");
    }

    private void saveData(){
        System.out.println("대리점: 데이터를 저장하고 새로운 폰으로 이동합니다.");
    }
}
