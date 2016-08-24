
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *  Used to provide information on the captioning format and purpose
 * 			
 * 
 * <p>Classe Java pour captioningFormatType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="captioningFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}formatGroup"/>
 *       &lt;attribute name="captioningFormatId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="captioningFormatName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="captioningFormatProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trackId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="trackName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="captioningSourceUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="closed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="captioningPresenceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "captioningFormatType")
public class CaptioningFormatType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlAttribute(name = "captioningFormatId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String captioningFormatId;
    @XmlAttribute(name = "captioningFormatName")
    protected java.lang.String captioningFormatName;
    @XmlAttribute(name = "captioningFormatProfile")
    protected java.lang.String captioningFormatProfile;
    @XmlAttribute(name = "trackId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected java.lang.String trackId;
    @XmlAttribute(name = "trackName")
    protected java.lang.String trackName;
    @XmlAttribute(name = "captioningSourceUri")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String captioningSourceUri;
    @XmlAttribute(name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String language;
    @XmlAttribute(name = "closed")
    protected java.lang.Boolean closed;
    @XmlAttribute(name = "captioningPresenceFlag")
    protected java.lang.Boolean captioningPresenceFlag;
    @XmlAttribute(name = "typeLabel")
    protected java.lang.String typeLabel;
    @XmlAttribute(name = "typeDefinition")
    protected java.lang.String typeDefinition;
    @XmlAttribute(name = "typeLink")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String typeLink;
    @XmlAttribute(name = "typeSource")
    protected java.lang.String typeSource;
    @XmlAttribute(name = "typeNamespace")
    protected java.lang.String typeNamespace;
    @XmlAttribute(name = "typeLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String typeLanguage;
    @XmlAttribute(name = "formatLabel")
    protected java.lang.String formatLabel;
    @XmlAttribute(name = "formatDefinition")
    protected java.lang.String formatDefinition;
    @XmlAttribute(name = "formatLink")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String formatLink;
    @XmlAttribute(name = "formatSource")
    protected java.lang.String formatSource;
    @XmlAttribute(name = "formatNamespace")
    protected java.lang.String formatNamespace;
    @XmlAttribute(name = "formatLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String formatLanguage;

    /**
     * Obtient la valeur de la propriété captioningFormatId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCaptioningFormatId() {
        return captioningFormatId;
    }

    /**
     * Définit la valeur de la propriété captioningFormatId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCaptioningFormatId(java.lang.String value) {
        this.captioningFormatId = value;
    }

    /**
     * Obtient la valeur de la propriété captioningFormatName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCaptioningFormatName() {
        return captioningFormatName;
    }

    /**
     * Définit la valeur de la propriété captioningFormatName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCaptioningFormatName(java.lang.String value) {
        this.captioningFormatName = value;
    }

    /**
     * Obtient la valeur de la propriété captioningFormatProfile.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCaptioningFormatProfile() {
        return captioningFormatProfile;
    }

    /**
     * Définit la valeur de la propriété captioningFormatProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCaptioningFormatProfile(java.lang.String value) {
        this.captioningFormatProfile = value;
    }

    /**
     * Obtient la valeur de la propriété trackId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTrackId() {
        return trackId;
    }

    /**
     * Définit la valeur de la propriété trackId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTrackId(java.lang.String value) {
        this.trackId = value;
    }

    /**
     * Obtient la valeur de la propriété trackName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTrackName() {
        return trackName;
    }

    /**
     * Définit la valeur de la propriété trackName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTrackName(java.lang.String value) {
        this.trackName = value;
    }

    /**
     * Obtient la valeur de la propriété captioningSourceUri.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCaptioningSourceUri() {
        return captioningSourceUri;
    }

    /**
     * Définit la valeur de la propriété captioningSourceUri.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCaptioningSourceUri(java.lang.String value) {
        this.captioningSourceUri = value;
    }

    /**
     * Obtient la valeur de la propriété language.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLanguage() {
        return language;
    }

    /**
     * Définit la valeur de la propriété language.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLanguage(java.lang.String value) {
        this.language = value;
    }

    /**
     * Obtient la valeur de la propriété closed.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isClosed() {
        return closed;
    }

    /**
     * Définit la valeur de la propriété closed.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setClosed(java.lang.Boolean value) {
        this.closed = value;
    }

    /**
     * Obtient la valeur de la propriété captioningPresenceFlag.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isCaptioningPresenceFlag() {
        return captioningPresenceFlag;
    }

    /**
     * Définit la valeur de la propriété captioningPresenceFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setCaptioningPresenceFlag(java.lang.Boolean value) {
        this.captioningPresenceFlag = value;
    }

    /**
     * Obtient la valeur de la propriété typeLabel.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLabel() {
        return typeLabel;
    }

    /**
     * Définit la valeur de la propriété typeLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLabel(java.lang.String value) {
        this.typeLabel = value;
    }

    /**
     * Obtient la valeur de la propriété typeDefinition.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeDefinition() {
        return typeDefinition;
    }

    /**
     * Définit la valeur de la propriété typeDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeDefinition(java.lang.String value) {
        this.typeDefinition = value;
    }

    /**
     * Obtient la valeur de la propriété typeLink.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLink() {
        return typeLink;
    }

    /**
     * Définit la valeur de la propriété typeLink.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLink(java.lang.String value) {
        this.typeLink = value;
    }

    /**
     * Obtient la valeur de la propriété typeSource.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeSource() {
        return typeSource;
    }

    /**
     * Définit la valeur de la propriété typeSource.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeSource(java.lang.String value) {
        this.typeSource = value;
    }

    /**
     * Obtient la valeur de la propriété typeNamespace.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeNamespace() {
        return typeNamespace;
    }

    /**
     * Définit la valeur de la propriété typeNamespace.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeNamespace(java.lang.String value) {
        this.typeNamespace = value;
    }

    /**
     * Obtient la valeur de la propriété typeLanguage.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLanguage() {
        return typeLanguage;
    }

    /**
     * Définit la valeur de la propriété typeLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLanguage(java.lang.String value) {
        this.typeLanguage = value;
    }

    /**
     * Obtient la valeur de la propriété formatLabel.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatLabel() {
        return formatLabel;
    }

    /**
     * Définit la valeur de la propriété formatLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatLabel(java.lang.String value) {
        this.formatLabel = value;
    }

    /**
     * Obtient la valeur de la propriété formatDefinition.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatDefinition() {
        return formatDefinition;
    }

    /**
     * Définit la valeur de la propriété formatDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatDefinition(java.lang.String value) {
        this.formatDefinition = value;
    }

    /**
     * Obtient la valeur de la propriété formatLink.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatLink() {
        return formatLink;
    }

    /**
     * Définit la valeur de la propriété formatLink.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatLink(java.lang.String value) {
        this.formatLink = value;
    }

    /**
     * Obtient la valeur de la propriété formatSource.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatSource() {
        return formatSource;
    }

    /**
     * Définit la valeur de la propriété formatSource.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatSource(java.lang.String value) {
        this.formatSource = value;
    }

    /**
     * Obtient la valeur de la propriété formatNamespace.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatNamespace() {
        return formatNamespace;
    }

    /**
     * Définit la valeur de la propriété formatNamespace.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatNamespace(java.lang.String value) {
        this.formatNamespace = value;
    }

    /**
     * Obtient la valeur de la propriété formatLanguage.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatLanguage() {
        return formatLanguage;
    }

    /**
     * Définit la valeur de la propriété formatLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatLanguage(java.lang.String value) {
        this.formatLanguage = value;
    }

}
