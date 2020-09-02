import events.HelloEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {

    public static void main(String args[]) throws Exception
    {
        JDA jda = JDABuilder.createDefault("NzUwNTAzNzExMDMzMzkzMTUz.X07fDA.85eKFoChQTgR00ArpM6zS8t6eEg").build();
        jda.addEventListener(new HelloEvent());
    }
}
