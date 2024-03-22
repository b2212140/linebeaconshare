package com.example.linebotbeacon.replier;

import com.linecorp.bot.model.event.BeaconEvent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;

import com.linecorp.bot.model.message.ImageMessage;
import java.net.URI;
import com.linecorp.bot.model.message.VideoMessage;

import com.example.linebotbeacon.replier.*;
public class Beacon implements Replier{

    private BeaconEvent event;

    public Beacon(BeaconEvent event){
        this.event = event;
    }

    @Override
    public Message reply() {

        String uriString = "";
        String preUriString = "";
        System.out.println("reply");
        //Beaconイベントの内容を文字列に変換する
        String eventStr = this.event.getBeacon().toString();
        String HWID = this.event.getBeacon().getHwid().toString();
        //String hwid = String.format("HWIDは%s", beacon);
        System.out.println("getHWID");
        //eventStrをBotで返信する(現在は未使用)
        //return new TextMessage(eventStr);
        //return new TextMessage(HWID);

        //↓ハードウェアID
        String bit1 = "01751fd0cb";
        String bit2 = "01753d24cf";
        //if文でどのビーコンか判定
        if(HWID.equals(bit1)){
            String demo = "ビーコン1を検出\n画像を送ったりリンクを貼り付けることができる\nhttps://www.chitose.ac.jp/";
            return new TextMessage(demo);

        }else if(HWID.equals(bit2)){
            //String demo2 = "ビーコン2を検出\n画像を送ったりリンクを貼り付けることができる\nhttps://www.chitose.ac.jp/";
            //String demo2 = "ビーコンを検出";
            //return new TextMessage(demo2);
            Choices choices = new Choices();
            return choices.reply();
        }else{
            return new TextMessage(eventStr);
        }

    }
}