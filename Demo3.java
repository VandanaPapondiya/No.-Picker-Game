import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
//main page, database name=>tb col, table_name=>login, col_name=ur
class FDemo extends JFrame implements ActionListener
{
	int a=1;
	int p=0;
	int k=8;
	JButton b1;
	Demo1 d1;
	Demo8 d2;
	Demo12 d3;
	Demo13 d4;
	Demo14 d5;
	Container con=getContentPane();
	CardLayout card;
    FDemo(){
	card=new CardLayout();
	setLayout(card);
	//b1=new JButton("Click");
	//add(b1);
	//b1.addActionListener(this);
	d1=new Demo1(this);
	add(d1);
	d2=new Demo8(this);
	add(d2);
	d3=new Demo12(this);
	add(d3);
	d4=new Demo13(this);
	add(d4);
	d5=new Demo14(this);
	add(d5);
	
}
public void actionPerformed(ActionEvent e){	
if(e.getSource()==d5.b2)
		System.exit(0);
       if(e.getSource() == d1.b8){
        String data = d1.getTextFieldData(); 
        try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tb?useSSL=false","root","Vann@123");
			Statement st=con.createStatement();
			String q="insert into login values('"+data+"')";
			st.executeUpdate(q);
		System.out.println("data insert...");
		con.close();
		}
		catch(Exception e1){
			System.out.println(e1);
		}
	   }
	   if(e.getSource() == d2.b8){
        String data = d2.getTextFieldData(); 
        try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tb?useSSL=false","root","Vann@123");
			Statement st=con.createStatement();
			String q="insert into login values('"+data+"')";
			st.executeUpdate(q);
		System.out.println("data insert...");
		con.close();
		}
		catch(Exception e1){
			System.out.println(e1);
		}
	   }
	   if(e.getSource() == d3.b8){
        String data = d3.getTextFieldData(); 
        try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tb?useSSL=false","root","Vann@123");
			Statement st=con.createStatement();
			String q="insert into login values('"+data+"')";
			st.executeUpdate(q);
		System.out.println("data insert...");
		con.close();
		}
		catch(Exception e1){
			System.out.println(e1);
		}
	   }
	   if(e.getSource() == d4.b8){
        String data = d4.getTextFieldData(); 
       try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tb?useSSL=false","root","Vann@123");
			Statement st=con.createStatement();
			String q="insert into login values('"+data+"')";
			st.executeUpdate(q);
		System.out.println("data insert...");
		con.close();
		}
		catch(Exception e1){
			System.out.println(e1);
		}
	   }
	   
	card.next(con);
	if(a==4){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tb?useSSL=false","root","Vann@123");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from login");
	        while(rs.next()){
				p+=k*Integer.parseInt(rs.getString(1));
				k-=k/2;
			}
			st.executeUpdate("delete from login");
			con.close();
	
		}
		catch(Exception e1){
			System.out.println(e1);
		}
		System.out.println("You think about=>"+p);
		d5.updatePValue(p);
		
		
		
	}
	a++;
}

}
class Demo3{
	public static void main(String ar[]){
		System.out.println("Mind Reading Game!!");
		FDemo f1=new FDemo();
		f1.setVisible(true);
		f1.setBounds(100,100,1000,1000);
		f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
	}
}