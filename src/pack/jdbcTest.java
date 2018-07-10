package pack;

import java.sql.*;

public class jdbcTest {
	//JDBC���������� �����ݿ��ַ
 static final String jDBC_DRIVER = "com.mysql.jdbc.Driver";
    //���ݿ������ΪEXAMPLE
 static final String DB_URL = "jdbc:mysql://localhost/EXAMPLE";
 
    //���ݿ��û�������
 static final String USRE = "root";
 
 static final String PASS ="";
 
 public static void main(String[] args) {
	Connection conn = null;
	Statement stmt = null;
	try {
		//ע��JDBC��������
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//������
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USRE, PASS);
		
		//ִ�в�ѯ
		System.out.println("Creating statement...");
		stmt = conn.createStatement();
		String sql;
		sql = "SELECT id,name,age FROM Students";
		ResultSet rs = stmt.executeQuery(sql);
		
		//�õ��ʹ�������
		while(rs.next()) {
			//����
			int id = rs.getInt("id");
			int age = rs.getInt("age");
			String name = rs.getString("name");
			
			//��ʾ
			System.out.println("ID:  "+id);
			System.out.println(", Age: " +age);
			System.out.println(",Name : " +name);
			System.out.println();
			
					
		}
		//������
		rs.close();
		stmt.close();
		conn.close();
	} catch (SQLException e) {
		// TODO: handle exception
		//JDBC ��������
		e.printStackTrace();
	}catch(Exception e) {
		//Class.forName ����
		e.printStackTrace();
	}finally {
		//����һ�������ر���Դ��
		try {
			if(stmt!=null)
				stmt.close();
		} catch (SQLException e2) {
			// TODO: handle exception
		}
		try {
			if(conn!=null)
				conn.close();
		} catch (SQLException e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
	System.out.println("Goodbye!");
}
}
