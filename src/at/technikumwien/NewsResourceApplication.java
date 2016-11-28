package at.technikumwien;

import jdk.nashorn.internal.objects.annotations.Getter;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
/**
 * Created by Julia on 07.11.2016.
 */
@ApplicationPath("/resources")
public class NewsResourceApplication extends Application {
//GET http://localhost:8080/NewsWebApp2/resources/news
}
