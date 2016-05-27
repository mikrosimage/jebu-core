
package ebu.metadata_schema.ebucore_2015;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.purl.dc.elements._1.ElementType;


/**
 * The document containing all the core descriptive information regarding
 * 				the resource
 * 
 * <p>Java class for coreMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coreMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{urn:ebu:metadata-schema:ebuCore_2015}titleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="alternativeTitle" type="{urn:ebu:metadata-schema:ebuCore_2015}alternativeTitleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creator" type="{urn:ebu:metadata-schema:ebuCore_2015}entityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{urn:ebu:metadata-schema:ebuCore_2015}subjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{urn:ebu:metadata-schema:ebuCore_2015}descriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="publisher" type="{urn:ebu:metadata-schema:ebuCore_2015}entityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contributor" type="{urn:ebu:metadata-schema:ebuCore_2015}entityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date" type="{urn:ebu:metadata-schema:ebuCore_2015}dateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:ebu:metadata-schema:ebuCore_2015}typeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="format" type="{urn:ebu:metadata-schema:ebuCore_2015}formatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="identifier" type="{urn:ebu:metadata-schema:ebuCore_2015}identifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}source" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="language" type="{urn:ebu:metadata-schema:ebuCore_2015}languageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relation" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isRelatedTo" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isNextInSequence" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="followsInSequence" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isVersionOf" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasVersion" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isReplacedBy" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="replaces" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isRequiredBy" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requires" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isPartOf" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasPart" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasTrackPart" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:ebu:metadata-schema:ebuCore_2015}relationType">
 *                 &lt;sequence>
 *                   &lt;element name="trackPartTitle" type="{urn:ebu:metadata-schema:ebuCore_2015}alternativeTitleType"/>
 *                   &lt;element name="destinationId" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                   &lt;element name="destinationStart" type="{urn:ebu:metadata-schema:ebuCore_2015}timeType" minOccurs="0"/>
 *                   &lt;element name="destinationEnd" type="{urn:ebu:metadata-schema:ebuCore_2015}timeType" minOccurs="0"/>
 *                   &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                   &lt;element name="sourceStart" type="{urn:ebu:metadata-schema:ebuCore_2015}timeType" minOccurs="0"/>
 *                   &lt;element name="sourceEnd" type="{urn:ebu:metadata-schema:ebuCore_2015}timeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="isReferencedBy" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="references" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isFormatOf" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasFormat" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isEpisodeOf" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isSeasonOf" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasEpisode" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasSeason" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasSeries" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isSeriesOf" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isMemberOf" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasMember" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sameAs" type="{urn:ebu:metadata-schema:ebuCore_2015}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coverage" type="{urn:ebu:metadata-schema:ebuCore_2015}coverageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rights" type="{urn:ebu:metadata-schema:ebuCore_2015}rightsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="version" type="{urn:ebu:metadata-schema:ebuCore_2015}versionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="publicationHistory" type="{urn:ebu:metadata-schema:ebuCore_2015}publicationHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="planning" type="{urn:ebu:metadata-schema:ebuCore_2015}planningType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rating" type="{urn:ebu:metadata-schema:ebuCore_2015}ratingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="audienceRating" type="{urn:ebu:metadata-schema:ebuCore_2015}ratingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="event" type="{urn:ebu:metadata-schema:ebuCore_2015}eventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="part" type="{urn:ebu:metadata-schema:ebuCore_2015}partType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coreMetadataType", propOrder = {
    "title",
    "alternativeTitle",
    "creator",
    "subject",
    "description",
    "publisher",
    "contributor",
    "date",
    "type",
    "format",
    "identifier",
    "source",
    "language",
    "relation",
    "isRelatedTo",
    "isNextInSequence",
    "followsInSequence",
    "isVersionOf",
    "hasVersion",
    "isReplacedBy",
    "replaces",
    "isRequiredBy",
    "requires",
    "isPartOf",
    "hasPart",
    "hasTrackPart",
    "isReferencedBy",
    "references",
    "isFormatOf",
    "hasFormat",
    "isEpisodeOf",
    "isSeasonOf",
    "hasEpisode",
    "hasSeason",
    "hasSeries",
    "isSeriesOf",
    "isMemberOf",
    "hasMember",
    "sameAs",
    "coverage",
    "rights",
    "version",
    "publicationHistory",
    "planning",
    "rating",
    "audienceRating",
    "event",
    "part"
})
@XmlSeeAlso({
    PartType.class
})
public class CoreMetadataType {

    protected List<TitleType> title;
    protected List<AlternativeTitleType> alternativeTitle;
    protected List<EntityType> creator;
    protected List<SubjectType> subject;
    protected List<DescriptionType> description;
    protected List<EntityType> publisher;
    protected List<EntityType> contributor;
    protected List<DateType> date;
    protected List<TypeType> type;
    protected List<FormatType> format;
    protected List<IdentifierType> identifier;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    protected List<ElementType> source;
    protected List<LanguageType> language;
    protected List<RelationType> relation;
    protected List<RelationType> isRelatedTo;
    protected List<RelationType> isNextInSequence;
    protected List<RelationType> followsInSequence;
    protected List<RelationType> isVersionOf;
    protected List<RelationType> hasVersion;
    protected List<RelationType> isReplacedBy;
    protected List<RelationType> replaces;
    protected List<RelationType> isRequiredBy;
    protected List<RelationType> requires;
    protected List<RelationType> isPartOf;
    protected List<RelationType> hasPart;
    protected List<CoreMetadataType.HasTrackPart> hasTrackPart;
    protected List<RelationType> isReferencedBy;
    protected List<RelationType> references;
    protected List<RelationType> isFormatOf;
    protected List<RelationType> hasFormat;
    protected List<RelationType> isEpisodeOf;
    protected List<RelationType> isSeasonOf;
    protected List<RelationType> hasEpisode;
    protected List<RelationType> hasSeason;
    protected List<RelationType> hasSeries;
    protected List<RelationType> isSeriesOf;
    protected List<RelationType> isMemberOf;
    protected List<RelationType> hasMember;
    protected List<RelationType> sameAs;
    protected List<CoverageType> coverage;
    protected List<RightsType> rights;
    protected List<VersionType> version;
    protected List<PublicationHistoryType> publicationHistory;
    protected List<PlanningType> planning;
    protected List<RatingType> rating;
    protected List<RatingType> audienceRating;
    protected List<EventType> event;
    protected List<PartType> part;

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitleType }
     * 
     * 
     */
    public List<TitleType> getTitle() {
        if (title == null) {
            title = new ArrayList<TitleType>();
        }
        return this.title;
    }

    /**
     * Gets the value of the alternativeTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternativeTitleType }
     * 
     * 
     */
    public List<AlternativeTitleType> getAlternativeTitle() {
        if (alternativeTitle == null) {
            alternativeTitle = new ArrayList<AlternativeTitleType>();
        }
        return this.alternativeTitle;
    }

    /**
     * Gets the value of the creator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityType }
     * 
     * 
     */
    public List<EntityType> getCreator() {
        if (creator == null) {
            creator = new ArrayList<EntityType>();
        }
        return this.creator;
    }

    /**
     * Gets the value of the subject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectType }
     * 
     * 
     */
    public List<SubjectType> getSubject() {
        if (subject == null) {
            subject = new ArrayList<SubjectType>();
        }
        return this.subject;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publisher property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublisher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityType }
     * 
     * 
     */
    public List<EntityType> getPublisher() {
        if (publisher == null) {
            publisher = new ArrayList<EntityType>();
        }
        return this.publisher;
    }

    /**
     * Gets the value of the contributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityType }
     * 
     * 
     */
    public List<EntityType> getContributor() {
        if (contributor == null) {
            contributor = new ArrayList<EntityType>();
        }
        return this.contributor;
    }

    /**
     * Gets the value of the date property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the date property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateType }
     * 
     * 
     */
    public List<DateType> getDate() {
        if (date == null) {
            date = new ArrayList<DateType>();
        }
        return this.date;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeType }
     * 
     * 
     */
    public List<TypeType> getType() {
        if (type == null) {
            type = new ArrayList<TypeType>();
        }
        return this.type;
    }

    /**
     * Gets the value of the format property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the format property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatType }
     * 
     * 
     */
    public List<FormatType> getFormat() {
        if (format == null) {
            format = new ArrayList<FormatType>();
        }
        return this.format;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<IdentifierType>();
        }
        return this.identifier;
    }

    /**
     * Reference to the resource (s) from which the current resource is
     * 						derived in whole or in part. If no label or number is available, the title
     * 						and/or the statement of responsibility etc. of the digitized recording is
     * 						recorded here. For a digitized radio programme the production number is
     * 						normally given here. The Recommended best practice is to use a unique
     * 						identifier to identify the physical source that has been used to create the
     * 						digital resource. In the case of a digitized analogue recording, it is the
     * 						recording used for digitization which is the source. For commercial
     * 						recordings the label and number is normally given here. Example: Eurovision
     * 						feed 2007-07-16T19:20:30.45+01:00 Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementType }
     * 
     * 
     */
    public List<ElementType> getSource() {
        if (source == null) {
            source = new ArrayList<ElementType>();
        }
        return this.source;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageType }
     * 
     * 
     */
    public List<LanguageType> getLanguage() {
        if (language == null) {
            language = new ArrayList<LanguageType>();
        }
        return this.language;
    }

    /**
     * Gets the value of the relation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getRelation() {
        if (relation == null) {
            relation = new ArrayList<RelationType>();
        }
        return this.relation;
    }

    /**
     * Gets the value of the isRelatedTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isRelatedTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsRelatedTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsRelatedTo() {
        if (isRelatedTo == null) {
            isRelatedTo = new ArrayList<RelationType>();
        }
        return this.isRelatedTo;
    }

    /**
     * Gets the value of the isNextInSequence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isNextInSequence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsNextInSequence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsNextInSequence() {
        if (isNextInSequence == null) {
            isNextInSequence = new ArrayList<RelationType>();
        }
        return this.isNextInSequence;
    }

    /**
     * Gets the value of the followsInSequence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the followsInSequence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFollowsInSequence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getFollowsInSequence() {
        if (followsInSequence == null) {
            followsInSequence = new ArrayList<RelationType>();
        }
        return this.followsInSequence;
    }

    /**
     * Gets the value of the isVersionOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isVersionOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsVersionOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsVersionOf() {
        if (isVersionOf == null) {
            isVersionOf = new ArrayList<RelationType>();
        }
        return this.isVersionOf;
    }

    /**
     * Gets the value of the hasVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasVersion() {
        if (hasVersion == null) {
            hasVersion = new ArrayList<RelationType>();
        }
        return this.hasVersion;
    }

    /**
     * Gets the value of the isReplacedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isReplacedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsReplacedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsReplacedBy() {
        if (isReplacedBy == null) {
            isReplacedBy = new ArrayList<RelationType>();
        }
        return this.isReplacedBy;
    }

    /**
     * Gets the value of the replaces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replaces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getReplaces() {
        if (replaces == null) {
            replaces = new ArrayList<RelationType>();
        }
        return this.replaces;
    }

    /**
     * Gets the value of the isRequiredBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isRequiredBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsRequiredBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsRequiredBy() {
        if (isRequiredBy == null) {
            isRequiredBy = new ArrayList<RelationType>();
        }
        return this.isRequiredBy;
    }

    /**
     * Gets the value of the requires property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requires property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequires().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getRequires() {
        if (requires == null) {
            requires = new ArrayList<RelationType>();
        }
        return this.requires;
    }

    /**
     * Gets the value of the isPartOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isPartOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsPartOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsPartOf() {
        if (isPartOf == null) {
            isPartOf = new ArrayList<RelationType>();
        }
        return this.isPartOf;
    }

    /**
     * Gets the value of the hasPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasPart() {
        if (hasPart == null) {
            hasPart = new ArrayList<RelationType>();
        }
        return this.hasPart;
    }

    /**
     * Gets the value of the hasTrackPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasTrackPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasTrackPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoreMetadataType.HasTrackPart }
     * 
     * 
     */
    public List<CoreMetadataType.HasTrackPart> getHasTrackPart() {
        if (hasTrackPart == null) {
            hasTrackPart = new ArrayList<CoreMetadataType.HasTrackPart>();
        }
        return this.hasTrackPart;
    }

    /**
     * Gets the value of the isReferencedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isReferencedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsReferencedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsReferencedBy() {
        if (isReferencedBy == null) {
            isReferencedBy = new ArrayList<RelationType>();
        }
        return this.isReferencedBy;
    }

    /**
     * Gets the value of the references property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the references property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getReferences() {
        if (references == null) {
            references = new ArrayList<RelationType>();
        }
        return this.references;
    }

    /**
     * Gets the value of the isFormatOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isFormatOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsFormatOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsFormatOf() {
        if (isFormatOf == null) {
            isFormatOf = new ArrayList<RelationType>();
        }
        return this.isFormatOf;
    }

    /**
     * Gets the value of the hasFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasFormat() {
        if (hasFormat == null) {
            hasFormat = new ArrayList<RelationType>();
        }
        return this.hasFormat;
    }

    /**
     * Gets the value of the isEpisodeOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isEpisodeOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsEpisodeOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsEpisodeOf() {
        if (isEpisodeOf == null) {
            isEpisodeOf = new ArrayList<RelationType>();
        }
        return this.isEpisodeOf;
    }

    /**
     * Gets the value of the isSeasonOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isSeasonOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsSeasonOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsSeasonOf() {
        if (isSeasonOf == null) {
            isSeasonOf = new ArrayList<RelationType>();
        }
        return this.isSeasonOf;
    }

    /**
     * Gets the value of the hasEpisode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasEpisode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasEpisode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasEpisode() {
        if (hasEpisode == null) {
            hasEpisode = new ArrayList<RelationType>();
        }
        return this.hasEpisode;
    }

    /**
     * Gets the value of the hasSeason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasSeason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasSeason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasSeason() {
        if (hasSeason == null) {
            hasSeason = new ArrayList<RelationType>();
        }
        return this.hasSeason;
    }

    /**
     * Gets the value of the hasSeries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasSeries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasSeries() {
        if (hasSeries == null) {
            hasSeries = new ArrayList<RelationType>();
        }
        return this.hasSeries;
    }

    /**
     * Gets the value of the isSeriesOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isSeriesOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsSeriesOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsSeriesOf() {
        if (isSeriesOf == null) {
            isSeriesOf = new ArrayList<RelationType>();
        }
        return this.isSeriesOf;
    }

    /**
     * Gets the value of the isMemberOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isMemberOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsMemberOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsMemberOf() {
        if (isMemberOf == null) {
            isMemberOf = new ArrayList<RelationType>();
        }
        return this.isMemberOf;
    }

    /**
     * Gets the value of the hasMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasMember() {
        if (hasMember == null) {
            hasMember = new ArrayList<RelationType>();
        }
        return this.hasMember;
    }

    /**
     * Gets the value of the sameAs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sameAs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSameAs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getSameAs() {
        if (sameAs == null) {
            sameAs = new ArrayList<RelationType>();
        }
        return this.sameAs;
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
            coverage = new ArrayList<CoverageType>();
        }
        return this.coverage;
    }

    /**
     * Gets the value of the rights property.
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
     * {@link RightsType }
     * 
     * 
     */
    public List<RightsType> getRights() {
        if (rights == null) {
            rights = new ArrayList<RightsType>();
        }
        return this.rights;
    }

    /**
     * Gets the value of the version property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the version property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VersionType }
     * 
     * 
     */
    public List<VersionType> getVersion() {
        if (version == null) {
            version = new ArrayList<VersionType>();
        }
        return this.version;
    }

    /**
     * Gets the value of the publicationHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicationHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicationHistoryType }
     * 
     * 
     */
    public List<PublicationHistoryType> getPublicationHistory() {
        if (publicationHistory == null) {
            publicationHistory = new ArrayList<PublicationHistoryType>();
        }
        return this.publicationHistory;
    }

    /**
     * Gets the value of the planning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanningType }
     * 
     * 
     */
    public List<PlanningType> getPlanning() {
        if (planning == null) {
            planning = new ArrayList<PlanningType>();
        }
        return this.planning;
    }

    /**
     * Gets the value of the rating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatingType }
     * 
     * 
     */
    public List<RatingType> getRating() {
        if (rating == null) {
            rating = new ArrayList<RatingType>();
        }
        return this.rating;
    }

    /**
     * Gets the value of the audienceRating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audienceRating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatingType }
     * 
     * 
     */
    public List<RatingType> getAudienceRating() {
        if (audienceRating == null) {
            audienceRating = new ArrayList<RatingType>();
        }
        return this.audienceRating;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventType }
     * 
     * 
     */
    public List<EventType> getEvent() {
        if (event == null) {
            event = new ArrayList<EventType>();
        }
        return this.event;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartType }
     * 
     * 
     */
    public List<PartType> getPart() {
        if (part == null) {
            part = new ArrayList<PartType>();
        }
        return this.part;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:ebu:metadata-schema:ebuCore_2015}relationType">
     *       &lt;sequence>
     *         &lt;element name="trackPartTitle" type="{urn:ebu:metadata-schema:ebuCore_2015}alternativeTitleType"/>
     *         &lt;element name="destinationId" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *         &lt;element name="destinationStart" type="{urn:ebu:metadata-schema:ebuCore_2015}timeType" minOccurs="0"/>
     *         &lt;element name="destinationEnd" type="{urn:ebu:metadata-schema:ebuCore_2015}timeType" minOccurs="0"/>
     *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *         &lt;element name="sourceStart" type="{urn:ebu:metadata-schema:ebuCore_2015}timeType" minOccurs="0"/>
     *         &lt;element name="sourceEnd" type="{urn:ebu:metadata-schema:ebuCore_2015}timeType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trackPartTitle",
        "destinationId",
        "destinationStart",
        "destinationEnd",
        "sourceId",
        "sourceStart",
        "sourceEnd"
    })
    public static class HasTrackPart
        extends RelationType
    {

        @XmlElement(required = true)
        protected AlternativeTitleType trackPartTitle;
        @XmlSchemaType(name = "anyURI")
        protected java.lang.String destinationId;
        protected TimeType destinationStart;
        protected TimeType destinationEnd;
        @XmlSchemaType(name = "anyURI")
        protected java.lang.String sourceId;
        protected TimeType sourceStart;
        protected TimeType sourceEnd;

        /**
         * Gets the value of the trackPartTitle property.
         * 
         * @return
         *     possible object is
         *     {@link AlternativeTitleType }
         *     
         */
        public AlternativeTitleType getTrackPartTitle() {
            return trackPartTitle;
        }

        /**
         * Sets the value of the trackPartTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link AlternativeTitleType }
         *     
         */
        public void setTrackPartTitle(AlternativeTitleType value) {
            this.trackPartTitle = value;
        }

        /**
         * Gets the value of the destinationId property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getDestinationId() {
            return destinationId;
        }

        /**
         * Sets the value of the destinationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setDestinationId(java.lang.String value) {
            this.destinationId = value;
        }

        /**
         * Gets the value of the destinationStart property.
         * 
         * @return
         *     possible object is
         *     {@link TimeType }
         *     
         */
        public TimeType getDestinationStart() {
            return destinationStart;
        }

        /**
         * Sets the value of the destinationStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeType }
         *     
         */
        public void setDestinationStart(TimeType value) {
            this.destinationStart = value;
        }

        /**
         * Gets the value of the destinationEnd property.
         * 
         * @return
         *     possible object is
         *     {@link TimeType }
         *     
         */
        public TimeType getDestinationEnd() {
            return destinationEnd;
        }

        /**
         * Sets the value of the destinationEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeType }
         *     
         */
        public void setDestinationEnd(TimeType value) {
            this.destinationEnd = value;
        }

        /**
         * Gets the value of the sourceId property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getSourceId() {
            return sourceId;
        }

        /**
         * Sets the value of the sourceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setSourceId(java.lang.String value) {
            this.sourceId = value;
        }

        /**
         * Gets the value of the sourceStart property.
         * 
         * @return
         *     possible object is
         *     {@link TimeType }
         *     
         */
        public TimeType getSourceStart() {
            return sourceStart;
        }

        /**
         * Sets the value of the sourceStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeType }
         *     
         */
        public void setSourceStart(TimeType value) {
            this.sourceStart = value;
        }

        /**
         * Gets the value of the sourceEnd property.
         * 
         * @return
         *     possible object is
         *     {@link TimeType }
         *     
         */
        public TimeType getSourceEnd() {
            return sourceEnd;
        }

        /**
         * Sets the value of the sourceEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeType }
         *     
         */
        public void setSourceEnd(TimeType value) {
            this.sourceEnd = value;
        }

    }

}
