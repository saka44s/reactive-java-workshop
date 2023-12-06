package io.javabrains.reactiveworkshop;

import java.io.IOException;

import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // TODO: Write code here
		/*
		 * ReactiveSources.intNumberMono().subscribe(n -> System.out.println(n), err ->
		 * System.out.println(err.getMessage()), () -> System.out.println("Completed"));
		 */
    	
    	ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());

        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }
    


}

class MySubscriber<T> extends BaseSubscriber<T>{
	public void hookOnSubscribe(Subscription subscription) {
		System.out.println("Subscribe Happend");
		request(1); // if this line is not added the process wont happen as it dont how many elements it need to process
	}
	
	public void hookOnNext(T value) {
		System.out.println(value.toString()+" received");
		request(1); // if this line is not added the process wont happen as it dont how many elements it need to process
	}
}