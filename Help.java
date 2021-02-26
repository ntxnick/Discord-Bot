import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Help extends ListenerAdapter{
	
	public void onMessageReceived(MessageReceivedEvent e) {
		if(e.getMessage().getContentRaw().equals("!help")) {
			e.getChannel().sendMessage("Commands I accept: !help, !invite,  hello, !joke").queue();
			e.getChannel().sendMessage("You can also ask for temperature in areas by asking (temp in ) then the area you want it.").queue();
			e.getChannel().sendMessage("ex. (temp in dallas)").queue();
		}
	}

}
