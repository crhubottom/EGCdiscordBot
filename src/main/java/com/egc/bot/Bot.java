package com.egc.bot;

import com.egc.bot.events.ReadyListener;
import com.egc.respond;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.io.IOException;

public class Bot {
    public static JDA client;


    public Bot() throws IOException {

        // Build bot
        String token = "MTIzNzU3NDExNjMyODg2NTg3Mw.GdTSdx.FQSPfS2xVEFeiMxkmRG8yq2wXBnspyL4n8p9qM";
        client = JDABuilder.createDefault(token).addEventListeners(new respond()).enableIntents(GatewayIntent.MESSAGE_CONTENT).build();

        // Event listeners
        client.addEventListener(new ReadyListener());


        // Commands

        // Schedulers

    }



}