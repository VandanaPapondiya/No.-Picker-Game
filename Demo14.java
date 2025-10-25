import javax.swing.*;
import java.awt.*;
//last page with your number
class Demo14 extends JPanel{
	JTextField tx1;
	JButton b1,b2;
Demo14(FDemo f1){
setLayout(null);
Font f=new Font("Harlow Solid Italic",Font.BOLD,50);
tx1=new JTextField("I knew your number!");
tx1.setFont(f);
tx1.setLocation(200,50);
tx1.setSize(500,50);
add(tx1);

b1=new JButton();
b1.setSize(100,100);
b1.setLocation(400,200);
b1.setFont(f);
add(b1);

b2=new JButton("over");
b2.setFont(f);
b2.setSize(500,100);
b2.setLocation(200,300);
add(b2);
b2.addActionListener(f1);
}
public void updatePValue(int p) {
        b1.setText("" + p);
    }
}