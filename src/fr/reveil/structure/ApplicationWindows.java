package fr.reveil.structure;

public class ApplicationWindows extends AbstractApplication 
{

	private static final ApplicationWindows instance = new ApplicationWindows();

	private ApplicationWindows()
	{

		super();
		
	}
	
	public static final ApplicationWindows getInstance()
	{
		
		return instance;
	}
	
}
