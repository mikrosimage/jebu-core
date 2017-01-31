
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A set of references to lookup MXF essence IDs.
 * 
 * <p>Classe Java pour audioMXFLookUpType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="audioMXFLookUpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageUIDRef" type="{urn:ebu:metadata-schema:ebuCore_2016}PackageIDType"/>
 *         &lt;element name="trackIDRef" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="channelIDRef" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioMXFLookUpType", propOrder = {
    "packageUIDRef",
    "trackIDRef",
    "channelIDRef"
})
public class AudioMXFLookUpType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected java.lang.String packageUIDRef;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String trackIDRef;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String channelIDRef;

    /**
     * Obtient la valeur de la propriété packageUIDRef.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPackageUIDRef() {
        return packageUIDRef;
    }

    /**
     * Définit la valeur de la propriété packageUIDRef.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPackageUIDRef(java.lang.String value) {
        this.packageUIDRef = value;
    }

    /**
     * Obtient la valeur de la propriété trackIDRef.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTrackIDRef() {
        return trackIDRef;
    }

    /**
     * Définit la valeur de la propriété trackIDRef.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTrackIDRef(java.lang.String value) {
        this.trackIDRef = value;
    }

    /**
     * Obtient la valeur de la propriété channelIDRef.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getChannelIDRef() {
        return channelIDRef;
    }

    /**
     * Définit la valeur de la propriété channelIDRef.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setChannelIDRef(java.lang.String value) {
        this.channelIDRef = value;
    }

}
