package com.pd.jobportal.feeds.models;

import java.util.UUID;

public class Feed {
    private UUID id;
    private String title;

    public Feed(UUID id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    private String description;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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


}
