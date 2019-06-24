package junit;

public class RemoveFirstTwoAFromString 
{
	public String Remove(String string)
	{
		String result="";
		
		if(string.charAt(0)=='A' && string.charAt(1)!='A')
		{
			result=result+string.substring(1,string.length());
		}
		else if(string.charAt(0)=='A' && string.charAt(1)=='A')
		{
			result=result+string.substring(2,string.length());
		}
		else if(string.charAt(0)!='A' && string.charAt(1)=='A')
		{
			result=result+string.charAt(0)+string.substring(2,string.length());
		}
		else
		{
			result=result+string;
		}
		
		return result;
	}
	
	

}
