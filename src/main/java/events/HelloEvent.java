package events;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.MiscUtil;

import java.util.Date;

public class HelloEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {
        String message = event.getMessage().getContentRaw();




        if(message.charAt(0) == '!')
        {
            if(message.equalsIgnoreCase("!help"))
            {
                event.getChannel().sendMessage("**Hello, I'm GluonsBot!**\n" +
                        "Below you can see all the commands I know.\n" +
                        "Have a nice day!\n\n" +
                        "" +
                        "`!help` - Displays help command\n" +
                        "`!ping` - Displays current latency\n").queue();
            }
            else if(message.equalsIgnoreCase("!ping"))
            {
                event.getChannel().sendMessage("Ping!")
                int m = event.getChannel().getLastMessage().getTimeCreated().getNano();
                event.getChannel().sendMessage("Pong! "+m+"ms");
            }
            else
            {
                event.getChannel().sendMessage("Invalid Command! See !help for details.").queue();
            }
        }

    }

}
