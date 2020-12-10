package com.clearminds.cbe.dtos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final String FORMATO_COMPLETO = "yyyy-MM-dd HH:mm:ss";

	public static String obtenerFecha(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_COMPLETO);
		String fechaF = sdf.format(date);
		return fechaF;
	}
}
