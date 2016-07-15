
package ebu.metadata_schema.ebucore_2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 *  A set of loudness parameters 
 * 
 * <p>Java class for loudnessMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loudnessMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="integratedLoudness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="loudnessRange" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxTruePeak" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxMomentary" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxShortTerm" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="dialogLoudness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="loudnessMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loudnessRecType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loudnessCorrectionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loudnessMetadataType", propOrder = {
    "integratedLoudness",
    "loudnessRange",
    "maxTruePeak",
    "maxMomentary",
    "maxShortTerm",
    "dialogLoudness"
})
public class LoudnessMetadataType {

    protected java.lang.Float integratedLoudness;
    protected java.lang.Float loudnessRange;
    protected java.lang.Float maxTruePeak;
    protected java.lang.Float maxMomentary;
    protected java.lang.Float maxShortTerm;
    protected java.lang.Float dialogLoudness;
    @XmlAttribute(name = "loudnessMethod")
    protected java.lang.String loudnessMethod;
    @XmlAttribute(name = "loudnessRecType")
    protected java.lang.String loudnessRecType;
    @XmlAttribute(name = "loudnessCorrectionType")
    protected java.lang.String loudnessCorrectionType;

    /**
     * Gets the value of the integratedLoudness property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getIntegratedLoudness() {
        return integratedLoudness;
    }

    /**
     * Sets the value of the integratedLoudness property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setIntegratedLoudness(java.lang.Float value) {
        this.integratedLoudness = value;
    }

    /**
     * Gets the value of the loudnessRange property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getLoudnessRange() {
        return loudnessRange;
    }

    /**
     * Sets the value of the loudnessRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setLoudnessRange(java.lang.Float value) {
        this.loudnessRange = value;
    }

    /**
     * Gets the value of the maxTruePeak property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getMaxTruePeak() {
        return maxTruePeak;
    }

    /**
     * Sets the value of the maxTruePeak property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setMaxTruePeak(java.lang.Float value) {
        this.maxTruePeak = value;
    }

    /**
     * Gets the value of the maxMomentary property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getMaxMomentary() {
        return maxMomentary;
    }

    /**
     * Sets the value of the maxMomentary property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setMaxMomentary(java.lang.Float value) {
        this.maxMomentary = value;
    }

    /**
     * Gets the value of the maxShortTerm property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getMaxShortTerm() {
        return maxShortTerm;
    }

    /**
     * Sets the value of the maxShortTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setMaxShortTerm(java.lang.Float value) {
        this.maxShortTerm = value;
    }

    /**
     * Gets the value of the dialogLoudness property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getDialogLoudness() {
        return dialogLoudness;
    }

    /**
     * Sets the value of the dialogLoudness property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setDialogLoudness(java.lang.Float value) {
        this.dialogLoudness = value;
    }

    /**
     * Gets the value of the loudnessMethod property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLoudnessMethod() {
        return loudnessMethod;
    }

    /**
     * Sets the value of the loudnessMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLoudnessMethod(java.lang.String value) {
        this.loudnessMethod = value;
    }

    /**
     * Gets the value of the loudnessRecType property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLoudnessRecType() {
        return loudnessRecType;
    }

    /**
     * Sets the value of the loudnessRecType property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLoudnessRecType(java.lang.String value) {
        this.loudnessRecType = value;
    }

    /**
     * Gets the value of the loudnessCorrectionType property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLoudnessCorrectionType() {
        return loudnessCorrectionType;
    }

    /**
     * Sets the value of the loudnessCorrectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLoudnessCorrectionType(java.lang.String value) {
        this.loudnessCorrectionType = value;
    }

}
