package com.example.linebotbeacon.replier;

import com.linecorp.bot.model.message.ImageMessage;
import com.linecorp.bot.model.message.Message;

import java.net.URI;

public class Maps implements Replier {
    @Override
    public Message reply() {
        String uriString = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj6W_0lnj-UBfH7crS5_gH9G_sdGzY-7Uws_eC5YgWMHCzs8vV13EVFPnf1-ks6hJtpusuZ3139bnhtdQP0fHeGEaQwhOqz89rXYmbq21jyRxFCSlfCGKooHAzj28tNBA5UahyphenhyphenByEqGaNk7QB-kTlbeoXsJ-fqKLllU9ot9c2SGVHccOq7lB8paLghWHpta/s391/kagidaizumen.png";
        URI uri = URI.create(uriString);
        return new ImageMessage(uri, uri);
    }
}