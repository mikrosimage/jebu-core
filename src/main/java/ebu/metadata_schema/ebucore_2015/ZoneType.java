
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour zoneType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="zoneType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="minX" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxX" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="minY" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxY" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="minZ" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxZ" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zoneType", propOrder = {
    "value"
})
public class ZoneType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlValue
    protected java.lang.String value;
    @XmlAttribute(name = "minX")
    protected java.lang.Float minX;
    @XmlAttribute(name = "maxX")
    protected java.lang.Float maxX;
    @XmlAttribute(name = "minY")
    protected java.lang.Float minY;
    @XmlAttribute(name = "maxY")
    protected java.lang.Float maxY;
    @XmlAttribute(name = "minZ")
    protected java.lang.Float minZ;
    @XmlAttribute(name = "maxZ")
    protected java.lang.Float maxZ;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété minX.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getMinX() {
        return minX;
    }

    /**
     * Définit la valeur de la propriété minX.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setMinX(java.lang.Float value) {
        this.minX = value;
    }

    /**
     * Obtient la valeur de la propriété maxX.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getMaxX() {
        return maxX;
    }

    /**
     * Définit la valeur de la propriété maxX.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setMaxX(java.lang.Float value) {
        this.maxX = value;
    }

    /**
     * Obtient la valeur de la propriété minY.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getMinY() {
        return minY;
    }

    /**
     * Définit la valeur de la propriété minY.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setMinY(java.lang.Float value) {
        this.minY = value;
    }

    /**
     * Obtient la valeur de la propriété maxY.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getMaxY() {
        return maxY;
    }

    /**
     * Définit la valeur de la propriété maxY.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setMaxY(java.lang.Float value) {
        this.maxY = value;
    }

    /**
     * Obtient la valeur de la propriété minZ.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getMinZ() {
        return minZ;
    }

    /**
     * Définit la valeur de la propriété minZ.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setMinZ(java.lang.Float value) {
        this.minZ = value;
    }

    /**
     * Obtient la valeur de la propriété maxZ.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getMaxZ() {
        return maxZ;
    }

    /**
     * Définit la valeur de la propriété maxZ.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setMaxZ(java.lang.Float value) {
        this.maxZ = value;
    }

}
