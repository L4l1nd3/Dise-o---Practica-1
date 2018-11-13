package Players;
//Se deber� emplear un patr�n Abstract Factory para crear los diferentes
//enemigos. Existir�n varios tipos de enemigos, comunes a todos los mundos/escenarios pero
//adaptados a cada mundo/escenario

//Habr� distintas categor�as de enemigos (guerreros, hechiceros, mutantes�), cada uno
//con sus caracter�sticas propias.
//Las mismas categor�as aplican en todos los mundos/escenarios, pero en cada uno de
//dichos mundos cada categor�a de enemigo presenta caracter�sticas diferentes (por
//ejemplo, los brujos de la selva podr�an hacer vuelos cortos y los brujos del mar vuelos
//largos).

public abstract class Enemy extends Personaje {
	
	Enemy(int intelecto, int fuerza, int HP, int mana, String nombre) {
		super(intelecto, fuerza, HP, mana, nombre);
		// TODO Auto-generated constructor stub
	}

}
