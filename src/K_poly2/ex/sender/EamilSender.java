package K_poly2.ex.sender;

public class EamilSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("메일을 발송합니다.");
    }
}
