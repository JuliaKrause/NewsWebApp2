package at.technikumwien;

import jdk.nashorn.internal.objects.annotations.Getter;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.awt.*;
import java.net.URI;
import java.util.List;

/**
 * Created by Julia on 07.11.2016.
 */

//KISS - keep it short and simple (wenn man es so machen will und nicht über EJB, für Übung 5)
@Path("/news")
@Transactional
public class NewsResource {
    @Inject
    private NewsService newsService;

    @PersistenceContext
    private EntityManager em;

    //Änderungen für Übung 5 gemacht

    @Context
    UriInfo ui;

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response createNews(News news) {
        em.persist(news);
        Long newsId = news.getNewsId();
        String newsIdString = newsId.toString();
        URI newsURI = ui.getAbsolutePathBuilder()
                .path(newsIdString)
                .build();
        return Response.created(newsURI).build();
    }

    @PUT
    @Path("/{newsId}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void updateNews(@PathParam("newsId") Long newsId, News news) {
        News oldNews = em.find(News.class, newsId);
        if(oldNews != null) {
            oldNews.setTitle(news.getTitle());
            oldNews.setText(news.getText());
        } else {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
    }


    @GET
    @Path("/{newsId}")
    @Produces({MediaType.TEXT_PLAIN})
    public String getNewsAsString(@PathParam("newsId") Long newsId) {
        News news = em.find(News.class, newsId);
        return (news != null ? news.toString() : null);
    }

    @GET
    @Path("/{newsId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public News getNewsAsJSONXML(@PathParam("newsId") Long newsId) {
        News news = em.find(News.class, newsId);
        return news;
    }

    @GET
    @Path("/{newsId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }

}
