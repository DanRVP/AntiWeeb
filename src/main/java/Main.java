import discord4j.core.DiscordClient;
import discord4j.core.DiscordClientBuilder;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.object.entity.Member;
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.User;
import discord4j.core.object.entity.channel.MessageChannel;
import reactor.core.publisher.Mono;

import java.util.Optional;

public class Main {
    public static void main(final String[] args){
        final GatewayDiscordClient client = DiscordClientBuilder.create("Key goes here").build().login().block();
        client.on(MessageCreateEvent.class).subscribe(event -> {
            final Message message = event.getMessage();
            if(message.getContent().contains("UwU")
                    || message.getContent().contains("uwu")
                    || message.getContent().contains("OwO")
                    || message.getContent().contains("owo")
                    || message.getContent().contains("UWU")
                    || message.getContent().contains("uWu")
                    || message.getContent().contains("uWU")
                    || message.getContent().contains("uwU")
                    || message.getContent().contains("UWU")
                    || message.getContent().contains("UWu")
                    || message.getContent().contains("oWo")
                    || message.getContent().contains("Owo")
                    || message.getContent().contains("owO")
                    || message.getContent().contains("OWo")
                    || message.getContent().contains("oWO")
                    || message.getContent().contains("0W0")
                    || message.getContent().contains("Onii-chan")
                    || message.getContent().contains("onii-chan")
                    || message.getContent().contains("Daijobu")
                    || message.getContent().contains("daijobu")
                    || message.getContent().contains("Nani")
                    || message.getContent().contains("nani")
                    || message.getContent().contains("Yare Yare")
                    || message.getContent().contains("yare yare")
                    || message.getContent().contains("tsundere")
                    || message.getContent().contains("Tsundere")
                    || message.getContent().contains("baka")
                    || message.getContent().contains("Baka")
                    || message.getContent().contains("Senpai")
                    || message.getContent().contains("senpai")
                    || message.getContent().contains("Yandere")
                    || message.getContent().contains("yandere")
                    || message.getContent().contains("Loli")
                    || message.getContent().contains("loli")
                    || message.getContent().contains("OWO")){
                message.delete().block();
                final MessageChannel channel = message.getChannel().block();
                channel.createMessage("NO WEEBS ALLOWED!").block();
            }
        });
        client.onDisconnect().block();
    }
}
