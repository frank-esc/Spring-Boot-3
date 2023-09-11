package med.voll.api.domain.paciente;

import med.voll.api.domain.direccion.Direccion;

public record DatosDetallesPaciente(Long id, String nombre, String email, String documentoIdentidad, String telefono,
                                    Direccion direccion) {
    public DatosDetallesPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNombre(), paciente.getEmail(), paciente.getDocumentoIdentidad(), paciente.getTelefono(), paciente.getDireccion());
    }
}
