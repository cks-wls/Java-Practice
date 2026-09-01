package basic.poly.ex.pay0;

public class PayService {
    // 클라이언트가 되는것

    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다 : option = " + option + ", amount = " + amount);

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }


}
