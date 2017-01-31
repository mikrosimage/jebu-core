
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
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
 * <p>Classe Java pour coreMetadataType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="coreMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{urn:ebu:metadata-schema:ebuCore_2016}titleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="alternativeTitle" type="{urn:ebu:metadata-schema:ebuCore_2016}alternativeTitleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creator" type="{urn:ebu:metadata-schema:ebuCore_2016}entityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{urn:ebu:metadata-schema:ebuCore_2016}subjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{urn:ebu:metadata-schema:ebuCore_2016}descriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="publisher" type="{urn:ebu:metadata-schema:ebuCore_2016}entityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contributor" type="{urn:ebu:metadata-schema:ebuCore_2016}entityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date" type="{urn:ebu:metadata-schema:ebuCore_2016}dateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:ebu:metadata-schema:ebuCore_2016}typeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="format" type="{urn:ebu:metadata-schema:ebuCore_2016}formatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="identifier" type="{urn:ebu:metadata-schema:ebuCore_2016}identifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}source" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="language" type="{urn:ebu:metadata-schema:ebuCore_2016}languageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relation" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isRelatedTo" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isNextInSequence" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="followsInSequence" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isVersionOf" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasVersion" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isReplacedBy" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="replaces" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isRequiredBy" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requires" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isPartOf" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasPart" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasTrackPart" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:ebu:metadata-schema:ebuCore_2016}relationType">
 *                 &lt;sequence>
 *                   &lt;element name="trackPartTitle" type="{urn:ebu:metadata-schema:ebuCore_2016}alternativeTitleType"/>
 *                   &lt;element name="destinationId" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                   &lt;element name="destinationStart" type="{urn:ebu:metadata-schema:ebuCore_2016}timeType" minOccurs="0"/>
 *                   &lt;element name="destinationEnd" type="{urn:ebu:metadata-schema:ebuCore_2016}timeType" minOccurs="0"/>
 *                   &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                   &lt;element name="sourceStart" type="{urn:ebu:metadata-schema:ebuCore_2016}timeType" minOccurs="0"/>
 *                   &lt;element name="sourceEnd" type="{urn:ebu:metadata-schema:ebuCore_2016}timeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="isReferencedBy" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="references" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isFormatOf" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasFormat" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isEpisodeOf" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isSeasonOf" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasEpisode" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasSeason" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasSeries" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isSeriesOf" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isMemberOf" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasMember" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sameAs" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasParent" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isParentOf" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasChild" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isChildOf" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasMaster" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isMasterOf" type="{urn:ebu:metadata-schema:ebuCore_2016}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coverage" type="{urn:ebu:metadata-schema:ebuCore_2016}coverageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rights" type="{urn:ebu:metadata-schema:ebuCore_2016}rightsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="version" type="{urn:ebu:metadata-schema:ebuCore_2016}versionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="publicationHistory" type="{urn:ebu:metadata-schema:ebuCore_2016}publicationHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="planning" type="{urn:ebu:metadata-schema:ebuCore_2016}planningType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rating" type="{urn:ebu:metadata-schema:ebuCore_2016}ratingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="audienceRating" type="{urn:ebu:metadata-schema:ebuCore_2016}ratingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="event" type="{urn:ebu:metadata-schema:ebuCore_2016}eventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="part" type="{urn:ebu:metadata-schema:ebuCore_2016}partType" maxOccurs="unbounded" minOccurs="0"/>
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
    "titles",
    "alternativeTitles",
    "creators",
    "subjects",
    "descriptions",
    "publishers",
    "contributors",
    "dates",
    "types",
    "formats",
    "identifiers",
    "sources",
    "languages",
    "relations",
    "isRelatedTos",
    "isNextInSequences",
    "followsInSequences",
    "isVersionOves",
    "hasVersions",
    "isReplacedBies",
    "replaces",
    "isRequiredBies",
    "requires",
    "isPartOves",
    "hasParts",
    "hasTrackParts",
    "isReferencedBies",
    "references",
    "isFormatOves",
    "hasFormats",
    "isEpisodeOves",
    "isSeasonOves",
    "hasEpisodes",
    "hasSeasons",
    "hasSeries",
    "isSeriesOves",
    "isMemberOves",
    "hasMembers",
    "sameAs",
    "hasParents",
    "isParentOves",
    "haschildren",
    "isChildOves",
    "hasMasters",
    "isMasterOves",
    "coverages",
    "rights",
    "versions",
    "publicationHistories",
    "plannings",
    "ratings",
    "audienceRatings",
    "events",
    "parts"
})
@XmlSeeAlso({
    PartType.class
})
public class CoreMetadataType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "title")
    protected List<TitleType> titles;
    @XmlElement(name = "alternativeTitle")
    protected List<AlternativeTitleType> alternativeTitles;
    @XmlElement(name = "creator")
    protected List<EntityType> creators;
    @XmlElement(name = "subject")
    protected List<SubjectType> subjects;
    @XmlElement(name = "description")
    protected List<DescriptionType> descriptions;
    @XmlElement(name = "publisher")
    protected List<EntityType> publishers;
    @XmlElement(name = "contributor")
    protected List<EntityType> contributors;
    @XmlElement(name = "date")
    protected List<DateType> dates;
    @XmlElement(name = "type")
    protected List<TypeType> types;
    @XmlElement(name = "format")
    protected List<FormatType> formats;
    @XmlElement(name = "identifier")
    protected List<IdentifierType> identifiers;
    @XmlElement(name = "source", namespace = "http://purl.org/dc/elements/1.1/")
    protected List<ElementType> sources;
    @XmlElement(name = "language")
    protected List<LanguageType> languages;
    @XmlElement(name = "relation")
    protected List<RelationType> relations;
    @XmlElement(name = "isRelatedTo")
    protected List<RelationType> isRelatedTos;
    @XmlElement(name = "isNextInSequence")
    protected List<RelationType> isNextInSequences;
    @XmlElement(name = "followsInSequence")
    protected List<RelationType> followsInSequences;
    @XmlElement(name = "isVersionOf")
    protected List<RelationType> isVersionOves;
    @XmlElement(name = "hasVersion")
    protected List<RelationType> hasVersions;
    @XmlElement(name = "isReplacedBy")
    protected List<RelationType> isReplacedBies;
    protected List<RelationType> replaces;
    @XmlElement(name = "isRequiredBy")
    protected List<RelationType> isRequiredBies;
    protected List<RelationType> requires;
    @XmlElement(name = "isPartOf")
    protected List<RelationType> isPartOves;
    @XmlElement(name = "hasPart")
    protected List<RelationType> hasParts;
    @XmlElement(name = "hasTrackPart")
    protected List<CoreMetadataType.HasTrackPart> hasTrackParts;
    @XmlElement(name = "isReferencedBy")
    protected List<RelationType> isReferencedBies;
    protected List<RelationType> references;
    @XmlElement(name = "isFormatOf")
    protected List<RelationType> isFormatOves;
    @XmlElement(name = "hasFormat")
    protected List<RelationType> hasFormats;
    @XmlElement(name = "isEpisodeOf")
    protected List<RelationType> isEpisodeOves;
    @XmlElement(name = "isSeasonOf")
    protected List<RelationType> isSeasonOves;
    @XmlElement(name = "hasEpisode")
    protected List<RelationType> hasEpisodes;
    @XmlElement(name = "hasSeason")
    protected List<RelationType> hasSeasons;
    protected List<RelationType> hasSeries;
    @XmlElement(name = "isSeriesOf")
    protected List<RelationType> isSeriesOves;
    @XmlElement(name = "isMemberOf")
    protected List<RelationType> isMemberOves;
    @XmlElement(name = "hasMember")
    protected List<RelationType> hasMembers;
    protected List<RelationType> sameAs;
    @XmlElement(name = "hasParent")
    protected List<RelationType> hasParents;
    @XmlElement(name = "isParentOf")
    protected List<RelationType> isParentOves;
    @XmlElement(name = "hasChild")
    protected List<RelationType> haschildren;
    @XmlElement(name = "isChildOf")
    protected List<RelationType> isChildOves;
    @XmlElement(name = "hasMaster")
    protected List<RelationType> hasMasters;
    @XmlElement(name = "isMasterOf")
    protected List<RelationType> isMasterOves;
    @XmlElement(name = "coverage")
    protected List<CoverageType> coverages;
    protected List<RightsType> rights;
    @XmlElement(name = "version")
    protected List<VersionType> versions;
    @XmlElement(name = "publicationHistory")
    protected List<PublicationHistoryType> publicationHistories;
    @XmlElement(name = "planning")
    protected List<PlanningType> plannings;
    @XmlElement(name = "rating")
    protected List<RatingType> ratings;
    @XmlElement(name = "audienceRating")
    protected List<RatingType> audienceRatings;
    @XmlElement(name = "event")
    protected List<EventType> events;
    @XmlElement(name = "part")
    protected List<PartType> parts;

    /**
     * Gets the value of the titles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitleType }
     * 
     * 
     */
    public List<TitleType> getTitles() {
        if (titles == null) {
            titles = new ArrayList<>();
        }
        return this.titles;
    }

    /**
     * Gets the value of the alternativeTitles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeTitles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeTitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternativeTitleType }
     * 
     * 
     */
    public List<AlternativeTitleType> getAlternativeTitles() {
        if (alternativeTitles == null) {
            alternativeTitles = new ArrayList<>();
        }
        return this.alternativeTitles;
    }

    /**
     * Gets the value of the creators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityType }
     * 
     * 
     */
    public List<EntityType> getCreators() {
        if (creators == null) {
            creators = new ArrayList<>();
        }
        return this.creators;
    }

    /**
     * Gets the value of the subjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectType }
     * 
     * 
     */
    public List<SubjectType> getSubjects() {
        if (subjects == null) {
            subjects = new ArrayList<>();
        }
        return this.subjects;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the publishers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityType }
     * 
     * 
     */
    public List<EntityType> getPublishers() {
        if (publishers == null) {
            publishers = new ArrayList<>();
        }
        return this.publishers;
    }

    /**
     * Gets the value of the contributors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityType }
     * 
     * 
     */
    public List<EntityType> getContributors() {
        if (contributors == null) {
            contributors = new ArrayList<>();
        }
        return this.contributors;
    }

    /**
     * Gets the value of the dates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateType }
     * 
     * 
     */
    public List<DateType> getDates() {
        if (dates == null) {
            dates = new ArrayList<>();
        }
        return this.dates;
    }

    /**
     * Gets the value of the types property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the types property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeType }
     * 
     * 
     */
    public List<TypeType> getTypes() {
        if (types == null) {
            types = new ArrayList<>();
        }
        return this.types;
    }

    /**
     * Gets the value of the formats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatType }
     * 
     * 
     */
    public List<FormatType> getFormats() {
        if (formats == null) {
            formats = new ArrayList<>();
        }
        return this.formats;
    }

    /**
     * Gets the value of the identifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<>();
        }
        return this.identifiers;
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
     * 						feed 2007-07-16T19:20:30.45+01:00 Gets the value of the sources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementType }
     * 
     * 
     */
    public List<ElementType> getSources() {
        if (sources == null) {
            sources = new ArrayList<>();
        }
        return this.sources;
    }

    /**
     * Gets the value of the languages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageType }
     * 
     * 
     */
    public List<LanguageType> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<>();
        }
        return this.languages;
    }

    /**
     * Gets the value of the relations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getRelations() {
        if (relations == null) {
            relations = new ArrayList<>();
        }
        return this.relations;
    }

    /**
     * Gets the value of the isRelatedTos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isRelatedTos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsRelatedTos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsRelatedTos() {
        if (isRelatedTos == null) {
            isRelatedTos = new ArrayList<>();
        }
        return this.isRelatedTos;
    }

    /**
     * Gets the value of the isNextInSequences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isNextInSequences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsNextInSequences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsNextInSequences() {
        if (isNextInSequences == null) {
            isNextInSequences = new ArrayList<>();
        }
        return this.isNextInSequences;
    }

    /**
     * Gets the value of the followsInSequences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the followsInSequences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFollowsInSequences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getFollowsInSequences() {
        if (followsInSequences == null) {
            followsInSequences = new ArrayList<>();
        }
        return this.followsInSequences;
    }

    /**
     * Gets the value of the isVersionOves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isVersionOves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsVersionOves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsVersionOves() {
        if (isVersionOves == null) {
            isVersionOves = new ArrayList<>();
        }
        return this.isVersionOves;
    }

    /**
     * Gets the value of the hasVersions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasVersions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasVersions() {
        if (hasVersions == null) {
            hasVersions = new ArrayList<>();
        }
        return this.hasVersions;
    }

    /**
     * Gets the value of the isReplacedBies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isReplacedBies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsReplacedBies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsReplacedBies() {
        if (isReplacedBies == null) {
            isReplacedBies = new ArrayList<>();
        }
        return this.isReplacedBies;
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
            replaces = new ArrayList<>();
        }
        return this.replaces;
    }

    /**
     * Gets the value of the isRequiredBies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isRequiredBies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsRequiredBies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsRequiredBies() {
        if (isRequiredBies == null) {
            isRequiredBies = new ArrayList<>();
        }
        return this.isRequiredBies;
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
            requires = new ArrayList<>();
        }
        return this.requires;
    }

    /**
     * Gets the value of the isPartOves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isPartOves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsPartOves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsPartOves() {
        if (isPartOves == null) {
            isPartOves = new ArrayList<>();
        }
        return this.isPartOves;
    }

    /**
     * Gets the value of the hasParts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasParts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasParts() {
        if (hasParts == null) {
            hasParts = new ArrayList<>();
        }
        return this.hasParts;
    }

    /**
     * Gets the value of the hasTrackParts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasTrackParts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasTrackParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoreMetadataType.HasTrackPart }
     * 
     * 
     */
    public List<CoreMetadataType.HasTrackPart> getHasTrackParts() {
        if (hasTrackParts == null) {
            hasTrackParts = new ArrayList<>();
        }
        return this.hasTrackParts;
    }

    /**
     * Gets the value of the isReferencedBies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isReferencedBies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsReferencedBies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsReferencedBies() {
        if (isReferencedBies == null) {
            isReferencedBies = new ArrayList<>();
        }
        return this.isReferencedBies;
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
            references = new ArrayList<>();
        }
        return this.references;
    }

    /**
     * Gets the value of the isFormatOves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isFormatOves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsFormatOves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsFormatOves() {
        if (isFormatOves == null) {
            isFormatOves = new ArrayList<>();
        }
        return this.isFormatOves;
    }

    /**
     * Gets the value of the hasFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasFormats() {
        if (hasFormats == null) {
            hasFormats = new ArrayList<>();
        }
        return this.hasFormats;
    }

    /**
     * Gets the value of the isEpisodeOves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isEpisodeOves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsEpisodeOves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsEpisodeOves() {
        if (isEpisodeOves == null) {
            isEpisodeOves = new ArrayList<>();
        }
        return this.isEpisodeOves;
    }

    /**
     * Gets the value of the isSeasonOves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isSeasonOves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsSeasonOves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsSeasonOves() {
        if (isSeasonOves == null) {
            isSeasonOves = new ArrayList<>();
        }
        return this.isSeasonOves;
    }

    /**
     * Gets the value of the hasEpisodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasEpisodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasEpisodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasEpisodes() {
        if (hasEpisodes == null) {
            hasEpisodes = new ArrayList<>();
        }
        return this.hasEpisodes;
    }

    /**
     * Gets the value of the hasSeasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasSeasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasSeasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasSeasons() {
        if (hasSeasons == null) {
            hasSeasons = new ArrayList<>();
        }
        return this.hasSeasons;
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
            hasSeries = new ArrayList<>();
        }
        return this.hasSeries;
    }

    /**
     * Gets the value of the isSeriesOves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isSeriesOves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsSeriesOves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsSeriesOves() {
        if (isSeriesOves == null) {
            isSeriesOves = new ArrayList<>();
        }
        return this.isSeriesOves;
    }

    /**
     * Gets the value of the isMemberOves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isMemberOves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsMemberOves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsMemberOves() {
        if (isMemberOves == null) {
            isMemberOves = new ArrayList<>();
        }
        return this.isMemberOves;
    }

    /**
     * Gets the value of the hasMembers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasMembers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasMembers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasMembers() {
        if (hasMembers == null) {
            hasMembers = new ArrayList<>();
        }
        return this.hasMembers;
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
            sameAs = new ArrayList<>();
        }
        return this.sameAs;
    }

    /**
     * Gets the value of the hasParents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasParents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasParents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasParents() {
        if (hasParents == null) {
            hasParents = new ArrayList<>();
        }
        return this.hasParents;
    }

    /**
     * Gets the value of the isParentOves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isParentOves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsParentOves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsParentOves() {
        if (isParentOves == null) {
            isParentOves = new ArrayList<>();
        }
        return this.isParentOves;
    }

    /**
     * Gets the value of the haschildren property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the haschildren property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHaschildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHaschildren() {
        if (haschildren == null) {
            haschildren = new ArrayList<>();
        }
        return this.haschildren;
    }

    /**
     * Gets the value of the isChildOves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isChildOves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsChildOves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsChildOves() {
        if (isChildOves == null) {
            isChildOves = new ArrayList<>();
        }
        return this.isChildOves;
    }

    /**
     * Gets the value of the hasMasters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasMasters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasMasters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getHasMasters() {
        if (hasMasters == null) {
            hasMasters = new ArrayList<>();
        }
        return this.hasMasters;
    }

    /**
     * Gets the value of the isMasterOves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isMasterOves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsMasterOves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getIsMasterOves() {
        if (isMasterOves == null) {
            isMasterOves = new ArrayList<>();
        }
        return this.isMasterOves;
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
            rights = new ArrayList<>();
        }
        return this.rights;
    }

    /**
     * Gets the value of the versions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VersionType }
     * 
     * 
     */
    public List<VersionType> getVersions() {
        if (versions == null) {
            versions = new ArrayList<>();
        }
        return this.versions;
    }

    /**
     * Gets the value of the publicationHistories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicationHistories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationHistories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicationHistoryType }
     * 
     * 
     */
    public List<PublicationHistoryType> getPublicationHistories() {
        if (publicationHistories == null) {
            publicationHistories = new ArrayList<>();
        }
        return this.publicationHistories;
    }

    /**
     * Gets the value of the plannings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plannings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlannings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanningType }
     * 
     * 
     */
    public List<PlanningType> getPlannings() {
        if (plannings == null) {
            plannings = new ArrayList<>();
        }
        return this.plannings;
    }

    /**
     * Gets the value of the ratings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatingType }
     * 
     * 
     */
    public List<RatingType> getRatings() {
        if (ratings == null) {
            ratings = new ArrayList<>();
        }
        return this.ratings;
    }

    /**
     * Gets the value of the audienceRatings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audienceRatings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceRatings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatingType }
     * 
     * 
     */
    public List<RatingType> getAudienceRatings() {
        if (audienceRatings == null) {
            audienceRatings = new ArrayList<>();
        }
        return this.audienceRatings;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventType }
     * 
     * 
     */
    public List<EventType> getEvents() {
        if (events == null) {
            events = new ArrayList<>();
        }
        return this.events;
    }

    /**
     * Gets the value of the parts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartType }
     * 
     * 
     */
    public List<PartType> getParts() {
        if (parts == null) {
            parts = new ArrayList<>();
        }
        return this.parts;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:ebu:metadata-schema:ebuCore_2016}relationType">
     *       &lt;sequence>
     *         &lt;element name="trackPartTitle" type="{urn:ebu:metadata-schema:ebuCore_2016}alternativeTitleType"/>
     *         &lt;element name="destinationId" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *         &lt;element name="destinationStart" type="{urn:ebu:metadata-schema:ebuCore_2016}timeType" minOccurs="0"/>
     *         &lt;element name="destinationEnd" type="{urn:ebu:metadata-schema:ebuCore_2016}timeType" minOccurs="0"/>
     *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *         &lt;element name="sourceStart" type="{urn:ebu:metadata-schema:ebuCore_2016}timeType" minOccurs="0"/>
     *         &lt;element name="sourceEnd" type="{urn:ebu:metadata-schema:ebuCore_2016}timeType" minOccurs="0"/>
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
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
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
         * Obtient la valeur de la propri�t� trackPartTitle.
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
         * D�finit la valeur de la propri�t� trackPartTitle.
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
         * Obtient la valeur de la propri�t� destinationId.
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
         * D�finit la valeur de la propri�t� destinationId.
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
         * Obtient la valeur de la propri�t� destinationStart.
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
         * D�finit la valeur de la propri�t� destinationStart.
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
         * Obtient la valeur de la propri�t� destinationEnd.
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
         * D�finit la valeur de la propri�t� destinationEnd.
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
         * Obtient la valeur de la propri�t� sourceId.
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
         * D�finit la valeur de la propri�t� sourceId.
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
         * Obtient la valeur de la propri�t� sourceStart.
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
         * D�finit la valeur de la propri�t� sourceStart.
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
         * Obtient la valeur de la propri�t� sourceEnd.
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
         * D�finit la valeur de la propri�t� sourceEnd.
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
