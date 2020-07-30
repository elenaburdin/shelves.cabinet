package main;

import Cabinet.Cabinet;
import Things.Book;
import Things.Phone;
import Things.Tablet;
import Things.Thing;

public class MainCabinet {

	public static void main(String[] args) {


		Cabinet cabinet = new Cabinet();
        cabinet.put( "topShelf", new Phone( "New iPhone" ) );
        cabinet.put( "middleShelf", new Book("Book: This is not a book") );
        cabinet.put( "bottomShelf", new Tablet("Apple IPad") );

			
        Thing thing = cabinet.whatIsOn("topShelf");
        System.out.println(thing.getName());

		thing = cabinet.whatIsOn("middleShelf");
        System.out.println(thing.getName());

		thing = cabinet.whatIsOn("bottomShelf");
		System.out.println(thing.getName());

		
	}
}