/*
 * @fileoverview    {MapeoConfiguracion} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.backend.servicio.mapeo;

import com.project.dev.backend.dominio.Configuracion;
import com.project.dev.backend.servicio.dto.ConfiguracionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * TODO: Definición de {@code MapeoConfiguracion}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@Mapper(componentModel = "spring") //, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapeoConfiguracion extends MapeoEntidadesGenerico<ConfiguracionDTO, Configuracion> {

    @Mapping(source = "intIdConfiguracion", target = "intIdConfiguracion")
    //TODO: deben ser el campo clave de la base de datos ( la llave )
    @Override
    public ConfiguracionDTO obtenerDto(Configuracion entidad);

    @Mapping(source = "intIdConfiguracion", target = "intIdConfiguracion")
    @Override
    public Configuracion obtenerEntidad(ConfiguracionDTO entidadDTO);

    default Configuracion desdeId(String intId) {
        if (intId == null) {
            return null;
        }
        Configuracion entidad = new Configuracion();
        entidad.setIntIdConfiguracion(Long.parseLong(intId));
        return entidad;
    }
}
