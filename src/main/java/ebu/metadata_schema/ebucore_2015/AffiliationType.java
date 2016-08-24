
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import eu.mikrosimage.xdmat.ebucore.adapters.XmlDateAdapter;

/**
 * <p>Classe Java pour affiliationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="affiliationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organisation" type="{urn:ebu:metadata-schema:ebuCore_2015}organisationDetailsType"/>
 *         &lt;element name="startDate">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}dateGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="endDate">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}dateGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "affiliationType", propOrder = {
    "organisation",
    "startDate",
    "endDate"
})
public class AffiliationType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected OrganisationDetailsType organisation;
    @XmlElement(required = true)
    protected AffiliationType.StartDate startDate;
    @XmlElement(required = true)
    protected AffiliationType.EndDate endDate;

    /**
     * Obtient la valeur de la propri�t� organisation.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationDetailsType }
     *     
     */
    public OrganisationDetailsType getOrganisation() {
        return organisation;
    }

    /**
     * D�finit la valeur de la propri�t� organisation.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationDetailsType }
     *     
     */
    public void setOrganisation(OrganisationDetailsType value) {
        this.organisation = value;
    }

    /**
     * Obtient la valeur de la propri�t� startDate.
     * 
     * @return
     *     possible object is
     *     {@link AffiliationType.StartDate }
     *     
     */
    public AffiliationType.StartDate getStartDate() {
        return startDate;
    }

    /**
     * D�finit la valeur de la propri�t� startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationType.StartDate }
     *     
     */
    public void setStartDate(AffiliationType.StartDate value) {
        this.startDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� endDate.
     * 
     * @return
     *     possible object is
     *     {@link AffiliationType.EndDate }
     *     
     */
    public AffiliationType.EndDate getEndDate() {
        return endDate;
    }

    /**
     * D�finit la valeur de la propri�t� endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationType.EndDate }
     *     
     */
    public void setEndDate(AffiliationType.EndDate value) {
        this.endDate = value;
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
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}dateGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EndDate
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
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
         * Obtient la valeur de la propri�t� startYear.
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
         * D�finit la valeur de la propri�t� startYear.
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
         * Obtient la valeur de la propri�t� startDate.
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
         * D�finit la valeur de la propri�t� startDate.
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
         * Obtient la valeur de la propri�t� startTime.
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
         * D�finit la valeur de la propri�t� startTime.
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
         * Obtient la valeur de la propri�t� endYear.
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
         * D�finit la valeur de la propri�t� endYear.
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
         * Obtient la valeur de la propri�t� endDate.
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
         * D�finit la valeur de la propri�t� endDate.
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
         * Obtient la valeur de la propri�t� endTime.
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
         * D�finit la valeur de la propri�t� endTime.
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
         * Obtient la valeur de la propri�t� period.
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
         * D�finit la valeur de la propri�t� period.
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


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}dateGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StartDate
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
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
         * Obtient la valeur de la propri�t� startYear.
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
         * D�finit la valeur de la propri�t� startYear.
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
         * Obtient la valeur de la propri�t� startDate.
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
         * D�finit la valeur de la propri�t� startDate.
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
         * Obtient la valeur de la propri�t� startTime.
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
         * D�finit la valeur de la propri�t� startTime.
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
         * Obtient la valeur de la propri�t� endYear.
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
         * D�finit la valeur de la propri�t� endYear.
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
         * Obtient la valeur de la propri�t� endDate.
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
         * D�finit la valeur de la propri�t� endDate.
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
         * Obtient la valeur de la propri�t� endTime.
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
         * D�finit la valeur de la propri�t� endTime.
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
         * Obtient la valeur de la propri�t� period.
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
         * D�finit la valeur de la propri�t� period.
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

}
