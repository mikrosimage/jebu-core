
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour audioContentType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="audioContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audioObjectIDRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loudnessMetadata" type="{urn:ebu:metadata-schema:ebuCore_2016}loudnessMetadataType" minOccurs="0"/>
 *         &lt;element name="dialogue" type="{urn:ebu:metadata-schema:ebuCore_2016}dialogueType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="audioContentID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="audioContentName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="audioContentLanguage" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioContentType", propOrder = {
    "audioObjectIDReves",
    "loudnessMetadata",
    "dialogue"
})
@XmlRootElement(name = "audioContent")
public class AudioContent
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "audioObjectIDRef", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> audioObjectIDReves;
    protected LoudnessMetadataType loudnessMetadata;
    @XmlElement(required = true)
    protected DialogueType dialogue;
    @XmlAttribute(name = "audioContentID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String audioContentID;
    @XmlAttribute(name = "audioContentName")
    protected java.lang.String audioContentName;
    @XmlAttribute(name = "audioContentLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String audioContentLanguage;

    /**
     * Gets the value of the audioObjectIDReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioObjectIDReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioObjectIDReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAudioObjectIDReves() {
        if (audioObjectIDReves == null) {
            audioObjectIDReves = new ArrayList<>();
        }
        return this.audioObjectIDReves;
    }

    /**
     * Obtient la valeur de la propri�t� loudnessMetadata.
     * 
     * @return
     *     possible object is
     *     {@link LoudnessMetadataType }
     *     
     */
    public LoudnessMetadataType getLoudnessMetadata() {
        return loudnessMetadata;
    }

    /**
     * D�finit la valeur de la propri�t� loudnessMetadata.
     * 
     * @param value
     *     allowed object is
     *     {@link LoudnessMetadataType }
     *     
     */
    public void setLoudnessMetadata(LoudnessMetadataType value) {
        this.loudnessMetadata = value;
    }

    /**
     * Obtient la valeur de la propri�t� dialogue.
     * 
     * @return
     *     possible object is
     *     {@link DialogueType }
     *     
     */
    public DialogueType getDialogue() {
        return dialogue;
    }

    /**
     * D�finit la valeur de la propri�t� dialogue.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogueType }
     *     
     */
    public void setDialogue(DialogueType value) {
        this.dialogue = value;
    }

    /**
     * Obtient la valeur de la propri�t� audioContentID.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioContentID() {
        return audioContentID;
    }

    /**
     * D�finit la valeur de la propri�t� audioContentID.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioContentID(java.lang.String value) {
        this.audioContentID = value;
    }

    /**
     * Obtient la valeur de la propri�t� audioContentName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioContentName() {
        return audioContentName;
    }

    /**
     * D�finit la valeur de la propri�t� audioContentName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioContentName(java.lang.String value) {
        this.audioContentName = value;
    }

    /**
     * Obtient la valeur de la propri�t� audioContentLanguage.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioContentLanguage() {
        return audioContentLanguage;
    }

    /**
     * D�finit la valeur de la propri�t� audioContentLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioContentLanguage(java.lang.String value) {
        this.audioContentLanguage = value;
    }

}
