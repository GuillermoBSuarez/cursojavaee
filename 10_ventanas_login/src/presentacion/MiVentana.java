package presentacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MiVentana extends JFrame{
	public MiVentana(String titulo) {
		super(titulo);
		//cambiar comportamiento botón de cierre
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//establecer tamaño y posición y hacerla visible
		setBounds(100, 50, 600, 400);
		getContentPane().setBackground(Color.YELLOW);
		inicializarComponentes();
		setVisible(true);
	}
	//incluir un constructor que permita establecer título
	//posición y tamaño de la ventana
	public MiVentana(String titulo, int x, int y, int w, int h) {
		super(titulo);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(x,y,w,h);
		inicializarComponentes();
		setVisible(true);
	}
	
	
	void inicializarComponentes() {
		setLayout(null);
		JLabel lbl1=new JLabel("Usuario: ");
		JLabel lbl2=new JLabel("Password: ");
		JTextField txtUsuario=new JTextField();
		JTextField txtPassword=new JTextField();
		JButton btnEntrar=new JButton("Entrar");
		/////////////////////////
		lbl1.setBounds(150, 100, 120, 40);
		lbl2.setBounds(150, 170, 120, 40);
		txtUsuario.setBounds(350, 100, 120, 40);
		txtPassword.setBounds(350, 170, 120, 40);
		btnEntrar.setBounds(250, 230, 150, 30);
		///////////////////////////
		add(lbl1);add(lbl2);
		add(txtUsuario);add(txtPassword);
		add(btnEntrar);
		// Crear clases de gestión de eventos
		ActionListener listener = new ActionListener() {
			/* ActionListener es una interfaz. Al crear un objeto con new de esa interfaz estamos creando
			una clase anónima que la implementa. La clase es el código entre llaves. */
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtUsuario.getText().equals("admin") && txtPassword.getText().equals("pwd")) {
					JOptionPane.showMessageDialog(MiVentana.this, "Correcto");
				} else {
					JOptionPane.showMessageDialog(MiVentana.this, "Incorrecto");
				}
			}
		};
		// Asociamos el botón con el objeto que implementa la interfaz.
		btnEntrar.addActionListener(listener);
	}
}