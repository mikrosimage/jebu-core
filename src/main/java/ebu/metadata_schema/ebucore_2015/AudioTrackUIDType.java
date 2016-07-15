
package ebu.metadata_schema.ebucore_2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="audioMXFLookUp" type="{urn:ebu:metadata-schema:ebuCore_2015}audioMXFLookUpType" minOccurs="0"/>
 *         &lt;element name="audioTrackFormatIDRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="audioPackFormatIDRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UID" type="{http://www.w3.org/2001/XMLSchema}ID" />
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
public class AudioTrackUIDType {

    protected AudioMXFLookUpType audioMXFLookUp;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object audioTrackFormatIDRef;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object audioPackFormatIDRef;
    @XmlAttribute(name = "UID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String uid;
    @XmlAttribute(name = "sampleRate")
    protected Integer sampleRate;
    @XmlAttribute(name = "bitDepth")
    protected Integer bitDepth;

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
     *     {@link Object }
     *     
     */
    public Object getAudioTrackFormatIDRef() {
        return audioTrackFormatIDRef;
    }

    /**
     * Sets the value of the audioTrackFormatIDRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAudioTrackFormatIDRef(Object value) {
        this.audioTrackFormatIDRef = value;
    }

    /**
     * Gets the value of the audioPackFormatIDRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAudioPackFormatIDRef() {
        return audioPackFormatIDRef;
    }

    /**
     * Sets the value of the audioPackFormatIDRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAudioPackFormatIDRef(Object value) {
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
