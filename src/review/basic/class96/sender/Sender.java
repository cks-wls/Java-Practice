package review.basic.class96.sender;

public interface Sender {
    // EmainSender, SmsSender, FaceBookSender의 부모
    void sendMessage(String message);
}
