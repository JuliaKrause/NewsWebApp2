package at.technikumwien;

import javax.inject.Inject;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by Julia on 28.10.2016.
 */

@WebService(endpointInterface="at.technikumwien.NewsWebService",
        serviceName="NewsWebService",
        portName="NewsWebServicePort")


public class NewsWebServiceImpl implements NewsWebService {

    @Inject
    private NewsService service;

    @Override
    public List<News> getAllNews() {

        return service.getAllNews();

    }


}
