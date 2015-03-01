import java.awt.*;
import java.util.*;
import java.text.*;
import java.awt.event.*;

class showDate implements WindowListener,ActionListener
{
	Frame f;
	TextField t1,t2,t3;
	Button b1;  
	Label l1;
	int dd=0,month=0,year=0;
	showDate()
	{
		f=new Frame("Date");
		f.setSize(350,300);
		
		t1=new TextField();	
		t2=new TextField();	
		t3=new TextField();	
		l1=new Label(); 	
		b1=new Button("OK");
		t1.setBounds(50,100,40,25);
		t2.setBounds(150,100,40,25);
		t3.setBounds(250,100,40,25);
		
		b1.addActionListener(this);
		
		b1.setBounds(150,280,52,25);

		l1.setBounds(160,240,60,20);
	
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(l1);
		f.add(b1);
		f.addWindowListener(this);
		f.setVisible(true);
	}

public void windowActivated(WindowEvent we)
{}
public void windowDeactivated(WindowEvent we)
{}
public void windowClosed(WindowEvent we)
{}
public void windowClosing(WindowEvent we)
{
	System.exit(0);
}

public void windowIconified(WindowEvent we)
{}
public void windowDeiconified(WindowEvent we)
{}
public void windowOpened(WindowEvent we)
{}
public void actionPerformed(ActionEvent t)
{
	String str=t.getActionCommand();
	
	dd=Integer.parseInt(t1.getText());
	month=Integer.parseInt(t2.getText())-1;
	year=Integer.parseInt(t3.getText());
	
	if(str.equals("OK"))
		{
			Date date=(new GregorianCalendar(year,month,dd)).getTime();
			SimpleDateFormat f=new SimpleDateFormat("EEEE");
			String day=f.format(date);
			l1.setText(day);
		}
	
	
	}
		public static void main(String args[])
		{
				showDate sd=new showDate();
		}
		 }