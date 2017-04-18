/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

/**
 *
 * @author dyzun
 */
import java.sql.Connection;
import java.sql.ResultSet;

public interface DbAccessInterface {
	
	public Connection connect();
	
	public ResultSet retrieve (Connection con, String query);

	public int create (Connection con, String query);
	
	public int update (Connection con, String query);
	
	public int delete (Connection con, String query);
	
	public void disconnect(Connection con);
}
