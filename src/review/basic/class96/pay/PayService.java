package review.basic.class96.pay;

public class PayService {
    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: " +
                "option=" + option + ", " +
                "amount=" + amount);
        Payment payment = CheckPay.checkPay(option);
        boolean result = payment.pay(amount);
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
