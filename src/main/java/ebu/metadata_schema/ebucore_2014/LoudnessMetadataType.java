//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.23 at 05:29:32 PM CEST 
//


package ebu.metadata_schema.ebucore_2014;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;/sequence>
 *       &lt;attribute name="loudnessMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "maxShortTerm"
})
public class LoudnessMetadataType {

	@XmlElement(nillable=false)
    protected java.lang.Float integratedLoudness;
	@XmlElement(nillable=false)
    protected java.lang.Float loudnessRange;
	@XmlElement(nillable=false)
    protected java.lang.Float maxTruePeak;
	@XmlElement(nillable=false)
    protected java.lang.Float maxMomentary;
	@XmlElement(nillable=false)
    protected java.lang.Float maxShortTerm;
    @XmlAttribute(name = "loudnessMethod")
    protected java.lang.String loudnessMethod;

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

}