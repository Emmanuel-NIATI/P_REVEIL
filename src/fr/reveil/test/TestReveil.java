package fr.reveil.test;

import fr.reveil.structure.ApplicationWindows;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import fr.reveil.structure.AbstractApplication;
import fr.reveil.structure.ApplicationRaspberry;

public class TestReveil
{

	public static void main(String[] args)
	{

		AbstractApplication application;

		if( "arm".equals( System.getProperty("os.arch") ) )
		{
			
			try
			{

				UIManager.setLookAndFeel( AbstractApplication.LOOK_AND_FEEL_METAL );
				application = ApplicationRaspberry.getInstance();
			}
			catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e)
			{

				System.out.println(">>> " + e.getClass() + e.getMessage() );
			}
			
		}
		else if( "amd64".equals( System.getProperty("os.arch") ) )
		{

			try
			{

				UIManager.setLookAndFeel( AbstractApplication.LOOK_AND_FEEL_WINDOWS );
				application = ApplicationWindows.getInstance();
			}
			catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e)
			{

				System.out.println(">>> " + e.getClass() + e.getMessage() );
			}
			
		}
		else
		{

			System.out.println( "OS non prévu : " + System.getProperty("os.name") );
		}
		
	}
	
}
