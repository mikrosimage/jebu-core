
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.mikrosimage.xdmat.ebucore.adapters.XmlDateAdapter;


/**
 *  To describe a period of time e.g. historical. 
 * 
 * <p>Classe Java pour periodOfTimeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="periodOfTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="periodName" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}dateGroup"/>
 *       &lt;attribute name="periodId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "periodOfTimeType", propOrder = {
    "periodName"
})
public class PeriodOfTimeType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected ElementType periodName;
    @XmlAttribute(name = "periodId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String periodId;
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
     * Obtient la valeur de la propriété periodName.
     * 
     * @return
     *     possible object is
     *     {@link ElementType }
     *     
     */
    public ElementType getPeriodName() {
        return periodName;
    }

    /**
     * Définit la valeur de la propriété periodName.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementType }
     *     
     */
    public void setPeriodName(ElementType value) {
        this.periodName = value;
    }

    /**
     * Obtient la valeur de la propriété periodId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPeriodId() {
        return periodId;
    }

    /**
     * Définit la valeur de la propriété periodId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPeriodId(java.lang.String value) {
        this.periodId = value;
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

}
