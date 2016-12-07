package at.technikumwien;

import java.util.List;

import javax.ejb.Stateless;

import javax.interceptor.Interceptors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



import org.jboss.logging.Logger;

/**
 * Created by Julia on 21.10.2016.
 */
@Stateless

public class NewsService {
    private static final Logger LOGGER = Logger.getLogger(NewsService.class);

    @PersistenceContext
    private EntityManager em;

    @Interceptors(NewsFilterInterceptor.class)
    public List<News> getAllNews() {
        LOGGER.info("getAllNews() called");
        return em.createNamedQuery("News.selectAll", News.class)
			.getResultList();
    }

}
