import javax.swing.*;
import java.awt.*;
class Demo1 extends JPanel
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JTextField textField;
	Demo1(FDemo f2){
		setLayout(null);
		Font f=new Font("Harlow Solid Italic",Font.BOLD,50);
		
		b1=new JButton("8");
		b1.setFont(f);
		b1.setSize(100,100);
		b1.setLocation(100,50);
		add(b1);
		
		b2=new JButton("9");
		b2.setFont(f);
		b2.setSize(100,100);
		b2.setLocation(300,50);
		add(b2);
		
		b3=new JButton("10");
		b3.setFont(f);
		b3.setSize(100,100);
		b3.setLocation(500,50);
		add(b3);
		
		b4=new JButton("11");
		b4.setFont(f);
		b4.setSize(100,100);
		b4.setLocation(700,50);
		add(b4);
		
		b5=new JButton("12");
		b5.setFont(f);
		b5.setSize(100,100);
		b5.setLocation(100,200);
		add(b5);
		
		b6=new JButton("13");
		b6.setFont(f);
		b6.setSize(100,100);
		b6.setLocation(300,200);
		add(b6);
		
		b7=new JButton("14");
		b7.setFont(f);
		b7.setSize(100,100);
		b7.setLocation(500,200);
		add(b7);
		
		b8=new JButton("Next");
		b8.setFont(f);
		b8.setSize(200,200);
		b8.setLocation(350,600);
		add(b8);
		b8.addActionListener(f2);
		
		textField = new JTextField(15);
        textField.setFont(f);		
		textField.setSize(300,50);
		textField.setLocation(300,400);
        add(textField);
	}
	public String getTextFieldData() {
        return textField.getText();
    }
}