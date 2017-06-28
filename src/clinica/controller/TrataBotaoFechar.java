package clinica.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TrataBotaoFechar implements ActionListener{
	
	private JFrame application;
	
	public TrataBotaoFechar(JFrame application) {
		this.application = application;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(this.application, "Mensagem");
	}
}
