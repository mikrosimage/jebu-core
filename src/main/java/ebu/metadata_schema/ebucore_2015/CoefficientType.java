
package ebu.metadata_schema.ebucore_2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for coefficientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coefficientType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
 *       &lt;attribute name="gain" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="gainVar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="phase" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="phaseVar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coefficientType", propOrder = {
    "value"
})
public class CoefficientType {

    @XmlValue
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object value;
    @XmlAttribute(name = "gain")
    protected java.lang.Float gain;
    @XmlAttribute(name = "gainVar")
    protected java.lang.String gainVar;
    @XmlAttribute(name = "phase")
    protected java.lang.Float phase;
    @XmlAttribute(name = "phaseVar")
    protected java.lang.String phaseVar;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Gets the value of the gain property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getGain() {
        return gain;
    }

    /**
     * Sets the value of the gain property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setGain(java.lang.Float value) {
        this.gain = value;
    }

    /**
     * Gets the value of the gainVar property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getGainVar() {
        return gainVar;
    }

    /**
     * Sets the value of the gainVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setGainVar(java.lang.String value) {
        this.gainVar = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setPhase(java.lang.Float value) {
        this.phase = value;
    }

    /**
     * Gets the value of the phaseVar property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPhaseVar() {
        return phaseVar;
    }

    /**
     * Sets the value of the phaseVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPhaseVar(java.lang.String value) {
        this.phaseVar = value;
    }

}
