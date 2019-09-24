package chc.jsj;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Remove html tags from a list.
 * Modifies l by removing elements of the form "<*>".
 * @param l list of words and html tags.
 */

public class Iterator {
	
	public static void stripTags(ArrayList<String> l) {
	    // THIS CODE HAS A BUG!  See the lecture notes.
	    
	    // using MyIterator
		//ArrayList<String> l0 = l;
	    MyIterator iter = new MyIterator(l);
	   // MyIterator iter0 = new MyIterator(l0);
	    
	    while (iter.hasNext()) {
	        String s = iter.next();
	        if ( true == isTag(s)) {
	            l.remove(s); 
	            iter.minus();
	        }
	    }
	}


	// returns true iff s is an html tag of the form "<*>" for any *
	private static boolean isTag(String s) {
	    return s.startsWith("<") && s.endsWith(">");
	}

	public static void main(String[] args) {
		ArrayList<String> l =  new ArrayList<String>
		(Arrays.asList(new String[] {"<b>","12313","<a>","</a>","<654>","<6541>","12313","<654>"}));
		
		System.out.println(l);
		for(String a:l) {
			System.out.print(a + "\t");
			}
		System.out.println();
		stripTags(l);
		System.out.println(l);
		
	}
}
