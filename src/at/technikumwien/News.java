package at.technikumwien;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Julia on 21.10.2016.
 */
@Entity
@Table
@NamedQuery(name="News.selectAll", query="Select n FROM News n")
@XmlRootElement
public class News {
    //es gibt auch: @Column(name=““) (wuerde man dann direkt ueber die Variable schreiben)

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long newsId;
    private String title;
    private String text;

    //Änderungen für Übung 5 gemacht

    public News() {

    }

    public News(Long newsId, String title, String text) {
        setNewsId(newsId);
        setText(text);
        setTitle(title);
    }

    public News(String title, String text) {
        this(null, title, text);//anderen ctor aufrufen
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public long getNewsId() {
        return newsId;
    }

    public void setNewsId(long newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

