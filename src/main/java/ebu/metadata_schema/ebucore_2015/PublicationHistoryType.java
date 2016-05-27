
package ebu.metadata_schema.ebucore_2015;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide information about the publication history.
 * 
 * <p>Java class for publicationHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publicationHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicationEvent" type="{urn:ebu:metadata-schema:ebuCore_2015}publicationEventType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="publicationHistoryId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publicationHistoryType", propOrder = {
    "publicationEvent"
})
public class PublicationHistoryType {

    protected List<PublicationEventType> publicationEvent;
    @XmlAttribute(name = "publicationHistoryId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String publicationHistoryId;

    /**
     * Gets the value of the publicationEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicationEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicationEventType }
     * 
     * 
     */
    public List<PublicationEventType> getPublicationEvent() {
        if (publicationEvent == null) {
            publicationEvent = new ArrayList<PublicationEventType>();
        }
        return this.publicationEvent;
    }

    /**
     * Gets the value of the publicationHistoryId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPublicationHistoryId() {
        return publicationHistoryId;
    }

    /**
     * Sets the value of the publicationHistoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPublicationHistoryId(java.lang.String value) {
        this.publicationHistoryId = value;
    }

}
