package at.technikumwien;


import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Julia on 28.11.2016.
 */
public class NewsResourceClient {

    public static void main(String[] args) throws Exception {
        //TODO Auto-generated method stub
        //diesen Client brauchen wir für Übung 5
        //wir wollen mit REST client API auf den service zugreifen
        //RESTEasy runterladen (resteay-jaxrs-3.0.19-Final) - schon geschehen
        //im Modul NewsClient einen neuen Folder lib gemacht, darin einen folder resteasy
        //alles aus resteasy lib folder darein kopiert
        //resteasy folder in lib folder in client module zum BuildPath hinzugefügt (Project Structure)

        WebTarget target = ClientBuilder
                .newClient()
                .target("http://localhost:8080/NewsWebApp2_war_exploded/resources/news");

        News news = target.path("/{newsId}")
                .resolveTemplate("newsId", 1)
                .request(MediaType.APPLICATION_XML)
                .get(News.class);

        System.out.println(news);

        Response response = target.request(MediaType.APPLICATION_XML)
                .post(Entity.xml(new News("title2", "text2")));

        System.out.println(response.getLocation());

    }
}
