import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Ass2 extends JFrame{
	
	private JLabel lbinput1,lbinput2,lboutput;
	private JTextField tfinput1,tfinput2,tfoutput;
	
	private JButton btpower,btsqrt,btabs,btround,btceil,btfloor,btrandom,btClear;
	private PowerButtonHandler PowerHandler;
	private SqrtButtonHandler SqrtHandler;
	private AbsButtonHandler AbsHandler;
	private RoundButtonHandler RoundHandler;
	private CeilButtonHandler CeilHandler;
	private FloorButtonHandler FloorHandler;
	private RandomButtonHandler RandomHandler;
	private ClearButtonHandler ClearHandler;	

public Ass2 (){
	lbinput1 = new JLabel("Input Data 1 :");
	lbinput2 = new JLabel("Input Data 2 :");
	lboutput = new JLabel("Output Data :");
	tfinput1 = new JTextField(20);
	tfinput2 = new JTextField(20);
	tfoutput = new JTextField(20);
	btpower = new JButton("Power");
	btsqrt = new JButton("Sqrt");
	btabs = new JButton("Abs");
	btround = new JButton("Round");
	btceil = new JButton("Ceil");
	btfloor = new JButton("Floor");
	btrandom = new JButton("Random");
	btClear = new JButton("Clear");
	PowerHandler = new PowerButtonHandler();
	SqrtHandler = new SqrtButtonHandler();
	AbsHandler = new AbsButtonHandler();
	RoundHandler = new RoundButtonHandler();
	CeilHandler = new CeilButtonHandler();
	FloorHandler = new FloorButtonHandler();
	RandomHandler = new RandomButtonHandler();
	ClearHandler = new ClearButtonHandler();

	btpower.addActionListener(PowerHandler);
	btsqrt.addActionListener(SqrtHandler);
	btabs.addActionListener(AbsHandler);
	btround.addActionListener(RoundHandler);
	btceil.addActionListener(CeilHandler);
	btfloor.addActionListener(FloorHandler);
	btrandom.addActionListener(RandomHandler);
	btClear.addActionListener(ClearHandler);
	
	
	
	Container pane = getContentPane();
	pane.setLayout(new GridLayout(7,2));
	pane.add(lbinput1);
	pane.add(tfinput1);
	pane.add(lbinput2);
	pane.add(tfinput2);
	pane.add(lboutput);
	pane.add(tfoutput);
	pane.add(btpower);
	pane.add(btsqrt);
	pane.add(btabs);
	pane.add(btround);
	pane.add(btceil);
	pane.add(btfloor);
	pane.add(btrandom);
	pane.add(btClear);

	setTitle("Programming With Math");
	setSize(500,500);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
private class PowerButtonHandler implements ActionListener{
	public void actionPerformed (ActionEvent e){
		double num1 = Double.parseDouble(tfinput1.getText());
		double num2 = Double.parseDouble(tfinput2.getText());
		
		
		tfoutput.setText(Math.pow(num1, num2)+"");
	   
		
	}
}
private class SqrtButtonHandler implements ActionListener{
	public void actionPerformed (ActionEvent e){
		double num1 = Double.parseDouble(tfinput1.getText());
		
		
		tfoutput.setText(Math.sqrt(num1)+"");
		
	}
}
private class AbsButtonHandler implements ActionListener{
	public void actionPerformed (ActionEvent e){
		double num1 = Double.parseDouble(tfinput1.getText());
		
		
		tfoutput.setText(Math.abs(num1)+"");
		
	}
}
private class RoundButtonHandler implements ActionListener{
	public void actionPerformed (ActionEvent e){
		double num1 = Double.parseDouble(tfinput1.getText());
		
		
		
		tfoutput.setText(Math.round(num1)+"");
		
	}
}
private class CeilButtonHandler implements ActionListener{
	public void actionPerformed (ActionEvent e){
		double num1 = Double.parseDouble(tfinput1.getText());
		
		
		
	    tfoutput.setText(Math.ceil(num1)+"");
	}
}
private class FloorButtonHandler implements ActionListener{
	public void actionPerformed (ActionEvent e){
		double num1 = Double.parseDouble(tfinput1.getText());
		
		
	
		tfoutput.setText(Math.floor(num1)+"");
	}
}
private class RandomButtonHandler implements ActionListener{
	public void actionPerformed (ActionEvent e){
		DecimalFormat df = new DecimalFormat("#.0000");
		tfoutput.setText((df.format(Math.random()*100))+"");
			
	}
}

	
	private class ClearButtonHandler implements ActionListener{
	public void actionPerformed (ActionEvent e){
		
			tfinput1.setText("");
			tfinput2.setText("");
			tfoutput.setText("");
		}
	}

public static void main(String[]args){
     new Ass2();
	
}

}

	

