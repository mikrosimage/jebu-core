
package ebu.metadata_schema.ebucore_2016;

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
 *  A set of metadata for the description of an image format.
 * 			
 * 
 * <p>Classe Java pour imageFormatType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="imageFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regionDelimX" type="{urn:ebu:metadata-schema:ebuCore_2016}dimensionType" minOccurs="0"/>
 *         &lt;element name="regionDelimY" type="{urn:ebu:metadata-schema:ebuCore_2016}dimensionType" minOccurs="0"/>
 *         &lt;element name="width" type="{urn:ebu:metadata-schema:ebuCore_2016}dimensionType" minOccurs="0"/>
 *         &lt;element name="height" type="{urn:ebu:metadata-schema:ebuCore_2016}dimensionType" minOccurs="0"/>
 *         &lt;element name="orientation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="landscape"/>
 *               &lt;enumeration value="portrait"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="aspectRatio" type="{urn:ebu:metadata-schema:ebuCore_2016}aspectRatioType" minOccurs="0"/>
 *         &lt;element name="imageEncoding" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="imageCodec" type="{urn:ebu:metadata-schema:ebuCore_2016}codecType" minOccurs="0"/>
 *         &lt;group ref="{urn:ebu:metadata-schema:ebuCore_2016}technicalAttributes"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2016}comment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="imageFormatId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="imageFormatVersionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="imageFormatName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="imageFormatDefinition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="imageFormatProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="imageFormatProfileLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="imagePresenceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imageFormatType", propOrder = {
    "regionDelimX",
    "regionDelimY",
    "width",
    "height",
    "orientation",
    "aspectRatio",
    "imageEncoding",
    "imageCodec",
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
    "comments"
})
public class ImageFormatType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected DimensionType regionDelimX;
    protected DimensionType regionDelimY;
    protected DimensionType width;
    protected DimensionType height;
    protected java.lang.String orientation;
    protected AspectRatioType aspectRatio;
    protected ImageFormatType.ImageEncoding imageEncoding;
    protected CodecType imageCodec;
    @XmlElement(name = "technicalAttributeString")
    protected List<ebu.metadata_schema.ebucore_2016.String> technicalAttributeStrings;
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
    protected List<ebu.metadata_schema.ebucore_2016.Boolean> technicalAttributeBooleen;
    @XmlElement(name = "technicalAttributeFloat")
    protected List<Float> technicalAttributeFloats;
    @XmlElement(name = "technicalAttributeRational", defaultValue = "1")
    protected List<TechnicalAttributeRationalType> technicalAttributeRationals;
    @XmlElement(name = "technicalAttributeUri")
    protected List<TechnicalAttributeUriType> technicalAttributeUris;
    @XmlElement(name = "comment")
    protected List<Comment> comments;
    @XmlAttribute(name = "imageFormatId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String imageFormatId;
    @XmlAttribute(name = "imageFormatVersionId")
    protected java.lang.String imageFormatVersionId;
    @XmlAttribute(name = "imageFormatName")
    protected java.lang.String imageFormatName;
    @XmlAttribute(name = "imageFormatDefinition")
    protected java.lang.String imageFormatDefinition;
    @XmlAttribute(name = "imageFormatProfile")
    protected java.lang.String imageFormatProfile;
    @XmlAttribute(name = "imageFormatProfileLevel")
    protected java.lang.String imageFormatProfileLevel;
    @XmlAttribute(name = "imagePresenceFlag")
    protected java.lang.Boolean imagePresenceFlag;

    /**
     * Obtient la valeur de la propri�t� regionDelimX.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getRegionDelimX() {
        return regionDelimX;
    }

    /**
     * D�finit la valeur de la propri�t� regionDelimX.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setRegionDelimX(DimensionType value) {
        this.regionDelimX = value;
    }

    /**
     * Obtient la valeur de la propri�t� regionDelimY.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getRegionDelimY() {
        return regionDelimY;
    }

    /**
     * D�finit la valeur de la propri�t� regionDelimY.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setRegionDelimY(DimensionType value) {
        this.regionDelimY = value;
    }

    /**
     * Obtient la valeur de la propri�t� width.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getWidth() {
        return width;
    }

    /**
     * D�finit la valeur de la propri�t� width.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setWidth(DimensionType value) {
        this.width = value;
    }

    /**
     * Obtient la valeur de la propri�t� height.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getHeight() {
        return height;
    }

    /**
     * D�finit la valeur de la propri�t� height.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setHeight(DimensionType value) {
        this.height = value;
    }

    /**
     * Obtient la valeur de la propri�t� orientation.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOrientation() {
        return orientation;
    }

    /**
     * D�finit la valeur de la propri�t� orientation.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOrientation(java.lang.String value) {
        this.orientation = value;
    }

    /**
     * Obtient la valeur de la propri�t� aspectRatio.
     * 
     * @return
     *     possible object is
     *     {@link AspectRatioType }
     *     
     */
    public AspectRatioType getAspectRatio() {
        return aspectRatio;
    }

    /**
     * D�finit la valeur de la propri�t� aspectRatio.
     * 
     * @param value
     *     allowed object is
     *     {@link AspectRatioType }
     *     
     */
    public void setAspectRatio(AspectRatioType value) {
        this.aspectRatio = value;
    }

    /**
     * Obtient la valeur de la propri�t� imageEncoding.
     * 
     * @return
     *     possible object is
     *     {@link ImageFormatType.ImageEncoding }
     *     
     */
    public ImageFormatType.ImageEncoding getImageEncoding() {
        return imageEncoding;
    }

    /**
     * D�finit la valeur de la propri�t� imageEncoding.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageFormatType.ImageEncoding }
     *     
     */
    public void setImageEncoding(ImageFormatType.ImageEncoding value) {
        this.imageEncoding = value;
    }

    /**
     * Obtient la valeur de la propri�t� imageCodec.
     * 
     * @return
     *     possible object is
     *     {@link CodecType }
     *     
     */
    public CodecType getImageCodec() {
        return imageCodec;
    }

    /**
     * D�finit la valeur de la propri�t� imageCodec.
     * 
     * @param value
     *     allowed object is
     *     {@link CodecType }
     *     
     */
    public void setImageCodec(CodecType value) {
        this.imageCodec = value;
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
     * {@link ebu.metadata_schema.ebucore_2016.String }
     * 
     * 
     */
    public List<ebu.metadata_schema.ebucore_2016.String> getTechnicalAttributeStrings() {
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
     * {@link ebu.metadata_schema.ebucore_2016.Boolean }
     * 
     * 
     */
    public List<ebu.metadata_schema.ebucore_2016.Boolean> getTechnicalAttributeBooleen() {
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
     * Obtient la valeur de la propri�t� imageFormatId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getImageFormatId() {
        return imageFormatId;
    }

    /**
     * D�finit la valeur de la propri�t� imageFormatId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setImageFormatId(java.lang.String value) {
        this.imageFormatId = value;
    }

    /**
     * Obtient la valeur de la propri�t� imageFormatVersionId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getImageFormatVersionId() {
        return imageFormatVersionId;
    }

    /**
     * D�finit la valeur de la propri�t� imageFormatVersionId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setImageFormatVersionId(java.lang.String value) {
        this.imageFormatVersionId = value;
    }

    /**
     * Obtient la valeur de la propri�t� imageFormatName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getImageFormatName() {
        return imageFormatName;
    }

    /**
     * D�finit la valeur de la propri�t� imageFormatName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setImageFormatName(java.lang.String value) {
        this.imageFormatName = value;
    }

    /**
     * Obtient la valeur de la propri�t� imageFormatDefinition.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getImageFormatDefinition() {
        return imageFormatDefinition;
    }

    /**
     * D�finit la valeur de la propri�t� imageFormatDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setImageFormatDefinition(java.lang.String value) {
        this.imageFormatDefinition = value;
    }

    /**
     * Obtient la valeur de la propri�t� imageFormatProfile.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getImageFormatProfile() {
        return imageFormatProfile;
    }

    /**
     * D�finit la valeur de la propri�t� imageFormatProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setImageFormatProfile(java.lang.String value) {
        this.imageFormatProfile = value;
    }

    /**
     * Obtient la valeur de la propri�t� imageFormatProfileLevel.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getImageFormatProfileLevel() {
        return imageFormatProfileLevel;
    }

    /**
     * D�finit la valeur de la propri�t� imageFormatProfileLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setImageFormatProfileLevel(java.lang.String value) {
        this.imageFormatProfileLevel = value;
    }

    /**
     * Obtient la valeur de la propri�t� imagePresenceFlag.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isImagePresenceFlag() {
        return imagePresenceFlag;
    }

    /**
     * D�finit la valeur de la propri�t� imagePresenceFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setImagePresenceFlag(java.lang.Boolean value) {
        this.imagePresenceFlag = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ImageEncoding
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
        @XmlAttribute(name = "typeThesaurus")
        protected java.lang.String typeThesaurus;

        /**
         * Obtient la valeur de la propri�t� typeLabel.
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
         * D�finit la valeur de la propri�t� typeLabel.
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
         * Obtient la valeur de la propri�t� typeDefinition.
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
         * D�finit la valeur de la propri�t� typeDefinition.
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
         * Obtient la valeur de la propri�t� typeLink.
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
         * D�finit la valeur de la propri�t� typeLink.
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
         * Obtient la valeur de la propri�t� typeSource.
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
         * D�finit la valeur de la propri�t� typeSource.
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
         * Obtient la valeur de la propri�t� typeNamespace.
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
         * D�finit la valeur de la propri�t� typeNamespace.
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
         * Obtient la valeur de la propri�t� typeLanguage.
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
         * D�finit la valeur de la propri�t� typeLanguage.
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
         * Obtient la valeur de la propri�t� typeThesaurus.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeThesaurus() {
            return typeThesaurus;
        }

        /**
         * D�finit la valeur de la propri�t� typeThesaurus.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeThesaurus(java.lang.String value) {
            this.typeThesaurus = value;
        }

    }

}
