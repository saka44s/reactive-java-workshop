package io.javabrains.reactiveworkshop;

public class Exercise1{

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
    	StreamSources.intNumbersStream().forEach(n -> System.out.println(n));
    	
    	System.out.println("-------------------------------");
        // Print numbers from intNumbersStream that are less than 5
    	StreamSources.intNumbersStream()
    	.filter(n -> n < 5)
    	.forEach(n -> System.out.println(n));

    	System.out.println("-------------------------------");
        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
    	StreamSources.intNumbersStream()
    	.filter(n -> n > 5)
    	.skip(1)
    	.limit(2)
       	.forEach(n -> System.out.println(n));
    	
    	System.out.println("-------------------------------");

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
    	
       	int val = StreamSources.intNumbersStream()
    	.filter(n -> n > 5)
    	.findFirst().orElse(-1);
       	
       	System.out.println(val);
       	System.out.println("-------------------------------");

        // Print first names of all users in userStream
       	StreamSources.userStream().map(n->n.getFirstName()).forEach(n -> System.out.println(n));
       	
       	System.out.println("-------------------------------");
        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
       	StreamSources.intNumbersStream()
       	.flatMap(i -> StreamSources.userStream().filter( n -> n.getId()==i))
       	.map( n -> n.getFirstName())
       	.forEach(n -> System.out.println(n));
       	
       	
      	StreamSources.userStream()
       	.filter(u ->
       				StreamSources.intNumbersStream().anyMatch(i -> i == u.getId()))
       	.forEach(b -> System.out.println(b.getFirstName()));;
       	
    }

}
