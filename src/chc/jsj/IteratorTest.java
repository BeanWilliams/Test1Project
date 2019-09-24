package chc.jsj;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IteratorTest {

	@Before
	public void setUp() throws Exception {
	}

	 @Test
	    public void emptyList() {
	        ArrayList<String> l = new ArrayList<String>();
	        Iterator.stripTags(l);
	        assertEquals(new ArrayList<Integer>(), l);
	    }

	    @Test
	    public void noTagsOneWord() {
	        ArrayList<String> l = new ArrayList<String>(
	                Arrays.asList(new String[] {"hello"}));
	        Iterator.stripTags(l);
	        assertEquals(new ArrayList<String>(
	                        Arrays.asList(new String[] {"hello"})), 
	                     l);
	    }

	    @Test
	    public void noTagsSeveralWords() {
	        ArrayList<String> l = new ArrayList<String>(
	                Arrays.asList(new String[] {"now", "is", "", "time"}));
	        Iterator.stripTags(l);
	        assertEquals(new ArrayList<String>(
	                        Arrays.asList(new String[] {"now", "is", "", "time"})), 
	                     l);
	    }

	    @Test
	    public void oneTagSeveralWords() {
	        ArrayList<String> l = new ArrayList<String>(
	                Arrays.asList(new String[] {"now", "<img>", "time"}));
	        Iterator.stripTags(l);
	        assertEquals(new ArrayList<String>(
	                        Arrays.asList(new String[] {"now", "time"})), 
	                     l);
	    }
	    
	    @Test
	    public void allTags() {
	        ArrayList<String> l = new ArrayList<String>(
	                Arrays.asList(new String[] {"<b>", "<a>", "</a>"}));
	        Iterator.stripTags(l);
	        System.out.println(l);
	        assertEquals(new ArrayList<Integer>(), l);
	       /* assertEquals(new ArrayList<String>(
	        		Arrays.asList(new String[] {"<a>"})), 
	        		l);*/
	    }
	

	
	@After
	public void tearDown() throws Exception {
	}

	
}
