
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
import eu.mikrosimage.xdmat.ebucore_2015.adapters.XmlDateAdapter;


/**
 * The physical or digital manifestation of the resource. Use the descriptor
 * 				Format to identify the format of a particular resource as it exists in its physical
 * 				or digital form. Physical form = an actual physical form that occupies physical
 * 				space, e.g. a tape. Digital form = a digital file residing on a server or hard
 * 				drive. Format may be used to determine the software, hardware or other equipment
 * 				needed to display or operate the resource. 
 * 
 * <p>Classe Java pour formatType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
    "media",
    "imageFormats",
    "videoFormats",
    "audioFormats",
    "audioFormatExtendeds",
    "containerFormats",
    "signingFormat",
    "dataFormats",
    "timecodeFormats",
    "metadataFormats",
    "starts",
    "ends",
    "durations",
    "fileSize",
    "fileName",
    "mimeTypes",
    "locators",
    "hash",
    "overallBitRate",
    "documentFormat",
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
    "dateCreated",
    "dateModified"
})
public class FormatType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    protected ElementType format;
    @XmlElement(name = "medium")
    protected List<FormatType.Medium> media;
    @XmlElement(name = "imageFormat")
    protected List<ImageFormatType> imageFormats;
    @XmlElement(name = "videoFormat")
    protected List<VideoFormatType> videoFormats;
    @XmlElement(name = "audioFormat")
    protected List<AudioFormatType> audioFormats;
    @XmlElement(name = "audioFormatExtended")
    protected List<AudioFormatExtendedType> audioFormatExtendeds;
    @XmlElement(name = "containerFormat")
    protected List<ContainerFormatType> containerFormats;
    protected SigningFormatType signingFormat;
    @XmlElement(name = "dataFormat")
    protected List<DataFormatType> dataFormats;
    @XmlElement(name = "timecodeFormat")
    protected List<TimecodeFormatType> timecodeFormats;
    @XmlElement(name = "metadataFormat")
    protected List<MetadataFormatType> metadataFormats;
    @XmlElement(name = "start")
    protected List<TimeType> starts;
    @XmlElement(name = "end")
    protected List<TimeType> ends;
    @XmlElement(name = "duration")
    protected List<DurationType> durations;
    protected DimensionType fileSize;
    protected java.lang.String fileName;
    @XmlElement(name = "mimeType")
    protected List<FormatType.MimeType> mimeTypes;
    @XmlElement(name = "locator")
    protected List<FormatType.Locator> locators;
    protected HashType hash;
    protected DimensionType overallBitRate;
    protected DocumentFormatType documentFormat;
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
     * Définit la valeur de la propriété format.
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
     * Gets the value of the media property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the media property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatType.Medium }
     * 
     * 
     */
    public List<FormatType.Medium> getMedia() {
        if (media == null) {
            media = new ArrayList<>();
        }
        return this.media;
    }

    /**
     * Gets the value of the imageFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageFormatType }
     * 
     * 
     */
    public List<ImageFormatType> getImageFormats() {
        if (imageFormats == null) {
            imageFormats = new ArrayList<>();
        }
        return this.imageFormats;
    }

    /**
     * Gets the value of the videoFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoFormatType }
     * 
     * 
     */
    public List<VideoFormatType> getVideoFormats() {
        if (videoFormats == null) {
            videoFormats = new ArrayList<>();
        }
        return this.videoFormats;
    }

    /**
     * Gets the value of the audioFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioFormatType }
     * 
     * 
     */
    public List<AudioFormatType> getAudioFormats() {
        if (audioFormats == null) {
            audioFormats = new ArrayList<>();
        }
        return this.audioFormats;
    }

    /**
     * Gets the value of the audioFormatExtendeds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioFormatExtendeds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioFormatExtendeds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioFormatExtendedType }
     * 
     * 
     */
    public List<AudioFormatExtendedType> getAudioFormatExtendeds() {
        if (audioFormatExtendeds == null) {
            audioFormatExtendeds = new ArrayList<>();
        }
        return this.audioFormatExtendeds;
    }

    /**
     * Gets the value of the containerFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerFormatType }
     * 
     * 
     */
    public List<ContainerFormatType> getContainerFormats() {
        if (containerFormats == null) {
            containerFormats = new ArrayList<>();
        }
        return this.containerFormats;
    }

    /**
     * Obtient la valeur de la propriété signingFormat.
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
     * Définit la valeur de la propriété signingFormat.
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
     * Gets the value of the dataFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataFormatType }
     * 
     * 
     */
    public List<DataFormatType> getDataFormats() {
        if (dataFormats == null) {
            dataFormats = new ArrayList<>();
        }
        return this.dataFormats;
    }

    /**
     * Gets the value of the timecodeFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timecodeFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimecodeFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimecodeFormatType }
     * 
     * 
     */
    public List<TimecodeFormatType> getTimecodeFormats() {
        if (timecodeFormats == null) {
            timecodeFormats = new ArrayList<>();
        }
        return this.timecodeFormats;
    }

    /**
     * Gets the value of the metadataFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataFormatType }
     * 
     * 
     */
    public List<MetadataFormatType> getMetadataFormats() {
        if (metadataFormats == null) {
            metadataFormats = new ArrayList<>();
        }
        return this.metadataFormats;
    }

    /**
     * Gets the value of the starts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the starts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStarts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeType }
     * 
     * 
     */
    public List<TimeType> getStarts() {
        if (starts == null) {
            starts = new ArrayList<>();
        }
        return this.starts;
    }

    /**
     * Gets the value of the ends property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ends property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeType }
     * 
     * 
     */
    public List<TimeType> getEnds() {
        if (ends == null) {
            ends = new ArrayList<>();
        }
        return this.ends;
    }

    /**
     * Gets the value of the durations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the durations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DurationType }
     * 
     * 
     */
    public List<DurationType> getDurations() {
        if (durations == null) {
            durations = new ArrayList<>();
        }
        return this.durations;
    }

    /**
     * Obtient la valeur de la propriété fileSize.
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
     * Définit la valeur de la propriété fileSize.
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
     * Obtient la valeur de la propriété fileName.
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
     * Définit la valeur de la propriété fileName.
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
     * Gets the value of the mimeTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mimeTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMimeTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatType.MimeType }
     * 
     * 
     */
    public List<FormatType.MimeType> getMimeTypes() {
        if (mimeTypes == null) {
            mimeTypes = new ArrayList<>();
        }
        return this.mimeTypes;
    }

    /**
     * Gets the value of the locators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatType.Locator }
     * 
     * 
     */
    public List<FormatType.Locator> getLocators() {
        if (locators == null) {
            locators = new ArrayList<>();
        }
        return this.locators;
    }

    /**
     * Obtient la valeur de la propriété hash.
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
     * Définit la valeur de la propriété hash.
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
     * Obtient la valeur de la propriété overallBitRate.
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
     * Définit la valeur de la propriété overallBitRate.
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
     * Obtient la valeur de la propriété documentFormat.
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
     * Définit la valeur de la propriété documentFormat.
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
     * Obtient la valeur de la propriété dateCreated.
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
     * Définit la valeur de la propriété dateCreated.
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
     * Obtient la valeur de la propriété dateModified.
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
     * Définit la valeur de la propriété dateModified.
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
     * Obtient la valeur de la propriété formatId.
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
     * Définit la valeur de la propriété formatId.
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
     * Obtient la valeur de la propriété formatVersionId.
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
     * Définit la valeur de la propriété formatVersionId.
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
     * Obtient la valeur de la propriété formatName.
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
     * Définit la valeur de la propriété formatName.
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
     * Obtient la valeur de la propriété formatDefinition.
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
     * Définit la valeur de la propriété formatDefinition.
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


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
    public static class DateCreated
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlAttribute(name = "startYear")
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar startYear;
        @XmlAttribute(name = "startDate")
        @XmlJavaTypeAdapter(XmlDateAdapter .class)
        @XmlSchemaType(name = "date")
        protected Date startDate;
        @XmlAttribute(name = "startTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar startTime;
        @XmlAttribute(name = "endYear")
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar endYear;
        @XmlAttribute(name = "endDate")
        @XmlJavaTypeAdapter(XmlDateAdapter .class)
        @XmlSchemaType(name = "date")
        protected Date endDate;
        @XmlAttribute(name = "endTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar endTime;
        @XmlAttribute(name = "period")
        protected java.lang.String period;

        /**
         * Obtient la valeur de la propriété startYear.
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
         * Définit la valeur de la propriété startYear.
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
         * Obtient la valeur de la propriété startDate.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public Date getStartDate() {
            return startDate;
        }

        /**
         * Définit la valeur de la propriété startDate.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setStartDate(Date value) {
            this.startDate = value;
        }

        /**
         * Obtient la valeur de la propriété startTime.
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
         * Définit la valeur de la propriété startTime.
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
         * Obtient la valeur de la propriété endYear.
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
         * Définit la valeur de la propriété endYear.
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
         * Obtient la valeur de la propriété endDate.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public Date getEndDate() {
            return endDate;
        }

        /**
         * Définit la valeur de la propriété endDate.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setEndDate(Date value) {
            this.endDate = value;
        }

        /**
         * Obtient la valeur de la propriété endTime.
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
         * Définit la valeur de la propriété endTime.
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
         * Obtient la valeur de la propriété period.
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
         * Définit la valeur de la propriété period.
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
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
    public static class DateModified
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlAttribute(name = "startYear")
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar startYear;
        @XmlAttribute(name = "startDate")
        @XmlJavaTypeAdapter(XmlDateAdapter .class)
        @XmlSchemaType(name = "date")
        protected Date startDate;
        @XmlAttribute(name = "startTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar startTime;
        @XmlAttribute(name = "endYear")
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar endYear;
        @XmlAttribute(name = "endDate")
        @XmlJavaTypeAdapter(XmlDateAdapter .class)
        @XmlSchemaType(name = "date")
        protected Date endDate;
        @XmlAttribute(name = "endTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar endTime;
        @XmlAttribute(name = "period")
        protected java.lang.String period;

        /**
         * Obtient la valeur de la propriété startYear.
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
         * Définit la valeur de la propriété startYear.
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
         * Obtient la valeur de la propriété startDate.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public Date getStartDate() {
            return startDate;
        }

        /**
         * Définit la valeur de la propriété startDate.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setStartDate(Date value) {
            this.startDate = value;
        }

        /**
         * Obtient la valeur de la propriété startTime.
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
         * Définit la valeur de la propriété startTime.
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
         * Obtient la valeur de la propriété endYear.
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
         * Définit la valeur de la propriété endYear.
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
         * Obtient la valeur de la propriété endDate.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public Date getEndDate() {
            return endDate;
        }

        /**
         * Définit la valeur de la propriété endDate.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setEndDate(Date value) {
            this.endDate = value;
        }

        /**
         * Obtient la valeur de la propriété endTime.
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
         * Définit la valeur de la propriété endTime.
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
         * Obtient la valeur de la propriété period.
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
         * Définit la valeur de la propriété period.
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
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
    public static class Locator
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
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
         * Obtient la valeur de la propriété value.
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
         * Définit la valeur de la propriété value.
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
    public static class Medium
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
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
         * Obtient la valeur de la propriété mediumId.
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
         * Définit la valeur de la propriété mediumId.
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MimeType
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
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
