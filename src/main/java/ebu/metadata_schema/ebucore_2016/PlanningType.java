
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


/**
 * To provide information about the publication history.
 * 
 * <p>Classe Java pour planningType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="planningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicationEvent" type="{urn:ebu:metadata-schema:ebuCore_2016}publicationEventType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="planningId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "planningType", propOrder = {
    "publicationEvents"
})
public class PlanningType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "publicationEvent")
    protected List<PublicationEventType> publicationEvents;
    @XmlAttribute(name = "planningId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String planningId;

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
     * Obtient la valeur de la propri�t� planningId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPlanningId() {
        return planningId;
    }

    /**
     * D�finit la valeur de la propri�t� planningId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPlanningId(java.lang.String value) {
        this.planningId = value;
    }

}
