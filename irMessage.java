import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class irMessage  extends ListenerAdapter{
	
	 private temperatureAPI api;
	
	public void onMessageReceived(MessageReceivedEvent e) {
		
		if(e.getMessage().getContentRaw().equals("hello")) {
			e.getChannel().sendMessage("Howdy Partner").queue();
		}
		
		String message = e.getMessage().getContentRaw();
		
	 	if(message.contains("temp in ")) {
    		try {
    			String city= message.substring(8);
    			api = new temperatureAPI();
    			String temp = api.Temperature(city);
    			e.getChannel().sendMessage(String.format("%.2f",  Double.parseDouble(temp))+ "°F").queue();
			} catch (IOException e1) {
				e.getChannel().sendMessage("please enter a valid input").queue();
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    	}
	 	
	 	if(e.getMessage().getContentRaw().equals("!joke")) {
	 		Random jokeNumber = new Random();
	 		int answer = jokeNumber.nextInt(10) + 1;
	        
	 		switch (answer) {
            case 1:  	e.getChannel().sendMessage("What did the fish say when he swam into a wall?").queue();
				try {
					TimeUnit.SECONDS.sleep(4);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            			e.getChannel().sendMessage("Dam").queue();
                     break;
                     
            case 2:  	e.getChannel().sendMessage("Did you hear about the italian chef who died?").queue();
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        			e.getChannel().sendMessage("He Pasta-way").queue();
                 break;
                 
            case 3:  	e.getChannel().sendMessage("I sold my vacuum the other day.").queue();
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        			e.getChannel().sendMessage("All it was doing was collecting dust.").queue();
                 break;
            case 4:  	e.getChannel().sendMessage("What is forest Gump's email password?").queue();
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        			e.getChannel().sendMessage("1forrest1").queue();
                 break;
            case 5:  	e.getChannel().sendMessage("what do you call a fake noodle?").queue();
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        			e.getChannel().sendMessage("An impasta").queue();
                 break;
            case 6: 	e.getChannel().sendMessage("What do you call an alligator in a vest?").queue();
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        			e.getChannel().sendMessage("An in-vest-igator.").queue();
                 break;
            case 7:  	e.getChannel().sendMessage("what do you call a fly with no wings?").queue();
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        			e.getChannel().sendMessage("A walk").queue();
                 break;
            case 8:  	e.getChannel().sendMessage("What did the janitor say when he jumped out of the closet?").queue();
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        			e.getChannel().sendMessage("Supplies!").queue();
                 break;
            case 9:  	e.getChannel().sendMessage("What did the buffalo say when his son left?").queue();
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        			e.getChannel().sendMessage("Bison!").queue();
                 break;
            case 10: 	e.getChannel().sendMessage("What's is the most terrifying word in nuclear physics?").queue();
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        			e.getChannel().sendMessage("Oops!").queue();
                 break;
            default: 	e.getChannel().sendMessage("What did the fish say when he swam into a wall?").queue();
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        			e.getChannel().sendMessage("Dam").queue();
                 break;
	 		
	 		}
	 	}
		
	}

}
