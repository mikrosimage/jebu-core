
package ebu.metadata_schema.ebucore_2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for jumpPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jumpPositionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>boolean">
 *       &lt;attribute name="interpolationLength" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jumpPositionType", propOrder = {
    "value"
})
public class JumpPositionType {

    @XmlValue
    protected boolean value;
    @XmlAttribute(name = "interpolationLength")
    protected java.lang.Float interpolationLength;

    /**
     * Gets the value of the value property.
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

    /**
     * Gets the value of the interpolationLength property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getInterpolationLength() {
        return interpolationLength;
    }

    /**
     * Sets the value of the interpolationLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setInterpolationLength(java.lang.Float value) {
        this.interpolationLength = value;
    }

}
