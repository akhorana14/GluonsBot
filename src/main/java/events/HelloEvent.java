package events;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {
        String message = event.getMessage().getContentRaw();
        if(message.charAt(0) == '!')
        {
            if(message.equals("!help"))
            {
                event.getChannel().sendMessage("```**Hello, I'm GluonsBot!**\nBelow you can see all the commands I know.\n**Have a nice day!**\n\n!help - Displays help command\nhsajsakdaslhjsk```").queue();
            }
            if(message.equals("!ping"))
            {
                event.getChannel().sendMessage("Pong! " /*+ onEvent(GenericEvent).getChannel().getTimeCreated() - event.getChannel().getTimeCreated()*/).queue();
            }
        }

    }

}
