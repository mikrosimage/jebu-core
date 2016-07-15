
package ebu.metadata_schema.ebucore_2015;

import java.math.BigInteger;
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
 *  To list the technical characteristics of a document. 
 * 
 * <p>Java class for documentFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wordCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="regionDelimX" type="{urn:ebu:metadata-schema:ebuCore_2015}dimensionType" minOccurs="0"/>
 *         &lt;element name="regionDelimY" type="{urn:ebu:metadata-schema:ebuCore_2015}dimensionType" minOccurs="0"/>
 *         &lt;element name="width" type="{urn:ebu:metadata-schema:ebuCore_2015}dimensionType" minOccurs="0"/>
 *         &lt;element name="height" type="{urn:ebu:metadata-schema:ebuCore_2015}dimensionType" minOccurs="0"/>
 *         &lt;group ref="{urn:ebu:metadata-schema:ebuCore_2015}technicalAttributes"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2015}comment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}formatGroup"/>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *       &lt;attribute name="documentFormatId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="documentFormatVersionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="documentFormatName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="documentFormatProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="documentFormatDefinition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentFormatType", propOrder = {
    "wordCount",
    "regionDelimX",
    "regionDelimY",
    "width",
    "height",
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
    "comment"
})
public class DocumentFormatType {

    protected BigInteger wordCount;
    protected DimensionType regionDelimX;
    protected DimensionType regionDelimY;
    protected DimensionType width;
    protected DimensionType height;
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
    protected List<Comment> comment;
    @XmlAttribute(name = "documentFormatId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String documentFormatId;
    @XmlAttribute(name = "documentFormatVersionId")
    protected java.lang.String documentFormatVersionId;
    @XmlAttribute(name = "documentFormatName")
    protected java.lang.String documentFormatName;
    @XmlAttribute(name = "documentFormatProfile")
    protected java.lang.String documentFormatProfile;
    @XmlAttribute(name = "documentFormatDefinition")
    protected java.lang.String documentFormatDefinition;
    @XmlAttribute(name = "formatLabel")
    protected java.lang.String formatLabel;
    @XmlAttribute(name = "formatDefinition")
    protected java.lang.String formatDefinition;
    @XmlAttribute(name = "formatLink")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String formatLink;
    @XmlAttribute(name = "formatSource")
    protected java.lang.String formatSource;
    @XmlAttribute(name = "formatNamespace")
    protected java.lang.String formatNamespace;
    @XmlAttribute(name = "formatLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String formatLanguage;
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
     * Gets the value of the wordCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWordCount() {
        return wordCount;
    }

    /**
     * Sets the value of the wordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWordCount(BigInteger value) {
        this.wordCount = value;
    }

    /**
     * Gets the value of the regionDelimX property.
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
     * Sets the value of the regionDelimX property.
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
     * Gets the value of the regionDelimY property.
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
     * Sets the value of the regionDelimY property.
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
     * Gets the value of the width property.
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
     * Sets the value of the width property.
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
     * Gets the value of the height property.
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
     * Sets the value of the height property.
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
     *  To provide additional contextual information. Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the documentFormatId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDocumentFormatId() {
        return documentFormatId;
    }

    /**
     * Sets the value of the documentFormatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDocumentFormatId(java.lang.String value) {
        this.documentFormatId = value;
    }

    /**
     * Gets the value of the documentFormatVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDocumentFormatVersionId() {
        return documentFormatVersionId;
    }

    /**
     * Sets the value of the documentFormatVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDocumentFormatVersionId(java.lang.String value) {
        this.documentFormatVersionId = value;
    }

    /**
     * Gets the value of the documentFormatName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDocumentFormatName() {
        return documentFormatName;
    }

    /**
     * Sets the value of the documentFormatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDocumentFormatName(java.lang.String value) {
        this.documentFormatName = value;
    }

    /**
     * Gets the value of the documentFormatProfile property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDocumentFormatProfile() {
        return documentFormatProfile;
    }

    /**
     * Sets the value of the documentFormatProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDocumentFormatProfile(java.lang.String value) {
        this.documentFormatProfile = value;
    }

    /**
     * Gets the value of the documentFormatDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDocumentFormatDefinition() {
        return documentFormatDefinition;
    }

    /**
     * Sets the value of the documentFormatDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDocumentFormatDefinition(java.lang.String value) {
        this.documentFormatDefinition = value;
    }

    /**
     * Gets the value of the formatLabel property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatLabel() {
        return formatLabel;
    }

    /**
     * Sets the value of the formatLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatLabel(java.lang.String value) {
        this.formatLabel = value;
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
     * Gets the value of the formatLink property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatLink() {
        return formatLink;
    }

    /**
     * Sets the value of the formatLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatLink(java.lang.String value) {
        this.formatLink = value;
    }

    /**
     * Gets the value of the formatSource property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatSource() {
        return formatSource;
    }

    /**
     * Sets the value of the formatSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatSource(java.lang.String value) {
        this.formatSource = value;
    }

    /**
     * Gets the value of the formatNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatNamespace() {
        return formatNamespace;
    }

    /**
     * Sets the value of the formatNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatNamespace(java.lang.String value) {
        this.formatNamespace = value;
    }

    /**
     * Gets the value of the formatLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatLanguage() {
        return formatLanguage;
    }

    /**
     * Sets the value of the formatLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatLanguage(java.lang.String value) {
        this.formatLanguage = value;
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
