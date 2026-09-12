package middle1.exception.ex4;


import middle1.exception.ex4.exception.ConnectExceptionV4;
import middle1.exception.ex4.exception.NetworkClientExceptionV4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);
        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
}
