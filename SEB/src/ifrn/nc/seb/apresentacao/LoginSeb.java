package ifrn.nc.seb.apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LoginSeb extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfLogin;
	private JTextField tfSenha;
	private JButton btnEntrar;
	private JButton btnCancelar;
	private JLabel lblEsqueceuSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoginSeb dialog = new LoginSeb();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoginSeb() {
		setTitle("Login do Funcionário");
		setBounds(100, 100, 285, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		tfLogin = new JTextField();
		tfLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		tfSenha = new JTextField();
		tfSenha.setColumns(10);
		
		lblEsqueceuSenha = new JLabel("Esqueceu sua senha?");
		lblEsqueceuSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEsqueceuSenha.setForeground(Color.BLUE);
		lblEsqueceuSenha.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent evt) {
				// TODO Auto-generated method stub
			}

			public void mouseEntered(MouseEvent evt) {
				lblEsqueceuSenha.setForeground(Color.red);
			}

			public void mouseExited(MouseEvent evt) {
				lblEsqueceuSenha.setForeground(Color.blue);
			}
			
		});
		
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(tfLogin, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
							.addComponent(lblLogin)
							.addComponent(lblSenha)
							.addComponent(tfSenha))
						.addComponent(lblEsqueceuSenha))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLogin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tfLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblSenha)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tfSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblEsqueceuSenha)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnEntrar = new JButton("Entrar");
				btnEntrar.setActionCommand("OK");
				getRootPane().setDefaultButton(btnEntrar);
			}
			{
				btnCancelar = new JButton("Cancelar");
				btnCancelar.setActionCommand("Cancel");
			}
			GroupLayout gl_buttonPane = new GroupLayout(buttonPane);
			gl_buttonPane.setHorizontalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addGap(59)
						.addComponent(btnEntrar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addGap(23))
			);
			gl_buttonPane.setVerticalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addGap(5)
						.addGroup(gl_buttonPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnEntrar)
							.addComponent(btnCancelar))
						.addContainerGap())
			);
			buttonPane.setLayout(gl_buttonPane);
		}
	}
}
