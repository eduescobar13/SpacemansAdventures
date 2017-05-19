package spacemans_adventures_interface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class background_start_panel extends JPanel { // Método para incluir un panel detrás del initialpanel.
	
//-----> DECLARACIÓN DE LOS ATRIBUTOS DE LA CLASE.
	
	private Dimension dimension_panel;
	private start_panel startpanel;
	
//-----> DECLARACIÓN DE LOS MÉTODOS DE LA CLASE.

	public background_start_panel() { // Constructor.
		
		// Inicialización de los atributos.
		dimension_panel = new Dimension(700,752);
		startpanel = new start_panel(dimension_panel);
		
		this.setLayout(null); // Desactivamos el Layout del panel para gestionarlo manualmente.
		this.add_characteristic(); // Llamada al método
		this.add_components();
	}

	private void add_characteristic() { // Método para establecer las características del panel de fondo.

		this.setSize(dimension_panel);
		this.setBackground(Color.black);
	}
	
	private void add_components() { // Método para añadir los componentes de nuestro background_start_panel.
		
		this.add(startpanel); // Añadimos nuestro panel inicial al mainpanel.
	}
	
	//-----> SOBRECARGA DEL MÉTODO PAINT.
	
	@Override
	public void paint(Graphics g) { // Sobrecargamos el método paint de nuestro panel para añadir una imagen de fondo al mismo.
		
		g.drawImage(new ImageIcon("images/backgrounds/background_backgroundpanel.gif").getImage(),0,0,750,752,this); 
		this.setOpaque(false); // Indicamos a nuestro panel que no muestre el fondo por defecto.
		super.paint(g); // Indicamos al panel que siga mostrando el resto de elementos por defecto.
	}
	
	//-----> MÉTODOS SETTER AND GETTERS.
	
	public start_panel getStartpanel() {
		return startpanel;
	}

	public void setStartpanel(start_panel startpanel) {
		this.startpanel = startpanel;
	}

}
