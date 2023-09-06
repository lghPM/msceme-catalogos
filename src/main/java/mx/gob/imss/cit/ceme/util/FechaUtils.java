/**
 * FolioPulssarUtils.java
 * Fecha de creaci�n: 06/02/2019, 12:26:21
 *
 * Copyright (c) 2019 Procesar S A de C V. 
 * Todos los derechos reservados.
 *
 * Este software es informaci�n confidencial, propiedad del
 * Procesar S A de C V. Esta informaci�n confidencial
 * no deber� ser divulgada y solo se podr� utilizar de acuerdo
 * a los t�rminos que determine la propia empresa.
 */
package mx.gob.imss.cit.ceme.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import lombok.extern.log4j.Log4j2;

/**
 * Utilerias Fecha
 * 
 * 
 */
@Log4j2
public class FechaUtils {

	public static Date convertirCadenaFecha(String fecha, String formato) {
		try {
			SimpleDateFormat formatoFecha = new SimpleDateFormat(formato);
			return formatoFecha.parse(fecha);
		} catch (Exception e) {
			log.error("error convertirCadenaFecha", e);
			return null;
		}
	}

	public static String convertirFechaCadena(Date fecha, String formato) {
		String salida = "";
		if (fecha == null || StringUtils.isEmpty(formato)) {
			salida = "";
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat(formato);
			salida = sdf.format(fecha);
		}
		return salida;
	}

}
