package me.ramswaroop.botkit.slackbot.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by ramswaroop on 10/06/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {

    private int id;
    private String type;
    private String channel;
    private String user;
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toJSONString() throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(this);
    }
}
