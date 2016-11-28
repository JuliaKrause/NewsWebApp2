package at.technikumwien;

import at.technikumwien.generated.NewsWebService_Service;
import at.technikumwien.generated.NewsWebService;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 * Created by Julia on 31.10.2016.
 */
//Methode 2, braucht nur WSDL, nicht Interface
public class NewsWebServiceClient2 {
    public static void main ( String [] args ) {
        NewsWebService_Service service = new NewsWebService_Service();
        NewsWebService port = service.getNewsWebServicePort();

        //für Aufgabe 4 braucht man Methode 2, und irgendwie sowas wie:
        //trennen: Einleseprozess aus der XML-Datei, senden an WebSwervice
        /*irgendwie aus Kommandozeile den XML-Datei-Namen einlesen
        JAXBContext jaxbcontext;
        Unmarshaller unmarshaller;
        Source;
        JAXBElement;
        MovieWebService;
        port;


        URL wsdlurl;
        QName qname;
        port.setMovies(movieWrapper.getMovies());*/

        //this does not give the same output, because the News Class was generated automatically
        // and so the toString method is not overridden
        port.getAllNews().forEach(System.out::println);

    }

}
