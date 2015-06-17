package ifrn.nc.seb.apresentacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import java.awt.Color;

/**
 * Esta classe será utilizada para iniciar a aplicação ...  
 */
public class Seb {

	private JFrame frmSistemaDeEmprstimo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seb window = new Seb();
					window.frmSistemaDeEmprstimo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Seb() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSistemaDeEmprstimo = new JFrame();
		frmSistemaDeEmprstimo.setTitle("Sistema de Empr\u00E9stimo para Biblioteca (SEB)");
		frmSistemaDeEmprstimo.setBounds(100, 100, 450, 300);
		frmSistemaDeEmprstimo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		frmSistemaDeEmprstimo.getContentPane().add(desktopPane, BorderLayout.CENTER);
	}

}
