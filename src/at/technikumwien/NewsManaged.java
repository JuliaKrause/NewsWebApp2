package at.technikumwien;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Julia on 21.10.2016.
 */

@RequestScoped
@Named("reqNews")
public class NewsManaged {
    @Inject
    private NewsService newsService;
	private List<News> newsList;

    public List<News> getAllNews() {
		if (newsList == null) {
			newsList = newsService.getAllNews();
		}
        return newsList;
    }

}
