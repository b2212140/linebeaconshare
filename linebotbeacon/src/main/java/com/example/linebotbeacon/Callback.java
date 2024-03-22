package com.example.linebotbeacon;

import com.example.linebotbeacon.replier.*;
import com.linecorp.bot.model.event.BeaconEvent;
import com.linecorp.bot.model.event.FollowEvent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.event.MessageEvent;

import java.util.List;

@LineMessageHandler
public class Callback {

    private static final Logger log = LoggerFactory.getLogger(Callback.class);

    // フォローイベントに対応する
    @EventMapping
    public Message handleFollow(FollowEvent event) {
        // 実際はこのタイミングでフォロワーのユーザIDをデータベースにに格納しておくなど
        Follow follow = new Follow(event);
        return follow.reply();
    }



    //test24/01/25MessageをList型に変更
    // 文章で話しかけられたとき（テキストメッセージのイベント）に対応する
    @EventMapping
    public List<Message> handleMessage(MessageEvent<TextMessageContent> event) {
        TextMessageContent tmc = event.getMessage();
        String text = tmc.getText();
        switch (text){
            case"バブル":
                BubbleSample bubbleSample = new BubbleSample();
                return List.of(bubbleSample.reply());
            case"チョイス":
                Choices choices = new Choices();
                return List.of(choices.reply());

            case"情報棟へ":
                Maps maps = new Maps();
               // return maps.reply();
                MapCarousel mapCarousel = new MapCarousel();
                //return mapCarousel.reply();
                //Listにすることで地図の画像とカルーセル同時に送信
                return List.of(maps.reply(),mapCarousel.reply());
            case "カルーセル":
                //MapCarousel mapCarousel = new MapCarousel();
                //return mapCarousel.reply();
                CarouselSample carouselSample = new CarouselSample();
                return List.of(carouselSample.reply());
            default:
                Parrot parrot = new Parrot(event);
                return List.of(parrot.reply());
        }
    }

    //BeaconEventに対応する
    @EventMapping
    public Message handleBeacon(BeaconEvent event){
        System.out.println("correct");
        Beacon beacon = new Beacon(event);
        return beacon.reply();
    }

}