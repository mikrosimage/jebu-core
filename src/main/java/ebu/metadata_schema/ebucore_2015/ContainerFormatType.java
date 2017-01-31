
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
 * To provide information on the wrapper format in complement to the stream
 * 				encoding information provided in 'channel', e.g. mp3, wave, Quicktime,
 * 				ogg.
 * 
 * <p>Classe Java pour containerFormatType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="containerFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="containerEncoding" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}formatGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codec" type="{urn:ebu:metadata-schema:ebuCore_2015}codecType" minOccurs="0"/>
 *         &lt;group ref="{urn:ebu:metadata-schema:ebuCore_2015}technicalAttributes"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2015}comment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="containerFormatId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="containerFormatVersionId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="containerFormatName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="containerFormatProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="containerFormatProfileLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="containerFormatDefinition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "containerFormatType", propOrder = {
    "containerEncoding",
    "codec",
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
public class ContainerFormatType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected ContainerFormatType.ContainerEncoding containerEncoding;
    protected CodecType codec;
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
    @XmlElement(name = "comment")
    protected List<Comment> comments;
    @XmlAttribute(name = "containerFormatId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String containerFormatId;
    @XmlAttribute(name = "containerFormatVersionId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String containerFormatVersionId;
    @XmlAttribute(name = "containerFormatName")
    protected java.lang.String containerFormatName;
    @XmlAttribute(name = "containerFormatProfile")
    protected java.lang.String containerFormatProfile;
    @XmlAttribute(name = "containerFormatProfileLevel")
    protected java.lang.String containerFormatProfileLevel;
    @XmlAttribute(name = "containerFormatDefinition")
    protected java.lang.String containerFormatDefinition;

    /**
     * Obtient la valeur de la propriété containerEncoding.
     * 
     * @return
     *     possible object is
     *     {@link ContainerFormatType.ContainerEncoding }
     *     
     */
    public ContainerFormatType.ContainerEncoding getContainerEncoding() {
        return containerEncoding;
    }

    /**
     * Définit la valeur de la propriété containerEncoding.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerFormatType.ContainerEncoding }
     *     
     */
    public void setContainerEncoding(ContainerFormatType.ContainerEncoding value) {
        this.containerEncoding = value;
    }

    /**
     * Obtient la valeur de la propriété codec.
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
     * Définit la valeur de la propriété codec.
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
     * Obtient la valeur de la propriété containerFormatId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getContainerFormatId() {
        return containerFormatId;
    }

    /**
     * Définit la valeur de la propriété containerFormatId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setContainerFormatId(java.lang.String value) {
        this.containerFormatId = value;
    }

    /**
     * Obtient la valeur de la propriété containerFormatVersionId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getContainerFormatVersionId() {
        return containerFormatVersionId;
    }

    /**
     * Définit la valeur de la propriété containerFormatVersionId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setContainerFormatVersionId(java.lang.String value) {
        this.containerFormatVersionId = value;
    }

    /**
     * Obtient la valeur de la propriété containerFormatName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getContainerFormatName() {
        return containerFormatName;
    }

    /**
     * Définit la valeur de la propriété containerFormatName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setContainerFormatName(java.lang.String value) {
        this.containerFormatName = value;
    }

    /**
     * Obtient la valeur de la propriété containerFormatProfile.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getContainerFormatProfile() {
        return containerFormatProfile;
    }

    /**
     * Définit la valeur de la propriété containerFormatProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setContainerFormatProfile(java.lang.String value) {
        this.containerFormatProfile = value;
    }

    /**
     * Obtient la valeur de la propriété containerFormatProfileLevel.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getContainerFormatProfileLevel() {
        return containerFormatProfileLevel;
    }

    /**
     * Définit la valeur de la propriété containerFormatProfileLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setContainerFormatProfileLevel(java.lang.String value) {
        this.containerFormatProfileLevel = value;
    }

    /**
     * Obtient la valeur de la propriété containerFormatDefinition.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getContainerFormatDefinition() {
        return containerFormatDefinition;
    }

    /**
     * Définit la valeur de la propriété containerFormatDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setContainerFormatDefinition(java.lang.String value) {
        this.containerFormatDefinition = value;
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
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}formatGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContainerEncoding
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
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

        /**
         * Obtient la valeur de la propriété formatLabel.
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
         * Définit la valeur de la propriété formatLabel.
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
         * Obtient la valeur de la propriété formatLink.
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
         * Définit la valeur de la propriété formatLink.
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
         * Obtient la valeur de la propriété formatSource.
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
         * Définit la valeur de la propriété formatSource.
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
         * Obtient la valeur de la propriété formatNamespace.
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
         * Définit la valeur de la propriété formatNamespace.
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
         * Obtient la valeur de la propriété formatLanguage.
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
         * Définit la valeur de la propriété formatLanguage.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setFormatLanguage(java.lang.String value) {
            this.formatLanguage = value;
        }

    }

}
