
package ebu.metadata_schema.ebucore_2015;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A container with all definitions related to the audioContents and
 * 				associated components contained in the material.
 * 
 * <p>Java class for audioFormatExtendedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audioFormatExtendedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2015}audioProgramme" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2015}audioContent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2015}audioObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2015}audioPackFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2015}audioChannelFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2015}audioBlockFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2015}audioStreamFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2015}audioTrackFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2015}audioTrackUID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="audioFormatExtendedID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="audioFormatExtendedName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioFormatExtendedType", propOrder = {
    "audioProgramme",
    "audioContent",
    "audioObject",
    "audioPackFormat",
    "audioChannelFormat",
    "audioBlockFormat",
    "audioStreamFormat",
    "audioTrackFormat",
    "audioTrackUID"
})
public class AudioFormatExtendedType {

    protected List<AudioProgrammeType> audioProgramme;
    protected List<AudioContentType> audioContent;
    protected List<AudioObjectType> audioObject;
    protected List<AudioPackFormatType> audioPackFormat;
    protected List<AudioChannelFormatType> audioChannelFormat;
    protected List<AudioBlockFormatType> audioBlockFormat;
    protected List<AudioStreamFormatType> audioStreamFormat;
    protected List<AudioTrackFormatType> audioTrackFormat;
    protected List<AudioTrackUIDType> audioTrackUID;
    @XmlAttribute(name = "audioFormatExtendedID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String audioFormatExtendedID;
    @XmlAttribute(name = "audioFormatExtendedName")
    protected java.lang.String audioFormatExtendedName;

    /**
     * One set of content associated with the	material.Gets the value of the audioProgramme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioProgramme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioProgramme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioProgrammeType }
     * 
     * 
     */
    public List<AudioProgrammeType> getAudioProgramme() {
        if (audioProgramme == null) {
            audioProgramme = new ArrayList<>();
        }
        return this.audioProgramme;
    }

    /**
     * One or more audioContents associated with an audioProgramme.
     * 						audioContent refers to an audioObject which contains the audio and its format description.Gets the value of the audioContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioContentType }
     * 
     * 
     */
    public List<AudioContentType> getAudioContent() {
        if (audioContent == null) {
            audioContent = new ArrayList<>();
        }
        return this.audioContent;
    }

    /**
     * A time limited (if required) set of audio tracks with a format defined by audioPackFormat.Gets the value of the audioObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioObjectType }
     * 
     * 
     */
    public List<AudioObjectType> getAudioObject() {
        if (audioObject == null) {
            audioObject = new ArrayList<>();
        }
        return this.audioObject;
    }

    /**
     * A set of audioChannels that belong together.Gets the value of the audioPackFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioPackFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioPackFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioPackFormatType }
     * 
     * 
     */
    public List<AudioPackFormatType> getAudioPackFormat() {
        if (audioPackFormat == null) {
            audioPackFormat = new ArrayList<>();
        }
        return this.audioPackFormat;
    }

    /**
     * A single sequence of audio samples.Gets the value of the audioChannelFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioChannelFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioChannelFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioChannelFormatType }
     * 
     * 
     */
    public List<AudioChannelFormatType> getAudioChannelFormat() {
        if (audioChannelFormat == null) {
            audioChannelFormat = new ArrayList<>();
        }
        return this.audioChannelFormat;
    }

    /**
     * A division of an audioChannel in time.Gets the value of the audioBlockFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioBlockFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioBlockFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioBlockFormatType }
     * 
     * 
     */
    public List<AudioBlockFormatType> getAudioBlockFormat() {
        if (audioBlockFormat == null) {
            audioBlockFormat = new ArrayList<>();
        }
        return this.audioBlockFormat;
    }

    /**
     *  A combination of one or more tracks required to represent a
     * 						channel, an object, or a group.Gets the value of the audioStreamFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioStreamFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioStreamFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioStreamFormatType }
     * 
     * 
     */
    public List<AudioStreamFormatType> getAudioStreamFormat() {
        if (audioStreamFormat == null) {
            audioStreamFormat = new ArrayList<>();
        }
        return this.audioStreamFormat;
    }

    /**
     * A single set of samples of data in the storage medium.Gets the value of the audioTrackFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioTrackFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioTrackFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioTrackFormatType }
     * 
     * 
     */
    public List<AudioTrackFormatType> getAudioTrackFormat() {
        if (audioTrackFormat == null) {
            audioTrackFormat = new ArrayList<>();
        }
        return this.audioTrackFormat;
    }

    /**
     * The UID of a track in the file. Gets the value of the audioTrackUID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioTrackUID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioTrackUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioTrackUIDType }
     * 
     * 
     */
    public List<AudioTrackUIDType> getAudioTrackUID() {
        if (audioTrackUID == null) {
            audioTrackUID = new ArrayList<>();
        }
        return this.audioTrackUID;
    }

    /**
     * Gets the value of the audioFormatExtendedID property.
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
     * Sets the value of the audioFormatExtendedID property.
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
     * Gets the value of the audioFormatExtendedName property.
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
     * Sets the value of the audioFormatExtendedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioFormatExtendedName(java.lang.String value) {
        this.audioFormatExtendedName = value;
    }

}
