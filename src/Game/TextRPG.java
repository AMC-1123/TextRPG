package Game;

import javax.swing.SwingUtilities;

import view.GameWindow;

public class TextRPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//GameEngine ge = new GameEngine();
		
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new GameWindow();
			}
		});
		
	
			
		/*ge.makeDungeon();
		System.out.print(ge.getDungeon().dungeonString());	
*/
		
	}
	
}
