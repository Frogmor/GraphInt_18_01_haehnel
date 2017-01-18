import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Zones extends JFrame{
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JTextArea ZoneTxt = new JTextArea(15,15);
	JScrollPane scrollPane = new JScrollPane(ZoneTxt);
	JCheckBox c1 = new JCheckBox("retours à la ligne auto");
	JCheckBox c2 = new JCheckBox("retours entre deux mots");
	JCheckBox c3 = new JCheckBox("Gras");
	JCheckBox c4 = new JCheckBox("Italique");
	
	JRadioButton r1= new JRadioButton("Rouge");
	JRadioButton r2= new JRadioButton("Vert");
	JRadioButton r3= new JRadioButton("Bleu");
	
	JRadioButton r4= new JRadioButton("Rouge");
	JRadioButton r5= new JRadioButton("Vert");
	JRadioButton r6= new JRadioButton("Bleu");
	
	JRadioButton r7= new JRadioButton("default");
	JRadioButton r8= new JRadioButton("default");
	
	ButtonGroup BG1 = new ButtonGroup();
	ButtonGroup BG2 = new ButtonGroup();
	
	String[] CBTL = { "12", "13", "16", "20", "28" };
	JComboBox cbt = new JComboBox(CBTL);

	
	Action b= new Action(){

		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			
			if(source==r4){
				ZoneTxt.setBackground(Color.RED);
			}else if(source==r5){
				ZoneTxt.setBackground(Color.GREEN);
			}else if(source==r6){
				ZoneTxt.setBackground(Color.BLUE);
			}else if(source==r8){
				ZoneTxt.setBackground(Color.WHITE);
			}
			
			if(source==r1){
				ZoneTxt.setForeground(Color.RED);
			}else if(source==r2){
				ZoneTxt.setForeground(Color.GREEN);
			}else if(source==r3){
				ZoneTxt.setForeground(Color.BLUE);
			}else if(source==r7){
				ZoneTxt.setForeground(Color.BLACK);
			}
			
		}

		@Override
		public void addPropertyChangeListener(PropertyChangeListener listener) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Object getValue(String key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void putValue(String key, Object value) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removePropertyChangeListener(PropertyChangeListener listener) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setEnabled(boolean b) {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	Action a2= new Action(){

		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			cbt.setSelectedItem(source);
			changePol();
		}

		@Override
		public void addPropertyChangeListener(PropertyChangeListener listener) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Object getValue(String key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void putValue(String key, Object value) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removePropertyChangeListener(PropertyChangeListener listener) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setEnabled(boolean b) {
			// TODO Auto-generated method stub
			
		}
	
	};
	
	ItemListener a = new ItemListener(){

		@Override
		public void itemStateChanged(ItemEvent e) {
			changePol();
			
			
		}
		
	};
	
	public void changePol(){
		if (c1.isSelected()){
			ZoneTxt.setLineWrap(true);
		}else{
			ZoneTxt.setLineWrap(false);
		}
		
		if (c2.isSelected()){
			ZoneTxt.setWrapStyleWord(true);
		}else{
			ZoneTxt.setWrapStyleWord(false);
		}
		
		if (c3.isSelected()){
			if (c4.isSelected()){
				ZoneTxt.setFont(new Font(" TimesRoman ",Font.BOLD+Font.ITALIC,12));
			}else{
				ZoneTxt.setFont(new Font(" TimesRoman ",Font.BOLD,Integer.parseInt(cbt.getSelectedItem().toString())));
			}
		}else{
			ZoneTxt.setFont(new Font(" TimesRoman ",Font.PLAIN,Integer.parseInt(cbt.getSelectedItem().toString())));
			if (c4.isSelected()){
				ZoneTxt.setFont(new Font(" TimesRoman ",Font.ITALIC,Integer.parseInt(cbt.getSelectedItem().toString())));
			}
		}
		
		if (c4.isSelected()){
			if (c3.isSelected()){
				ZoneTxt.setFont(new Font(" TimesRoman ",Font.BOLD+Font.ITALIC,Integer.parseInt(cbt.getSelectedItem().toString())));
			}else{
				ZoneTxt.setFont(new Font(" TimesRoman ",Font.ITALIC,Integer.parseInt(cbt.getSelectedItem().toString())));
			}
		}else{
			ZoneTxt.setFont(new Font(" TimesRoman ",Font.PLAIN,Integer.parseInt(cbt.getSelectedItem().toString())));
			if (c3.isSelected()){
				ZoneTxt.setFont(new Font(" TimesRoman ",Font.BOLD,Integer.parseInt(cbt.getSelectedItem().toString())));
			}
		}
	}
	
	
	public Zones(){
		setBounds(0,0,600,400);
		setLayout(new GridLayout(3, 1));
		ZoneTxt.setBounds(50, 50, 200, 200);
		ZoneTxt.setPreferredSize(new Dimension(200,200) );
		
		ZoneTxt.setWrapStyleWord(true);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(250, 250));
		
		jp1.setBorder(BorderFactory.createLineBorder(Color.black));
		jp1.setBorder(BorderFactory.createTitledBorder("Couleurs Police"));
		
		jp2.setBorder(BorderFactory.createLineBorder(Color.black));
		jp2.setBorder(BorderFactory.createTitledBorder("Couleurs Fond"));
		
		c1.addItemListener(a);
		c2.addItemListener(a);
		c3.addItemListener(a);
		c4.addItemListener(a);
		
		r1.addActionListener(b);
		r2.addActionListener(b);
		r3.addActionListener(b);
		r4.addActionListener(b);
		r5.addActionListener(b);
		r6.addActionListener(b);
		r7.addActionListener(b);
		r8.addActionListener(b);
		
		BG1.add(r1);
		BG1.add(r2);
		BG1.add(r3);
		BG1.add(r7);
		
		BG2.add(r4);
		BG2.add(r5);
		BG2.add(r6);
		BG2.add(r8);
		
		jp1.add(r1);
		jp1.add(r2);
		jp1.add(r3);
		jp2.add(r4);
		jp2.add(r5);
		jp2.add(r6);
		jp1.add(r7);
		jp2.add(r8);
		
		cbt.addActionListener(a2);
		
		getContentPane().add(scrollPane);
		getContentPane().add(c1);
		getContentPane().add(c2);
		getContentPane().add(c3);
		getContentPane().add(c4);
		getContentPane().add(jp1);
		getContentPane().add(jp2);
		getContentPane().add(cbt);
	}

}
