package mx.gob.imss.cit.ceme.model.entitydto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import mx.gob.imss.cit.ceme.persistence.Delegacion;

/**
 * A DTO for the {@link Delegacion} entity
 */
@Data
public class DelegacionDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6662504180308266072L;
	private Integer id;
	private String desDelegacion;
	private String refAbreviacion;
	private Date fecAlta;
	private Date fecBaja;
	private Date fecModifica;
	private String cveUsuarioAlta;
	private String cveUsuarioBaja;
	private String cveUsuarioModifica;
}