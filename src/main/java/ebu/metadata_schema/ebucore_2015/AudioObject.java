
package ebu.metadata_schema.ebucore_2015;

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
 * <p>Classe Java pour audioObjectType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
    "audioPackFormatIDReves",
    "audioObjectIDReves",
    "audioComplementaryObjectIDReves",
    "audioTrackUIDReves",
    "audioObjectInteractions"
})
@XmlRootElement(name = "audioObject")
public class AudioObject
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "audioPackFormatIDRef", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> audioPackFormatIDReves;
    @XmlElementRef(name = "audioObjectIDRef", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> audioObjectIDReves;
    @XmlElementRef(name = "audioComplementaryObjectIDRef", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> audioComplementaryObjectIDReves;
    @XmlElementRef(name = "audioTrackUIDRef", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> audioTrackUIDReves;
    @XmlElement(name = "audioObjectInteraction")
    protected List<AudioObjectInteractionType> audioObjectInteractions;
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
     * Gets the value of the audioPackFormatIDReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioPackFormatIDReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioPackFormatIDReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAudioPackFormatIDReves() {
        if (audioPackFormatIDReves == null) {
            audioPackFormatIDReves = new ArrayList<>();
        }
        return this.audioPackFormatIDReves;
    }

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
     * Gets the value of the audioComplementaryObjectIDReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioComplementaryObjectIDReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioComplementaryObjectIDReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAudioComplementaryObjectIDReves() {
        if (audioComplementaryObjectIDReves == null) {
            audioComplementaryObjectIDReves = new ArrayList<>();
        }
        return this.audioComplementaryObjectIDReves;
    }

    /**
     * Gets the value of the audioTrackUIDReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioTrackUIDReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioTrackUIDReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAudioTrackUIDReves() {
        if (audioTrackUIDReves == null) {
            audioTrackUIDReves = new ArrayList<>();
        }
        return this.audioTrackUIDReves;
    }

    /**
     * Gets the value of the audioObjectInteractions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioObjectInteractions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioObjectInteractions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioObjectInteractionType }
     * 
     * 
     */
    public List<AudioObjectInteractionType> getAudioObjectInteractions() {
        if (audioObjectInteractions == null) {
            audioObjectInteractions = new ArrayList<>();
        }
        return this.audioObjectInteractions;
    }

    /**
     * Obtient la valeur de la propriété audioObjectID.
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
     * Définit la valeur de la propriété audioObjectID.
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
     * Obtient la valeur de la propriété audioObjectName.
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
     * Définit la valeur de la propriété audioObjectName.
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
     * Obtient la valeur de la propriété start.
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
     * Définit la valeur de la propriété start.
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
     * Obtient la valeur de la propriété duration.
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
     * Définit la valeur de la propriété duration.
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
     * Obtient la valeur de la propriété dialogue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDialogue() {
        if (dialogue == null) {
            return  0;
        } else {
            return dialogue;
        }
    }

    /**
     * Définit la valeur de la propriété dialogue.
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
     * Obtient la valeur de la propriété importance.
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
     * Définit la valeur de la propriété importance.
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
     * Obtient la valeur de la propriété interact.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isInteract() {
        return interact;
    }

    /**
     * Définit la valeur de la propriété interact.
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
     * Obtient la valeur de la propriété disableDucking.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isDisableDucking() {
        return disableDucking;
    }

    /**
     * Définit la valeur de la propriété disableDucking.
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
