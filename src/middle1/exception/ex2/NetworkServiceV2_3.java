package middle1.exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가


        try {
            client.connect();
            client.send(data);
            client.disconnect();
            // try 구문에서 문제가 발생시 즉시 catch로 이동
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + " ,메시지: " + e.getMessage());
        }

    }
}
