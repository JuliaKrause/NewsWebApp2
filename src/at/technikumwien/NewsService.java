package at.technikumwien;

import org.jboss.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Julia on 21.10.2016.
 */
@Stateless

public class NewsService {
    private final Logger logger = Logger.getLogger(NewsService.class);

    @PersistenceContext
    private EntityManager em;

    public List<News> getAllNews() {
        logger.info("getAllNews() called");
        List<News> newsList;
        newsList = em.createNamedQuery("News.selectAll", News.class).getResultList();
        logger.debug(newsList.size() + " news found");
        return newsList;
    }

}
