package middle1.exception.ex1;


public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); //추가

        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류코드 : " + connectResult);
        } else {
            String sendResult = client.send(data);
            // 결과가 성공이 아니다 -> 오류다.
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류코드 : " + sendResult);
            }
        }
        client.disconnect();
    }

    private static boolean isError(String result) {
        return !result.equals("success");
    }
}
