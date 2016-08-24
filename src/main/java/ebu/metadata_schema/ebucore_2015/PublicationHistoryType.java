
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide information about the publication history.
 * 
 * <p>Classe Java pour publicationHistoryType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
    "publicationEvents"
})
public class PublicationHistoryType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "publicationEvent")
    protected List<PublicationEventType> publicationEvents;
    @XmlAttribute(name = "publicationHistoryId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String publicationHistoryId;

    /**
     * Gets the value of the publicationEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicationEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicationEventType }
     * 
     * 
     */
    public List<PublicationEventType> getPublicationEvents() {
        if (publicationEvents == null) {
            publicationEvents = new ArrayList<>();
        }
        return this.publicationEvents;
    }

    /**
     * Obtient la valeur de la propriété publicationHistoryId.
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
     * Définit la valeur de la propriété publicationHistoryId.
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
