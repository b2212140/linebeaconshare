package com.example.linebotbeacon.replier;

import com.linecorp.bot.model.action.MessageAction;
import com.linecorp.bot.model.message.FlexMessage;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.flex.component.Box;
import com.linecorp.bot.model.message.flex.component.Button;
import com.linecorp.bot.model.message.flex.component.Separator;
import com.linecorp.bot.model.message.flex.component.Text;
import com.linecorp.bot.model.message.flex.unit.FlexAlign;
import com.linecorp.bot.model.message.flex.unit.FlexFontSize;
import com.linecorp.bot.model.message.flex.unit.FlexLayout;

import java.util.Arrays;

public class Choices implements Replier{
    @Override
    public Message reply() {

        var hello = Text.builder()
                .text("↓選択肢")
                .build();

        var zyoho = Button.builder()
                .style(Button.ButtonStyle.LINK)
                .action(new MessageAction("情報棟","情報棟へ"))
                .build();

        var test = Button.builder()
                .style(Button.ButtonStyle.LINK)
                .action(new MessageAction("テスト用選択肢","テストメッセージ"))
                .build();



        var box = Box.builder()
                .layout(FlexLayout.VERTICAL)
                .contents(Arrays.asList(hello,zyoho, test))
                .build();

        var bubble = com.linecorp.bot.model.message.flex.container.Bubble.builder()
                .body(box)
                .build();

        return new FlexMessage("Choices",bubble);
    }

}


