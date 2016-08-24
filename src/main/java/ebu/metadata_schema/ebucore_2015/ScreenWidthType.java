
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour screenWidthType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="screenWidthType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
 *       &lt;attribute name="azimuth" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="X" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screenWidthType", propOrder = {
    "value"
})
public class ScreenWidthType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlValue
    protected float value;
    @XmlAttribute(name = "azimuth")
    protected java.lang.Float azimuth;
    @XmlAttribute(name = "X")
    protected java.lang.Float x;

    /**
     * Obtient la valeur de la propriété value.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété azimuth.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getAzimuth() {
        return azimuth;
    }

    /**
     * Définit la valeur de la propriété azimuth.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setAzimuth(java.lang.Float value) {
        this.azimuth = value;
    }

    /**
     * Obtient la valeur de la propriété x.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getX() {
        return x;
    }

    /**
     * Définit la valeur de la propriété x.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setX(java.lang.Float value) {
        this.x = value;
    }

}
