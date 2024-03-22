package com.example.linebotbeacon.replier;

import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;

// おうむ返し用の返信クラス
public class Parrot implements Replier {

    private MessageEvent<TextMessageContent> event;

    public Parrot(MessageEvent<TextMessageContent> event) {
        this.event = event;
    }

    @Override
    public Message reply() {
        TextMessageContent tmc = this.event.getMessage();
        String text = tmc.getText();


        //String text = "動画テスト \nhttps://www.youtube.com/watch?v=0jZ4tsxcwrw";
        //String text = "https://www.dropbox.com/scl/fi/tlbnwzruqqad1kb4yv92y/infomatics2021_hy07.pdf?rlkey=agkalfu66vc00isqdkdi3y4hu&dl=0";
        return new TextMessage(text);
    }

}