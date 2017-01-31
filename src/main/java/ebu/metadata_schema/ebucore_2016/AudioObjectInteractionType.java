
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour audioObjectInteractionType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="audioObjectInteractionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gainInteractionRange" type="{urn:ebu:metadata-schema:ebuCore_2016}gainInteractionRangeType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="positionInteractionRange" type="{urn:ebu:metadata-schema:ebuCore_2016}positionInteractionRangeType" maxOccurs="6" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="onOffInteract" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="gainInteract" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="positionInteract" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioObjectInteractionType", propOrder = {
    "gainInteractionRanges",
    "positionInteractionRanges"
})
public class AudioObjectInteractionType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "gainInteractionRange")
    protected List<GainInteractionRangeType> gainInteractionRanges;
    @XmlElement(name = "positionInteractionRange")
    protected List<PositionInteractionRangeType> positionInteractionRanges;
    @XmlAttribute(name = "onOffInteract")
    protected java.lang.Boolean onOffInteract;
    @XmlAttribute(name = "gainInteract")
    protected java.lang.Boolean gainInteract;
    @XmlAttribute(name = "positionInteract")
    protected java.lang.Boolean positionInteract;

    /**
     * Gets the value of the gainInteractionRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gainInteractionRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGainInteractionRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GainInteractionRangeType }
     * 
     * 
     */
    public List<GainInteractionRangeType> getGainInteractionRanges() {
        if (gainInteractionRanges == null) {
            gainInteractionRanges = new ArrayList<>();
        }
        return this.gainInteractionRanges;
    }

    /**
     * Gets the value of the positionInteractionRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionInteractionRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionInteractionRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionInteractionRangeType }
     * 
     * 
     */
    public List<PositionInteractionRangeType> getPositionInteractionRanges() {
        if (positionInteractionRanges == null) {
            positionInteractionRanges = new ArrayList<>();
        }
        return this.positionInteractionRanges;
    }

    /**
     * Obtient la valeur de la propri�t� onOffInteract.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isOnOffInteract() {
        return onOffInteract;
    }

    /**
     * D�finit la valeur de la propri�t� onOffInteract.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOnOffInteract(java.lang.Boolean value) {
        this.onOffInteract = value;
    }

    /**
     * Obtient la valeur de la propri�t� gainInteract.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isGainInteract() {
        return gainInteract;
    }

    /**
     * D�finit la valeur de la propri�t� gainInteract.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setGainInteract(java.lang.Boolean value) {
        this.gainInteract = value;
    }

    /**
     * Obtient la valeur de la propri�t� positionInteract.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isPositionInteract() {
        return positionInteract;
    }

    /**
     * D�finit la valeur de la propri�t� positionInteract.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setPositionInteract(java.lang.Boolean value) {
        this.positionInteract = value;
    }

}
