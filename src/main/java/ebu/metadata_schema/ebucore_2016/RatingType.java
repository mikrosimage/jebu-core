
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
 *  To provide rating using classification scheme or custom rating schemes.
 * 			
 * 
 * <p>Classe Java pour ratingType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ratingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ratingValue" type="{urn:ebu:metadata-schema:ebuCore_2016}elementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingScaleMaxValue" type="{urn:ebu:metadata-schema:ebuCore_2016}elementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingScaleMinValue" type="{urn:ebu:metadata-schema:ebuCore_2016}elementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingProvider" type="{urn:ebu:metadata-schema:ebuCore_2016}entityType" minOccurs="0"/>
 *         &lt;element name="ratingRegion" type="{urn:ebu:metadata-schema:ebuCore_2016}regionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingExclusionRegion" type="{urn:ebu:metadata-schema:ebuCore_2016}regionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}formatGroup"/>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
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
    "ratingValues",
    "ratingLinks",
    "ratingScaleMaxValues",
    "ratingScaleMinValues",
    "ratingProvider",
    "ratingRegions",
    "ratingExclusionRegions"
})
public class RatingType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ratingValue")
    protected List<ElementType> ratingValues;
    @XmlElement(name = "ratingLink")
    @XmlSchemaType(name = "anyURI")
    protected List<java.lang.String> ratingLinks;
    @XmlElement(name = "ratingScaleMaxValue")
    protected List<ElementType> ratingScaleMaxValues;
    @XmlElement(name = "ratingScaleMinValue")
    protected List<ElementType> ratingScaleMinValues;
    protected EntityType ratingProvider;
    @XmlElement(name = "ratingRegion")
    protected List<RegionType> ratingRegions;
    @XmlElement(name = "ratingExclusionRegion")
    protected List<RegionType> ratingExclusionRegions;
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
    @XmlAttribute(name = "formatThesaurus")
    protected java.lang.String formatThesaurus;
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
     * Gets the value of the ratingValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementType }
     * 
     * 
     */
    public List<ElementType> getRatingValues() {
        if (ratingValues == null) {
            ratingValues = new ArrayList<>();
        }
        return this.ratingValues;
    }

    /**
     * Gets the value of the ratingLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getRatingLinks() {
        if (ratingLinks == null) {
            ratingLinks = new ArrayList<>();
        }
        return this.ratingLinks;
    }

    /**
     * Gets the value of the ratingScaleMaxValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingScaleMaxValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingScaleMaxValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementType }
     * 
     * 
     */
    public List<ElementType> getRatingScaleMaxValues() {
        if (ratingScaleMaxValues == null) {
            ratingScaleMaxValues = new ArrayList<>();
        }
        return this.ratingScaleMaxValues;
    }

    /**
     * Gets the value of the ratingScaleMinValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingScaleMinValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingScaleMinValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementType }
     * 
     * 
     */
    public List<ElementType> getRatingScaleMinValues() {
        if (ratingScaleMinValues == null) {
            ratingScaleMinValues = new ArrayList<>();
        }
        return this.ratingScaleMinValues;
    }

    /**
     * Obtient la valeur de la propri�t� ratingProvider.
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
     * D�finit la valeur de la propri�t� ratingProvider.
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
     * Gets the value of the ratingRegions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingRegions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingRegions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionType }
     * 
     * 
     */
    public List<RegionType> getRatingRegions() {
        if (ratingRegions == null) {
            ratingRegions = new ArrayList<>();
        }
        return this.ratingRegions;
    }

    /**
     * Gets the value of the ratingExclusionRegions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingExclusionRegions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingExclusionRegions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionType }
     * 
     * 
     */
    public List<RegionType> getRatingExclusionRegions() {
        if (ratingExclusionRegions == null) {
            ratingExclusionRegions = new ArrayList<>();
        }
        return this.ratingExclusionRegions;
    }

    /**
     * Obtient la valeur de la propri�t� ratingSystem.
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
     * D�finit la valeur de la propri�t� ratingSystem.
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
     * Obtient la valeur de la propri�t� ratingEnvironment.
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
     * D�finit la valeur de la propri�t� ratingEnvironment.
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
     * Obtient la valeur de la propri�t� reason.
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
     * D�finit la valeur de la propri�t� reason.
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
     * Obtient la valeur de la propri�t� linkToLogo.
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
     * D�finit la valeur de la propri�t� linkToLogo.
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
     * Obtient la valeur de la propri�t� notRated.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isNotRated() {
        return notRated;
    }

    /**
     * D�finit la valeur de la propri�t� notRated.
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
     * Obtient la valeur de la propri�t� adultContent.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isAdultContent() {
        return adultContent;
    }

    /**
     * D�finit la valeur de la propri�t� adultContent.
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
     * Obtient la valeur de la propri�t� formatLabel.
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
     * D�finit la valeur de la propri�t� formatLabel.
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
     * Obtient la valeur de la propri�t� formatDefinition.
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
     * D�finit la valeur de la propri�t� formatDefinition.
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
     * Obtient la valeur de la propri�t� formatLink.
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
     * D�finit la valeur de la propri�t� formatLink.
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
     * Obtient la valeur de la propri�t� formatSource.
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
     * D�finit la valeur de la propri�t� formatSource.
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
     * Obtient la valeur de la propri�t� formatNamespace.
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
     * D�finit la valeur de la propri�t� formatNamespace.
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
     * Obtient la valeur de la propri�t� formatLanguage.
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
     * D�finit la valeur de la propri�t� formatLanguage.
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
     * Obtient la valeur de la propri�t� formatThesaurus.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatThesaurus() {
        return formatThesaurus;
    }

    /**
     * D�finit la valeur de la propri�t� formatThesaurus.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatThesaurus(java.lang.String value) {
        this.formatThesaurus = value;
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
