import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Bot{
	
	public static void main(String[] args){
		
		JDABuilder jdaBuilder = JDABuilder.createDefault("Discord Bot Key goes here");
		JDA jda;
		
		Invite invite = new Invite();
		jdaBuilder.addEventListeners(invite);
		
		irMessage irmessage = new irMessage();
		jdaBuilder.addEventListeners(irmessage);
	
		Help help = new Help();
		jdaBuilder.addEventListeners(help);
		
		try {
			jda = jdaBuilder.build();
		} catch (LoginException e) {
			e.printStackTrace();
		}
		
	}


	
}