
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour audioBlockFormatType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="audioBlockFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="speakerLabel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="position" type="{urn:ebu:metadata-schema:ebuCore_2016}positionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="matrix" type="{urn:ebu:metadata-schema:ebuCore_2016}matrixType" minOccurs="0"/>
 *         &lt;element name="cartesian" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="diffuse" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="depth" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="channelLock" type="{urn:ebu:metadata-schema:ebuCore_2016}channelLockType" minOccurs="0"/>
 *         &lt;element name="objectDivergence" type="{urn:ebu:metadata-schema:ebuCore_2016}objectDivergenceType" minOccurs="0"/>
 *         &lt;element name="jumpPosition" type="{urn:ebu:metadata-schema:ebuCore_2016}jumpPositionType" minOccurs="0"/>
 *         &lt;element name="zoneExclusion" type="{urn:ebu:metadata-schema:ebuCore_2016}zoneExclusionType" minOccurs="0"/>
 *         &lt;element name="screenRef" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="importance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="equation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="audioBlockFormatID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="rtime" type="{urn:ebu:metadata-schema:ebuCore_2016}timecodeStringType" />
 *       &lt;attribute name="duration" type="{urn:ebu:metadata-schema:ebuCore_2016}timecodeStringType" />
 *       &lt;attribute name="editRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="end" type="{urn:ebu:metadata-schema:ebuCore_2016}timecodeStringType" />
 *       &lt;attribute name="dropframe" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="factorNumerator" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
 *       &lt;attribute name="factorDenominator" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioBlockFormatType", propOrder = {
    "speakerLabelsAndPositionsAndMatrixes"
})
@XmlRootElement(name = "audioBlockFormat")
public class AudioBlockFormat
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRefs({
        @XmlElementRef(name = "matrix", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "zoneExclusion", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equation", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "screenRef", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "diffuse", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "width", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "order", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cartesian", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "channelLock", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "height", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "importance", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "depth", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "position", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "objectDivergence", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "speakerLabel", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "jumpPosition", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gain", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "degree", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> speakerLabelsAndPositionsAndMatrixes;
    @XmlAttribute(name = "audioBlockFormatID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String audioBlockFormatID;
    @XmlAttribute(name = "rtime")
    protected java.lang.String rtime;
    @XmlAttribute(name = "duration")
    protected java.lang.String duration;
    @XmlAttribute(name = "editRate")
    protected java.lang.Float editRate;
    @XmlAttribute(name = "end")
    protected java.lang.String end;
    @XmlAttribute(name = "dropframe")
    protected java.lang.Boolean dropframe;
    @XmlAttribute(name = "factorNumerator")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger factorNumerator;
    @XmlAttribute(name = "factorDenominator")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger factorDenominator;

    /**
     * Gets the value of the speakerLabelsAndPositionsAndMatrixes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speakerLabelsAndPositionsAndMatrixes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeakerLabelsAndPositionsAndMatrixes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MatrixType }{@code >}
     * {@link JAXBElement }{@code <}{@link ZoneExclusionType }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link ChannelLockType }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectDivergenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     * {@link JAXBElement }{@code <}{@link JumpPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getSpeakerLabelsAndPositionsAndMatrixes() {
        if (speakerLabelsAndPositionsAndMatrixes == null) {
            speakerLabelsAndPositionsAndMatrixes = new ArrayList<>();
        }
        return this.speakerLabelsAndPositionsAndMatrixes;
    }

    /**
     * Obtient la valeur de la propri�t� audioBlockFormatID.
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
     * D�finit la valeur de la propri�t� audioBlockFormatID.
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
     * Obtient la valeur de la propri�t� rtime.
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
     * D�finit la valeur de la propri�t� rtime.
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
     * Obtient la valeur de la propri�t� duration.
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
     * D�finit la valeur de la propri�t� duration.
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
     * Obtient la valeur de la propri�t� editRate.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getEditRate() {
        return editRate;
    }

    /**
     * D�finit la valeur de la propri�t� editRate.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setEditRate(java.lang.Float value) {
        this.editRate = value;
    }

    /**
     * Obtient la valeur de la propri�t� end.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getEnd() {
        return end;
    }

    /**
     * D�finit la valeur de la propri�t� end.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setEnd(java.lang.String value) {
        this.end = value;
    }

    /**
     * Obtient la valeur de la propri�t� dropframe.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isDropframe() {
        return dropframe;
    }

    /**
     * D�finit la valeur de la propri�t� dropframe.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setDropframe(java.lang.Boolean value) {
        this.dropframe = value;
    }

    /**
     * Obtient la valeur de la propri�t� factorNumerator.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFactorNumerator() {
        if (factorNumerator == null) {
            return new BigInteger("1");
        } else {
            return factorNumerator;
        }
    }

    /**
     * D�finit la valeur de la propri�t� factorNumerator.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFactorNumerator(BigInteger value) {
        this.factorNumerator = value;
    }

    /**
     * Obtient la valeur de la propri�t� factorDenominator.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFactorDenominator() {
        if (factorDenominator == null) {
            return new BigInteger("1");
        } else {
            return factorDenominator;
        }
    }

    /**
     * D�finit la valeur de la propri�t� factorDenominator.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFactorDenominator(BigInteger value) {
        this.factorDenominator = value;
    }

}
