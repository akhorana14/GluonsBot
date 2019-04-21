import events.HelloEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {

    public static void main(String args[]) throws Exception
    {
        JDA jda = new JDABuilder("NTY3OTE3NzI5MTc3MjcyMzIx.XLagvg.BaZp63HuFcznCapTlNlb4lhco6o").build();

        jda.addEventListener(new HelloEvent());
    }
}
