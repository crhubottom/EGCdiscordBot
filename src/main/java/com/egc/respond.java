package com.egc;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class respond extends ListenerAdapter {
    int count = 0;
    Boolean spam = false;
    Random rand = new Random();
    String id;
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        System.out.println(event.getMessage().getContentRaw());
        String message=event.getMessage().getContentRaw();
        if(event.getMessage().getAuthor().getId().equals("205713886601674753")) {
            if (event.getMessage().getAuthor().getName().equals("frankie4sd")) {
                count++;
                int rand_int1 = rand.nextInt(10);
                if (rand_int1 == 3) {
                    event.getMessage().reply("https://tenor.com/view/shh-gif-27680056").queue(); // call queue

                }
            }
            if (message.startsWith("spam")) {
                System.out.println(message);
                id = message.substring(message.indexOf("spam") + 5);
                System.out.println(id);
                for (int y = 0; y < 30; y++) {

                    event.getChannel().sendMessage(id + " get on!").queue();
                /*
                Objects.requireNonNull(client.getUserById("285527615081676800")).openPrivateChannel().flatMap(channel -> channel.sendMessage("get on!"))
                        .queue();
    */

                }
            }
            if (Objects.equals(event.getMessage().getContentRaw(), "spam evan bot!")) {
                spam = true;
                while (spam) {

                    event.getChannel().sendMessage("<@285527615081676800> get on! Friend the bot to stop the spam").queue();
                /*
                Objects.requireNonNull(client.getUserById("285527615081676800")).openPrivateChannel().flatMap(channel -> channel.sendMessage("get on!"))
                        .queue();
    */
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            if (Objects.equals(event.getMessage().getContentRaw(), "stop")) {
                spam = false;
            }
        }
    }


    }

