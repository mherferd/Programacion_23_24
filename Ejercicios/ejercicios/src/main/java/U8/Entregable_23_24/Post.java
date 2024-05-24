package U8.Entregable_23_24;

public class Post {

    private String title;
    private String link;
    private String description;
    private String pubDate;
    private String guid;

    public Post(String title, String link, String description, String pubDate, String GUID) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.pubDate = pubDate;
        this.guid = GUID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", pubdate='" + pubDate + '\'' +
                ", GUID='" + guid + '\'' +
                '}';
    }
}
