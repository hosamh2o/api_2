package tpe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class theControlModel{
	
	private dbconnection connObj;
	private sqlModel sqlObj;
	private theViewModel viewObj;
	private Statement stmt = null;
	private String sql = "";
	private ResultSet result = null;
	
	public theControlModel(dbconnection connObj, sqlModel sqlObj, theViewModel viewObj){
		this.connObj = connObj;
		this.sqlObj = sqlObj;
		this.viewObj = viewObj;
		
		  
		
		        this.viewObj.addCalculateListener(new btnListener());

		}
	
       class btnListener implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent arg0) {
					 try{
						 
						   sql=sqlObj.getCreateSql();
						   stmt=connObj.connect().createStatement();
							stmt.executeUpdate(sql);
							//viewObj.setResult(result);
							//result.close();
							stmt.close();
							connObj.Closeconnection();
					             }
					 
					  
					 
					             catch(SQLException ex){
				
					                 System.out.println(ex);
					
				                viewObj.displayErrorMessage("error ");
				                
					             }
					 
					
				}

	
	
	

}
}
