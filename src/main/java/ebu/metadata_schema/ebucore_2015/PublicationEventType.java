
package ebu.metadata_schema.ebucore_2015;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  To describe when, where, in which formats and under which rights
 * 				conditions the resource has been distributed. 
 * 
 * <p>Java class for publicationEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publicationEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="publicationTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="scheduleDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="publicationService" type="{urn:ebu:metadata-schema:ebuCore_2015}publicationServiceType" minOccurs="0"/>
 *         &lt;element name="publicationMedium" type="{urn:ebu:metadata-schema:ebuCore_2015}publicationMediumType" minOccurs="0"/>
 *         &lt;element name="publicationChannel" type="{urn:ebu:metadata-schema:ebuCore_2015}publicationChannelType" minOccurs="0"/>
 *         &lt;element name="publicationRegion" type="{urn:ebu:metadata-schema:ebuCore_2015}regionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="publicationEventId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="publicationEventName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="firstShowing" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="lastShowing" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="live" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="liveProduction" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="free" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="note" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="formatIdRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="rightsIDRefs" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publicationEventType", propOrder = {
    "publicationDate",
    "publicationTime",
    "scheduleDate",
    "publicationService",
    "publicationMedium",
    "publicationChannel",
    "publicationRegion"
})
public class PublicationEventType {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationDate;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar publicationTime;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleDate;
    protected PublicationServiceType publicationService;
    protected PublicationMediumType publicationMedium;
    protected PublicationChannelType publicationChannel;
    protected List<RegionType> publicationRegion;
    @XmlAttribute(name = "publicationEventId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String publicationEventId;
    @XmlAttribute(name = "publicationEventName")
    protected java.lang.String publicationEventName;
    @XmlAttribute(name = "firstShowing")
    protected java.lang.Boolean firstShowing;
    @XmlAttribute(name = "lastShowing")
    protected java.lang.Boolean lastShowing;
    @XmlAttribute(name = "live")
    protected java.lang.Boolean live;
    @XmlAttribute(name = "liveProduction")
    protected java.lang.Boolean liveProduction;
    @XmlAttribute(name = "free")
    protected java.lang.Boolean free;
    @XmlAttribute(name = "note")
    protected java.lang.String note;
    @XmlAttribute(name = "formatIdRef")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String formatIdRef;
    @XmlAttribute(name = "rightsIDRefs")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String rightsIDRefs;

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDate(XMLGregorianCalendar value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the publicationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationTime() {
        return publicationTime;
    }

    /**
     * Sets the value of the publicationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationTime(XMLGregorianCalendar value) {
        this.publicationTime = value;
    }

    /**
     * Gets the value of the scheduleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleDate() {
        return scheduleDate;
    }

    /**
     * Sets the value of the scheduleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleDate(XMLGregorianCalendar value) {
        this.scheduleDate = value;
    }

    /**
     * Gets the value of the publicationService property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationServiceType }
     *     
     */
    public PublicationServiceType getPublicationService() {
        return publicationService;
    }

    /**
     * Sets the value of the publicationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationServiceType }
     *     
     */
    public void setPublicationService(PublicationServiceType value) {
        this.publicationService = value;
    }

    /**
     * Gets the value of the publicationMedium property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationMediumType }
     *     
     */
    public PublicationMediumType getPublicationMedium() {
        return publicationMedium;
    }

    /**
     * Sets the value of the publicationMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationMediumType }
     *     
     */
    public void setPublicationMedium(PublicationMediumType value) {
        this.publicationMedium = value;
    }

    /**
     * Gets the value of the publicationChannel property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationChannelType }
     *     
     */
    public PublicationChannelType getPublicationChannel() {
        return publicationChannel;
    }

    /**
     * Sets the value of the publicationChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationChannelType }
     *     
     */
    public void setPublicationChannel(PublicationChannelType value) {
        this.publicationChannel = value;
    }

    /**
     * Gets the value of the publicationRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicationRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionType }
     * 
     * 
     */
    public List<RegionType> getPublicationRegion() {
        if (publicationRegion == null) {
            publicationRegion = new ArrayList<>();
        }
        return this.publicationRegion;
    }

    /**
     * Gets the value of the publicationEventId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPublicationEventId() {
        return publicationEventId;
    }

    /**
     * Sets the value of the publicationEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPublicationEventId(java.lang.String value) {
        this.publicationEventId = value;
    }

    /**
     * Gets the value of the publicationEventName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPublicationEventName() {
        return publicationEventName;
    }

    /**
     * Sets the value of the publicationEventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPublicationEventName(java.lang.String value) {
        this.publicationEventName = value;
    }

    /**
     * Gets the value of the firstShowing property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getFirstShowing() {
        return firstShowing;
    }

    /**
     * Sets the value of the firstShowing property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setFirstShowing(java.lang.Boolean value) {
        this.firstShowing = value;
    }

    /**
     * Gets the value of the lastShowing property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getLastShowing() {
        return lastShowing;
    }

    /**
     * Sets the value of the lastShowing property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setLastShowing(java.lang.Boolean value) {
        this.lastShowing = value;
    }

    /**
     * Gets the value of the live property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getLive() {
        return live;
    }

    /**
     * Sets the value of the live property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setLive(java.lang.Boolean value) {
        this.live = value;
    }

    /**
     * Gets the value of the liveProduction property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getLiveProduction() {
        return liveProduction;
    }

    /**
     * Sets the value of the liveProduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setLiveProduction(java.lang.Boolean value) {
        this.liveProduction = value;
    }

    /**
     * Gets the value of the free property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getFree() {
        return free;
    }

    /**
     * Sets the value of the free property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setFree(java.lang.Boolean value) {
        this.free = value;
    }

    /**
     * Gets the value of the note property.
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
     * Sets the value of the note property.
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
     * Gets the value of the formatIdRef property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatIdRef() {
        return formatIdRef;
    }

    /**
     * Sets the value of the formatIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatIdRef(java.lang.String value) {
        this.formatIdRef = value;
    }

    /**
     * Gets the value of the rightsIDRefs property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRightsIDRefs() {
        return rightsIDRefs;
    }

    /**
     * Sets the value of the rightsIDRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRightsIDRefs(java.lang.String value) {
        this.rightsIDRefs = value;
    }

}
