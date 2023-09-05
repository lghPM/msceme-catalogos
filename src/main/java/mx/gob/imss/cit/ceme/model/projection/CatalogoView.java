package mx.gob.imss.cit.ceme.model.projection;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author
 *
 */
@JsonPropertyOrder({ "id", "descripcion" })
public interface CatalogoView {

	Integer getId();

	String getDescripcion();

}