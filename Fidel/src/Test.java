import java.awt.Toolkit;
import java.sql.SQLException;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		
		Mudi m=new Mudi();
	 // m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setSize(1365,775);
		m.setResizable(false);
		
		Level level=new Level();
     // level.setVisible(true);
		level.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		level.setSize(1365,775);
		level.setResizable(false);
		
		Login l=new Login();
		l.setSize(620,330);
	    l.setVisible(true);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setResizable(false);
		l.setLocation(350,200);
		
	    l.setIconImage(Toolkit.getDefaultToolkit().getImage(l.getClass().getResource("lo.png")));
	    level.setIconImage(Toolkit.getDefaultToolkit().getImage(l.getClass().getResource("lo.png")));
	    m.setIconImage(Toolkit.getDefaultToolkit().getImage(l.getClass().getResource("lo.png")));
	   

	}

}
