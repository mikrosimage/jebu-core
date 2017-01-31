
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * To provide information on metadata formats and tracks.
 * 
 * <p>Classe Java pour metadataFormatType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="metadataFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadataTrack" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *                 &lt;attribute name="trackId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *                 &lt;attribute name="trackName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;group ref="{urn:ebu:metadata-schema:ebuCore_2015}technicalAttributes"/>
 *         &lt;element name="start" type="{urn:ebu:metadata-schema:ebuCore_2015}timeType" minOccurs="0"/>
 *         &lt;element name="duration" type="{urn:ebu:metadata-schema:ebuCore_2015}durationType" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2015}comment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="metadataFormatId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="metadataFormatVersionId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="metadataFormatName" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="metadataFormatDefinition" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadataFormatType", propOrder = {
    "metadataTracks",
    "technicalAttributeStrings",
    "technicalAttributeBytes",
    "technicalAttributeShorts",
    "technicalAttributeIntegers",
    "technicalAttributeLongs",
    "technicalAttributeUnsignedBytes",
    "technicalAttributeUnsignedShorts",
    "technicalAttributeUnsignedIntegers",
    "technicalAttributeUnsignedLongs",
    "technicalAttributeBooleen",
    "technicalAttributeFloats",
    "technicalAttributeRationals",
    "technicalAttributeUris",
    "start",
    "duration",
    "comments"
})
public class MetadataFormatType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "metadataTrack")
    protected List<MetadataFormatType.MetadataTrack> metadataTracks;
    @XmlElement(name = "technicalAttributeString")
    protected List<ebu.metadata_schema.ebucore_2015.String> technicalAttributeStrings;
    @XmlElement(name = "technicalAttributeByte")
    protected List<Int8> technicalAttributeBytes;
    @XmlElement(name = "technicalAttributeShort")
    protected List<Int16> technicalAttributeShorts;
    @XmlElement(name = "technicalAttributeInteger")
    protected List<Int32> technicalAttributeIntegers;
    @XmlElement(name = "technicalAttributeLong")
    protected List<Int64> technicalAttributeLongs;
    @XmlElement(name = "technicalAttributeUnsignedByte")
    protected List<UInt8> technicalAttributeUnsignedBytes;
    @XmlElement(name = "technicalAttributeUnsignedShort")
    protected List<UInt16> technicalAttributeUnsignedShorts;
    @XmlElement(name = "technicalAttributeUnsignedInteger")
    protected List<UInt32> technicalAttributeUnsignedIntegers;
    @XmlElement(name = "technicalAttributeUnsignedLong")
    protected List<UInt64> technicalAttributeUnsignedLongs;
    @XmlElement(name = "technicalAttributeBoolean")
    protected List<Boolean> technicalAttributeBooleen;
    @XmlElement(name = "technicalAttributeFloat")
    protected List<Float> technicalAttributeFloats;
    @XmlElement(name = "technicalAttributeRational", defaultValue = "1")
    protected List<TechnicalAttributeRationalType> technicalAttributeRationals;
    @XmlElement(name = "technicalAttributeUri")
    protected List<TechnicalAttributeUriType> technicalAttributeUris;
    protected TimeType start;
    protected DurationType duration;
    @XmlElement(name = "comment")
    protected List<Comment> comments;
    @XmlAttribute(name = "metadataFormatId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String metadataFormatId;
    @XmlAttribute(name = "metadataFormatVersionId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String metadataFormatVersionId;
    @XmlAttribute(name = "metadataFormatName")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String metadataFormatName;
    @XmlAttribute(name = "metadataFormatDefinition")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String metadataFormatDefinition;

    /**
     * Gets the value of the metadataTracks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataTracks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataTracks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataFormatType.MetadataTrack }
     * 
     * 
     */
    public List<MetadataFormatType.MetadataTrack> getMetadataTracks() {
        if (metadataTracks == null) {
            metadataTracks = new ArrayList<>();
        }
        return this.metadataTracks;
    }

    /**
     * Gets the value of the technicalAttributeStrings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeStrings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeStrings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ebu.metadata_schema.ebucore_2015.String }
     * 
     * 
     */
    public List<ebu.metadata_schema.ebucore_2015.String> getTechnicalAttributeStrings() {
        if (technicalAttributeStrings == null) {
            technicalAttributeStrings = new ArrayList<>();
        }
        return this.technicalAttributeStrings;
    }

    /**
     * Gets the value of the technicalAttributeBytes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeBytes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeBytes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Int8 }
     * 
     * 
     */
    public List<Int8> getTechnicalAttributeBytes() {
        if (technicalAttributeBytes == null) {
            technicalAttributeBytes = new ArrayList<>();
        }
        return this.technicalAttributeBytes;
    }

    /**
     * Gets the value of the technicalAttributeShorts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeShorts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeShorts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Int16 }
     * 
     * 
     */
    public List<Int16> getTechnicalAttributeShorts() {
        if (technicalAttributeShorts == null) {
            technicalAttributeShorts = new ArrayList<>();
        }
        return this.technicalAttributeShorts;
    }

    /**
     * Gets the value of the technicalAttributeIntegers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeIntegers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeIntegers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Int32 }
     * 
     * 
     */
    public List<Int32> getTechnicalAttributeIntegers() {
        if (technicalAttributeIntegers == null) {
            technicalAttributeIntegers = new ArrayList<>();
        }
        return this.technicalAttributeIntegers;
    }

    /**
     * Gets the value of the technicalAttributeLongs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeLongs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeLongs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Int64 }
     * 
     * 
     */
    public List<Int64> getTechnicalAttributeLongs() {
        if (technicalAttributeLongs == null) {
            technicalAttributeLongs = new ArrayList<>();
        }
        return this.technicalAttributeLongs;
    }

    /**
     * Gets the value of the technicalAttributeUnsignedBytes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUnsignedBytes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUnsignedBytes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UInt8 }
     * 
     * 
     */
    public List<UInt8> getTechnicalAttributeUnsignedBytes() {
        if (technicalAttributeUnsignedBytes == null) {
            technicalAttributeUnsignedBytes = new ArrayList<>();
        }
        return this.technicalAttributeUnsignedBytes;
    }

    /**
     * Gets the value of the technicalAttributeUnsignedShorts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUnsignedShorts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUnsignedShorts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UInt16 }
     * 
     * 
     */
    public List<UInt16> getTechnicalAttributeUnsignedShorts() {
        if (technicalAttributeUnsignedShorts == null) {
            technicalAttributeUnsignedShorts = new ArrayList<>();
        }
        return this.technicalAttributeUnsignedShorts;
    }

    /**
     * Gets the value of the technicalAttributeUnsignedIntegers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUnsignedIntegers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUnsignedIntegers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UInt32 }
     * 
     * 
     */
    public List<UInt32> getTechnicalAttributeUnsignedIntegers() {
        if (technicalAttributeUnsignedIntegers == null) {
            technicalAttributeUnsignedIntegers = new ArrayList<>();
        }
        return this.technicalAttributeUnsignedIntegers;
    }

    /**
     * Gets the value of the technicalAttributeUnsignedLongs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUnsignedLongs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUnsignedLongs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UInt64 }
     * 
     * 
     */
    public List<UInt64> getTechnicalAttributeUnsignedLongs() {
        if (technicalAttributeUnsignedLongs == null) {
            technicalAttributeUnsignedLongs = new ArrayList<>();
        }
        return this.technicalAttributeUnsignedLongs;
    }

    /**
     * Gets the value of the technicalAttributeBooleen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeBooleen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeBooleen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getTechnicalAttributeBooleen() {
        if (technicalAttributeBooleen == null) {
            technicalAttributeBooleen = new ArrayList<>();
        }
        return this.technicalAttributeBooleen;
    }

    /**
     * Gets the value of the technicalAttributeFloats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeFloats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeFloats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getTechnicalAttributeFloats() {
        if (technicalAttributeFloats == null) {
            technicalAttributeFloats = new ArrayList<>();
        }
        return this.technicalAttributeFloats;
    }

    /**
     * Gets the value of the technicalAttributeRationals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeRationals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeRationals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalAttributeRationalType }
     * 
     * 
     */
    public List<TechnicalAttributeRationalType> getTechnicalAttributeRationals() {
        if (technicalAttributeRationals == null) {
            technicalAttributeRationals = new ArrayList<>();
        }
        return this.technicalAttributeRationals;
    }

    /**
     * Gets the value of the technicalAttributeUris property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUris property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUris().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalAttributeUriType }
     * 
     * 
     */
    public List<TechnicalAttributeUriType> getTechnicalAttributeUris() {
        if (technicalAttributeUris == null) {
            technicalAttributeUris = new ArrayList<>();
        }
        return this.technicalAttributeUris;
    }

    /**
     * Obtient la valeur de la propriété start.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getStart() {
        return start;
    }

    /**
     * Définit la valeur de la propriété start.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setStart(TimeType value) {
        this.start = value;
    }

    /**
     * Obtient la valeur de la propriété duration.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getDuration() {
        return duration;
    }

    /**
     * Définit la valeur de la propriété duration.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setDuration(DurationType value) {
        this.duration = value;
    }

    /**
     *  To provide additional contextual information. Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getComments() {
        if (comments == null) {
            comments = new ArrayList<>();
        }
        return this.comments;
    }

    /**
     * Obtient la valeur de la propriété metadataFormatId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMetadataFormatId() {
        return metadataFormatId;
    }

    /**
     * Définit la valeur de la propriété metadataFormatId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMetadataFormatId(java.lang.String value) {
        this.metadataFormatId = value;
    }

    /**
     * Obtient la valeur de la propriété metadataFormatVersionId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMetadataFormatVersionId() {
        return metadataFormatVersionId;
    }

    /**
     * Définit la valeur de la propriété metadataFormatVersionId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMetadataFormatVersionId(java.lang.String value) {
        this.metadataFormatVersionId = value;
    }

    /**
     * Obtient la valeur de la propriété metadataFormatName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMetadataFormatName() {
        return metadataFormatName;
    }

    /**
     * Définit la valeur de la propriété metadataFormatName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMetadataFormatName(java.lang.String value) {
        this.metadataFormatName = value;
    }

    /**
     * Obtient la valeur de la propriété metadataFormatDefinition.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMetadataFormatDefinition() {
        return metadataFormatDefinition;
    }

    /**
     * Définit la valeur de la propriété metadataFormatDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMetadataFormatDefinition(java.lang.String value) {
        this.metadataFormatDefinition = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
     *       &lt;attribute name="trackId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
     *       &lt;attribute name="trackName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MetadataTrack
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlAttribute(name = "trackId")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NMTOKEN")
        protected java.lang.String trackId;
        @XmlAttribute(name = "trackName")
        protected java.lang.String trackName;
        @XmlAttribute(name = "typeLabel")
        protected java.lang.String typeLabel;
        @XmlAttribute(name = "typeDefinition")
        protected java.lang.String typeDefinition;
        @XmlAttribute(name = "typeLink")
        @XmlSchemaType(name = "anyURI")
        protected java.lang.String typeLink;
        @XmlAttribute(name = "typeSource")
        protected java.lang.String typeSource;
        @XmlAttribute(name = "typeNamespace")
        protected java.lang.String typeNamespace;
        @XmlAttribute(name = "typeLanguage")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected java.lang.String typeLanguage;

        /**
         * Obtient la valeur de la propriété trackId.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTrackId() {
            return trackId;
        }

        /**
         * Définit la valeur de la propriété trackId.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTrackId(java.lang.String value) {
            this.trackId = value;
        }

        /**
         * Obtient la valeur de la propriété trackName.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTrackName() {
            return trackName;
        }

        /**
         * Définit la valeur de la propriété trackName.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTrackName(java.lang.String value) {
            this.trackName = value;
        }

        /**
         * Obtient la valeur de la propriété typeLabel.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeLabel() {
            return typeLabel;
        }

        /**
         * Définit la valeur de la propriété typeLabel.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeLabel(java.lang.String value) {
            this.typeLabel = value;
        }

        /**
         * Obtient la valeur de la propriété typeDefinition.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeDefinition() {
            return typeDefinition;
        }

        /**
         * Définit la valeur de la propriété typeDefinition.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeDefinition(java.lang.String value) {
            this.typeDefinition = value;
        }

        /**
         * Obtient la valeur de la propriété typeLink.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeLink() {
            return typeLink;
        }

        /**
         * Définit la valeur de la propriété typeLink.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeLink(java.lang.String value) {
            this.typeLink = value;
        }

        /**
         * Obtient la valeur de la propriété typeSource.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeSource() {
            return typeSource;
        }

        /**
         * Définit la valeur de la propriété typeSource.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeSource(java.lang.String value) {
            this.typeSource = value;
        }

        /**
         * Obtient la valeur de la propriété typeNamespace.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeNamespace() {
            return typeNamespace;
        }

        /**
         * Définit la valeur de la propriété typeNamespace.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeNamespace(java.lang.String value) {
            this.typeNamespace = value;
        }

        /**
         * Obtient la valeur de la propriété typeLanguage.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeLanguage() {
            return typeLanguage;
        }

        /**
         * Définit la valeur de la propriété typeLanguage.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeLanguage(java.lang.String value) {
            this.typeLanguage = value;
        }

    }

}
