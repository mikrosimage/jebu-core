
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
 *  To describe when, where, in which formats and under which rights
 * 				conditions the resource has been distributed. 
 * 
 * <p>Classe Java pour publicationEventType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="publicationEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="publicationTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="scheduleDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="publicationService" type="{urn:ebu:metadata-schema:ebuCore_2016}publicationServiceType" minOccurs="0"/>
 *         &lt;element name="publicationMedium" type="{urn:ebu:metadata-schema:ebuCore_2016}publicationMediumType" minOccurs="0"/>
 *         &lt;element name="publicationChannel" type="{urn:ebu:metadata-schema:ebuCore_2016}publicationChannelType" minOccurs="0"/>
 *         &lt;element name="publicationRegion" type="{urn:ebu:metadata-schema:ebuCore_2016}regionType" maxOccurs="unbounded" minOccurs="0"/>
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
    "publicationRegions"
})
public class PublicationEventType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(type = java.lang.String.class)
    @XmlJavaTypeAdapter(XmlDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date publicationDate;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar publicationTime;
    @XmlElement(type = java.lang.String.class)
    @XmlJavaTypeAdapter(XmlDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date scheduleDate;
    protected PublicationServiceType publicationService;
    protected PublicationMediumType publicationMedium;
    protected PublicationChannelType publicationChannel;
    @XmlElement(name = "publicationRegion")
    protected List<RegionType> publicationRegions;
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
     * Obtient la valeur de la propri�t� publicationDate.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Date getPublicationDate() {
        return publicationDate;
    }

    /**
     * D�finit la valeur de la propri�t� publicationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPublicationDate(Date value) {
        this.publicationDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� publicationTime.
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
     * D�finit la valeur de la propri�t� publicationTime.
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
     * Obtient la valeur de la propri�t� scheduleDate.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Date getScheduleDate() {
        return scheduleDate;
    }

    /**
     * D�finit la valeur de la propri�t� scheduleDate.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setScheduleDate(Date value) {
        this.scheduleDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� publicationService.
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
     * D�finit la valeur de la propri�t� publicationService.
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
     * Obtient la valeur de la propri�t� publicationMedium.
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
     * D�finit la valeur de la propri�t� publicationMedium.
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
     * Obtient la valeur de la propri�t� publicationChannel.
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
     * D�finit la valeur de la propri�t� publicationChannel.
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
     * Gets the value of the publicationRegions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicationRegions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationRegions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionType }
     * 
     * 
     */
    public List<RegionType> getPublicationRegions() {
        if (publicationRegions == null) {
            publicationRegions = new ArrayList<>();
        }
        return this.publicationRegions;
    }

    /**
     * Obtient la valeur de la propri�t� publicationEventId.
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
     * D�finit la valeur de la propri�t� publicationEventId.
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
     * Obtient la valeur de la propri�t� publicationEventName.
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
     * D�finit la valeur de la propri�t� publicationEventName.
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
     * Obtient la valeur de la propri�t� firstShowing.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isFirstShowing() {
        return firstShowing;
    }

    /**
     * D�finit la valeur de la propri�t� firstShowing.
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
     * Obtient la valeur de la propri�t� lastShowing.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isLastShowing() {
        return lastShowing;
    }

    /**
     * D�finit la valeur de la propri�t� lastShowing.
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
     * Obtient la valeur de la propri�t� live.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isLive() {
        return live;
    }

    /**
     * D�finit la valeur de la propri�t� live.
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
     * Obtient la valeur de la propri�t� liveProduction.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isLiveProduction() {
        return liveProduction;
    }

    /**
     * D�finit la valeur de la propri�t� liveProduction.
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
     * Obtient la valeur de la propri�t� free.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isFree() {
        return free;
    }

    /**
     * D�finit la valeur de la propri�t� free.
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
     * Obtient la valeur de la propri�t� note.
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
     * D�finit la valeur de la propri�t� note.
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
     * Obtient la valeur de la propri�t� formatIdRef.
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
     * D�finit la valeur de la propri�t� formatIdRef.
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
     * Obtient la valeur de la propri�t� rightsIDRefs.
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
     * D�finit la valeur de la propri�t� rightsIDRefs.
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
