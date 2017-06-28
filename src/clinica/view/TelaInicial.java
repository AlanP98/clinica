package clinica.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaInicial {
	
	public static Dimension dimension = new Dimension(500, 200);

	public static void main(String[] args) {
		JFrame application = new JFrame();
		application.setTitle("Sistema");
		application.setSize(1000, 500);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Barra de Menu
		JMenuBar jmb = new JMenuBar();

		//Menus dos Módulos
		JMenu consultaMenu = new JMenu("Consulta");
		JMenu triagemMenu = new JMenu("Triagem");
		JMenu pacienteMenu = new JMenu("Paciente");
		JMenu medicoMenu = new JMenu("Médico");
		JMenu enfermeiroMenu = new JMenu("Enfermeiro");
		JMenu convenioMenu = new JMenu("Convênio");
		JMenu medicamentoMenu = new JMenu("Medicamento");
		JMenu salaMenu = new JMenu("Sala");
		
		//Itens do Menu Sala
		JMenuItem saveSalaMenuItem = new JMenuItem("Cadastrar");
		JMenuItem updateSalaMenuItem = new JMenuItem("Editar");
		JMenuItem deleteSalaMenuItem = new JMenuItem("Excluir");
		JMenuItem searchbyNumeroSalaMenuItem = new JMenuItem("Buscar por Número");
		salaMenu.add(saveSalaMenuItem);
		salaMenu.add(updateSalaMenuItem);
		salaMenu.add(deleteSalaMenuItem);
		salaMenu.add(searchbyNumeroSalaMenuItem);
		
		//Adicionando Itens a barra de Menu		
		jmb.add(consultaMenu);
		jmb.add(triagemMenu);
		jmb.add(pacienteMenu);
		jmb.add(medicoMenu);
		jmb.add(enfermeiroMenu);
		jmb.add(convenioMenu);
		jmb.add(medicamentoMenu);
		jmb.add(salaMenu);
		
		saveSalaMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CadastroSalaDialog dialogo = new CadastroSalaDialog(application);
				dialogo.setVisible(true);
			}
		});
		
		application.setJMenuBar(jmb);
		application.setVisible(true);
	}

}
