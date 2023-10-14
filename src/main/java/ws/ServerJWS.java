package ws;

import jakarta.xml.ws.Endpoint;

/**
 * @author mohamedyoussfi
 **/
public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:5566/",new BanqueService());
        System.out.println("Web service déployé sur http://localhost:5566/");
    }
}
