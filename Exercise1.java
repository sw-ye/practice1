import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField; 
public class Exercise1 extends JFrame implements ActionListener{
 private JPanel p1 = new JPanel(); 
 private JPanel p2 = new JPanel(); 
 private JTextField t1;
 StringBuffer str;
 JButton[] b=new JButton[10];
 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
 double x,y;
 int n;
 public Exercise1() {
 super("¼ÆËãÆ÷"); 
 setSize(350,300);
 setLocationRelativeTo(null);
 Container c = getContentPane();
 t1 = new JTextField(25); t1.setEditable(false); 
 p2.add(t1); 
 p2.setLayout(new GridLayout(3,2)); 
 str=new StringBuffer(); 
 
 for(int i=0;i<10;i++)  
 { 
 String s=""+i; 
 b[i]= new JButton(s); 
 b[i].addActionListener(this); 
 } 
 b1=new JButton("+");
 b2=new JButton("-");
 b3=new JButton("*");
 b4=new JButton("/"); 
 b5=new JButton("=");
 b6=new JButton("."); 
 b7= new JButton("sqrt");
 b8= new JButton("x^2");
 b9= new JButton("ÍË¸ñ");
 b10= new JButton("Çå¿Õ");
 
 p1.add(b[7]); p1.add(b[8]); p1.add(b[9]);
 p1.add(b1);p1.add(b7);
 p1.add(b[4]);p1.add(b[5]);p1.add(b[6]); 
 p1.add(b2);p1.add(b8);
 p1.add(b[1]); p1.add(b[2]); p1.add(b[3]); 
 p1.add(b3);p1.add(b9);
 p1.add(b[0]); p1.add(b6);
 p1.add(b5);  p1.add(b4);p1.add(b10);
 p1.setLayout(new GridLayout(4,5,10,10)); 
  
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 b5.addActionListener(this);
 b6.addActionListener(this);
 b7.addActionListener(this);
 b8.addActionListener(this);
 b9.addActionListener(this);
 b10.addActionListener(this);
  
 c.add(p2); 
 c.add(p1); 
 c.setLayout(new FlowLayout());  
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 setVisible(true);  
 setResizable(false); 
 }
 public static void main(String[] args) {
 @SuppressWarnings("unused")
 Exercise1 calculate=new Exercise1();
 }
 public void actionPerformed(ActionEvent e) {
 if(e.getSource()==b10){
 t1.setText("0");
 t1.setHorizontalAlignment(JTextField.RIGHT);
 str.setLength(0);
 }
 else if (e.getSource()==b9)
 { 
String text = t1.getText();
 int i = text.length();
 if(i>0){
  text = text.substring(0,i-1);
  if (text.length() == 0) {
	   t1.setText("0");
	  }else {
	      t1.setText(text);
	    }}
}else if (e.getSource()==b8)
{
 String i = t1.getText();
Double j = Double.parseDouble(i);
double ans = j*j;
String answer =String.valueOf(ans);
t1.setText(answer);
}else if (e.getSource()==b7)
{
 String i = t1.getText();
 Double j = Double.parseDouble(i);
 double ans = (double)Math.sqrt(j);
 String answer = String.valueOf(ans);
 t1.setText(answer);
}
 else if (e.getSource()==b1) 
 { 
 x=Double.parseDouble(t1.getText().trim()); 
 str.setLength(0); 
 y=0d; 
 n=0;
 }else if(e.getSource()==b2)
 {
 x=Double.parseDouble(t1.getText().trim()); 
 str.setLength(0); 
 y=0d;
 n=1;
 }else if(e.getSource()==b3)
 {
 x=Double.parseDouble(t1.getText().trim()); 
 str.setLength(0); 
 y=0d;
 n=2;
 }else if(e.getSource()==b4)
 {
 x=Double.parseDouble(t1.getText().trim()); 
 str.setLength(0); 
 y=0d;
 n=3;
 }else if(e.getSource()==b5)
 {
 str.setLength(0);
 switch(n){
 case 0:t1.setText(""+(x+y));break;
 case 1:t1.setText(""+(x-y));break;
 case 2:t1.setText(""+(x*y));break;
 case 3:t1.setText(""+(x/y));break;
 } 
 }else{
 if(e.getSource()==b[0])
 {
 if(t1.getText().trim().equals("0")) 
 {} 
 else
 t1.setText(str.append(e.getActionCommand()).toString());
 t1.setHorizontalAlignment(JTextField.RIGHT); 
 y=Double.parseDouble(t1.getText().trim());
 }
 else
 { 
 t1.setText(str.append(e.getActionCommand()).toString()); 
 t1.setHorizontalAlignment(JTextField.RIGHT); 
 y=Double.parseDouble(t1.getText().trim()); 
 }
 }
 } 
}