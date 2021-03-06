package spacemans_adventures_interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class button_panel extends JPanel { // Clase para la creación de un panel auxiliar de botones (herencia JPanel)
										   // Implementamos una ActionListener para dar eventos a los botones.
	
//-----> DECLARACIÓN DE LOS ATRIBUTOS DE LA CLASE.

	private JButton button_spaceman;
	private JButton button_objetive;
	private JButton button_body_to_body;
	private JButton button_distance;
	private JButton button_reset_characters;
	private JButton button_reset_path;
	private JCheckBox checkbox_path;
	private JButton button_back_menu;
	private JButton button_exit;
	private int map_selected;
	
//-----> DECLARACIÓN DE LOS MÉTODOS DE LA CLASE.
	
	public button_panel() { // Constructor.
		
		// Inicialización de los atributos.
		button_spaceman = new JButton();
		button_objetive = new JButton();
		button_body_to_body = new JButton(); 
		button_distance = new JButton();
		button_reset_characters = new JButton("REINICIAR PERSONAJES"); 
		button_reset_path = new JButton("REINICIAR CAMINO"); 
		checkbox_path = new JCheckBox("MOSTRAR CAMINO MÍNIMO");
		button_back_menu = new JButton("VOLVER AL MENÚ"); 
		button_exit = new JButton("SALIR"); 
		
		this.add_characteristics(); // Llamada al método add_characteristics().
		this.add_components(); // Llamada al método add_components().
		this.add_Layout(); // Llamada al método add_Layout().
		this.edit_components(); // Llamada al método edit_components().
		this.add_tooltip(); // Llamada al método add_tooltip().
		this.setVisible(false); // Inicialmente nuestro panel de botones no se mostrará.
	}
	
	public void add_characteristics() { // Método para editar las carácteristicas de nuestro panel de botones.
		
		this.setLayout(null); // Desactivamos el gestor de Layout para hacerlo manualmente.
		this.setBounds(0,700,700,52); // Establecemos unas coordenadas y un tamaño a nuestro buttonpanel (Layout desactivado en el mainframe).
		this.setBackground(new Color(182,180,180)); // Añadimos un color gris oscuro (puntos RGB) a nuestro panel.
	}	
	
	public void add_components() { // Método para añadir los componentes a nuestro panel de botones.
		
		this.add(button_spaceman);
		this.add(button_objetive); 
		this.add(button_body_to_body);
		this.add(button_distance);
		this.add(button_reset_path);
		this.add(button_reset_characters);
		this.add(checkbox_path);
		this.add(button_back_menu);
		this.add(button_exit);
	}
	
	public void add_Layout() { // Método para gestionar manualmente el Layout.
		
		button_spaceman.setBounds(20,2,60,45);
		button_objetive.setBounds(82,2,60,45);
		button_reset_characters.setBounds(150,5,160,20);
		button_reset_path.setBounds(150,27,160,20);
		button_body_to_body.setBounds(340,0,60,50);
		button_distance.setBounds(400,0,60,50);
		checkbox_path.setBounds(492,5,181,18);
		button_back_menu.setBounds(499,25,100,18);
		button_exit.setBounds(602,25,78,18);
	}
	
	public void edit_components() { // Método para editar el formato de los botones.
		
		button_spaceman.setIcon(new ImageIcon("images/elements/buttons/normal/button_spaceman.png"));
		button_objetive.setIcon(new ImageIcon("images/elements/buttons/normal/button_ironmonger.png"));
		button_body_to_body.setIcon(new ImageIcon("images/elements/buttons/normal/button_body_to_body.png"));
		button_distance.setIcon(new ImageIcon("images/elements/buttons/normal/button_distance.png"));
		button_reset_characters.setFont(new Font("Tahoma",Font.BOLD,11));
		button_reset_characters.setForeground(Color.black);
		button_reset_path.setFont(new Font("Tahoma",Font.BOLD,11));
		button_reset_path.setForeground(Color.black);
		checkbox_path.setFont(new Font("Tahoma",Font.BOLD,10));
		checkbox_path.setForeground(Color.black);
		button_back_menu.setFont(new Font("Tahoma",Font.BOLD,10));
		button_back_menu.setForeground(Color.black);
		button_exit.setFont(new Font("Tahoma",Font.BOLD,13));
		button_exit.setForeground(new Color(185,4,4));
	}
	
	public void add_tooltip() { // Método para añadir tooltip en los botones.
		
		button_spaceman.setToolTipText("Colocar al Spaceman en el mapa");
		button_objetive.setToolTipText("Colocar al objetivo en el mapa");
		button_body_to_body.setToolTipText("Iniciar un ataque cuerpo a cuerpo");
		button_distance.setToolTipText("Iniciar un ataque a distancia");
		button_reset_path.setToolTipText("Reiniciar el mismo camino mínimo");
		button_reset_characters.setToolTipText("Eliminar los personajes del juego");
		button_back_menu.setToolTipText("Crear un nuevo mapa de juego");
	}
	
	//-----> SOBRECARGA DEL MÉTODO PAINT.
	
	@Override
	public void paint(Graphics g) { // Sobrecargamos el método paint de nuestro panel para añadir una imagen de fondo al mismo.
		
		g.drawImage(new ImageIcon("images/backgrounds/background_buttonpanel.png").getImage(),0,0,720,52,null); 
		this.setOpaque(false); // Indicamos a nuestro panel que no muestre el fondo por defecto.
		super.paint(g); // Indicamos al panel que siga mostrando el resto de elementos por defecto.
	}
	
	//-----> MÉTODOS GETTERS AND SETTERS.

	public JButton getButton_spaceman() {
		return button_spaceman;
	}

	public void setButton_spaceman(JButton button_spaceman) {
		this.button_spaceman = button_spaceman;
	}

	public JButton getButton_objetive() {
		return button_objetive;
	}

	public void setButton_objetive(JButton button_objetive) {
		this.button_objetive = button_objetive;
	}

	public JButton getButton_body_to_body() {
		return button_body_to_body;
	}

	public void setButton_body_to_body(JButton button_body_to_body) {
		this.button_body_to_body = button_body_to_body;
	}
	
	public JButton getButton_distance() {
		return button_distance;
	}

	public void setButton_distance(JButton button_distance) {
		this.button_distance = button_distance;
	}

	public JButton getButton_reset_characters() {
		return button_reset_characters;
	}
	
	public void setButton_reset_characters(JButton button_reset_characters) {
		this.button_reset_characters = button_reset_characters;
	}

	public JButton getButton_reset_path() {
		return button_reset_path;
	}

	public void setButton_reset_path(JButton button_reset_path) {
		this.button_reset_path = button_reset_path;
	}

	public JCheckBox getCheckbox_path() {
		return checkbox_path;
	}

	public void setCheckbox_path(JCheckBox checkbox_path) {
		this.checkbox_path = checkbox_path;
	}

	public JButton getButton_back_menu() {
		return button_back_menu;
	}

	public void setButton_back_menu(JButton button_back_menu) {
		this.button_back_menu = button_back_menu;
	}

	public JButton getButton_exit() {
		return button_exit;
	}

	public void setButton_exit(JButton button_exit) {
		this.button_exit = button_exit;
	}

	public int getMap_selected() {
		return map_selected;
	}

	public void setMap_selected(int map_selected) {
		this.map_selected = map_selected;
	}
}

