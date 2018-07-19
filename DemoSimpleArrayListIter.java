

import java.util.ListIterator;

public class DemoSimpleArrayListIter
{

   public static void main(String[] args)
   {
       SimpleArrayList<String> sList = new SimpleArrayList<String>();
       SimpleArrayList<Integer> iList = new SimpleArrayList<Integer>();

       if( sList.isEmpty() )
	   System.out.println( "sList is empty: no elements: " + sList.size() );
       else
	   System.out.println( "sList is not empty: no elements: " + sList.size() );

       System.out.println( "Adding at end: A B C D E F" );

       sList.add( "A" );
       sList.add( "B" );
       sList.add( "C" );
       sList.add( "D" );
       sList.add( "E" );
       sList.add( "F" );

       if( sList.isEmpty() )
	   System.out.println( "sList is empty: no elements: " + sList.size() );
       else
	   System.out.println( "sList is not empty: no elements: " + sList.size() );

       ListIterator<String> iter = sList.listIterator( 0 );
       System.out.print( "List: {" );
       while( iter.hasNext() )
	   System.out.print( " " + iter.next() );
       System.out.println( " }" );

       System.out.print( "List in reverse: {" );
       while( iter.hasPrevious() )
	   System.out.print( " " + iter.previous() );
       System.out.println( " }" );

       for( int i = 0; i < 110; i++ )
	   iList.add( i );

       ListIterator<Integer> iter2 = iList.listIterator( 0 );
       System.out.print( "List: {" );
       while( iter2.hasNext() )
	   System.out.print( " " + iter2.next() );
       System.out.println( " }" );

       if( iter.hasNext() )
	   System.out.println( "Step to the next: " + iter.next() );
       if( iter.hasNext() )
	   System.out.println( "Step to the next: " + iter.next() );

       // add an element
       sList.remove( 3 );

       if( sList.isEmpty() )
	   System.out.println( "sList is empty: no elements: " + sList.size() );
       else
	   System.out.println( "sList is not empty: no elements: " + sList.size() );

       if( iter.hasNext() )
	   System.out.println( "Step to the next: " + iter.next() );

    }
}
