
package ebu.metadata_schema.ebucore_2015;

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
 *  A group of attributes to provide a set of techncial attributes on data
 * 				provided with the resource. 
 * 
 * <p>Java class for dataFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="captioningFormat" type="{urn:ebu:metadata-schema:ebuCore_2015}captioningFormatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subtitlingFormat" type="{urn:ebu:metadata-schema:ebuCore_2015}subtitlingFormatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ancillaryDataFormat" type="{urn:ebu:metadata-schema:ebuCore_2015}ancillaryDataFormatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codec" type="{urn:ebu:metadata-schema:ebuCore_2015}codecType" minOccurs="0"/>
 *         &lt;group ref="{urn:ebu:metadata-schema:ebuCore_2015}technicalAttributes"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2015}comment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dataFormatId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="dataFormatVersionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataFormatName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataFormatDefinition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataTrackId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="dataTrackName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataTrackLanguage" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="dataFormatProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataFormatProfileLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataPresenceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataFormatType", propOrder = {
    "captioningFormat",
    "subtitlingFormat",
    "ancillaryDataFormat",
    "codec",
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
public class DataFormatType {

    protected List<CaptioningFormatType> captioningFormat;
    protected List<SubtitlingFormatType> subtitlingFormat;
    protected List<AncillaryDataFormatType> ancillaryDataFormat;
    protected CodecType codec;
    protected List<ebu.metadata_schema.ebucore_2015.String> technicalAttributeString;
    protected List<Int8> technicalAttributeByte;
    protected List<Int16> technicalAttributeShort;
    protected List<Int32> technicalAttributeInteger;
    protected List<Int64> technicalAttributeLong;
    protected List<UInt8> technicalAttributeUnsignedByte;
    protected List<UInt16> technicalAttributeUnsignedShort;
    protected List<UInt32> technicalAttributeUnsignedInteger;
    protected List<UInt64> technicalAttributeUnsignedLong;
    protected List<ebu.metadata_schema.ebucore_2015.Boolean> technicalAttributeBoolean;
    protected List<Float> technicalAttributeFloat;
    @XmlElement(defaultValue = "1")
    protected List<TechnicalAttributeRationalType> technicalAttributeRational;
    protected List<TechnicalAttributeUriType> technicalAttributeUri;
    protected List<Comment> comment;
    @XmlAttribute(name = "dataFormatId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String dataFormatId;
    @XmlAttribute(name = "dataFormatVersionId")
    protected java.lang.String dataFormatVersionId;
    @XmlAttribute(name = "dataFormatName")
    protected java.lang.String dataFormatName;
    @XmlAttribute(name = "dataFormatDefinition")
    protected java.lang.String dataFormatDefinition;
    @XmlAttribute(name = "dataTrackId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected java.lang.String dataTrackId;
    @XmlAttribute(name = "dataTrackName")
    protected java.lang.String dataTrackName;
    @XmlAttribute(name = "dataTrackLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String dataTrackLanguage;
    @XmlAttribute(name = "dataFormatProfile")
    protected java.lang.String dataFormatProfile;
    @XmlAttribute(name = "dataFormatProfileLevel")
    protected java.lang.String dataFormatProfileLevel;
    @XmlAttribute(name = "dataPresenceFlag")
    protected java.lang.Boolean dataPresenceFlag;

    /**
     * Gets the value of the captioningFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the captioningFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaptioningFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaptioningFormatType }
     * 
     * 
     */
    public List<CaptioningFormatType> getCaptioningFormat() {
        if (captioningFormat == null) {
            captioningFormat = new ArrayList<>();
        }
        return this.captioningFormat;
    }

    /**
     * Gets the value of the subtitlingFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subtitlingFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtitlingFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubtitlingFormatType }
     * 
     * 
     */
    public List<SubtitlingFormatType> getSubtitlingFormat() {
        if (subtitlingFormat == null) {
            subtitlingFormat = new ArrayList<>();
        }
        return this.subtitlingFormat;
    }

    /**
     * Gets the value of the ancillaryDataFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryDataFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryDataFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryDataFormatType }
     * 
     * 
     */
    public List<AncillaryDataFormatType> getAncillaryDataFormat() {
        if (ancillaryDataFormat == null) {
            ancillaryDataFormat = new ArrayList<>();
        }
        return this.ancillaryDataFormat;
    }

    /**
     * Gets the value of the codec property.
     * 
     * @return
     *     possible object is
     *     {@link CodecType }
     *     
     */
    public CodecType getCodec() {
        return codec;
    }

    /**
     * Sets the value of the codec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodecType }
     *     
     */
    public void setCodec(CodecType value) {
        this.codec = value;
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
     * {@link ebu.metadata_schema.ebucore_2015.Boolean }
     * 
     * 
     */
    public List<ebu.metadata_schema.ebucore_2015.Boolean> getTechnicalAttributeBoolean() {
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
     * Gets the value of the dataFormatId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDataFormatId() {
        return dataFormatId;
    }

    /**
     * Sets the value of the dataFormatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDataFormatId(java.lang.String value) {
        this.dataFormatId = value;
    }

    /**
     * Gets the value of the dataFormatVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDataFormatVersionId() {
        return dataFormatVersionId;
    }

    /**
     * Sets the value of the dataFormatVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDataFormatVersionId(java.lang.String value) {
        this.dataFormatVersionId = value;
    }

    /**
     * Gets the value of the dataFormatName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDataFormatName() {
        return dataFormatName;
    }

    /**
     * Sets the value of the dataFormatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDataFormatName(java.lang.String value) {
        this.dataFormatName = value;
    }

    /**
     * Gets the value of the dataFormatDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDataFormatDefinition() {
        return dataFormatDefinition;
    }

    /**
     * Sets the value of the dataFormatDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDataFormatDefinition(java.lang.String value) {
        this.dataFormatDefinition = value;
    }

    /**
     * Gets the value of the dataTrackId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDataTrackId() {
        return dataTrackId;
    }

    /**
     * Sets the value of the dataTrackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDataTrackId(java.lang.String value) {
        this.dataTrackId = value;
    }

    /**
     * Gets the value of the dataTrackName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDataTrackName() {
        return dataTrackName;
    }

    /**
     * Sets the value of the dataTrackName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDataTrackName(java.lang.String value) {
        this.dataTrackName = value;
    }

    /**
     * Gets the value of the dataTrackLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDataTrackLanguage() {
        return dataTrackLanguage;
    }

    /**
     * Sets the value of the dataTrackLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDataTrackLanguage(java.lang.String value) {
        this.dataTrackLanguage = value;
    }

    /**
     * Gets the value of the dataFormatProfile property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDataFormatProfile() {
        return dataFormatProfile;
    }

    /**
     * Sets the value of the dataFormatProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDataFormatProfile(java.lang.String value) {
        this.dataFormatProfile = value;
    }

    /**
     * Gets the value of the dataFormatProfileLevel property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDataFormatProfileLevel() {
        return dataFormatProfileLevel;
    }

    /**
     * Sets the value of the dataFormatProfileLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDataFormatProfileLevel(java.lang.String value) {
        this.dataFormatProfileLevel = value;
    }

    /**
     * Gets the value of the dataPresenceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getDataPresenceFlag() {
        return dataPresenceFlag;
    }

    /**
     * Sets the value of the dataPresenceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setDataPresenceFlag(java.lang.Boolean value) {
        this.dataPresenceFlag = value;
    }

}
