package at.technikumwien;

import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Julia on 21.10.2016.
 */

 
@WebServlet("/news")
@SuppressWarnings("serial")
public class NewsServlet extends HttpServlet {
    @Inject
    private NewsService newsService;

   
   

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        
		out.println("<html><body>");
        

        newsService.getAllNews().forEach(news -> {
            out.println("<h1>" + news.getTitle() + "</h1>" +
						"<p>" + news.getText() + "</p>");
        });

        out.println("</body></html>");

    }
}
