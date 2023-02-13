package member_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import member.bo.enquiry_bo;
import member.bo.member_bo;
import member.bo.membership_bo;

public class member_dao1 {
    
public static Connection getConnection()
	
	{  
	Connection con=null;
	    try{  
	        Class.forName("com.mysql.cj.jdbc.Driver");  
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sep_placement","root","root");  
	        
	        } 
	    catch(Exception e)
	    {
	    	System.out.println(e);
	        }  
	     return con;  
	}
        

        public static int signup(member_bo mb)
        {
        	int status =0;
        	  try
        	  {
        	 Connection con=member_dao1.getConnection();
        	  String sql="insert into signup1 (name,pass,email,phone) values(?,?,?,?)";
        	  PreparedStatement ps=con.prepareStatement(sql);
        	  
        	   ps.setString(1,mb.getName());
        	   ps.setString(2,mb.getPassword());
        	   ps.setString(3,mb.getEmail());
        	   ps.setString(4, mb.getPhone());
        	   
        	    status=ps.executeUpdate();
        	    }
        	  
        	   catch(Exception e)
        	  {
        		  System.out.println(e);
        	  }
        	
        	return status;
        }
	
	
	         public static boolean login(String name,String pass)
	         {
	        	 boolean status=false;
	        	 
	        	 
	        	 try
	        	 {
	        		 
	        		 Connection  con=member_dao1.getConnection();
	        		 
	        		 String sql="select * from signup1 where name=? and pass=?";
	        		 
	        		 PreparedStatement ps=con.prepareStatement(sql);
	        		 
	        		 ps.setString(1,name);
	        		 ps.setString(2,pass);
	        		 
	        		    ResultSet rs=ps.executeQuery();
	        		    
	        		    status=rs.next();
	        		 
	        		 
	        		 
	        	 }
	        	 catch(Exception e)
	        	 {
	        		 System.out.println(e);
	        	 }
	        	 return status;
	         }
	         
	        	 public static int addenquiry(enquiry_bo em)
	             {
	             	int status=0;
	           	  try
	           	  {
	           		 Connection con=member_dao1.getConnection();
	           		  String sql="insert into addenquiry(first_name,last_name, current_weight, bmi,age, goal_weight, email)values(?,?,?,?,?,?,?)";
	           		  PreparedStatement ps=con.prepareStatement(sql);
	           		  
	           		  ps.setString(1, em.getFirst_name());
	           		  ps.setString(2, em.getLast_name());
	           		  ps.setString(3, em.getCurrent_weight());
	           		  ps.setString(4,em.getBmi());
	           		  ps.setString(5,em.getAge());
	           		  ps.setString(6,em.getGoal_weight());
	           		  ps.setString(7,em.getEmail());
	           				
	           		  
	           		  
	           		  status=ps.executeUpdate();
	           		  
	           	  }
	           	  catch(Exception e)
	           	  {
	           		  System.out.println(e);
	           	  }
	           	  return status;
	        
	         }
	        	 
	        	 public static List getallemployee()
	        	 {
	        		 List<enquiry_bo> list=new ArrayList<enquiry_bo>();
	        		try
	        		{
	        		
	        		
	        		Connection con=member_dao1.getConnection();
	        		
	        		PreparedStatement ps=con.prepareStatement("select * from addenquiry");
	        		
	        		
	        		
	        		ResultSet rs=ps.executeQuery();
	        		
	        		
	        		 while(rs.next())
	        		 {
	        			enquiry_bo em=new enquiry_bo();
	        			em.setId(rs.getInt(1));
	        			em.setFirst_name(rs.getString(2));
	        			em.setLast_name(rs.getString(3));
	        			em.setCurrent_weight(rs.getString(4));
	        			em.setBmi(rs.getString(5));
	        			em.setAge(rs.getString(6));
	        			em.setGoal_weight(rs.getString(7));
	        			em.setEmail(rs.getString(8));
	        			list.add(em);
	        			 
	        		 }
	        		
	        		}catch (Exception e) {
						 System.out.println(e);
					}
					return list;	
	        		
	        	 }
	        	 
	        	 public static int addmembers1(membership_bo mb)
	             {
	             	int status=0;
	           	  try
	           	  {
	           		 Connection con=member_dao1.getConnection();
	           		  String sql="insert into members(name,email,contact_no,loc,doj,pack)values(?,?,?,?,?,?)";
	           		  PreparedStatement ps=con.prepareStatement(sql);
	           		  
	           		  ps.setString(1, mb.getName());
	           		  ps.setString(2, mb.getEmail());
	           		  ps.setString(3,mb.getContact_no());
	           		  ps.setString(4,mb.getLoc());
	           		  ps.setString(5,mb.getDoj());
	           		  ps.setString(6,mb.getPack());
	           				
	           		  
	           		  
	           		  status=ps.executeUpdate();
	           		  
	           	  }
	           	  catch(Exception e)
	           	  {
	           		  System.out.println(e);
	           	  }
	           	  
	           	  
	           	  return status;
	             } 
	        	 
	        	 public static List getallmembers1()
	        	 {
	        		 List<membership_bo> list=new ArrayList<membership_bo>();
	        		try
	        		{
	        		
	        		
	        		Connection con=member_dao1.getConnection();
	        		
	        		PreparedStatement ps=con.prepareStatement("select * from members");
	        		
	        		
	        		
	        		ResultSet rs=ps.executeQuery();
	        		
	        		
	        		 while(rs.next())
	        		 {
	        			membership_bo em=new membership_bo();
	        			em.setId(rs.getInt(1));
	        			em.setName(rs.getString(2));
	        			em.setEmail(rs.getString(3));
	        			em.setContact_no(rs.getString(4));
	        			em.setLoc(rs.getString(5));
	        			em.setDoj(rs.getString(6));
	        			em.setPack(rs.getString(7));
	        			list.add(em);
	        			 
	        		 }
	        		
	        		}catch (Exception e) {
						 System.out.println(e);
					}
					return list;	
	        		
	        	 }
	        	 
	        	 
	        	 
	        	 
	        	 public static enquiry_bo getemployee(int id)
	        	 {
	        		 enquiry_bo eb=new enquiry_bo();
	        		 
	        		 try
	        		 {
	        			 Connection con=member_dao1.getConnection(); 
	        			 String query="select * from addenquiry where id=?";
	        			 
	        			 PreparedStatement ps=con.prepareStatement(query);
	        			 
	        			 ps.setInt(1, id);
	        			 
	        			ResultSet rs=ps.executeQuery();
	        			
	        			
	        			if(rs.next())
	        			{
	        				eb.setId(rs.getInt(1));            
	        				 eb.setFirst_name(rs.getString(2));
	        				 eb.setLast_name(rs.getString(3));
	        				 eb.setCurrent_weight(rs.getString(4));
	        				 eb.setBmi(rs.getString(5));
	        				 eb.setAge(rs.getString(6));
	        				 eb.setGoal_weight(rs.getString(7));
	        				 eb.setEmail(rs.getString(8));
	        			}
	        		 }
	        			catch(Exception e)
	        			{
	        				System.out.println(e);
	        			}
	        				
	                 return eb;
	        	 }
         
	        	 
	        	 public static membership_bo getmembers(int id)
	        	 {
	        		 membership_bo eb=new membership_bo();
	        		 
	        		 try
	        		 {
	        			 Connection con=member_dao1.getConnection(); 
	        			 String query="select * from members where id=?";
	        			 
	        			 PreparedStatement ps=con.prepareStatement(query);
	        			 
	        			 ps.setInt(1, id);
	        			 
	        			ResultSet rs=ps.executeQuery();
	        			
	        			
	        			if(rs.next())
	        			{
	        				 eb.setId(rs.getInt(1));
	        				 eb.setName(rs.getString(2));            
	        				 eb.setEmail(rs.getString(3));
	        				 eb.setContact_no(rs.getString(4));
	        				 eb.setLoc(rs.getString(5));
	        				 eb.setDoj(rs.getString(6));
	        				 eb.setPack(rs.getString(7));
	        			    
	        			}
	        		 }
	        			catch(Exception e)
	        			{
	        				System.out.println(e);
	        			}
	        				
	                 return eb;
	        	 }
         
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 public static int update1( membership_bo eb)
	        	 {
	        		 int status=0;
	        		 try
	        		 {
	        			 Connection con=member_dao1.getConnection();
	        			String query="update members set name=?,email=?,contact_no=? ,loc=?,doj=?,pack=? where id=?";
	        			 PreparedStatement ps=con.prepareStatement(query);
	        			 
	        			  ps.setString(1,eb.getName());            
	        				 ps.setString(2,eb.getEmail());
	        				 ps.setString (3,eb.getContact_no());
	        				 ps.setString (4,eb.getLoc());
	        				 ps.setString (5,eb.getDoj());
	        				 ps.setString(6,eb.getPack());
	        			     ps.setInt(7,eb.getId());
	        			     
	        			     status=ps.executeUpdate();
	        			     
	        			     
	        			 
	        		 }
	        		 catch(Exception e)
	        		 {
	        			 System.out.println(e);
	        		 }
					return status;
	        	 }	 
				
	        	 public static int update( enquiry_bo eb)
	        	 {
	        		 int status=0;
	        		 try
	        		 {
	        			 Connection con=member_dao1.getConnection();
	        			String query="update addenquiry set first_name=?,last_name=?,current_weight=? ,bmi=?,age=?,goal_weight=?,email=? where id=?";
	        			 PreparedStatement ps=con.prepareStatement(query);
	        			 
	        			  ps.setString(1,eb.getFirst_name());            
	        				 ps.setString(2,eb.getLast_name());
	        				 ps.setString (3,eb.getCurrent_weight());
	        				 ps.setString (4,eb.getBmi());
	        				 ps.setString (5,eb.getAge());
	        				 ps.setString(6,eb.getGoal_weight());
	        				 ps.setString(7,eb.getEmail());
	        				 ps.setInt(8,eb.getId());
	        			     
	        			     status=ps.executeUpdate();
	        			     
	        			     
	        			 
	        		 }
	        		 catch(Exception e)
	        		 {
	        			 System.out.println(e);
	        		 }
					return status;
	        	 }	 
				
	        	 public static int delete(int id) {
	        			
	        			int status=0;
	        			  try {
	        			
	        				  Connection con=member_dao1.getConnection();
	        				  String query="Delete from members where id=?";
	        				  PreparedStatement ps=con.prepareStatement(query);
	        				  ps.setInt(1, id);
	        				  status=ps.executeUpdate();
	        				  
	        			} catch (Exception e) {
	        			
	        				   System.out.println(e);
	        			}
	        			
	        			return status;
	        			
	        		}
	        	 
	        	 
	        	 public static int delete1(int id) {
	        			
	        			int status=0;
	        			  try {
	        			
	        				  Connection con=member_dao1.getConnection();
	        				  String query="Delete from addenquiry where id=?";
	        				  PreparedStatement ps=con.prepareStatement(query);
	        				  ps.setInt(1, id);
	        				  status=ps.executeUpdate();
	        				  
	        			} catch (Exception e) {
	        			
	        				   System.out.println(e);
	        			}
	        			
	        			return status;
	        			
	        		}
	        	 
	        		 
	
	
}
