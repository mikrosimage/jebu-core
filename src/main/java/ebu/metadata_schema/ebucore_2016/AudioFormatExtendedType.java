
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A container with all definitions related to the audioContents and
 * 				associated components contained in the material.
 * 
 * <p>Classe Java pour audioFormatExtendedType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="audioFormatExtendedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2016}audioProgramme" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2016}audioContent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2016}audioObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2016}audioPackFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2016}audioChannelFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2016}audioBlockFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2016}audioStreamFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2016}audioTrackFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2016}audioTrackUID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="audioFormatExtendedID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="audioFormatExtendedName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="audioFormatExtendedDefinition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="audioFormatExtendedPresenceFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="audioFormatExtendedVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioFormatExtendedType", propOrder = {
    "audioProgrammes",
    "audioContents",
    "audioObjects",
    "audioPackFormats",
    "audioChannelFormats",
    "audioBlockFormats",
    "audioStreamFormats",
    "audioTrackFormats",
    "audioTrackUIDs"
})
public class AudioFormatExtendedType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "audioProgramme")
    protected List<AudioProgramme> audioProgrammes;
    @XmlElement(name = "audioContent")
    protected List<AudioContent> audioContents;
    @XmlElement(name = "audioObject")
    protected List<AudioObject> audioObjects;
    @XmlElement(name = "audioPackFormat")
    protected List<AudioPackFormat> audioPackFormats;
    @XmlElement(name = "audioChannelFormat")
    protected List<AudioChannelFormat> audioChannelFormats;
    @XmlElement(name = "audioBlockFormat")
    protected List<AudioBlockFormat> audioBlockFormats;
    @XmlElement(name = "audioStreamFormat")
    protected List<AudioStreamFormat> audioStreamFormats;
    @XmlElement(name = "audioTrackFormat")
    protected List<AudioTrackFormat> audioTrackFormats;
    @XmlElement(name = "audioTrackUID")
    protected List<AudioTrackUID> audioTrackUIDs;
    @XmlAttribute(name = "audioFormatExtendedID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String audioFormatExtendedID;
    @XmlAttribute(name = "audioFormatExtendedName")
    protected java.lang.String audioFormatExtendedName;
    @XmlAttribute(name = "audioFormatExtendedDefinition")
    protected java.lang.String audioFormatExtendedDefinition;
    @XmlAttribute(name = "audioFormatExtendedPresenceFlag")
    protected java.lang.String audioFormatExtendedPresenceFlag;
    @XmlAttribute(name = "audioFormatExtendedVersion")
    protected java.lang.String audioFormatExtendedVersion;

    /**
     * One set of content associated with the material.Gets the value of the audioProgrammes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioProgrammes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioProgrammes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioProgramme }
     * 
     * 
     */
    public List<AudioProgramme> getAudioProgrammes() {
        if (audioProgrammes == null) {
            audioProgrammes = new ArrayList<>();
        }
        return this.audioProgrammes;
    }

    /**
     * One or more audioContents associated with an audioProgramme.
     * 						audioContent refers to an audioObject which contains the audio and its
     * 						format description.Gets the value of the audioContents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioContents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioContent }
     * 
     * 
     */
    public List<AudioContent> getAudioContents() {
        if (audioContents == null) {
            audioContents = new ArrayList<>();
        }
        return this.audioContents;
    }

    /**
     * A time limited (if required) set of audio tracks with a format
     * 						defined by audioPackFormat.Gets the value of the audioObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioObject }
     * 
     * 
     */
    public List<AudioObject> getAudioObjects() {
        if (audioObjects == null) {
            audioObjects = new ArrayList<>();
        }
        return this.audioObjects;
    }

    /**
     * A set of audioChannels that belong together.Gets the value of the audioPackFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioPackFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioPackFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioPackFormat }
     * 
     * 
     */
    public List<AudioPackFormat> getAudioPackFormats() {
        if (audioPackFormats == null) {
            audioPackFormats = new ArrayList<>();
        }
        return this.audioPackFormats;
    }

    /**
     * A single sequence of audio samples.Gets the value of the audioChannelFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioChannelFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioChannelFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioChannelFormat }
     * 
     * 
     */
    public List<AudioChannelFormat> getAudioChannelFormats() {
        if (audioChannelFormats == null) {
            audioChannelFormats = new ArrayList<>();
        }
        return this.audioChannelFormats;
    }

    /**
     * A division of an audioChannel in time.Gets the value of the audioBlockFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioBlockFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioBlockFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioBlockFormat }
     * 
     * 
     */
    public List<AudioBlockFormat> getAudioBlockFormats() {
        if (audioBlockFormats == null) {
            audioBlockFormats = new ArrayList<>();
        }
        return this.audioBlockFormats;
    }

    /**
     *  A combination of one or more tracks required to represent a
     * 						channel, an object, or a group.Gets the value of the audioStreamFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioStreamFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioStreamFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioStreamFormat }
     * 
     * 
     */
    public List<AudioStreamFormat> getAudioStreamFormats() {
        if (audioStreamFormats == null) {
            audioStreamFormats = new ArrayList<>();
        }
        return this.audioStreamFormats;
    }

    /**
     * A single set of samples of data in the storage
     * 						medium.Gets the value of the audioTrackFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioTrackFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioTrackFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioTrackFormat }
     * 
     * 
     */
    public List<AudioTrackFormat> getAudioTrackFormats() {
        if (audioTrackFormats == null) {
            audioTrackFormats = new ArrayList<>();
        }
        return this.audioTrackFormats;
    }

    /**
     * The UID of a track in the file. Gets the value of the audioTrackUIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioTrackUIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioTrackUIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioTrackUID }
     * 
     * 
     */
    public List<AudioTrackUID> getAudioTrackUIDs() {
        if (audioTrackUIDs == null) {
            audioTrackUIDs = new ArrayList<>();
        }
        return this.audioTrackUIDs;
    }

    /**
     * Obtient la valeur de la propri�t� audioFormatExtendedID.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioFormatExtendedID() {
        return audioFormatExtendedID;
    }

    /**
     * D�finit la valeur de la propri�t� audioFormatExtendedID.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioFormatExtendedID(java.lang.String value) {
        this.audioFormatExtendedID = value;
    }

    /**
     * Obtient la valeur de la propri�t� audioFormatExtendedName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioFormatExtendedName() {
        return audioFormatExtendedName;
    }

    /**
     * D�finit la valeur de la propri�t� audioFormatExtendedName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioFormatExtendedName(java.lang.String value) {
        this.audioFormatExtendedName = value;
    }

    /**
     * Obtient la valeur de la propri�t� audioFormatExtendedDefinition.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioFormatExtendedDefinition() {
        return audioFormatExtendedDefinition;
    }

    /**
     * D�finit la valeur de la propri�t� audioFormatExtendedDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioFormatExtendedDefinition(java.lang.String value) {
        this.audioFormatExtendedDefinition = value;
    }

    /**
     * Obtient la valeur de la propri�t� audioFormatExtendedPresenceFlag.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioFormatExtendedPresenceFlag() {
        return audioFormatExtendedPresenceFlag;
    }

    /**
     * D�finit la valeur de la propri�t� audioFormatExtendedPresenceFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioFormatExtendedPresenceFlag(java.lang.String value) {
        this.audioFormatExtendedPresenceFlag = value;
    }

    /**
     * Obtient la valeur de la propri�t� audioFormatExtendedVersion.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioFormatExtendedVersion() {
        return audioFormatExtendedVersion;
    }

    /**
     * D�finit la valeur de la propri�t� audioFormatExtendedVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioFormatExtendedVersion(java.lang.String value) {
        this.audioFormatExtendedVersion = value;
    }

}
