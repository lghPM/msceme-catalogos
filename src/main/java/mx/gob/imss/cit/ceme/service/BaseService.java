/**
 * 
 */
package mx.gob.imss.cit.ceme.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import mx.gob.imss.cit.ceme.model.entitydto.DelegacionDto;
import mx.gob.imss.cit.ceme.model.projection.CatalogoView;
import mx.gob.imss.cit.ceme.persistence.Delegacion;

/**
 * 
 */
public interface BaseService {

	// evitar uso de generico  <?> por issue sonar
	ResponseEntity<List<CatalogoView>> getBasePrueba(Integer id);

	ResponseEntity<List<DelegacionDto>> getBasePruebaDto();

	ResponseEntity<List<Delegacion>> getBasePruebaEntidad();
	
	ResponseEntity<List<DelegacionDto>> getBasePruebaMapStruct();
}
