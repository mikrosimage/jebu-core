
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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An all-purpose field to identify information (rights management statement
 * 				or reference to a service providing such information e.g. via a URL) about
 * 				copyright, intellectual property rights or other property rights held in and over a
 * 				resource, stating whether open access or restricted in some way. If dates, times,
 * 				territories and availability periods are associated with a right, they should be
 * 				included. If the Rights element is absent, no assumptions can be made about the
 * 				status of these and other rights with respect to the resource. 
 * 
 * <p>Classe Java pour rightsType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="rightsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}rights" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rightsLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="rightsHolder" type="{urn:ebu:metadata-schema:ebuCore_2015}entityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exploitationIssues" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="copyrightStatement" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coverage" type="{urn:ebu:metadata-schema:ebuCore_2015}coverageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rightsClearanceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="processingRestrictionFlag" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>boolean">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *                 &lt;attribute name="qualityClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="restrictions" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="disclaimer" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rightsAttributedId" type="{urn:ebu:metadata-schema:ebuCore_2015}identifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactDetails" type="{urn:ebu:metadata-schema:ebuCore_2015}contactDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *       &lt;attribute name="note" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="formatIDRefs" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="rightsID" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rightsType", propOrder = {
    "rights",
    "rightsLink",
    "rightsHolders",
    "exploitationIssues",
    "copyrightStatements",
    "coverages",
    "rightsClearanceFlag",
    "processingRestrictionFlag",
    "disclaimers",
    "rightsAttributedIds",
    "contactDetails"
})
public class RightsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    protected List<org.purl.dc.elements._1.ElementType> rights;
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String rightsLink;
    @XmlElement(name = "rightsHolder")
    protected List<EntityType> rightsHolders;
    protected List<ebu.metadata_schema.ebucore_2015.ElementType> exploitationIssues;
    @XmlElement(name = "copyrightStatement")
    protected List<ebu.metadata_schema.ebucore_2015.ElementType> copyrightStatements;
    @XmlElement(name = "coverage")
    protected List<CoverageType> coverages;
    protected java.lang.Boolean rightsClearanceFlag;
    protected RightsType.ProcessingRestrictionFlag processingRestrictionFlag;
    @XmlElement(name = "disclaimer")
    protected List<ebu.metadata_schema.ebucore_2015.ElementType> disclaimers;
    @XmlElement(name = "rightsAttributedId")
    protected List<IdentifierType> rightsAttributedIds;
    protected List<ContactDetailsType> contactDetails;
    @XmlAttribute(name = "note")
    protected java.lang.String note;
    @XmlAttribute(name = "formatIDRefs")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String formatIDRefs;
    @XmlAttribute(name = "rightsID")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String rightsID;
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
     *  The EBU core metadata set is built as a refinement of the Dublin
     * 						Core. An element to express any form of rights related
     * 						matters.Gets the value of the rights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.purl.dc.elements._1.ElementType }
     * 
     * 
     */
    public List<org.purl.dc.elements._1.ElementType> getRights() {
        if (rights == null) {
            rights = new ArrayList<>();
        }
        return this.rights;
    }

    /**
     * Obtient la valeur de la propriété rightsLink.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRightsLink() {
        return rightsLink;
    }

    /**
     * Définit la valeur de la propriété rightsLink.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRightsLink(java.lang.String value) {
        this.rightsLink = value;
    }

    /**
     * Gets the value of the rightsHolders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightsHolders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightsHolders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityType }
     * 
     * 
     */
    public List<EntityType> getRightsHolders() {
        if (rightsHolders == null) {
            rightsHolders = new ArrayList<>();
        }
        return this.rightsHolders;
    }

    /**
     * Gets the value of the exploitationIssues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exploitationIssues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExploitationIssues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ebu.metadata_schema.ebucore_2015.ElementType }
     * 
     * 
     */
    public List<ebu.metadata_schema.ebucore_2015.ElementType> getExploitationIssues() {
        if (exploitationIssues == null) {
            exploitationIssues = new ArrayList<>();
        }
        return this.exploitationIssues;
    }

    /**
     * Gets the value of the copyrightStatements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyrightStatements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyrightStatements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ebu.metadata_schema.ebucore_2015.ElementType }
     * 
     * 
     */
    public List<ebu.metadata_schema.ebucore_2015.ElementType> getCopyrightStatements() {
        if (copyrightStatements == null) {
            copyrightStatements = new ArrayList<>();
        }
        return this.copyrightStatements;
    }

    /**
     * Gets the value of the coverages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageType }
     * 
     * 
     */
    public List<CoverageType> getCoverages() {
        if (coverages == null) {
            coverages = new ArrayList<>();
        }
        return this.coverages;
    }

    /**
     * Obtient la valeur de la propriété rightsClearanceFlag.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isRightsClearanceFlag() {
        return rightsClearanceFlag;
    }

    /**
     * Définit la valeur de la propriété rightsClearanceFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setRightsClearanceFlag(java.lang.Boolean value) {
        this.rightsClearanceFlag = value;
    }

    /**
     * Obtient la valeur de la propriété processingRestrictionFlag.
     * 
     * @return
     *     possible object is
     *     {@link RightsType.ProcessingRestrictionFlag }
     *     
     */
    public RightsType.ProcessingRestrictionFlag getProcessingRestrictionFlag() {
        return processingRestrictionFlag;
    }

    /**
     * Définit la valeur de la propriété processingRestrictionFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link RightsType.ProcessingRestrictionFlag }
     *     
     */
    public void setProcessingRestrictionFlag(RightsType.ProcessingRestrictionFlag value) {
        this.processingRestrictionFlag = value;
    }

    /**
     * Gets the value of the disclaimers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclaimers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclaimers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ebu.metadata_schema.ebucore_2015.ElementType }
     * 
     * 
     */
    public List<ebu.metadata_schema.ebucore_2015.ElementType> getDisclaimers() {
        if (disclaimers == null) {
            disclaimers = new ArrayList<>();
        }
        return this.disclaimers;
    }

    /**
     * Gets the value of the rightsAttributedIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightsAttributedIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightsAttributedIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getRightsAttributedIds() {
        if (rightsAttributedIds == null) {
            rightsAttributedIds = new ArrayList<>();
        }
        return this.rightsAttributedIds;
    }

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
     * Obtient la valeur de la propriété note.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNote() {
        return note;
    }

    /**
     * Définit la valeur de la propriété note.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNote(java.lang.String value) {
        this.note = value;
    }

    /**
     * Obtient la valeur de la propriété formatIDRefs.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatIDRefs() {
        return formatIDRefs;
    }

    /**
     * Définit la valeur de la propriété formatIDRefs.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatIDRefs(java.lang.String value) {
        this.formatIDRefs = value;
    }

    /**
     * Obtient la valeur de la propriété rightsID.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRightsID() {
        return rightsID;
    }

    /**
     * Définit la valeur de la propriété rightsID.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRightsID(java.lang.String value) {
        this.rightsID = value;
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
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>boolean">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
     *       &lt;attribute name="qualityClass" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="restrictions" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ProcessingRestrictionFlag
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlValue
        protected boolean value;
        @XmlAttribute(name = "qualityClass")
        protected java.lang.String qualityClass;
        @XmlAttribute(name = "restrictions")
        protected java.lang.String restrictions;
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
         * Obtient la valeur de la propriété qualityClass.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getQualityClass() {
            return qualityClass;
        }

        /**
         * Définit la valeur de la propriété qualityClass.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setQualityClass(java.lang.String value) {
            this.qualityClass = value;
        }

        /**
         * Obtient la valeur de la propriété restrictions.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getRestrictions() {
            return restrictions;
        }

        /**
         * Définit la valeur de la propriété restrictions.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setRestrictions(java.lang.String value) {
            this.restrictions = value;
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
