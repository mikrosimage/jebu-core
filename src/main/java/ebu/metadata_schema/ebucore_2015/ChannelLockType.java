
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour channelLockType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="channelLockType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>boolean">
 *       &lt;attribute name="maxDistance" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channelLockType", propOrder = {
    "value"
})
public class ChannelLockType implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlValue
    protected boolean value;
    @XmlAttribute(name = "maxDistance")
    protected java.lang.Float maxDistance;

    /**
     * Obtient la valeur de la propriété value.
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété maxDistance.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getMaxDistance() {
        return maxDistance;
    }

    /**
     * Définit la valeur de la propriété maxDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setMaxDistance(java.lang.Float value) {
        this.maxDistance = value;
    }

}
