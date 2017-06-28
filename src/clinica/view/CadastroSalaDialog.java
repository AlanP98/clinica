package clinica.view;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroSalaDialog extends JDialog {
	
	public CadastroSalaDialog(JFrame frame){
		super(frame);
		super.setTitle("Cadastro de Sala");
		super.setModal(true);
		super.setSize(TelaInicial.dimension);
		
		JLabel andarLabel = new JLabel("Andar:");
		andarLabel.setSize(100, 20);
		andarLabel.setLocation(50, 20);
		
		JTextField andarField = new JTextField();
		andarField.setSize(200, 20);
		andarField.setLocation(150, 20);
		
		JPanel andarPanel = (JPanel) getContentPane();
		andarPanel.setLayout(null);
		andarPanel.add(andarLabel);
		andarPanel.add(andarField);
		
		JLabel numeroLabel = new JLabel("Número:");
		numeroLabel.setSize(100, 20);
		numeroLabel.setLocation(50, 50);
		
		JTextField numeroField = new JTextField();
		numeroField.setSize(200, 20);
		numeroField.setLocation(150, 50);
		
		JPanel numeroPanel = (JPanel) getContentPane();
		numeroPanel.setLayout(null);
		numeroPanel.add(numeroLabel);
		numeroPanel.add(numeroField);
		
		JLabel descricaoLabel = new JLabel("Descrição:");
		descricaoLabel.setSize(100, 20);
		descricaoLabel.setLocation(50, 80);
		
		JTextField descricaoField = new JTextField();
		descricaoField.setSize(200, 20);
		descricaoField.setLocation(150, 80);
		
		JPanel descricaoPanel = (JPanel) getContentPane();
		descricaoPanel.setLayout(null);
		descricaoPanel.add(descricaoLabel);
		descricaoPanel.add(descricaoField);
	}
	
}
