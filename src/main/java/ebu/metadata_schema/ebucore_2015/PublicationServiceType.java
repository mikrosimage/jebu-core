
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
 *  To provide information on the service associated with the publication.
 * 			
 * 
 * <p>Classe Java pour publicationServiceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="publicationServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicationServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publicationSource" type="{urn:ebu:metadata-schema:ebuCore_2015}organisationDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *       &lt;attribute name="serviceId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="linkToLogo" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publicationServiceType", propOrder = {
    "publicationServiceName",
    "publicationSource"
})
public class PublicationServiceType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected java.lang.String publicationServiceName;
    protected OrganisationDetailsType publicationSource;
    @XmlAttribute(name = "serviceId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String serviceId;
    @XmlAttribute(name = "linkToLogo")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String linkToLogo;
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

    /**
     * Obtient la valeur de la propriété publicationServiceName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPublicationServiceName() {
        return publicationServiceName;
    }

    /**
     * Définit la valeur de la propriété publicationServiceName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPublicationServiceName(java.lang.String value) {
        this.publicationServiceName = value;
    }

    /**
     * Obtient la valeur de la propriété publicationSource.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationDetailsType }
     *     
     */
    public OrganisationDetailsType getPublicationSource() {
        return publicationSource;
    }

    /**
     * Définit la valeur de la propriété publicationSource.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationDetailsType }
     *     
     */
    public void setPublicationSource(OrganisationDetailsType value) {
        this.publicationSource = value;
    }

    /**
     * Obtient la valeur de la propriété serviceId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }

    /**
     * Définit la valeur de la propriété serviceId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setServiceId(java.lang.String value) {
        this.serviceId = value;
    }

    /**
     * Obtient la valeur de la propriété linkToLogo.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLinkToLogo() {
        return linkToLogo;
    }

    /**
     * Définit la valeur de la propriété linkToLogo.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLinkToLogo(java.lang.String value) {
        this.linkToLogo = value;
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

}
