package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveFirstTwoAFromStringTest
{
	RemoveFirstTwoAFromString result=new RemoveFirstTwoAFromString();
	
	/*
	 * 
	 * Case 1:	“ABCD” => “BCD”
	 * Case 2:	“AACD” => “CD” 
	 * Case 3:	“BACD” => “BCD”
	 * Case 4:	“BBAA” => “BBAA”
	 * Case 5:	“AABAA” => “BAA”
	 *  
	 */
	
	@Test
	void testForDifferentStrings() 
	{
		String temp=result.Remove("ABCD");
		assertEquals("BCD",temp);
		
		temp=result.Remove("AACD");
		assertEquals("CD",temp);
		
		temp=result.Remove("BACD");
		assertEquals("BCD",temp);
		
		temp=result.Remove("BBAA");
		assertEquals("BBAA",temp);
		
		temp=result.Remove("AABAA");
		assertEquals("BAA",temp);
		
	}

}
