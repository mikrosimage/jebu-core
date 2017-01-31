
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour audioProgrammeType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="audioProgrammeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audioContentIDRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loudnessMetadata" type="{urn:ebu:metadata-schema:ebuCore_2016}loudnessMetadataType" minOccurs="0"/>
 *         &lt;element name="audioProgrammeReferenceScreen" type="{urn:ebu:metadata-schema:ebuCore_2016}audioProgrammeReferenceScreenType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}formatGroup"/>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
 *       &lt;attribute name="audioProgrammeID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="audioProgrammeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="audioProgrammeLanguage" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="start" type="{urn:ebu:metadata-schema:ebuCore_2016}timecodeStringType" />
 *       &lt;attribute name="editRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="end" type="{urn:ebu:metadata-schema:ebuCore_2016}timecodeStringType" />
 *       &lt;attribute name="dropframe" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="factorNumerator" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
 *       &lt;attribute name="factorDenominator" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
 *       &lt;attribute name="maxDuckingDepth" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioProgrammeType", propOrder = {
    "audioContentIDReves",
    "loudnessMetadata",
    "audioProgrammeReferenceScreen"
})
@XmlRootElement(name = "audioProgramme")
public class AudioProgramme
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "audioContentIDRef", namespace = "urn:ebu:metadata-schema:ebuCore_2016", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> audioContentIDReves;
    protected LoudnessMetadataType loudnessMetadata;
    protected AudioProgrammeReferenceScreenType audioProgrammeReferenceScreen;
    @XmlAttribute(name = "audioProgrammeID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String audioProgrammeID;
    @XmlAttribute(name = "audioProgrammeName")
    protected java.lang.String audioProgrammeName;
    @XmlAttribute(name = "audioProgrammeLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String audioProgrammeLanguage;
    @XmlAttribute(name = "start")
    protected java.lang.String start;
    @XmlAttribute(name = "editRate")
    protected java.lang.Float editRate;
    @XmlAttribute(name = "end")
    protected java.lang.String end;
    @XmlAttribute(name = "dropframe")
    protected java.lang.Boolean dropframe;
    @XmlAttribute(name = "factorNumerator")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger factorNumerator;
    @XmlAttribute(name = "factorDenominator")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger factorDenominator;
    @XmlAttribute(name = "maxDuckingDepth")
    protected java.lang.Float maxDuckingDepth;
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
    @XmlAttribute(name = "formatThesaurus")
    protected java.lang.String formatThesaurus;
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
     * Gets the value of the audioContentIDReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioContentIDReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioContentIDReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAudioContentIDReves() {
        if (audioContentIDReves == null) {
            audioContentIDReves = new ArrayList<>();
        }
        return this.audioContentIDReves;
    }

    /**
     * Obtient la valeur de la propri�t� loudnessMetadata.
     * 
     * @return
     *     possible object is
     *     {@link LoudnessMetadataType }
     *     
     */
    public LoudnessMetadataType getLoudnessMetadata() {
        return loudnessMetadata;
    }

    /**
     * D�finit la valeur de la propri�t� loudnessMetadata.
     * 
     * @param value
     *     allowed object is
     *     {@link LoudnessMetadataType }
     *     
     */
    public void setLoudnessMetadata(LoudnessMetadataType value) {
        this.loudnessMetadata = value;
    }

    /**
     * Obtient la valeur de la propri�t� audioProgrammeReferenceScreen.
     * 
     * @return
     *     possible object is
     *     {@link AudioProgrammeReferenceScreenType }
     *     
     */
    public AudioProgrammeReferenceScreenType getAudioProgrammeReferenceScreen() {
        return audioProgrammeReferenceScreen;
    }

    /**
     * D�finit la valeur de la propri�t� audioProgrammeReferenceScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioProgrammeReferenceScreenType }
     *     
     */
    public void setAudioProgrammeReferenceScreen(AudioProgrammeReferenceScreenType value) {
        this.audioProgrammeReferenceScreen = value;
    }

    /**
     * Obtient la valeur de la propri�t� audioProgrammeID.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioProgrammeID() {
        return audioProgrammeID;
    }

    /**
     * D�finit la valeur de la propri�t� audioProgrammeID.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioProgrammeID(java.lang.String value) {
        this.audioProgrammeID = value;
    }

    /**
     * Obtient la valeur de la propri�t� audioProgrammeName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioProgrammeName() {
        return audioProgrammeName;
    }

    /**
     * D�finit la valeur de la propri�t� audioProgrammeName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioProgrammeName(java.lang.String value) {
        this.audioProgrammeName = value;
    }

    /**
     * Obtient la valeur de la propri�t� audioProgrammeLanguage.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioProgrammeLanguage() {
        return audioProgrammeLanguage;
    }

    /**
     * D�finit la valeur de la propri�t� audioProgrammeLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioProgrammeLanguage(java.lang.String value) {
        this.audioProgrammeLanguage = value;
    }

    /**
     * Obtient la valeur de la propri�t� start.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getStart() {
        return start;
    }

    /**
     * D�finit la valeur de la propri�t� start.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setStart(java.lang.String value) {
        this.start = value;
    }

    /**
     * Obtient la valeur de la propri�t� editRate.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getEditRate() {
        return editRate;
    }

    /**
     * D�finit la valeur de la propri�t� editRate.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setEditRate(java.lang.Float value) {
        this.editRate = value;
    }

    /**
     * Obtient la valeur de la propri�t� end.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getEnd() {
        return end;
    }

    /**
     * D�finit la valeur de la propri�t� end.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setEnd(java.lang.String value) {
        this.end = value;
    }

    /**
     * Obtient la valeur de la propri�t� dropframe.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isDropframe() {
        return dropframe;
    }

    /**
     * D�finit la valeur de la propri�t� dropframe.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setDropframe(java.lang.Boolean value) {
        this.dropframe = value;
    }

    /**
     * Obtient la valeur de la propri�t� factorNumerator.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFactorNumerator() {
        if (factorNumerator == null) {
            return new BigInteger("1");
        } else {
            return factorNumerator;
        }
    }

    /**
     * D�finit la valeur de la propri�t� factorNumerator.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFactorNumerator(BigInteger value) {
        this.factorNumerator = value;
    }

    /**
     * Obtient la valeur de la propri�t� factorDenominator.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFactorDenominator() {
        if (factorDenominator == null) {
            return new BigInteger("1");
        } else {
            return factorDenominator;
        }
    }

    /**
     * D�finit la valeur de la propri�t� factorDenominator.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFactorDenominator(BigInteger value) {
        this.factorDenominator = value;
    }

    /**
     * Obtient la valeur de la propri�t� maxDuckingDepth.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getMaxDuckingDepth() {
        return maxDuckingDepth;
    }

    /**
     * D�finit la valeur de la propri�t� maxDuckingDepth.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setMaxDuckingDepth(java.lang.Float value) {
        this.maxDuckingDepth = value;
    }

    /**
     * Obtient la valeur de la propri�t� formatLabel.
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
     * D�finit la valeur de la propri�t� formatLabel.
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
     * Obtient la valeur de la propri�t� formatDefinition.
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
     * D�finit la valeur de la propri�t� formatDefinition.
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
     * Obtient la valeur de la propri�t� formatLink.
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
     * D�finit la valeur de la propri�t� formatLink.
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
     * Obtient la valeur de la propri�t� formatSource.
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
     * D�finit la valeur de la propri�t� formatSource.
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
     * Obtient la valeur de la propri�t� formatNamespace.
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
     * D�finit la valeur de la propri�t� formatNamespace.
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
     * Obtient la valeur de la propri�t� formatLanguage.
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
     * D�finit la valeur de la propri�t� formatLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatLanguage(java.lang.String value) {
        this.formatLanguage = value;
    }

    /**
     * Obtient la valeur de la propri�t� formatThesaurus.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatThesaurus() {
        return formatThesaurus;
    }

    /**
     * D�finit la valeur de la propri�t� formatThesaurus.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatThesaurus(java.lang.String value) {
        this.formatThesaurus = value;
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
