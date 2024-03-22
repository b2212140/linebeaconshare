package com.example.linebotbeacon.replier;

import com.linecorp.bot.model.action.URIAction;
import com.linecorp.bot.model.message.FlexMessage;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.flex.component.Box;
import com.linecorp.bot.model.message.flex.component.Button;
import com.linecorp.bot.model.message.flex.component.Image;
import com.linecorp.bot.model.message.flex.component.Text;
import com.linecorp.bot.model.message.flex.container.Bubble;
import com.linecorp.bot.model.message.flex.container.Carousel;
import com.linecorp.bot.model.message.flex.unit.FlexLayout;

import java.net.URI;
import java.util.Arrays;

public class MapCarousel implements Replier {

    @Override
    public Message reply() {
        var currentTitle = Text.builder()
                .text("道中の画像①")
                .build();

        var currentHeader = Box.builder()
                .layout(FlexLayout.VERTICAL)
                .contents(Arrays.asList(currentTitle))
                .build();

        var currentImage = Image.builder()
                .url(URI.create("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi2YhAYl_RoD6NBLscmJN-TNMvod8dnolp1fdu_qgxVY7Lbz6_ztDorS0ZKlAWXeWjUfBKaUI75CxW0Ie0tUkHl6AkSJNvAFeNKb_aQp7XCCyogVwiBthhQqOgHHbeVXXwGTZlAybVNXZjRumiyEr5lsdY2QH-jRwTbeBuhlrlJCsHFK7i7GB7JX9TvlGHq/s2048/%E9%81%93%E4%B8%AD%E3%81%AE%E7%94%BB%E5%83%8F%E2%91%A0.jpg"))
                .size(Image.ImageSize.FULL_WIDTH)
                .aspectMode(Image.ImageAspectMode.Fit)
                .build();

        var currentText = Text.builder()
                .text("→にも道中の画像があります")
                .wrap(true)
                .build();



        var currentBody = Box.builder()
                .layout(FlexLayout.VERTICAL)
                .contents(Arrays.asList(currentText))
                .build();

        var currentBbl = Bubble.builder()
                .header(currentHeader)
                .hero(currentImage)
                .body(currentBody)
                .build();

        var nextTitle = Text.builder()
                .text("道中の画像②")
                .build();

        var nextHeader = Box.builder()
                .layout(FlexLayout.VERTICAL)
                .contents(Arrays.asList(nextTitle))
                .build();

        var nextImage = Image.builder()
                .url(URI.create("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjKX3R5W1BGV0rM0uE0aoAVIXrws1fJM6TXTrKR0TsFYQKsjAEue8EKoiFFrI_L8Sq1dVK4il9jKHRE3Eo0De4bgX9TW2ukfKsZ8_n-THIKDcVIjfV4uaFPayPSBTJNlXj-igId1qhazcf4w_BRpPPnyd7KGtc5uP38BLaBvRu_7cFRDAecxFNu69ckomXn/s328/%E9%81%93%E4%B8%AD%E3%81%AE%E7%94%BB%E5%83%8F%E2%91%A1.png"))
                .size(Image.ImageSize.FULL_WIDTH)
                .aspectMode(Image.ImageAspectMode.Fit)
                .build();


        var nextBbl = Bubble.builder()
                .header(nextHeader)
                .hero(nextImage)
                .build();


        var next2Title = Text.builder()
                .text("道中の画像③")
                .build();

        var next2Header = Box.builder()
                .layout(FlexLayout.VERTICAL)
                .contents(Arrays.asList(next2Title))
                .build();

        var next2Image = Image.builder()
                .url(URI.create("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgLZ1LaV4Y11PhwXrUINt8Iv8ElPojd48dLrMlND_KIyomdC8rnqKWe1GPLJp7C3uzdLkrZNLKPhOljO_RNPS0afch-wu_a0vKfWOBSCI5GPH0K-0M78L6D9UnTwgwHR-sHpySXnnGZuOXxK645WHfdLl4ALmhRR9IYj0PxB8zI9yo_-OBGnHJw3jM8m5of/s2048/%E9%81%93%E4%B8%AD%E3%81%AE%E7%94%BB%E5%83%8F%E2%91%A2.jpg"))
                .size(Image.ImageSize.FULL_WIDTH)
                .aspectMode(Image.ImageAspectMode.Fit)
                .build();

        var next2Bbl = Bubble.builder()
                .header(next2Header)
                .hero(next2Image)
                .build();

        var carousel = Carousel.builder()
                .contents(Arrays.asList(currentBbl, nextBbl,next2Bbl))
                .build();

        return new FlexMessage("カルーセル", carousel);
    }
}