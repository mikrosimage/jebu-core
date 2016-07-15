
package ebu.metadata_schema.ebucore_2015;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for audioBlockFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audioBlockFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="speakerLabel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="position" type="{urn:ebu:metadata-schema:ebuCore_2015}positionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="matrix" type="{urn:ebu:metadata-schema:ebuCore_2015}matrixType" minOccurs="0"/>
 *         &lt;element name="cartesian" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="diffuse" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="depth" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="channelLock" type="{urn:ebu:metadata-schema:ebuCore_2015}channelLockType" minOccurs="0"/>
 *         &lt;element name="objectDivergence" type="{urn:ebu:metadata-schema:ebuCore_2015}objectDivergenceType" minOccurs="0"/>
 *         &lt;element name="jumpPosition" type="{urn:ebu:metadata-schema:ebuCore_2015}jumpPositionType" minOccurs="0"/>
 *         &lt;element name="zoneExclusion" type="{urn:ebu:metadata-schema:ebuCore_2015}zoneExclusionType" minOccurs="0"/>
 *         &lt;element name="screenRef" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="importance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="equation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="audioBlockFormatID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="rtime" type="{urn:ebu:metadata-schema:ebuCore_2015}timecodeType" />
 *       &lt;attribute name="duration" type="{urn:ebu:metadata-schema:ebuCore_2015}timecodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioBlockFormatType", propOrder = {
    "speakerLabelAndPositionAndMatrix"
})
public class AudioBlockFormatType {

    @XmlElementRefs({
        @XmlElementRef(name = "diffuse", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "channelLock", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "matrix", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "zoneExclusion", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "speakerLabel", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "importance", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "position", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cartesian", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "height", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equation", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gain", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "order", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "depth", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "width", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "objectDivergence", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "degree", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "screenRef", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "jumpPosition", namespace = "urn:ebu:metadata-schema:ebuCore_2015", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> speakerLabelAndPositionAndMatrix;
    @XmlAttribute(name = "audioBlockFormatID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String audioBlockFormatID;
    @XmlAttribute(name = "rtime")
    protected java.lang.String rtime;
    @XmlAttribute(name = "duration")
    protected java.lang.String duration;

    /**
     * Gets the value of the speakerLabelAndPositionAndMatrix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speakerLabelAndPositionAndMatrix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeakerLabelAndPositionAndMatrix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}
     * {@link JAXBElement }{@code <}{@link ChannelLockType }{@code >}
     * {@link JAXBElement }{@code <}{@link MatrixType }{@code >}
     * {@link JAXBElement }{@code <}{@link ZoneExclusionType }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectDivergenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link JumpPositionType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getSpeakerLabelAndPositionAndMatrix() {
        if (speakerLabelAndPositionAndMatrix == null) {
            speakerLabelAndPositionAndMatrix = new ArrayList<>();
        }
        return this.speakerLabelAndPositionAndMatrix;
    }

    /**
     * Gets the value of the audioBlockFormatID property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioBlockFormatID() {
        return audioBlockFormatID;
    }

    /**
     * Sets the value of the audioBlockFormatID property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioBlockFormatID(java.lang.String value) {
        this.audioBlockFormatID = value;
    }

    /**
     * Gets the value of the rtime property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRtime() {
        return rtime;
    }

    /**
     * Sets the value of the rtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRtime(java.lang.String value) {
        this.rtime = value;
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

}
