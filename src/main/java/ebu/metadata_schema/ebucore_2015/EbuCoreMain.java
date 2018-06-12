
package ebu.metadata_schema.ebucore_2015;

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
import eu.mikrosimage.xdmat.ebucore_2015.adapters.XmlDateAdapter;


/**
 * The root element of EBUCore.
 * 
 * <p>Classe Java pour ebuCoreMainType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
    @XmlJavaTypeAdapter(XmlDateAdapter .class)
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

    /**
     * Obtient la valeur de la propriété coreMetadata.
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
     * Définit la valeur de la propriété coreMetadata.
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
     * Obtient la valeur de la propriété metadataProvider.
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
     * Définit la valeur de la propriété metadataProvider.
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
     * Obtient la valeur de la propriété schema.
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
     * Définit la valeur de la propriété schema.
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
     * Obtient la valeur de la propriété version.
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
     * Définit la valeur de la propriété version.
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
     * Obtient la valeur de la propriété dateLastModified.
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
     * Définit la valeur de la propriété dateLastModified.
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
     * Obtient la valeur de la propriété timeLastModified.
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
     * Définit la valeur de la propriété timeLastModified.
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
     * Obtient la valeur de la propriété documentId.
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
     * Définit la valeur de la propriété documentId.
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
     * Obtient la valeur de la propriété documentLocation.
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
     * Définit la valeur de la propriété documentLocation.
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
     * Définit la valeur de la propriété lang.
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
