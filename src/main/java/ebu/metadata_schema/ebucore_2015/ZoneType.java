
package ebu.metadata_schema.ebucore_2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for zoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
public class ZoneType {

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
     * Gets the value of the value property.
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
     * Sets the value of the value property.
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
     * Gets the value of the minX property.
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
     * Sets the value of the minX property.
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
     * Gets the value of the maxX property.
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
     * Sets the value of the maxX property.
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
     * Gets the value of the minY property.
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
     * Sets the value of the minY property.
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
     * Gets the value of the maxY property.
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
     * Sets the value of the maxY property.
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
     * Gets the value of the minZ property.
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
     * Sets the value of the minZ property.
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
     * Gets the value of the maxZ property.
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
     * Sets the value of the maxZ property.
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
