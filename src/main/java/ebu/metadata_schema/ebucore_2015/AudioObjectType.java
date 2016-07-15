
package ebu.metadata_schema.ebucore_2015;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for audioObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audioObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audioPackFormatIDRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="audioObjectIDRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="audioComplementaryObjectIDRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="audioTrackUIDRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="audioObjectInteraction" type="{urn:ebu:metadata-schema:ebuCore_2015}audioObjectInteractionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="audioObjectID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="audioObjectName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="start" type="{urn:ebu:metadata-schema:ebuCore_2015}timecodeType" />
 *       &lt;attribute name="duration" type="{urn:ebu:metadata-schema:ebuCore_2015}timecodeType" />
 *       &lt;attribute name="dialogue" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="importance" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="interact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="disableDucking" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioObjectType", propOrder = {
    "audioPackFormatIDRef",
    "audioObjectIDRef",
    "audioComplementaryObjectIDRef",
    "audioTrackUIDRef",
    "audioObjectInteraction"
})
public class AudioObjectType {

    @XmlElementRef(name = "audioPackFormatIDRef", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> audioPackFormatIDRef;
    @XmlElementRef(name = "audioObjectIDRef", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> audioObjectIDRef;
    @XmlElementRef(name = "audioComplementaryObjectIDRef", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> audioComplementaryObjectIDRef;
    @XmlElementRef(name = "audioTrackUIDRef", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> audioTrackUIDRef;
    protected List<AudioObjectInteractionType> audioObjectInteraction;
    @XmlAttribute(name = "audioObjectID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String audioObjectID;
    @XmlAttribute(name = "audioObjectName")
    protected java.lang.String audioObjectName;
    @XmlAttribute(name = "start")
    protected java.lang.String start;
    @XmlAttribute(name = "duration")
    protected java.lang.String duration;
    @XmlAttribute(name = "dialogue")
    protected Integer dialogue;
    @XmlAttribute(name = "importance")
    protected Integer importance;
    @XmlAttribute(name = "interact")
    protected java.lang.Boolean interact;
    @XmlAttribute(name = "disableDucking")
    protected java.lang.Boolean disableDucking;

    /**
     * Gets the value of the audioPackFormatIDRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioPackFormatIDRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioPackFormatIDRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAudioPackFormatIDRef() {
        if (audioPackFormatIDRef == null) {
            audioPackFormatIDRef = new ArrayList<>();
        }
        return this.audioPackFormatIDRef;
    }

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
     * Gets the value of the audioComplementaryObjectIDRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioComplementaryObjectIDRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioComplementaryObjectIDRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAudioComplementaryObjectIDRef() {
        if (audioComplementaryObjectIDRef == null) {
            audioComplementaryObjectIDRef = new ArrayList<>();
        }
        return this.audioComplementaryObjectIDRef;
    }

    /**
     * Gets the value of the audioTrackUIDRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioTrackUIDRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioTrackUIDRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAudioTrackUIDRef() {
        if (audioTrackUIDRef == null) {
            audioTrackUIDRef = new ArrayList<>();
        }
        return this.audioTrackUIDRef;
    }

    /**
     * Gets the value of the audioObjectInteraction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioObjectInteraction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioObjectInteraction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioObjectInteractionType }
     * 
     * 
     */
    public List<AudioObjectInteractionType> getAudioObjectInteraction() {
        if (audioObjectInteraction == null) {
            audioObjectInteraction = new ArrayList<>();
        }
        return this.audioObjectInteraction;
    }

    /**
     * Gets the value of the audioObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioObjectID() {
        return audioObjectID;
    }

    /**
     * Sets the value of the audioObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioObjectID(java.lang.String value) {
        this.audioObjectID = value;
    }

    /**
     * Gets the value of the audioObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioObjectName() {
        return audioObjectName;
    }

    /**
     * Sets the value of the audioObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioObjectName(java.lang.String value) {
        this.audioObjectName = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setStart(java.lang.String value) {
        this.start = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDuration(java.lang.String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the dialogue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDialogue() {
        if (dialogue == null) {
            return  0;
        } else {
            return dialogue;
        }
    }

    /**
     * Sets the value of the dialogue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDialogue(Integer value) {
        this.dialogue = value;
    }

    /**
     * Gets the value of the importance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImportance() {
        return importance;
    }

    /**
     * Sets the value of the importance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImportance(Integer value) {
        this.importance = value;
    }

    /**
     * Gets the value of the interact property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getInteract() {
        return interact;
    }

    /**
     * Sets the value of the interact property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setInteract(java.lang.Boolean value) {
        this.interact = value;
    }

    /**
     * Gets the value of the disableDucking property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getDisableDucking() {
        return disableDucking;
    }

    /**
     * Sets the value of the disableDucking property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setDisableDucking(java.lang.Boolean value) {
        this.disableDucking = value;
    }

}
