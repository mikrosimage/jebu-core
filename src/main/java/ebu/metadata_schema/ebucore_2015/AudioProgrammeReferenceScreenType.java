
package ebu.metadata_schema.ebucore_2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for audioProgrammeReferenceScreenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
public class AudioProgrammeReferenceScreenType {

    protected java.lang.Float aspectRatio;
    protected ScreenCentrePositionType screenCentrePosition;
    protected ScreenWidthType screenWidth;

    /**
     * Gets the value of the aspectRatio property.
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
     * Sets the value of the aspectRatio property.
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
     * Gets the value of the screenCentrePosition property.
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
     * Sets the value of the screenCentrePosition property.
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
     * Gets the value of the screenWidth property.
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
     * Sets the value of the screenWidth property.
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
