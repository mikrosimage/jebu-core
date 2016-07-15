
package ebu.metadata_schema.ebucore_2015;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for audioContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audioContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audioObjectIDRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loudnessMetadata" type="{urn:ebu:metadata-schema:ebuCore_2015}loudnessMetadataType" minOccurs="0"/>
 *         &lt;element name="dialogue" type="{urn:ebu:metadata-schema:ebuCore_2015}dialogueType"/>
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
    "audioObjectIDRef",
    "loudnessMetadata",
    "dialogue"
})
public class AudioContentType {

    @XmlElementRef(name = "audioObjectIDRef", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> audioObjectIDRef;
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
     * Gets the value of the audioObjectIDRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioObjectIDRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioObjectIDRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAudioObjectIDRef() {
        if (audioObjectIDRef == null) {
            audioObjectIDRef = new ArrayList<>();
        }
        return this.audioObjectIDRef;
    }

    /**
     * Gets the value of the loudnessMetadata property.
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
     * Sets the value of the loudnessMetadata property.
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
     * Gets the value of the dialogue property.
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
     * Sets the value of the dialogue property.
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
     * Gets the value of the audioContentID property.
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
     * Sets the value of the audioContentID property.
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
     * Gets the value of the audioContentName property.
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
     * Sets the value of the audioContentName property.
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
     * Gets the value of the audioContentLanguage property.
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
     * Sets the value of the audioContentLanguage property.
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
