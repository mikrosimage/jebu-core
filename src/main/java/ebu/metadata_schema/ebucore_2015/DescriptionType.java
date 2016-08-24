
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.purl.dc.elements._1.ElementType;
import eu.mikrosimage.xdmat.ebucore.adapters.XmlDateAdapter;


/**
 * Free-form text or a narrative to report general notes, abstracts, or
 * 				summaries about the intellectual content of a resource. The information may be in
 * 				the form of a paragraph giving an individual program description, anecdotal
 * 				interpretations, or brief content reviews. The description may also consist of
 * 				outlines, lists, bullet points, edit decision lists, indexes, or tables of content,
 * 				a reference to a graphical representation of content or even a pointer (URI, URL) to
 * 				an external resource. For a Radio or television programme a running order can be
 * 				used as description. A description can be provided in different languages.
 * 			
 * 
 * <p>Classe Java pour descriptionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="descriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attributor" type="{urn:ebu:metadata-schema:ebuCore_2015}entityType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}dateGroup"/>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="geographicalScope" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="geographicalExclusionScope" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="castFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="note" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "descriptionType", propOrder = {
    "descriptions",
    "attributor"
})
public class DescriptionType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "description", namespace = "http://purl.org/dc/elements/1.1/")
    protected List<ElementType> descriptions;
    protected EntityType attributor;
    @XmlAttribute(name = "length")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger length;
    @XmlAttribute(name = "geographicalScope")
    protected java.lang.String geographicalScope;
    @XmlAttribute(name = "geographicalExclusionScope")
    protected java.lang.String geographicalExclusionScope;
    @XmlAttribute(name = "castFlag")
    protected java.lang.Boolean castFlag;
    @XmlAttribute(name = "note")
    protected java.lang.String note;
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
     * 						Core. Free text to provide a description of the resource. The description
     * 						can be repeated in different languages as specified by the entityType’s lang
     * 						attribute. The type of description is defined in the type group of
     * 						attributes.Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementType }
     * 
     * 
     */
    public List<ElementType> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<>();
        }
        return this.descriptions;
    }

    /**
     * Obtient la valeur de la propriété attributor.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getAttributor() {
        return attributor;
    }

    /**
     * Définit la valeur de la propriété attributor.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setAttributor(EntityType value) {
        this.attributor = value;
    }

    /**
     * Obtient la valeur de la propriété length.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Définit la valeur de la propriété length.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Obtient la valeur de la propriété geographicalScope.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getGeographicalScope() {
        return geographicalScope;
    }

    /**
     * Définit la valeur de la propriété geographicalScope.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setGeographicalScope(java.lang.String value) {
        this.geographicalScope = value;
    }

    /**
     * Obtient la valeur de la propriété geographicalExclusionScope.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getGeographicalExclusionScope() {
        return geographicalExclusionScope;
    }

    /**
     * Définit la valeur de la propriété geographicalExclusionScope.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setGeographicalExclusionScope(java.lang.String value) {
        this.geographicalExclusionScope = value;
    }

    /**
     * Obtient la valeur de la propriété castFlag.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isCastFlag() {
        return castFlag;
    }

    /**
     * Définit la valeur de la propriété castFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setCastFlag(java.lang.Boolean value) {
        this.castFlag = value;
    }

    /**
     * Obtient la valeur de la propriété note.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNote() {
        return note;
    }

    /**
     * Définit la valeur de la propriété note.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNote(java.lang.String value) {
        this.note = value;
    }

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
