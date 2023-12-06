package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise7 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Print all values from intNumbersFlux that's greater than 5
        // TODO: Write code here
    	ReactiveSources.intNumbersFlux()
    	//.log()
    	.filter(n -> n>5)
    	.subscribe(System.out::println);

        // Print 10 times each value from intNumbersFlux that's greater than 5
        // TODO: Write code here
    	
    	ReactiveSources.intNumbersFlux()
    	.filter(n -> n>5)
    	.map(n -> n*10)
    	.subscribe(System.out::println);

        // Print 10 times each value from intNumbersFlux for the first 3 numbers emitted that's greater than 5
        // TODO: Write code here

    	ReactiveSources.intNumbersFlux()
    	.filter(n -> n>5)
    	.take(3)
    	.map(n -> n*100)
    	.subscribe(System.out::println);
    	
        // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
        // TODO: Write code here
    	ReactiveSources.intNumbersFlux()
    	.filter(n -> n>20)
    	.defaultIfEmpty(-1)
    	.map(n -> n*1000)
    	.subscribe(System.out::println);

        // Switch ints from intNumbersFlux to the right user from userFlux
        // TODO: Write code here

        // Print only distinct numbers from intNumbersFluxWithRepeat
        // TODO: Write code here

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
