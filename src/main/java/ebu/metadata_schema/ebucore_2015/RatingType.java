
package ebu.metadata_schema.ebucore_2015;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *  To provide rating using classification scheme or custom rating schemes.
 * 			
 * 
 * <p>Java class for ratingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ratingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ratingValue" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingScaleMaxValue" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingScaleMinValue" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingProvider" type="{urn:ebu:metadata-schema:ebuCore_2015}entityType" minOccurs="0"/>
 *         &lt;element name="ratingRegion" type="{urn:ebu:metadata-schema:ebuCore_2015}regionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingExclusionRegion" type="{urn:ebu:metadata-schema:ebuCore_2015}regionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}formatGroup"/>
 *       &lt;attribute name="ratingSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ratingEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="linkToLogo" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="notRated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="adultContent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ratingType", propOrder = {
    "ratingValue",
    "ratingLink",
    "ratingScaleMaxValue",
    "ratingScaleMinValue",
    "ratingProvider",
    "ratingRegion",
    "ratingExclusionRegion"
})
public class RatingType {

    protected List<ElementType> ratingValue;
    @XmlSchemaType(name = "anyURI")
    protected List<java.lang.String> ratingLink;
    protected List<ElementType> ratingScaleMaxValue;
    protected List<ElementType> ratingScaleMinValue;
    protected EntityType ratingProvider;
    protected List<RegionType> ratingRegion;
    protected List<RegionType> ratingExclusionRegion;
    @XmlAttribute(name = "ratingSystem")
    protected java.lang.String ratingSystem;
    @XmlAttribute(name = "ratingEnvironment")
    protected java.lang.String ratingEnvironment;
    @XmlAttribute(name = "reason")
    protected java.lang.String reason;
    @XmlAttribute(name = "linkToLogo")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String linkToLogo;
    @XmlAttribute(name = "notRated")
    protected java.lang.Boolean notRated;
    @XmlAttribute(name = "adultContent")
    protected java.lang.Boolean adultContent;
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
     * Gets the value of the ratingValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementType }
     * 
     * 
     */
    public List<ElementType> getRatingValue() {
        if (ratingValue == null) {
            ratingValue = new ArrayList<>();
        }
        return this.ratingValue;
    }

    /**
     * Gets the value of the ratingLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getRatingLink() {
        if (ratingLink == null) {
            ratingLink = new ArrayList<>();
        }
        return this.ratingLink;
    }

    /**
     * Gets the value of the ratingScaleMaxValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingScaleMaxValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingScaleMaxValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementType }
     * 
     * 
     */
    public List<ElementType> getRatingScaleMaxValue() {
        if (ratingScaleMaxValue == null) {
            ratingScaleMaxValue = new ArrayList<>();
        }
        return this.ratingScaleMaxValue;
    }

    /**
     * Gets the value of the ratingScaleMinValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingScaleMinValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingScaleMinValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementType }
     * 
     * 
     */
    public List<ElementType> getRatingScaleMinValue() {
        if (ratingScaleMinValue == null) {
            ratingScaleMinValue = new ArrayList<>();
        }
        return this.ratingScaleMinValue;
    }

    /**
     * Gets the value of the ratingProvider property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getRatingProvider() {
        return ratingProvider;
    }

    /**
     * Sets the value of the ratingProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setRatingProvider(EntityType value) {
        this.ratingProvider = value;
    }

    /**
     * Gets the value of the ratingRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionType }
     * 
     * 
     */
    public List<RegionType> getRatingRegion() {
        if (ratingRegion == null) {
            ratingRegion = new ArrayList<>();
        }
        return this.ratingRegion;
    }

    /**
     * Gets the value of the ratingExclusionRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingExclusionRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingExclusionRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionType }
     * 
     * 
     */
    public List<RegionType> getRatingExclusionRegion() {
        if (ratingExclusionRegion == null) {
            ratingExclusionRegion = new ArrayList<>();
        }
        return this.ratingExclusionRegion;
    }

    /**
     * Gets the value of the ratingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRatingSystem() {
        return ratingSystem;
    }

    /**
     * Sets the value of the ratingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRatingSystem(java.lang.String value) {
        this.ratingSystem = value;
    }

    /**
     * Gets the value of the ratingEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRatingEnvironment() {
        return ratingEnvironment;
    }

    /**
     * Sets the value of the ratingEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRatingEnvironment(java.lang.String value) {
        this.ratingEnvironment = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setReason(java.lang.String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the linkToLogo property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLinkToLogo() {
        return linkToLogo;
    }

    /**
     * Sets the value of the linkToLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLinkToLogo(java.lang.String value) {
        this.linkToLogo = value;
    }

    /**
     * Gets the value of the notRated property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getNotRated() {
        return notRated;
    }

    /**
     * Sets the value of the notRated property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setNotRated(java.lang.Boolean value) {
        this.notRated = value;
    }

    /**
     * Gets the value of the adultContent property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getAdultContent() {
        return adultContent;
    }

    /**
     * Sets the value of the adultContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setAdultContent(java.lang.Boolean value) {
        this.adultContent = value;
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

}
