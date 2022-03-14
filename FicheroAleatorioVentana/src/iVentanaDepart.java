import java.awt.event.ActionEvent;

public interface iVentanaDepart {

	void modificacion(String deparError, String NOEXISTE_DEPART);

	void borrar(String deparError, String NOEXISTE_DEPART);

	void alta(String deparError);

	void consultas(ActionEvent e);

}