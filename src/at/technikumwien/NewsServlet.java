package at.technikumwien;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Julia on 21.10.2016.
 */
@WebServlet("/news")
public class NewsServlet extends HttpServlet {
    @Inject
    private NewsService newsService;

    public NewsServlet() {
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        //TODO alle nachrichten ausgeben

        out.println("<html>");
        out.println("<body>");

        newsService.getAllNews().forEach(news -> {
            out.println("<h1>" + news.getTitle() + "</h1>");
            out.println("<p>" + news.getText() + "</p>");
        });
    }
}
