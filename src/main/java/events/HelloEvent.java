package events;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.MiscUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;

public class HelloEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {
        String message = event.getMessage().getContentRaw();

        if(message.contains("Ping!") && event.getAuthor().isBot())
        {
            event.getChannel().sendMessage("Pong! " + (LocalDateTime.now().getNano() - (event.getMessage().getTimeCreated().getNano()))/1000000 + "ms").queue();
        //Needs work. Sometimes gives negative numbers, with all ms values ranging from  300 to 700
        }


        if(message.charAt(0) == '!')
        {
            switch(message) {
                case "!help": event.getChannel().sendMessage("**Hello, I'm JetBot!**\n" +
                        "Below you can see all the commands I know.\n" +
                        "Have a nice day!\n\n" +
                        "" +
                        "`!help` - Displays help command\n" +
                        "`!ping` - Displays current latency\n").queue();
                    break;

                case "!ping":
                    event.getChannel().sendMessage("Ping!").queue();
                    break;

                default:
                    event.getChannel().sendMessage("Invalid Command! See !help for details.").queue();
            }

        }

    }

}
