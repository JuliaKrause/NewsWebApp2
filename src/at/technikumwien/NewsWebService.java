package at.technikumwien;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Julia on 28.10.2016.
 */

@WebService
public interface NewsWebService {

    @WebMethod
    public List<News> getAllNews();
}
