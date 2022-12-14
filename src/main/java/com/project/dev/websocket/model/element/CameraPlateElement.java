/*
 * @fileoverview    {CameraPlateElement} se encarga de realizar tareas específicas.
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
package com.project.dev.websocket.model.element;

import lombok.Builder;
import lombok.Data;

/**
 * TODO: Definición de {@code CameraPlateElement}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
//@AllArgsConstructor
//@Builder
@Data
//@NoArgsConstructor
public class CameraPlateElement extends GenericElement {

    // Non static block.
    {
        this.type = TYPE_CAMERA_PLATE;
    }
    private String txtPlate;
    private String imgPlate;

    /**
     * TODO: Definición de {@code CameraPlateElement}.
     *
     * @param sender
     * @param imgPlate
     * @param txtPlate
     */
    @Builder
    public CameraPlateElement(String sender, String txtPlate, String imgPlate) {
        super(sender);
        this.txtPlate = txtPlate;
        this.imgPlate = imgPlate;
    }

    /**
     * TODO: Definición de {@code getPrintTextTxtPlate}.
     *
     * @return
     */
    protected String getPrintTextTxtPlate() {
        return (txtPlate == null) ? "" : txtPlate;
    }

    /**
     * TODO: Definición de {@code getPrintTextImgPlate}.
     *
     * @return
     */
    protected String getPrintTextImgPlate() {
        return (imgPlate == null) ? "" : (imgPlate.length() > 12) ? "%image%" : imgPlate;
    }

    /**
     * Obtiene el valor en {String} del objeto actual.
     *
     * @return un {String} con la representación del objeto.
     */
    @Override
    public String toString() {
        String text = "";
        text += "{" + "'" + getPrintTextTxtPlate() + "'";
        text += ", " + "'" + getPrintTextImgPlate() + "'";
        if (recoveryDate != null)
            text += ", " + "'" + getPrintTextRecoveryDate() + "'";
        text += "}";
        return text;
    }

}
