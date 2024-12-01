package com.pd.jobportal.feeds.controllers;

import com.pd.jobportal.feeds.models.Feed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/feeds")
public class FeedsControllers {

    @GetMapping
    public List<Feed> feeds(){
        List<Feed> feeds = new ArrayList<Feed>();

        feeds.add(new Feed(UUID.randomUUID(),"Feed 1 title","Feed 1 description"));
        feeds.add(new Feed(UUID.randomUUID(),"Feed 2 title","Feed 2 description"));
        feeds.add(new Feed(UUID.randomUUID(),"Feed 3 title","Feed 4 description"));
        feeds.add(new Feed(UUID.randomUUID(),"Feed 4 title","Feed 5 description"));
        feeds.add(new Feed(UUID.randomUUID(),"Feed 5 title","Feed 6 description"));

        return feeds;
    }
}
