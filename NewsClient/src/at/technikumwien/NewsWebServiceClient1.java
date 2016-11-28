package at.technikumwien;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by Julia on 31.10.2016.
 */
//Methode 1, braucht Interface aus NewsWebApp
public class NewsWebServiceClient1 {
    public static void main (String [] args) throws Exception {
        //ausserdem muss man den BuildPath ändern
        URL wsdl = new URL("http://localhost:8080/NewsWebApp2_war_exploded/NewsWebService?wsdl");
        QName serviceName = new QName("http://technikumwien.at/", "NewsWebService");

        Service service = Service.create(wsdl, serviceName);

        NewsWebService port = service.getPort(NewsWebService.class);

        port.getAllNews().forEach(System.out::println);
    }

}
