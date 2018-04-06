package tpe;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class theViewModel extends JFrame {
	
	    
	    private JButton showBtn = new JButton("show");
	     theViewModel(){
	    	 
	    	 
	    	         JPanel showPanel = new JPanel();
	    	         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	         this.setSize(20, 200);
	    	         showPanel.add(showBtn);
	    	         this.add(showPanel);
	    	         
	    	         this.setVisible(true);

	     }
	  


	public void setResult(ResultSet result) throws SQLException {
		
		while ( result.next() ) {
			int id = result.getInt("id");
			String  name = result.getString("name");
			int age  = result.getInt("age");
			String  address = result.getString("address");
			float salary = result.getFloat("salary");
			System.out.println( "ID = " + id );
			System.out.println( "NAME = " + name );
			System.out.println( "AGE = " + age );
			System.out.println( "ADDRESS = " + address );
			System.out.println( "SALARY = " + salary );
			System.out.println();
		}
		
	}
        void addCalculateListener(ActionListener listenForCalcButton){
		  
	  
	          showBtn.addActionListener(listenForCalcButton);
 
		      }



	public void displayErrorMessage(String string) {
		
		  JOptionPane.showMessageDialog(this, string);

	}
}
