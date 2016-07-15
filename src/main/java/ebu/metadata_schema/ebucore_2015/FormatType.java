
package ebu.metadata_schema.ebucore_2015;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.purl.dc.elements._1.ElementType;


/**
 * The physical or digital manifestation of the resource. Use the descriptor
 * 				Format to identify the format of a particular resource as it exists in its physical
 * 				or digital form. Physical form = an actual physical form that occupies physical
 * 				space, e.g. a tape. Digital form = a digital file residing on a server or hard
 * 				drive. Format may be used to determine the software, hardware or other equipment
 * 				needed to display or operate the resource. 
 * 
 * <p>Java class for formatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}format" minOccurs="0"/>
 *         &lt;element name="medium" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *                 &lt;attribute name="mediumId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="imageFormat" type="{urn:ebu:metadata-schema:ebuCore_2015}imageFormatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="videoFormat" type="{urn:ebu:metadata-schema:ebuCore_2015}videoFormatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="audioFormat" type="{urn:ebu:metadata-schema:ebuCore_2015}audioFormatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="audioFormatExtended" type="{urn:ebu:metadata-schema:ebuCore_2015}audioFormatExtendedType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="containerFormat" type="{urn:ebu:metadata-schema:ebuCore_2015}containerFormatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="signingFormat" type="{urn:ebu:metadata-schema:ebuCore_2015}signingFormatType" minOccurs="0"/>
 *         &lt;element name="dataFormat" type="{urn:ebu:metadata-schema:ebuCore_2015}dataFormatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timecodeFormat" type="{urn:ebu:metadata-schema:ebuCore_2015}timecodeFormatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metadataFormat" type="{urn:ebu:metadata-schema:ebuCore_2015}metadataFormatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="start" type="{urn:ebu:metadata-schema:ebuCore_2015}timeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="end" type="{urn:ebu:metadata-schema:ebuCore_2015}timeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="duration" type="{urn:ebu:metadata-schema:ebuCore_2015}durationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{urn:ebu:metadata-schema:ebuCore_2015}fileInfo" minOccurs="0"/>
 *         &lt;element name="documentFormat" type="{urn:ebu:metadata-schema:ebuCore_2015}documentFormatType" minOccurs="0"/>
 *         &lt;group ref="{urn:ebu:metadata-schema:ebuCore_2015}technicalAttributes"/>
 *         &lt;element name="dateCreated" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}dateGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dateModified" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}dateGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *       &lt;attribute name="formatId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="formatVersionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="formatName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="formatDefinition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formatType", propOrder = {
    "format",
    "medium",
    "imageFormat",
    "videoFormat",
    "audioFormat",
    "audioFormatExtended",
    "containerFormat",
    "signingFormat",
    "dataFormat",
    "timecodeFormat",
    "metadataFormat",
    "start",
    "end",
    "duration",
    "fileSize",
    "fileName",
    "mimeType",
    "locator",
    "hash",
    "overallBitRate",
    "documentFormat",
    "technicalAttributeString",
    "technicalAttributeByte",
    "technicalAttributeShort",
    "technicalAttributeInteger",
    "technicalAttributeLong",
    "technicalAttributeUnsignedByte",
    "technicalAttributeUnsignedShort",
    "technicalAttributeUnsignedInteger",
    "technicalAttributeUnsignedLong",
    "technicalAttributeBoolean",
    "technicalAttributeFloat",
    "technicalAttributeRational",
    "technicalAttributeUri",
    "dateCreated",
    "dateModified"
})
public class FormatType {

    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    protected ElementType format;
    protected List<FormatType.Medium> medium;
    protected List<ImageFormatType> imageFormat;
    protected List<VideoFormatType> videoFormat;
    protected List<AudioFormatType> audioFormat;
    protected List<AudioFormatExtendedType> audioFormatExtended;
    protected List<ContainerFormatType> containerFormat;
    protected SigningFormatType signingFormat;
    protected List<DataFormatType> dataFormat;
    protected List<TimecodeFormatType> timecodeFormat;
    protected List<MetadataFormatType> metadataFormat;
    protected List<TimeType> start;
    protected List<TimeType> end;
    protected List<DurationType> duration;
    protected DimensionType fileSize;
    protected java.lang.String fileName;
    protected List<FormatType.MimeType> mimeType;
    protected List<FormatType.Locator> locator;
    protected HashType hash;
    protected DimensionType overallBitRate;
    protected DocumentFormatType documentFormat;
    protected List<ebu.metadata_schema.ebucore_2015.String> technicalAttributeString;
    protected List<Int8> technicalAttributeByte;
    protected List<Int16> technicalAttributeShort;
    protected List<Int32> technicalAttributeInteger;
    protected List<Int64> technicalAttributeLong;
    protected List<UInt8> technicalAttributeUnsignedByte;
    protected List<UInt16> technicalAttributeUnsignedShort;
    protected List<UInt32> technicalAttributeUnsignedInteger;
    protected List<UInt64> technicalAttributeUnsignedLong;
    protected List<Boolean> technicalAttributeBoolean;
    protected List<Float> technicalAttributeFloat;
    @XmlElement(defaultValue = "1")
    protected List<TechnicalAttributeRationalType> technicalAttributeRational;
    protected List<TechnicalAttributeUriType> technicalAttributeUri;
    protected FormatType.DateCreated dateCreated;
    protected FormatType.DateModified dateModified;
    @XmlAttribute(name = "formatId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String formatId;
    @XmlAttribute(name = "formatVersionId")
    protected java.lang.String formatVersionId;
    @XmlAttribute(name = "formatName")
    protected java.lang.String formatName;
    @XmlAttribute(name = "formatDefinition")
    protected java.lang.String formatDefinition;
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
     *  The EBU core metadata set is built as a refinement of the Dublin
     * 						Core. Free text to provide information on the format.
     * 
     * @return
     *     possible object is
     *     {@link ElementType }
     *     
     */
    public ElementType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementType }
     *     
     */
    public void setFormat(ElementType value) {
        this.format = value;
    }

    /**
     * Gets the value of the medium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatType.Medium }
     * 
     * 
     */
    public List<FormatType.Medium> getMedium() {
        if (medium == null) {
            medium = new ArrayList<>();
        }
        return this.medium;
    }

    /**
     * Gets the value of the imageFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageFormatType }
     * 
     * 
     */
    public List<ImageFormatType> getImageFormat() {
        if (imageFormat == null) {
            imageFormat = new ArrayList<>();
        }
        return this.imageFormat;
    }

    /**
     * Gets the value of the videoFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoFormatType }
     * 
     * 
     */
    public List<VideoFormatType> getVideoFormat() {
        if (videoFormat == null) {
            videoFormat = new ArrayList<>();
        }
        return this.videoFormat;
    }

    /**
     * Gets the value of the audioFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioFormatType }
     * 
     * 
     */
    public List<AudioFormatType> getAudioFormat() {
        if (audioFormat == null) {
            audioFormat = new ArrayList<>();
        }
        return this.audioFormat;
    }

    /**
     * Gets the value of the audioFormatExtended property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioFormatExtended property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioFormatExtended().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioFormatExtendedType }
     * 
     * 
     */
    public List<AudioFormatExtendedType> getAudioFormatExtended() {
        if (audioFormatExtended == null) {
            audioFormatExtended = new ArrayList<>();
        }
        return this.audioFormatExtended;
    }

    /**
     * Gets the value of the containerFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerFormatType }
     * 
     * 
     */
    public List<ContainerFormatType> getContainerFormat() {
        if (containerFormat == null) {
            containerFormat = new ArrayList<>();
        }
        return this.containerFormat;
    }

    /**
     * Gets the value of the signingFormat property.
     * 
     * @return
     *     possible object is
     *     {@link SigningFormatType }
     *     
     */
    public SigningFormatType getSigningFormat() {
        return signingFormat;
    }

    /**
     * Sets the value of the signingFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigningFormatType }
     *     
     */
    public void setSigningFormat(SigningFormatType value) {
        this.signingFormat = value;
    }

    /**
     * Gets the value of the dataFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataFormatType }
     * 
     * 
     */
    public List<DataFormatType> getDataFormat() {
        if (dataFormat == null) {
            dataFormat = new ArrayList<>();
        }
        return this.dataFormat;
    }

    /**
     * Gets the value of the timecodeFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timecodeFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimecodeFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimecodeFormatType }
     * 
     * 
     */
    public List<TimecodeFormatType> getTimecodeFormat() {
        if (timecodeFormat == null) {
            timecodeFormat = new ArrayList<>();
        }
        return this.timecodeFormat;
    }

    /**
     * Gets the value of the metadataFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataFormatType }
     * 
     * 
     */
    public List<MetadataFormatType> getMetadataFormat() {
        if (metadataFormat == null) {
            metadataFormat = new ArrayList<>();
        }
        return this.metadataFormat;
    }

    /**
     * Gets the value of the start property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the start property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeType }
     * 
     * 
     */
    public List<TimeType> getStart() {
        if (start == null) {
            start = new ArrayList<>();
        }
        return this.start;
    }

    /**
     * Gets the value of the end property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the end property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeType }
     * 
     * 
     */
    public List<TimeType> getEnd() {
        if (end == null) {
            end = new ArrayList<>();
        }
        return this.end;
    }

    /**
     * Gets the value of the duration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the duration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DurationType }
     * 
     * 
     */
    public List<DurationType> getDuration() {
        if (duration == null) {
            duration = new ArrayList<>();
        }
        return this.duration;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setFileSize(DimensionType value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFileName(java.lang.String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mimeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMimeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatType.MimeType }
     * 
     * 
     */
    public List<FormatType.MimeType> getMimeType() {
        if (mimeType == null) {
            mimeType = new ArrayList<>();
        }
        return this.mimeType;
    }

    /**
     * Gets the value of the locator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatType.Locator }
     * 
     * 
     */
    public List<FormatType.Locator> getLocator() {
        if (locator == null) {
            locator = new ArrayList<>();
        }
        return this.locator;
    }

    /**
     * Gets the value of the hash property.
     * 
     * @return
     *     possible object is
     *     {@link HashType }
     *     
     */
    public HashType getHash() {
        return hash;
    }

    /**
     * Sets the value of the hash property.
     * 
     * @param value
     *     allowed object is
     *     {@link HashType }
     *     
     */
    public void setHash(HashType value) {
        this.hash = value;
    }

    /**
     * Gets the value of the overallBitRate property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getOverallBitRate() {
        return overallBitRate;
    }

    /**
     * Sets the value of the overallBitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setOverallBitRate(DimensionType value) {
        this.overallBitRate = value;
    }

    /**
     * Gets the value of the documentFormat property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentFormatType }
     *     
     */
    public DocumentFormatType getDocumentFormat() {
        return documentFormat;
    }

    /**
     * Sets the value of the documentFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFormatType }
     *     
     */
    public void setDocumentFormat(DocumentFormatType value) {
        this.documentFormat = value;
    }

    /**
     * Gets the value of the technicalAttributeString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ebu.metadata_schema.ebucore_2015.String }
     * 
     * 
     */
    public List<ebu.metadata_schema.ebucore_2015.String> getTechnicalAttributeString() {
        if (technicalAttributeString == null) {
            technicalAttributeString = new ArrayList<>();
        }
        return this.technicalAttributeString;
    }

    /**
     * Gets the value of the technicalAttributeByte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeByte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeByte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Int8 }
     * 
     * 
     */
    public List<Int8> getTechnicalAttributeByte() {
        if (technicalAttributeByte == null) {
            technicalAttributeByte = new ArrayList<>();
        }
        return this.technicalAttributeByte;
    }

    /**
     * Gets the value of the technicalAttributeShort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeShort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeShort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Int16 }
     * 
     * 
     */
    public List<Int16> getTechnicalAttributeShort() {
        if (technicalAttributeShort == null) {
            technicalAttributeShort = new ArrayList<>();
        }
        return this.technicalAttributeShort;
    }

    /**
     * Gets the value of the technicalAttributeInteger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeInteger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeInteger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Int32 }
     * 
     * 
     */
    public List<Int32> getTechnicalAttributeInteger() {
        if (technicalAttributeInteger == null) {
            technicalAttributeInteger = new ArrayList<>();
        }
        return this.technicalAttributeInteger;
    }

    /**
     * Gets the value of the technicalAttributeLong property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeLong property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeLong().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Int64 }
     * 
     * 
     */
    public List<Int64> getTechnicalAttributeLong() {
        if (technicalAttributeLong == null) {
            technicalAttributeLong = new ArrayList<>();
        }
        return this.technicalAttributeLong;
    }

    /**
     * Gets the value of the technicalAttributeUnsignedByte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUnsignedByte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUnsignedByte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UInt8 }
     * 
     * 
     */
    public List<UInt8> getTechnicalAttributeUnsignedByte() {
        if (technicalAttributeUnsignedByte == null) {
            technicalAttributeUnsignedByte = new ArrayList<>();
        }
        return this.technicalAttributeUnsignedByte;
    }

    /**
     * Gets the value of the technicalAttributeUnsignedShort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUnsignedShort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUnsignedShort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UInt16 }
     * 
     * 
     */
    public List<UInt16> getTechnicalAttributeUnsignedShort() {
        if (technicalAttributeUnsignedShort == null) {
            technicalAttributeUnsignedShort = new ArrayList<>();
        }
        return this.technicalAttributeUnsignedShort;
    }

    /**
     * Gets the value of the technicalAttributeUnsignedInteger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUnsignedInteger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUnsignedInteger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UInt32 }
     * 
     * 
     */
    public List<UInt32> getTechnicalAttributeUnsignedInteger() {
        if (technicalAttributeUnsignedInteger == null) {
            technicalAttributeUnsignedInteger = new ArrayList<>();
        }
        return this.technicalAttributeUnsignedInteger;
    }

    /**
     * Gets the value of the technicalAttributeUnsignedLong property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUnsignedLong property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUnsignedLong().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UInt64 }
     * 
     * 
     */
    public List<UInt64> getTechnicalAttributeUnsignedLong() {
        if (technicalAttributeUnsignedLong == null) {
            technicalAttributeUnsignedLong = new ArrayList<>();
        }
        return this.technicalAttributeUnsignedLong;
    }

    /**
     * Gets the value of the technicalAttributeBoolean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeBoolean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeBoolean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getTechnicalAttributeBoolean() {
        if (technicalAttributeBoolean == null) {
            technicalAttributeBoolean = new ArrayList<>();
        }
        return this.technicalAttributeBoolean;
    }

    /**
     * Gets the value of the technicalAttributeFloat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeFloat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeFloat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getTechnicalAttributeFloat() {
        if (technicalAttributeFloat == null) {
            technicalAttributeFloat = new ArrayList<>();
        }
        return this.technicalAttributeFloat;
    }

    /**
     * Gets the value of the technicalAttributeRational property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeRational property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeRational().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalAttributeRationalType }
     * 
     * 
     */
    public List<TechnicalAttributeRationalType> getTechnicalAttributeRational() {
        if (technicalAttributeRational == null) {
            technicalAttributeRational = new ArrayList<>();
        }
        return this.technicalAttributeRational;
    }

    /**
     * Gets the value of the technicalAttributeUri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalAttributeUriType }
     * 
     * 
     */
    public List<TechnicalAttributeUriType> getTechnicalAttributeUri() {
        if (technicalAttributeUri == null) {
            technicalAttributeUri = new ArrayList<>();
        }
        return this.technicalAttributeUri;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link FormatType.DateCreated }
     *     
     */
    public FormatType.DateCreated getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatType.DateCreated }
     *     
     */
    public void setDateCreated(FormatType.DateCreated value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the dateModified property.
     * 
     * @return
     *     possible object is
     *     {@link FormatType.DateModified }
     *     
     */
    public FormatType.DateModified getDateModified() {
        return dateModified;
    }

    /**
     * Sets the value of the dateModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatType.DateModified }
     *     
     */
    public void setDateModified(FormatType.DateModified value) {
        this.dateModified = value;
    }

    /**
     * Gets the value of the formatId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatId() {
        return formatId;
    }

    /**
     * Sets the value of the formatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatId(java.lang.String value) {
        this.formatId = value;
    }

    /**
     * Gets the value of the formatVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatVersionId() {
        return formatVersionId;
    }

    /**
     * Sets the value of the formatVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatVersionId(java.lang.String value) {
        this.formatVersionId = value;
    }

    /**
     * Gets the value of the formatName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatName() {
        return formatName;
    }

    /**
     * Sets the value of the formatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatName(java.lang.String value) {
        this.formatName = value;
    }

    /**
     * Gets the value of the formatDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatDefinition() {
        return formatDefinition;
    }

    /**
     * Sets the value of the formatDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatDefinition(java.lang.String value) {
        this.formatDefinition = value;
    }

    /**
     * Gets the value of the typeLabel property.
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
     * Sets the value of the typeLabel property.
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
     * Gets the value of the typeDefinition property.
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
     * Sets the value of the typeDefinition property.
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
     * Gets the value of the typeLink property.
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
     * Sets the value of the typeLink property.
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
     * Gets the value of the typeSource property.
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
     * Sets the value of the typeSource property.
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
     * Gets the value of the typeNamespace property.
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
     * Sets the value of the typeNamespace property.
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
     * Gets the value of the typeLanguage property.
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
     * Sets the value of the typeLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLanguage(java.lang.String value) {
        this.typeLanguage = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}dateGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DateCreated {

        @XmlAttribute(name = "startYear")
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar startYear;
        @XmlAttribute(name = "startDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlAttribute(name = "startTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar startTime;
        @XmlAttribute(name = "endYear")
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar endYear;
        @XmlAttribute(name = "endDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDate;
        @XmlAttribute(name = "endTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar endTime;
        @XmlAttribute(name = "period")
        protected java.lang.String period;

        /**
         * Gets the value of the startYear property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartYear() {
            return startYear;
        }

        /**
         * Sets the value of the startYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartYear(XMLGregorianCalendar value) {
            this.startYear = value;
        }

        /**
         * Gets the value of the startDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDate(XMLGregorianCalendar value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the startTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartTime() {
            return startTime;
        }

        /**
         * Sets the value of the startTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartTime(XMLGregorianCalendar value) {
            this.startTime = value;
        }

        /**
         * Gets the value of the endYear property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndYear() {
            return endYear;
        }

        /**
         * Sets the value of the endYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndYear(XMLGregorianCalendar value) {
            this.endYear = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
        }

        /**
         * Gets the value of the endTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndTime() {
            return endTime;
        }

        /**
         * Sets the value of the endTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndTime(XMLGregorianCalendar value) {
            this.endTime = value;
        }

        /**
         * Gets the value of the period property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getPeriod() {
            return period;
        }

        /**
         * Sets the value of the period property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setPeriod(java.lang.String value) {
            this.period = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}dateGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DateModified {

        @XmlAttribute(name = "startYear")
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar startYear;
        @XmlAttribute(name = "startDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlAttribute(name = "startTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar startTime;
        @XmlAttribute(name = "endYear")
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar endYear;
        @XmlAttribute(name = "endDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDate;
        @XmlAttribute(name = "endTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar endTime;
        @XmlAttribute(name = "period")
        protected java.lang.String period;

        /**
         * Gets the value of the startYear property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartYear() {
            return startYear;
        }

        /**
         * Sets the value of the startYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartYear(XMLGregorianCalendar value) {
            this.startYear = value;
        }

        /**
         * Gets the value of the startDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDate(XMLGregorianCalendar value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the startTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartTime() {
            return startTime;
        }

        /**
         * Sets the value of the startTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartTime(XMLGregorianCalendar value) {
            this.startTime = value;
        }

        /**
         * Gets the value of the endYear property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndYear() {
            return endYear;
        }

        /**
         * Sets the value of the endYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndYear(XMLGregorianCalendar value) {
            this.endYear = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
        }

        /**
         * Gets the value of the endTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndTime() {
            return endTime;
        }

        /**
         * Sets the value of the endTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndTime(XMLGregorianCalendar value) {
            this.endTime = value;
        }

        /**
         * Gets the value of the period property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getPeriod() {
            return period;
        }

        /**
         * Sets the value of the period property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setPeriod(java.lang.String value) {
            this.period = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Locator {

        @XmlValue
        @XmlSchemaType(name = "anyURI")
        protected java.lang.String value;
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
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setValue(java.lang.String value) {
            this.value = value;
        }

        /**
         * Gets the value of the typeLabel property.
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
         * Sets the value of the typeLabel property.
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
         * Gets the value of the typeDefinition property.
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
         * Sets the value of the typeDefinition property.
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
         * Gets the value of the typeLink property.
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
         * Sets the value of the typeLink property.
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
         * Gets the value of the typeSource property.
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
         * Sets the value of the typeSource property.
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
         * Gets the value of the typeNamespace property.
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
         * Sets the value of the typeNamespace property.
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
         * Gets the value of the typeLanguage property.
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
         * Sets the value of the typeLanguage property.
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
     *       &lt;attribute name="mediumId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Medium {

        @XmlAttribute(name = "mediumId")
        @XmlSchemaType(name = "anyURI")
        protected java.lang.String mediumId;
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
         * Gets the value of the mediumId property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getMediumId() {
            return mediumId;
        }

        /**
         * Sets the value of the mediumId property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setMediumId(java.lang.String value) {
            this.mediumId = value;
        }

        /**
         * Gets the value of the typeLabel property.
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
         * Sets the value of the typeLabel property.
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
         * Gets the value of the typeDefinition property.
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
         * Sets the value of the typeDefinition property.
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
         * Gets the value of the typeLink property.
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
         * Sets the value of the typeLink property.
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
         * Gets the value of the typeSource property.
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
         * Sets the value of the typeSource property.
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
         * Gets the value of the typeNamespace property.
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
         * Sets the value of the typeNamespace property.
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
         * Gets the value of the typeLanguage property.
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
         * Sets the value of the typeLanguage property.
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MimeType {

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
         * Gets the value of the typeLabel property.
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
         * Sets the value of the typeLabel property.
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
         * Gets the value of the typeDefinition property.
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
         * Sets the value of the typeDefinition property.
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
         * Gets the value of the typeLink property.
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
         * Sets the value of the typeLink property.
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
         * Gets the value of the typeSource property.
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
         * Sets the value of the typeSource property.
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
         * Gets the value of the typeNamespace property.
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
         * Sets the value of the typeNamespace property.
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
         * Gets the value of the typeLanguage property.
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
         * Sets the value of the typeLanguage property.
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
