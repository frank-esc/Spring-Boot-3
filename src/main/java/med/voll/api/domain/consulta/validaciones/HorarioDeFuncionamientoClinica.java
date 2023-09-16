package med.voll.api.domain.consulta.validaciones;

import jakarta.validation.ValidationException;
import med.voll.api.domain.consulta.DatosAgendarConsulta;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;

@Component
public class HorarioDeFuncionamientoClinica implements ValidadorDeConsultas{
    public void validar(DatosAgendarConsulta datos){

        var domingo = DayOfWeek.SUNDAY.equals(datos.fecha().getDayOfWeek());

        var antesDeHoraApertura= datos.fecha().getHour()<7;
        var despuesDeCierre= datos.fecha().getHour()>19;
        if (domingo || antesDeHoraApertura || despuesDeCierre) {
            throw new ValidationException("El horario de atencion de la clinica es de lunes a sabado de 7:00 a 19:00 horas");
        }

    }
}
