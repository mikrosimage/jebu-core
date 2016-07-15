
package ebu.metadata_schema.ebucore_2015;

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
 * <p>Java class for rightsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
    "rightsHolder",
    "exploitationIssues",
    "copyrightStatement",
    "coverage",
    "rightsClearanceFlag",
    "processingRestrictionFlag",
    "disclaimer",
    "rightsAttributedId",
    "contactDetails"
})
public class RightsType {

    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    protected List<org.purl.dc.elements._1.ElementType> rights;
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String rightsLink;
    protected List<EntityType> rightsHolder;
    protected List<ebu.metadata_schema.ebucore_2015.ElementType> exploitationIssues;
    protected List<ebu.metadata_schema.ebucore_2015.ElementType> copyrightStatement;
    protected List<CoverageType> coverage;
    protected java.lang.Boolean rightsClearanceFlag;
    protected RightsType.ProcessingRestrictionFlag processingRestrictionFlag;
    protected List<ebu.metadata_schema.ebucore_2015.ElementType> disclaimer;
    protected List<IdentifierType> rightsAttributedId;
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
     * Gets the value of the rightsLink property.
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
     * Sets the value of the rightsLink property.
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
     * Gets the value of the rightsHolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightsHolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightsHolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityType }
     * 
     * 
     */
    public List<EntityType> getRightsHolder() {
        if (rightsHolder == null) {
            rightsHolder = new ArrayList<>();
        }
        return this.rightsHolder;
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
     * Gets the value of the copyrightStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyrightStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyrightStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ebu.metadata_schema.ebucore_2015.ElementType }
     * 
     * 
     */
    public List<ebu.metadata_schema.ebucore_2015.ElementType> getCopyrightStatement() {
        if (copyrightStatement == null) {
            copyrightStatement = new ArrayList<>();
        }
        return this.copyrightStatement;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageType }
     * 
     * 
     */
    public List<CoverageType> getCoverage() {
        if (coverage == null) {
            coverage = new ArrayList<>();
        }
        return this.coverage;
    }

    /**
     * Gets the value of the rightsClearanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getRightsClearanceFlag() {
        return rightsClearanceFlag;
    }

    /**
     * Sets the value of the rightsClearanceFlag property.
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
     * Gets the value of the processingRestrictionFlag property.
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
     * Sets the value of the processingRestrictionFlag property.
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
     * Gets the value of the disclaimer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclaimer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclaimer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ebu.metadata_schema.ebucore_2015.ElementType }
     * 
     * 
     */
    public List<ebu.metadata_schema.ebucore_2015.ElementType> getDisclaimer() {
        if (disclaimer == null) {
            disclaimer = new ArrayList<>();
        }
        return this.disclaimer;
    }

    /**
     * Gets the value of the rightsAttributedId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightsAttributedId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightsAttributedId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getRightsAttributedId() {
        if (rightsAttributedId == null) {
            rightsAttributedId = new ArrayList<>();
        }
        return this.rightsAttributedId;
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
     * Gets the value of the note property.
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
     * Sets the value of the note property.
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
     * Gets the value of the formatIDRefs property.
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
     * Sets the value of the formatIDRefs property.
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
     * Gets the value of the rightsID property.
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
     * Sets the value of the rightsID property.
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
     * Gets the value of the typeLabel property.
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
     * Sets the value of the typeLabel property.
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
     * Gets the value of the typeDefinition property.
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
     * Sets the value of the typeDefinition property.
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
     * Gets the value of the typeLink property.
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
     * Sets the value of the typeLink property.
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
     * Gets the value of the typeSource property.
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
     * Sets the value of the typeSource property.
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
     * Gets the value of the typeNamespace property.
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
     * Sets the value of the typeNamespace property.
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
     * Gets the value of the typeLanguage property.
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
     * Sets the value of the typeLanguage property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
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
    public static class ProcessingRestrictionFlag {

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
         * Gets the value of the value property.
         * 
         */
        public boolean isValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(boolean value) {
            this.value = value;
        }

        /**
         * Gets the value of the qualityClass property.
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
         * Sets the value of the qualityClass property.
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
         * Gets the value of the restrictions property.
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
         * Sets the value of the restrictions property.
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
         * Gets the value of the typeLabel property.
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
         * Sets the value of the typeLabel property.
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
         * Gets the value of the typeDefinition property.
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
         * Sets the value of the typeDefinition property.
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
         * Gets the value of the typeLink property.
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
         * Sets the value of the typeLink property.
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
         * Gets the value of the typeSource property.
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
         * Sets the value of the typeSource property.
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
         * Gets the value of the typeNamespace property.
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
         * Sets the value of the typeNamespace property.
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
         * Gets the value of the typeLanguage property.
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
         * Sets the value of the typeLanguage property.
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
