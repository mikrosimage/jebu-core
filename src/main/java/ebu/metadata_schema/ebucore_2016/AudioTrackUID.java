
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour audioTrackUIDType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="audioTrackUIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audioMXFLookUp" type="{urn:ebu:metadata-schema:ebuCore_2016}audioMXFLookUpType" minOccurs="0"/>
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
@XmlRootElement(name = "audioTrackUID")
public class AudioTrackUID
    implements Serializable
{

    private final static long serialVersionUID = -1L;
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
     * Obtient la valeur de la propriété audioMXFLookUp.
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
     * Définit la valeur de la propriété audioMXFLookUp.
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
     * Obtient la valeur de la propriété audioTrackFormatIDRef.
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
     * Définit la valeur de la propriété audioTrackFormatIDRef.
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
     * Obtient la valeur de la propriété audioPackFormatIDRef.
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
     * Définit la valeur de la propriété audioPackFormatIDRef.
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
     * Obtient la valeur de la propriété uid.
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
     * Définit la valeur de la propriété uid.
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
     * Obtient la valeur de la propriété sampleRate.
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
     * Définit la valeur de la propriété sampleRate.
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
     * Obtient la valeur de la propriété bitDepth.
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
     * Définit la valeur de la propriété bitDepth.
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
