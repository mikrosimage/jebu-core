
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import eu.mikrosimage.xdmat.ebucore.adapters.XmlDateAdapter;


/**
 * The root element of EBUCore.
 * 
 * <p>Classe Java pour ebuCoreMainType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ebuCoreMainType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coreMetadata" type="{urn:ebu:metadata-schema:ebuCore_2016}coreMetadataType"/>
 *         &lt;element name="metadataProvider" type="{urn:ebu:metadata-schema:ebuCore_2016}entityType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
 *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="1.7" />
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
@XmlRootElement(name = "ebuCoreMain")
public class EbuCoreMain
    implements Serializable
{

    private final static long serialVersionUID = -1L;
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
    @XmlJavaTypeAdapter(XmlDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date dateLastModified;
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
    @XmlAttribute(name = "typeThesaurus")
    protected java.lang.String typeThesaurus;

    /**
     * Obtient la valeur de la propri�t� coreMetadata.
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
     * D�finit la valeur de la propri�t� coreMetadata.
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
     * Obtient la valeur de la propri�t� metadataProvider.
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
     * D�finit la valeur de la propri�t� metadataProvider.
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
     * Obtient la valeur de la propri�t� schema.
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
     * D�finit la valeur de la propri�t� schema.
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
     * Obtient la valeur de la propri�t� version.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVersion() {
        if (version == null) {
            return "1.7";
        } else {
            return version;
        }
    }

    /**
     * D�finit la valeur de la propri�t� version.
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
     * Obtient la valeur de la propri�t� dateLastModified.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Date getDateLastModified() {
        return dateLastModified;
    }

    /**
     * D�finit la valeur de la propri�t� dateLastModified.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDateLastModified(Date value) {
        this.dateLastModified = value;
    }

    /**
     * Obtient la valeur de la propri�t� timeLastModified.
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
     * D�finit la valeur de la propri�t� timeLastModified.
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
     * Obtient la valeur de la propri�t� documentId.
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
     * D�finit la valeur de la propri�t� documentId.
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
     * Obtient la valeur de la propri�t� documentLocation.
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
     * D�finit la valeur de la propri�t� documentLocation.
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
     * D�finit la valeur de la propri�t� lang.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLang(java.lang.String value) {
        this.lang = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeLabel.
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
     * D�finit la valeur de la propri�t� typeLabel.
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
     * Obtient la valeur de la propri�t� typeDefinition.
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
     * D�finit la valeur de la propri�t� typeDefinition.
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
     * Obtient la valeur de la propri�t� typeLink.
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
     * D�finit la valeur de la propri�t� typeLink.
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
     * Obtient la valeur de la propri�t� typeSource.
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
     * D�finit la valeur de la propri�t� typeSource.
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
     * Obtient la valeur de la propri�t� typeNamespace.
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
     * D�finit la valeur de la propri�t� typeNamespace.
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
     * Obtient la valeur de la propri�t� typeLanguage.
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
     * D�finit la valeur de la propri�t� typeLanguage.
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
     * Obtient la valeur de la propri�t� typeThesaurus.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeThesaurus() {
        return typeThesaurus;
    }

    /**
     * D�finit la valeur de la propri�t� typeThesaurus.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeThesaurus(java.lang.String value) {
        this.typeThesaurus = value;
    }

}
