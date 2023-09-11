package med.voll.api.domain.paciente;

import med.voll.api.domain.direccion.Direccion;

public record DatosListadoPaciente(Long id, String nombre, String email, String documentoIdentidad) {
    public DatosListadoPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNombre(), paciente.getEmail(), paciente.getDocumentoIdentidad());
    }
}
