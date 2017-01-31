
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * To identify a person, group of persons or organisation
 * 
 * <p>Classe Java pour entityType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="entityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactDetails" type="{urn:ebu:metadata-schema:ebuCore_2015}contactDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="organisationDetails" type="{urn:ebu:metadata-schema:ebuCore_2015}organisationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="role" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *                 &lt;attribute name="costCentre" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="award" type="{urn:ebu:metadata-schema:ebuCore_2015}awardType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="entityId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entityType", propOrder = {
    "contactDetails",
    "organisationDetails",
    "roles",
    "awards"
})
public class EntityType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected List<ContactDetailsType> contactDetails;
    protected List<OrganisationDetailsType> organisationDetails;
    @XmlElement(name = "role")
    protected List<EntityType.Role> roles;
    @XmlElement(name = "award")
    protected List<AwardType> awards;
    @XmlAttribute(name = "entityId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String entityId;

    /**
     * Gets the value of the contactDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetailsType }
     * 
     * 
     */
    public List<ContactDetailsType> getContactDetails() {
        if (contactDetails == null) {
            contactDetails = new ArrayList<>();
        }
        return this.contactDetails;
    }

    /**
     * Gets the value of the organisationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationDetailsType }
     * 
     * 
     */
    public List<OrganisationDetailsType> getOrganisationDetails() {
        if (organisationDetails == null) {
            organisationDetails = new ArrayList<>();
        }
        return this.organisationDetails;
    }

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityType.Role }
     * 
     * 
     */
    public List<EntityType.Role> getRoles() {
        if (roles == null) {
            roles = new ArrayList<>();
        }
        return this.roles;
    }

    /**
     * Gets the value of the awards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardType }
     * 
     * 
     */
    public List<AwardType> getAwards() {
        if (awards == null) {
            awards = new ArrayList<>();
        }
        return this.awards;
    }

    /**
     * Obtient la valeur de la propriété entityId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getEntityId() {
        return entityId;
    }

    /**
     * Définit la valeur de la propriété entityId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setEntityId(java.lang.String value) {
        this.entityId = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
     *       &lt;attribute name="costCentre" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Role
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlAttribute(name = "costCentre")
        @XmlSchemaType(name = "anySimpleType")
        protected java.lang.String costCentre;
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
         * Obtient la valeur de la propriété costCentre.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getCostCentre() {
            return costCentre;
        }

        /**
         * Définit la valeur de la propriété costCentre.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setCostCentre(java.lang.String value) {
            this.costCentre = value;
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

}
