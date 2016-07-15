
package ebu.metadata_schema.ebucore_2015;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for audioObjectInteractionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audioObjectInteractionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gainInteractionRange" type="{urn:ebu:metadata-schema:ebuCore_2015}gainInteractionRangeType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="positionInteractionRange" type="{urn:ebu:metadata-schema:ebuCore_2015}positionInteractionRangeType" maxOccurs="6" minOccurs="0"/>
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
    "gainInteractionRange",
    "positionInteractionRange"
})
public class AudioObjectInteractionType {

    protected List<GainInteractionRangeType> gainInteractionRange;
    protected List<PositionInteractionRangeType> positionInteractionRange;
    @XmlAttribute(name = "onOffInteract")
    protected java.lang.Boolean onOffInteract;
    @XmlAttribute(name = "gainInteract")
    protected java.lang.Boolean gainInteract;
    @XmlAttribute(name = "positionInteract")
    protected java.lang.Boolean positionInteract;

    /**
     * Gets the value of the gainInteractionRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gainInteractionRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGainInteractionRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GainInteractionRangeType }
     * 
     * 
     */
    public List<GainInteractionRangeType> getGainInteractionRange() {
        if (gainInteractionRange == null) {
            gainInteractionRange = new ArrayList<>();
        }
        return this.gainInteractionRange;
    }

    /**
     * Gets the value of the positionInteractionRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionInteractionRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionInteractionRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionInteractionRangeType }
     * 
     * 
     */
    public List<PositionInteractionRangeType> getPositionInteractionRange() {
        if (positionInteractionRange == null) {
            positionInteractionRange = new ArrayList<>();
        }
        return this.positionInteractionRange;
    }

    /**
     * Gets the value of the onOffInteract property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getOnOffInteract() {
        return onOffInteract;
    }

    /**
     * Sets the value of the onOffInteract property.
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
     * Gets the value of the gainInteract property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getGainInteract() {
        return gainInteract;
    }

    /**
     * Sets the value of the gainInteract property.
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
     * Gets the value of the positionInteract property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getPositionInteract() {
        return positionInteract;
    }

    /**
     * Sets the value of the positionInteract property.
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
