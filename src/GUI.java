import javax.swing.*;  
import java.awt.event.*;  
public class GUI extends JFrame implements ActionListener{  
    JLabel l;  
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6;  
    JButton b;  
    char Value[];
    GUI(){  
        l=new JLabel("STATUS");  
        l.setBounds(50,50,100,20);  
        cb1=new JCheckBox("Status1");  
        cb1.setBounds(50,80,100,20);  
        cb2=new JCheckBox("Status2");  
        cb2.setBounds(50,110,100,20);  
        cb3=new JCheckBox("Status3");  
        cb3.setBounds(50,140,100,20); 
        cb4=new JCheckBox("Status4");
        cb4.setBounds(50,170,100,20);  
        cb5=new JCheckBox("Status5");  
        cb5.setBounds(50,200,100,20);    
        cb6=new JCheckBox("AllStatus");  
        cb6.setBounds(50,230,100,20); 
        b=new JButton("Build Query");  
        b.setBounds(100,500,100,20); 
        add(l);add(cb1);add(cb2);add(cb3);add(cb4);add(cb5);add(cb6);add(b);  
        setSize(1400,600);  
        setLayout(null);  
        setVisible(true); 
        b.addActionListener(this);  
 
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
        //float amount=0;  
        //String msg="";  
    	//Value="";
    	int i=0;
        if(cb1.isSelected()){  
        	Value[i] = "Status1";
        }  
        if(cb2.isSelected()){  
        	Value = Value + ",Status2"; 
        }  
        if(cb3.isSelected()){  
        	Value = Value + ",Status3"; 
        }  
        if(cb4.isSelected()){  
        	Value = Value + ",Status4";  
        }  
        if(cb5.isSelected()){  
        	Value = Value + ",Status5";   
        } 
        if(cb6.isSelected()){  
        	Value = "AllStatus";   
        }

        JOptionPane.showMessageDialog(this,Value);  
    }  
    public static void main(String[] args) {  
        new GUI();  
		System.out.println("Hello World");
    }  
}  