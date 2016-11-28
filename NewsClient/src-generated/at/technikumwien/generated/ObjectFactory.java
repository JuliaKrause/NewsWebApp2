
package at.technikumwien.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.technikumwien.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _News_QNAME = new QName("http://technikumwien.at/", "news");
    private final static QName _GetAllNews_QNAME = new QName("http://technikumwien.at/", "getAllNews");
    private final static QName _GetAllNewsResponse_QNAME = new QName("http://technikumwien.at/", "getAllNewsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.technikumwien.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link News }
     * 
     */
    public News createNews() {
        return new News();
    }

    /**
     * Create an instance of {@link GetAllNews }
     * 
     */
    public GetAllNews createGetAllNews() {
        return new GetAllNews();
    }

    /**
     * Create an instance of {@link GetAllNewsResponse }
     * 
     */
    public GetAllNewsResponse createGetAllNewsResponse() {
        return new GetAllNewsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link News }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "news")
    public JAXBElement<News> createNews(News value) {
        return new JAXBElement<News>(_News_QNAME, News.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "getAllNews")
    public JAXBElement<GetAllNews> createGetAllNews(GetAllNews value) {
        return new JAXBElement<GetAllNews>(_GetAllNews_QNAME, GetAllNews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "getAllNewsResponse")
    public JAXBElement<GetAllNewsResponse> createGetAllNewsResponse(GetAllNewsResponse value) {
        return new JAXBElement<GetAllNewsResponse>(_GetAllNewsResponse_QNAME, GetAllNewsResponse.class, null, value);
    }

}
