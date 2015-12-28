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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for audioTrackUIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audioTrackUIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audioMXFLookUp" type="{urn:ebu:metadata-schema:ebuCore_2014}audioMXFLookUpType" minOccurs="0"/>
 *         &lt;element name="audioTrackFormatIDRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="audioPackFormatIDRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UID" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="sampleRate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="bitDepth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioTrackUIDType", propOrder = {
    "audioMXFLookUp",
    "audioTrackFormatIDRef",
    "audioPackFormatIDRef"
})
public class AudioTrackUIDType implements Comparable<AudioTrackUIDType>{
	
	/**
	 * Prefix for this type EBUCore String ID
	 */
	public static final java.lang.String PREFIX = "ATU_";

    protected AudioMXFLookUpType audioMXFLookUp;
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String audioTrackFormatIDRef;
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String audioPackFormatIDRef;
    @XmlAttribute(name = "UID")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String uid;
    @XmlAttribute(name = "sampleRate")
    protected Integer sampleRate;
    @XmlAttribute(name = "bitDepth")
    protected Integer bitDepth;

    @Override
    public int compareTo(AudioTrackUIDType other) {
    	return other.getUID().compareTo(getUID());
    }
    
    @Override
    public java.lang.String toString() {
    	return getUID();
    }
    
    /**
     * Gets the value of the audioMXFLookUp property.
     * 
     * @return
     *     possible object is
     *     {@link AudioMXFLookUpType }
     *     
     */
    public AudioMXFLookUpType getAudioMXFLookUp() {
        return audioMXFLookUp;
    }

    /**
     * Sets the value of the audioMXFLookUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioMXFLookUpType }
     *     
     */
    public void setAudioMXFLookUp(AudioMXFLookUpType value) {
        this.audioMXFLookUp = value;
    }

    /**
     * Gets the value of the audioTrackFormatIDRef property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioTrackFormatIDRef() {
        return audioTrackFormatIDRef;
    }

    /**
     * Sets the value of the audioTrackFormatIDRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioTrackFormatIDRef(java.lang.String value) {
        this.audioTrackFormatIDRef = value;
    }

    /**
     * Gets the value of the audioPackFormatIDRef property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioPackFormatIDRef() {
        return audioPackFormatIDRef;
    }

    /**
     * Sets the value of the audioPackFormatIDRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioPackFormatIDRef(java.lang.String value) {
        this.audioPackFormatIDRef = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setUID(java.lang.String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the sampleRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSampleRate() {
        return sampleRate;
    }

    /**
     * Sets the value of the sampleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSampleRate(Integer value) {
        this.sampleRate = value;
    }

    /**
     * Gets the value of the bitDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBitDepth() {
        return bitDepth;
    }

    /**
     * Sets the value of the bitDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBitDepth(Integer value) {
        this.bitDepth = value;
    }

}