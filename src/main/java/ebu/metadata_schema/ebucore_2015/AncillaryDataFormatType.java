
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to provide information on ancillary data format and purpose. This
 * 				type provides information on the Ancillary Data packet type. See SMPTE 291M, SMPTE
 * 				436M
 * 
 * <p>Classe Java pour ancillaryDataFormatType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ancillaryDataFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SDID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wrappingType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ancillaryDataFormatId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="ancillaryDataFormatName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ancillaryDataFormatProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ancillaryDataFormatType", propOrder = {
    "did",
    "sdid",
    "lineNumbers",
    "wrappingType"
})
public class AncillaryDataFormatType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "DID")
    protected BigInteger did;
    @XmlElement(name = "SDID")
    protected BigInteger sdid;
    @XmlElement(name = "lineNumber")
    protected List<BigInteger> lineNumbers;
    protected BigInteger wrappingType;
    @XmlAttribute(name = "ancillaryDataFormatId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String ancillaryDataFormatId;
    @XmlAttribute(name = "ancillaryDataFormatName")
    protected java.lang.String ancillaryDataFormatName;
    @XmlAttribute(name = "ancillaryDataFormatProfile")
    protected java.lang.String ancillaryDataFormatProfile;

    /**
     * Obtient la valeur de la propriété did.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDID() {
        return did;
    }

    /**
     * Définit la valeur de la propriété did.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDID(BigInteger value) {
        this.did = value;
    }

    /**
     * Obtient la valeur de la propriété sdid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSDID() {
        return sdid;
    }

    /**
     * Définit la valeur de la propriété sdid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSDID(BigInteger value) {
        this.sdid = value;
    }

    /**
     * Gets the value of the lineNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLineNumbers() {
        if (lineNumbers == null) {
            lineNumbers = new ArrayList<>();
        }
        return this.lineNumbers;
    }

    /**
     * Obtient la valeur de la propriété wrappingType.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWrappingType() {
        return wrappingType;
    }

    /**
     * Définit la valeur de la propriété wrappingType.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWrappingType(BigInteger value) {
        this.wrappingType = value;
    }

    /**
     * Obtient la valeur de la propriété ancillaryDataFormatId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAncillaryDataFormatId() {
        return ancillaryDataFormatId;
    }

    /**
     * Définit la valeur de la propriété ancillaryDataFormatId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAncillaryDataFormatId(java.lang.String value) {
        this.ancillaryDataFormatId = value;
    }

    /**
     * Obtient la valeur de la propriété ancillaryDataFormatName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAncillaryDataFormatName() {
        return ancillaryDataFormatName;
    }

    /**
     * Définit la valeur de la propriété ancillaryDataFormatName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAncillaryDataFormatName(java.lang.String value) {
        this.ancillaryDataFormatName = value;
    }

    /**
     * Obtient la valeur de la propriété ancillaryDataFormatProfile.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAncillaryDataFormatProfile() {
        return ancillaryDataFormatProfile;
    }

    /**
     * Définit la valeur de la propriété ancillaryDataFormatProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAncillaryDataFormatProfile(java.lang.String value) {
        this.ancillaryDataFormatProfile = value;
    }

}
