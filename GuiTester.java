package Score4_GUI;

public class GuiTester {
	
	static Gui gui;
	
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
		
			@Override
			public void run() {
			
				gui = new Gui();
			}	
		});		
	}
}
