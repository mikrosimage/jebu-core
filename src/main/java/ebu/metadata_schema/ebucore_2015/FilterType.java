
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
 * Complex type for describing filters of any kind
 * 
 * <p>Java class for filterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="filterSetting" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;group ref="{urn:ebu:metadata-schema:ebuCore_2015}technicalAttributes"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *                 &lt;attribute name="filterAttributeOrder" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *       &lt;attribute name="filterOrder" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filterType", propOrder = {
    "trackIdRef",
    "filterProfile",
    "filterSetting"
})
public class FilterType {

    @XmlElement(required = true)
    protected List<Object> trackIdRef;
    @XmlElement(required = true)
    protected FilterType.FilterProfile filterProfile;
    protected List<FilterType.FilterSetting> filterSetting;
    @XmlAttribute(name = "filterOrder")
    @XmlSchemaType(name = "anySimpleType")
    protected java.lang.String filterOrder;
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
     * Gets the value of the trackIdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackIdRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackIdRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTrackIdRef() {
        if (trackIdRef == null) {
            trackIdRef = new ArrayList<>();
        }
        return this.trackIdRef;
    }

    /**
     * Gets the value of the filterProfile property.
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
     * Sets the value of the filterProfile property.
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
     * Gets the value of the filterSetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterSetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType.FilterSetting }
     * 
     * 
     */
    public List<FilterType.FilterSetting> getFilterSetting() {
        if (filterSetting == null) {
            filterSetting = new ArrayList<>();
        }
        return this.filterSetting;
    }

    /**
     * Gets the value of the filterOrder property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFilterOrder() {
        return filterOrder;
    }

    /**
     * Sets the value of the filterOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFilterOrder(java.lang.String value) {
        this.filterOrder = value;
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
    public static class FilterProfile {

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;group ref="{urn:ebu:metadata-schema:ebuCore_2015}technicalAttributes"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
     *       &lt;attribute name="filterAttributeOrder" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
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
        "technicalAttributeUri"
    })
    public static class FilterSetting {

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
        @XmlAttribute(name = "filterAttributeOrder")
        @XmlSchemaType(name = "anySimpleType")
        protected java.lang.String filterAttributeOrder;
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
         * Gets the value of the filterAttributeOrder property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getFilterAttributeOrder() {
            return filterAttributeOrder;
        }

        /**
         * Sets the value of the filterAttributeOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setFilterAttributeOrder(java.lang.String value) {
            this.filterAttributeOrder = value;
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

}
