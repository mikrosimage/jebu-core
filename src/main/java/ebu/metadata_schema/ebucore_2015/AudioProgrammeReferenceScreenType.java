
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour audioProgrammeReferenceScreenType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="audioProgrammeReferenceScreenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aspectRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="screenCentrePosition" type="{urn:ebu:metadata-schema:ebuCore_2015}screenCentrePositionType" minOccurs="0"/>
 *         &lt;element name="screenWidth" type="{urn:ebu:metadata-schema:ebuCore_2015}screenWidthType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioProgrammeReferenceScreenType", propOrder = {
    "aspectRatio",
    "screenCentrePosition",
    "screenWidth"
})
public class AudioProgrammeReferenceScreenType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected java.lang.Float aspectRatio;
    protected ScreenCentrePositionType screenCentrePosition;
    protected ScreenWidthType screenWidth;

    /**
     * Obtient la valeur de la propriété aspectRatio.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getAspectRatio() {
        return aspectRatio;
    }

    /**
     * Définit la valeur de la propriété aspectRatio.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setAspectRatio(java.lang.Float value) {
        this.aspectRatio = value;
    }

    /**
     * Obtient la valeur de la propriété screenCentrePosition.
     * 
     * @return
     *     possible object is
     *     {@link ScreenCentrePositionType }
     *     
     */
    public ScreenCentrePositionType getScreenCentrePosition() {
        return screenCentrePosition;
    }

    /**
     * Définit la valeur de la propriété screenCentrePosition.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreenCentrePositionType }
     *     
     */
    public void setScreenCentrePosition(ScreenCentrePositionType value) {
        this.screenCentrePosition = value;
    }

    /**
     * Obtient la valeur de la propriété screenWidth.
     * 
     * @return
     *     possible object is
     *     {@link ScreenWidthType }
     *     
     */
    public ScreenWidthType getScreenWidth() {
        return screenWidth;
    }

    /**
     * Définit la valeur de la propriété screenWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreenWidthType }
     *     
     */
    public void setScreenWidth(ScreenWidthType value) {
        this.screenWidth = value;
    }

}
