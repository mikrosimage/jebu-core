
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour positionInteractionRangeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="positionInteractionRangeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
 *       &lt;attribute name="coordinate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bound" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionInteractionRangeType", propOrder = {
    "value"
})
public class PositionInteractionRangeType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlValue
    protected float value;
    @XmlAttribute(name = "coordinate")
    protected java.lang.String coordinate;
    @XmlAttribute(name = "bound")
    protected java.lang.String bound;

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
     * Obtient la valeur de la propriété coordinate.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCoordinate() {
        return coordinate;
    }

    /**
     * Définit la valeur de la propriété coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCoordinate(java.lang.String value) {
        this.coordinate = value;
    }

    /**
     * Obtient la valeur de la propriété bound.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getBound() {
        return bound;
    }

    /**
     * Définit la valeur de la propriété bound.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setBound(java.lang.String value) {
        this.bound = value;
    }

}
