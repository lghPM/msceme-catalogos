/**
 * 
 */
package mx.gob.imss.cit.ceme.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import mx.gob.imss.cit.ceme.model.entitydto.DelegacionDto;
import mx.gob.imss.cit.ceme.model.projection.CatalogoView;
import mx.gob.imss.cit.ceme.persistence.Delegacion;
import mx.gob.imss.cit.ceme.service.BaseService;

/**
 * 
 */
@Log4j2
@RestController
@RequestMapping("/base")
@RequiredArgsConstructor
public class BaseController {

	// usar DI por constructor
	private final BaseService baseService;

	// evitar uso de generico <?> por issue sonar
	@GetMapping("/hola")
	public ResponseEntity<List<CatalogoView>> prueba(@RequestParam(required = false) Integer test) {
		log.info("prueba param{} ", test);
		return baseService.getBasePrueba(1);
	}

	@GetMapping("/hola2")
	public ResponseEntity<List<DelegacionDto>> pruebaDto() {
		log.info("prueba pruebaDto");
		return baseService.getBasePruebaDto();
	}

	@GetMapping("/hola3")
	public ResponseEntity<List<Delegacion>> pruebaEntidad() {
		log.info("prueba pruebaEntidad");
		return baseService.getBasePruebaEntidad();
	}

	@GetMapping("/hola4")
	public ResponseEntity<List<DelegacionDto>> pruebaMapStruct() {
		log.info("prueba MapStruct");
		return baseService.getBasePruebaMapStruct();
	}
}
