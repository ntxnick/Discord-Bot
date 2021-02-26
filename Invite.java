import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Invite extends ListenerAdapter {
String url = "https://discord.com/oauth2/authorize?client_id=811734933486960680&scope=bot";

public void onMessageReceived(MessageReceivedEvent e) {
	if(e.getMessage().getContentRaw().equals("!invite")) {
		e.getChannel().sendMessage(String.format(url, e.getJDA().getSelfUser().getId())).queue();
	}
}
}