
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
 * Complex type for describing filters of any kind
 * 
 * <p>Classe Java pour filterType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="filterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trackIdRef" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/>
 *         &lt;element name="filterProfile">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="filterSetting" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;group ref="{urn:ebu:metadata-schema:ebuCore_2016}technicalAttributes"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
 *                 &lt;attribute name="filterAttributeOrder" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
 *       &lt;attribute name="filterOrder" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filterType", propOrder = {
    "trackIdReves",
    "filterProfile",
    "filterSettings"
})
public class FilterType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "trackIdRef", required = true)
    protected List<Object> trackIdReves;
    @XmlElement(required = true)
    protected FilterType.FilterProfile filterProfile;
    @XmlElement(name = "filterSetting")
    protected List<FilterType.FilterSetting> filterSettings;
    @XmlAttribute(name = "filterOrder")
    protected Integer filterOrder;
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
     * Gets the value of the trackIdReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackIdReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackIdReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTrackIdReves() {
        if (trackIdReves == null) {
            trackIdReves = new ArrayList<>();
        }
        return this.trackIdReves;
    }

    /**
     * Obtient la valeur de la propri�t� filterProfile.
     * 
     * @return
     *     possible object is
     *     {@link FilterType.FilterProfile }
     *     
     */
    public FilterType.FilterProfile getFilterProfile() {
        return filterProfile;
    }

    /**
     * D�finit la valeur de la propri�t� filterProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType.FilterProfile }
     *     
     */
    public void setFilterProfile(FilterType.FilterProfile value) {
        this.filterProfile = value;
    }

    /**
     * Gets the value of the filterSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType.FilterSetting }
     * 
     * 
     */
    public List<FilterType.FilterSetting> getFilterSettings() {
        if (filterSettings == null) {
            filterSettings = new ArrayList<>();
        }
        return this.filterSettings;
    }

    /**
     * Obtient la valeur de la propri�t� filterOrder.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterOrder() {
        return filterOrder;
    }

    /**
     * D�finit la valeur de la propri�t� filterOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterOrder(Integer value) {
        this.filterOrder = value;
    }

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
    public static class FilterProfile
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


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;group ref="{urn:ebu:metadata-schema:ebuCore_2016}technicalAttributes"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
     *       &lt;attribute name="filterAttributeOrder" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
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
        "technicalAttributeUris"
    })
    public static class FilterSetting
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
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
        protected List<Boolean> technicalAttributeBooleen;
        @XmlElement(name = "technicalAttributeFloat")
        protected List<Float> technicalAttributeFloats;
        @XmlElement(name = "technicalAttributeRational", defaultValue = "1")
        protected List<TechnicalAttributeRationalType> technicalAttributeRationals;
        @XmlElement(name = "technicalAttributeUri")
        protected List<TechnicalAttributeUriType> technicalAttributeUris;
        @XmlAttribute(name = "filterAttributeOrder")
        protected Integer filterAttributeOrder;
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
         * Obtient la valeur de la propri�t� filterAttributeOrder.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFilterAttributeOrder() {
            return filterAttributeOrder;
        }

        /**
         * D�finit la valeur de la propri�t� filterAttributeOrder.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFilterAttributeOrder(Integer value) {
            this.filterAttributeOrder = value;
        }

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
