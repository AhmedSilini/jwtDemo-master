package es.softtek.jwtDemo.Service;

import javax.persistence.*;
import java.util.Date;

public class PostContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String title;
    private String description;
    private String commercial;
    private String type;
    @OneToMany
    @JoinColumn(name = "attachment_id")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientId", referencedColumnName = "id")
    private PostClient  client;
    private Date startDate;
    private Date endDate;
    private String note;
    private boolean active = true;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommercial() {
        return commercial;
    }

    public void setCommercial(String commercial) {
        this.commercial = commercial;
    }

    public PostClient getClient() {
        return client;
    }

    public void setClient(PostClient client) {
        this.client = client;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public PostContract(Long id, String title, String description, String commercial, String type,
                        PostClient client, Date startDate, Date endDate, String note, boolean active) {
        this.client=client;
        this.note=note;
        this.commercial=commercial;
        this.description=description;
        this.endDate=endDate;
        this.startDate=startDate;
        this.title=title;
        this.type=type;
        this.id=id;
        this.active=active;
    }
    public PostContract(String title, String description, String commercial, String type,
                        PostClient client, Date startDate, Date endDate, String note, boolean active) {
        this.client=client;
        this.note=note;
        this.commercial=commercial;
        this.description=description;
        this.endDate=endDate;
        this.startDate=startDate;
        this.title=title;
        this.type=type;
        this.active=active;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
