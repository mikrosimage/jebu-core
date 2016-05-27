
package ebu.metadata_schema.ebucore_2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The root element of EBUCore.
 * 
 * <p>Java class for ebuCoreMainType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ebuCoreMainType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coreMetadata" type="{urn:ebu:metadata-schema:ebuCore_2015}coreMetadataType"/>
 *         &lt;element name="metadataProvider" type="{urn:ebu:metadata-schema:ebuCore_2015}entityType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="1.6" />
 *       &lt;attribute name="dateLastModified" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="timeLastModified" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="documentId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="documentLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ebuCoreMainType", propOrder = {
    "coreMetadata",
    "metadataProvider"
})
public class EbuCoreMainType {

    @XmlElement(required = true)
    protected CoreMetadataType coreMetadata;
    protected EntityType metadataProvider;
    @XmlAttribute(name = "schema")
    @XmlSchemaType(name = "anySimpleType")
    protected java.lang.String schema;
    @XmlAttribute(name = "version")
    @XmlSchemaType(name = "anySimpleType")
    protected java.lang.String version;
    @XmlAttribute(name = "dateLastModified")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateLastModified;
    @XmlAttribute(name = "timeLastModified")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar timeLastModified;
    @XmlAttribute(name = "documentId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected java.lang.String documentId;
    @XmlAttribute(name = "documentLocation")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String documentLocation;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String lang;

    /**
     * Gets the value of the coreMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link CoreMetadataType }
     *     
     */
    public CoreMetadataType getCoreMetadata() {
        return coreMetadata;
    }

    /**
     * Sets the value of the coreMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoreMetadataType }
     *     
     */
    public void setCoreMetadata(CoreMetadataType value) {
        this.coreMetadata = value;
    }

    /**
     * Gets the value of the metadataProvider property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getMetadataProvider() {
        return metadataProvider;
    }

    /**
     * Sets the value of the metadataProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setMetadataProvider(EntityType value) {
        this.metadataProvider = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSchema(java.lang.String value) {
        this.schema = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVersion() {
        if (version == null) {
            return "1.6";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVersion(java.lang.String value) {
        this.version = value;
    }

    /**
     * Gets the value of the dateLastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastModified() {
        return dateLastModified;
    }

    /**
     * Sets the value of the dateLastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastModified(XMLGregorianCalendar value) {
        this.dateLastModified = value;
    }

    /**
     * Gets the value of the timeLastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeLastModified() {
        return timeLastModified;
    }

    /**
     * Sets the value of the timeLastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeLastModified(XMLGregorianCalendar value) {
        this.timeLastModified = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDocumentId(java.lang.String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the documentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDocumentLocation() {
        return documentLocation;
    }

    /**
     * Sets the value of the documentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDocumentLocation(java.lang.String value) {
        this.documentLocation = value;
    }

    /**
     *  An attribute to specify the dominant language used to express
     * 					metadata information in the document, which can be superceded each time an
     * 					language attribute or element is available a different levels of description
     * 					granularity 
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLang(java.lang.String value) {
        this.lang = value;
    }

}
