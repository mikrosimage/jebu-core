
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 *  A set of loudness parameters 
 * 
 * <p>Classe Java pour loudnessMetadataType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="loudnessMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="integratedLoudness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="loudnessRange" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxTruePeak" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxMomentary" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxShortTerm" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="dialogLoudness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="loudnessMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loudnessRecType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loudnessCorrectionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loudnessMetadataType", propOrder = {
    "integratedLoudness",
    "loudnessRange",
    "maxTruePeak",
    "maxMomentary",
    "maxShortTerm",
    "dialogLoudness"
})
public class LoudnessMetadataType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected java.lang.Float integratedLoudness;
    protected java.lang.Float loudnessRange;
    protected java.lang.Float maxTruePeak;
    protected java.lang.Float maxMomentary;
    protected java.lang.Float maxShortTerm;
    protected java.lang.Float dialogLoudness;
    @XmlAttribute(name = "loudnessMethod")
    protected java.lang.String loudnessMethod;
    @XmlAttribute(name = "loudnessRecType")
    protected java.lang.String loudnessRecType;
    @XmlAttribute(name = "loudnessCorrectionType")
    protected java.lang.String loudnessCorrectionType;

    /**
     * Obtient la valeur de la propriété integratedLoudness.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getIntegratedLoudness() {
        return integratedLoudness;
    }

    /**
     * Définit la valeur de la propriété integratedLoudness.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setIntegratedLoudness(java.lang.Float value) {
        this.integratedLoudness = value;
    }

    /**
     * Obtient la valeur de la propriété loudnessRange.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getLoudnessRange() {
        return loudnessRange;
    }

    /**
     * Définit la valeur de la propriété loudnessRange.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setLoudnessRange(java.lang.Float value) {
        this.loudnessRange = value;
    }

    /**
     * Obtient la valeur de la propriété maxTruePeak.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getMaxTruePeak() {
        return maxTruePeak;
    }

    /**
     * Définit la valeur de la propriété maxTruePeak.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setMaxTruePeak(java.lang.Float value) {
        this.maxTruePeak = value;
    }

    /**
     * Obtient la valeur de la propriété maxMomentary.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getMaxMomentary() {
        return maxMomentary;
    }

    /**
     * Définit la valeur de la propriété maxMomentary.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setMaxMomentary(java.lang.Float value) {
        this.maxMomentary = value;
    }

    /**
     * Obtient la valeur de la propriété maxShortTerm.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getMaxShortTerm() {
        return maxShortTerm;
    }

    /**
     * Définit la valeur de la propriété maxShortTerm.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setMaxShortTerm(java.lang.Float value) {
        this.maxShortTerm = value;
    }

    /**
     * Obtient la valeur de la propriété dialogLoudness.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getDialogLoudness() {
        return dialogLoudness;
    }

    /**
     * Définit la valeur de la propriété dialogLoudness.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setDialogLoudness(java.lang.Float value) {
        this.dialogLoudness = value;
    }

    /**
     * Obtient la valeur de la propriété loudnessMethod.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLoudnessMethod() {
        return loudnessMethod;
    }

    /**
     * Définit la valeur de la propriété loudnessMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLoudnessMethod(java.lang.String value) {
        this.loudnessMethod = value;
    }

    /**
     * Obtient la valeur de la propriété loudnessRecType.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLoudnessRecType() {
        return loudnessRecType;
    }

    /**
     * Définit la valeur de la propriété loudnessRecType.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLoudnessRecType(java.lang.String value) {
        this.loudnessRecType = value;
    }

    /**
     * Obtient la valeur de la propriété loudnessCorrectionType.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLoudnessCorrectionType() {
        return loudnessCorrectionType;
    }

    /**
     * Définit la valeur de la propriété loudnessCorrectionType.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLoudnessCorrectionType(java.lang.String value) {
        this.loudnessCorrectionType = value;
    }

}
