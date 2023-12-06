package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        // TODO: Write code here
    	ReactiveSources.intNumberMono().subscribe(n -> System.out.println(n));

        // Get the value from the Mono into an integer variable
        // TODO: Write code here
    	
    	
    	///block/blockoptional is used to block untill next signal is received, cause mono emits either emits one value or not, it means its done
    	Integer i = ReactiveSources.intNumberMono().block();
    	System.out.println(i);
    	
    	User usr = ReactiveSources.userMono().block();
    	System.out.println(usr);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
