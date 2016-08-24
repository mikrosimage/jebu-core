
package ebu.metadata_schema.ebucore_2015;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ebu.metadata_schema.ebucore_2015 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AudioStreamFormatAudioPackFormatIDRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioPackFormatIDRef");
    private final static QName _AudioStreamFormatAudioChannelFormatIDRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioChannelFormatIDRef");
    private final static QName _AudioStreamFormatAudioTrackFormatIDRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioTrackFormatIDRef");
    private final static QName _AudioProgrammeAudioContentIDRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioContentIDRef");
    private final static QName _AudioBlockFormatMatrix_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "matrix");
    private final static QName _AudioBlockFormatGain_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "gain");
    private final static QName _AudioBlockFormatSpeakerLabel_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "speakerLabel");
    private final static QName _AudioBlockFormatCartesian_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "cartesian");
    private final static QName _AudioBlockFormatDegree_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "degree");
    private final static QName _AudioBlockFormatDiffuse_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "diffuse");
    private final static QName _AudioBlockFormatEquation_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "equation");
    private final static QName _AudioBlockFormatImportance_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "importance");
    private final static QName _AudioBlockFormatJumpPosition_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "jumpPosition");
    private final static QName _AudioBlockFormatObjectDivergence_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "objectDivergence");
    private final static QName _AudioBlockFormatChannelLock_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "channelLock");
    private final static QName _AudioBlockFormatHeight_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "height");
    private final static QName _AudioBlockFormatOrder_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "order");
    private final static QName _AudioBlockFormatWidth_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "width");
    private final static QName _AudioBlockFormatPosition_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "position");
    private final static QName _AudioBlockFormatDepth_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "depth");
    private final static QName _AudioBlockFormatScreenRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "screenRef");
    private final static QName _AudioBlockFormatZoneExclusion_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "zoneExclusion");
    private final static QName _AudioContentAudioObjectIDRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioObjectIDRef");
    private final static QName _AudioObjectAudioComplementaryObjectIDRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioComplementaryObjectIDRef");
    private final static QName _AudioObjectAudioTrackUIDRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioTrackUIDRef");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ebu.metadata_schema.ebucore_2015
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactDetailsType }
     * 
     */
    public ContactDetailsType createContactDetailsType() {
        return new ContactDetailsType();
    }

    /**
     * Create an instance of {@link RightsType }
     * 
     */
    public RightsType createRightsType() {
        return new RightsType();
    }

    /**
     * Create an instance of {@link DateType }
     * 
     */
    public DateType createDateType() {
        return new DateType();
    }

    /**
     * Create an instance of {@link HashType }
     * 
     */
    public HashType createHashType() {
        return new HashType();
    }

    /**
     * Create an instance of {@link FilterType }
     * 
     */
    public FilterType createFilterType() {
        return new FilterType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link ContainerFormatType }
     * 
     */
    public ContainerFormatType createContainerFormatType() {
        return new ContainerFormatType();
    }

    /**
     * Create an instance of {@link FormatType }
     * 
     */
    public FormatType createFormatType() {
        return new FormatType();
    }

    /**
     * Create an instance of {@link AudioFormatType }
     * 
     */
    public AudioFormatType createAudioFormatType() {
        return new AudioFormatType();
    }

    /**
     * Create an instance of {@link MetadataFormatType }
     * 
     */
    public MetadataFormatType createMetadataFormatType() {
        return new MetadataFormatType();
    }

    /**
     * Create an instance of {@link TimeType }
     * 
     */
    public TimeType createTimeType() {
        return new TimeType();
    }

    /**
     * Create an instance of {@link AffiliationType }
     * 
     */
    public AffiliationType createAffiliationType() {
        return new AffiliationType();
    }

    /**
     * Create an instance of {@link TimecodeFormatType }
     * 
     */
    public TimecodeFormatType createTimecodeFormatType() {
        return new TimecodeFormatType();
    }

    /**
     * Create an instance of {@link ImageFormatType }
     * 
     */
    public ImageFormatType createImageFormatType() {
        return new ImageFormatType();
    }

    /**
     * Create an instance of {@link DurationType }
     * 
     */
    public DurationType createDurationType() {
        return new DurationType();
    }

    /**
     * Create an instance of {@link AwardType }
     * 
     */
    public AwardType createAwardType() {
        return new AwardType();
    }

    /**
     * Create an instance of {@link OrganisationDetailsType }
     * 
     */
    public OrganisationDetailsType createOrganisationDetailsType() {
        return new OrganisationDetailsType();
    }

    /**
     * Create an instance of {@link TypeType }
     * 
     */
    public TypeType createTypeType() {
        return new TypeType();
    }

    /**
     * Create an instance of {@link CoreMetadataType }
     * 
     */
    public CoreMetadataType createCoreMetadataType() {
        return new CoreMetadataType();
    }

    /**
     * Create an instance of {@link RegionType }
     * 
     */
    public RegionType createRegionType() {
        return new RegionType();
    }

    /**
     * Create an instance of {@link VideoFormatType }
     * 
     */
    public VideoFormatType createVideoFormatType() {
        return new VideoFormatType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link EntityType }
     * 
     */
    public EntityType createEntityType() {
        return new EntityType();
    }

    /**
     * Create an instance of {@link AudioTrackUID }
     * 
     */
    public AudioTrackUID createAudioTrackUID() {
        return new AudioTrackUID();
    }

    /**
     * Create an instance of {@link AudioMXFLookUpType }
     * 
     */
    public AudioMXFLookUpType createAudioMXFLookUpType() {
        return new AudioMXFLookUpType();
    }

    /**
     * Create an instance of {@link AudioTrackFormat }
     * 
     */
    public AudioTrackFormat createAudioTrackFormat() {
        return new AudioTrackFormat();
    }

    /**
     * Create an instance of {@link AudioChannelFormat }
     * 
     */
    public AudioChannelFormat createAudioChannelFormat() {
        return new AudioChannelFormat();
    }

    /**
     * Create an instance of {@link Frequency }
     * 
     */
    public Frequency createFrequency() {
        return new Frequency();
    }

    /**
     * Create an instance of {@link AudioBlockFormat }
     * 
     */
    public AudioBlockFormat createAudioBlockFormat() {
        return new AudioBlockFormat();
    }

    /**
     * Create an instance of {@link PositionType }
     * 
     */
    public PositionType createPositionType() {
        return new PositionType();
    }

    /**
     * Create an instance of {@link MatrixType }
     * 
     */
    public MatrixType createMatrixType() {
        return new MatrixType();
    }

    /**
     * Create an instance of {@link ChannelLockType }
     * 
     */
    public ChannelLockType createChannelLockType() {
        return new ChannelLockType();
    }

    /**
     * Create an instance of {@link ObjectDivergenceType }
     * 
     */
    public ObjectDivergenceType createObjectDivergenceType() {
        return new ObjectDivergenceType();
    }

    /**
     * Create an instance of {@link JumpPositionType }
     * 
     */
    public JumpPositionType createJumpPositionType() {
        return new JumpPositionType();
    }

    /**
     * Create an instance of {@link ZoneExclusionType }
     * 
     */
    public ZoneExclusionType createZoneExclusionType() {
        return new ZoneExclusionType();
    }

    /**
     * Create an instance of {@link AudioContent }
     * 
     */
    public AudioContent createAudioContent() {
        return new AudioContent();
    }

    /**
     * Create an instance of {@link LoudnessMetadataType }
     * 
     */
    public LoudnessMetadataType createLoudnessMetadataType() {
        return new LoudnessMetadataType();
    }

    /**
     * Create an instance of {@link DialogueType }
     * 
     */
    public DialogueType createDialogueType() {
        return new DialogueType();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link ElementType }
     * 
     */
    public ElementType createElementType() {
        return new ElementType();
    }

    /**
     * Create an instance of {@link AudioPackFormat }
     * 
     */
    public AudioPackFormat createAudioPackFormat() {
        return new AudioPackFormat();
    }

    /**
     * Create an instance of {@link EbuCoreMain }
     * 
     */
    public EbuCoreMain createEbuCoreMain() {
        return new EbuCoreMain();
    }

    /**
     * Create an instance of {@link AudioObject }
     * 
     */
    public AudioObject createAudioObject() {
        return new AudioObject();
    }

    /**
     * Create an instance of {@link AudioObjectInteractionType }
     * 
     */
    public AudioObjectInteractionType createAudioObjectInteractionType() {
        return new AudioObjectInteractionType();
    }

    /**
     * Create an instance of {@link AudioStreamFormat }
     * 
     */
    public AudioStreamFormat createAudioStreamFormat() {
        return new AudioStreamFormat();
    }

    /**
     * Create an instance of {@link AudioProgramme }
     * 
     */
    public AudioProgramme createAudioProgramme() {
        return new AudioProgramme();
    }

    /**
     * Create an instance of {@link AudioProgrammeReferenceScreenType }
     * 
     */
    public AudioProgrammeReferenceScreenType createAudioProgrammeReferenceScreenType() {
        return new AudioProgrammeReferenceScreenType();
    }

    /**
     * Create an instance of {@link RelationType }
     * 
     */
    public RelationType createRelationType() {
        return new RelationType();
    }

    /**
     * Create an instance of {@link TitleType }
     * 
     */
    public TitleType createTitleType() {
        return new TitleType();
    }

    /**
     * Create an instance of {@link PublicationEventType }
     * 
     */
    public PublicationEventType createPublicationEventType() {
        return new PublicationEventType();
    }

    /**
     * Create an instance of {@link PeriodOfTimeType }
     * 
     */
    public PeriodOfTimeType createPeriodOfTimeType() {
        return new PeriodOfTimeType();
    }

    /**
     * Create an instance of {@link ebu.metadata_schema.ebucore_2015.String }
     * 
     */
    public ebu.metadata_schema.ebucore_2015.String createString() {
        return new ebu.metadata_schema.ebucore_2015.String();
    }

    /**
     * Create an instance of {@link Int16 }
     * 
     */
    public Int16 createInt16() {
        return new Int16();
    }

    /**
     * Create an instance of {@link PlanningType }
     * 
     */
    public PlanningType createPlanningType() {
        return new PlanningType();
    }

    /**
     * Create an instance of {@link TechnicalAttributeRationalType }
     * 
     */
    public TechnicalAttributeRationalType createTechnicalAttributeRationalType() {
        return new TechnicalAttributeRationalType();
    }

    /**
     * Create an instance of {@link ebu.metadata_schema.ebucore_2015.Boolean }
     * 
     */
    public ebu.metadata_schema.ebucore_2015.Boolean createBoolean() {
        return new ebu.metadata_schema.ebucore_2015.Boolean();
    }

    /**
     * Create an instance of {@link PartType }
     * 
     */
    public PartType createPartType() {
        return new PartType();
    }

    /**
     * Create an instance of {@link VersionType }
     * 
     */
    public VersionType createVersionType() {
        return new VersionType();
    }

    /**
     * Create an instance of {@link PublicationMediumType }
     * 
     */
    public PublicationMediumType createPublicationMediumType() {
        return new PublicationMediumType();
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link ebu.metadata_schema.ebucore_2015.Float }
     * 
     */
    public ebu.metadata_schema.ebucore_2015.Float createFloat() {
        return new ebu.metadata_schema.ebucore_2015.Float();
    }

    /**
     * Create an instance of {@link CaptioningFormatType }
     * 
     */
    public CaptioningFormatType createCaptioningFormatType() {
        return new CaptioningFormatType();
    }

    /**
     * Create an instance of {@link PublicationChannelType }
     * 
     */
    public PublicationChannelType createPublicationChannelType() {
        return new PublicationChannelType();
    }

    /**
     * Create an instance of {@link DetailsType }
     * 
     */
    public DetailsType createDetailsType() {
        return new DetailsType();
    }

    /**
     * Create an instance of {@link IdentifierType }
     * 
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierType();
    }

    /**
     * Create an instance of {@link PositionInteractionRangeType }
     * 
     */
    public PositionInteractionRangeType createPositionInteractionRangeType() {
        return new PositionInteractionRangeType();
    }

    /**
     * Create an instance of {@link Int32 }
     * 
     */
    public Int32 createInt32() {
        return new Int32();
    }

    /**
     * Create an instance of {@link SigningFormatType }
     * 
     */
    public SigningFormatType createSigningFormatType() {
        return new SigningFormatType();
    }

    /**
     * Create an instance of {@link AudienceType }
     * 
     */
    public AudienceType createAudienceType() {
        return new AudienceType();
    }

    /**
     * Create an instance of {@link ScreenCentrePositionType }
     * 
     */
    public ScreenCentrePositionType createScreenCentrePositionType() {
        return new ScreenCentrePositionType();
    }

    /**
     * Create an instance of {@link Int8 }
     * 
     */
    public Int8 createInt8() {
        return new Int8();
    }

    /**
     * Create an instance of {@link AudioFormatExtendedType }
     * 
     */
    public AudioFormatExtendedType createAudioFormatExtendedType() {
        return new AudioFormatExtendedType();
    }

    /**
     * Create an instance of {@link LengthType }
     * 
     */
    public LengthType createLengthType() {
        return new LengthType();
    }

    /**
     * Create an instance of {@link EditUnitNumberType }
     * 
     */
    public EditUnitNumberType createEditUnitNumberType() {
        return new EditUnitNumberType();
    }

    /**
     * Create an instance of {@link UInt32 }
     * 
     */
    public UInt32 createUInt32() {
        return new UInt32();
    }

    /**
     * Create an instance of {@link CompoundNameType }
     * 
     */
    public CompoundNameType createCompoundNameType() {
        return new CompoundNameType();
    }

    /**
     * Create an instance of {@link ZoneType }
     * 
     */
    public ZoneType createZoneType() {
        return new ZoneType();
    }

    /**
     * Create an instance of {@link AspectRatioType }
     * 
     */
    public AspectRatioType createAspectRatioType() {
        return new AspectRatioType();
    }

    /**
     * Create an instance of {@link SubjectType }
     * 
     */
    public SubjectType createSubjectType() {
        return new SubjectType();
    }

    /**
     * Create an instance of {@link CodecType }
     * 
     */
    public CodecType createCodecType() {
        return new CodecType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link DataFormatType }
     * 
     */
    public DataFormatType createDataFormatType() {
        return new DataFormatType();
    }

    /**
     * Create an instance of {@link CoefficientType }
     * 
     */
    public CoefficientType createCoefficientType() {
        return new CoefficientType();
    }

    /**
     * Create an instance of {@link OrganisationDepartmentType }
     * 
     */
    public OrganisationDepartmentType createOrganisationDepartmentType() {
        return new OrganisationDepartmentType();
    }

    /**
     * Create an instance of {@link GainInteractionRangeType }
     * 
     */
    public GainInteractionRangeType createGainInteractionRangeType() {
        return new GainInteractionRangeType();
    }

    /**
     * Create an instance of {@link UInt16 }
     * 
     */
    public UInt16 createUInt16() {
        return new UInt16();
    }

    /**
     * Create an instance of {@link SpatialType }
     * 
     */
    public SpatialType createSpatialType() {
        return new SpatialType();
    }

    /**
     * Create an instance of {@link DimensionType }
     * 
     */
    public DimensionType createDimensionType() {
        return new DimensionType();
    }

    /**
     * Create an instance of {@link TemporalType }
     * 
     */
    public TemporalType createTemporalType() {
        return new TemporalType();
    }

    /**
     * Create an instance of {@link RationalType }
     * 
     */
    public RationalType createRationalType() {
        return new RationalType();
    }

    /**
     * Create an instance of {@link DocumentFormatType }
     * 
     */
    public DocumentFormatType createDocumentFormatType() {
        return new DocumentFormatType();
    }

    /**
     * Create an instance of {@link UInt8 }
     * 
     */
    public UInt8 createUInt8() {
        return new UInt8();
    }

    /**
     * Create an instance of {@link PublicationServiceType }
     * 
     */
    public PublicationServiceType createPublicationServiceType() {
        return new PublicationServiceType();
    }

    /**
     * Create an instance of {@link RatingType }
     * 
     */
    public RatingType createRatingType() {
        return new RatingType();
    }

    /**
     * Create an instance of {@link AlternativeTitleType }
     * 
     */
    public AlternativeTitleType createAlternativeTitleType() {
        return new AlternativeTitleType();
    }

    /**
     * Create an instance of {@link AudienceLevelType }
     * 
     */
    public AudienceLevelType createAudienceLevelType() {
        return new AudienceLevelType();
    }

    /**
     * Create an instance of {@link PublicationHistoryType }
     * 
     */
    public PublicationHistoryType createPublicationHistoryType() {
        return new PublicationHistoryType();
    }

    /**
     * Create an instance of {@link UInt64 }
     * 
     */
    public UInt64 createUInt64() {
        return new UInt64();
    }

    /**
     * Create an instance of {@link AncillaryDataFormatType }
     * 
     */
    public AncillaryDataFormatType createAncillaryDataFormatType() {
        return new AncillaryDataFormatType();
    }

    /**
     * Create an instance of {@link LanguageType }
     * 
     */
    public LanguageType createLanguageType() {
        return new LanguageType();
    }

    /**
     * Create an instance of {@link SubtitlingFormatType }
     * 
     */
    public SubtitlingFormatType createSubtitlingFormatType() {
        return new SubtitlingFormatType();
    }

    /**
     * Create an instance of {@link CoverageType }
     * 
     */
    public CoverageType createCoverageType() {
        return new CoverageType();
    }

    /**
     * Create an instance of {@link Int64 }
     * 
     */
    public Int64 createInt64() {
        return new Int64();
    }

    /**
     * Create an instance of {@link AlternativeDateType }
     * 
     */
    public AlternativeDateType createAlternativeDateType() {
        return new AlternativeDateType();
    }

    /**
     * Create an instance of {@link ScreenWidthType }
     * 
     */
    public ScreenWidthType createScreenWidthType() {
        return new ScreenWidthType();
    }

    /**
     * Create an instance of {@link TechnicalAttributeUriType }
     * 
     */
    public TechnicalAttributeUriType createTechnicalAttributeUriType() {
        return new TechnicalAttributeUriType();
    }

    /**
     * Create an instance of {@link ContactDetailsType.StageName }
     * 
     */
    public ContactDetailsType.StageName createContactDetailsTypeStageName() {
        return new ContactDetailsType.StageName();
    }

    /**
     * Create an instance of {@link ContactDetailsType.RelatedInformationLink }
     * 
     */
    public ContactDetailsType.RelatedInformationLink createContactDetailsTypeRelatedInformationLink() {
        return new ContactDetailsType.RelatedInformationLink();
    }

    /**
     * Create an instance of {@link RightsType.ProcessingRestrictionFlag }
     * 
     */
    public RightsType.ProcessingRestrictionFlag createRightsTypeProcessingRestrictionFlag() {
        return new RightsType.ProcessingRestrictionFlag();
    }

    /**
     * Create an instance of {@link DateType.Created }
     * 
     */
    public DateType.Created createDateTypeCreated() {
        return new DateType.Created();
    }

    /**
     * Create an instance of {@link DateType.Issued }
     * 
     */
    public DateType.Issued createDateTypeIssued() {
        return new DateType.Issued();
    }

    /**
     * Create an instance of {@link DateType.Modified }
     * 
     */
    public DateType.Modified createDateTypeModified() {
        return new DateType.Modified();
    }

    /**
     * Create an instance of {@link DateType.Digitised }
     * 
     */
    public DateType.Digitised createDateTypeDigitised() {
        return new DateType.Digitised();
    }

    /**
     * Create an instance of {@link DateType.Released }
     * 
     */
    public DateType.Released createDateTypeReleased() {
        return new DateType.Released();
    }

    /**
     * Create an instance of {@link DateType.Copyrighted }
     * 
     */
    public DateType.Copyrighted createDateTypeCopyrighted() {
        return new DateType.Copyrighted();
    }

    /**
     * Create an instance of {@link DateType.Encoded }
     * 
     */
    public DateType.Encoded createDateTypeEncoded() {
        return new DateType.Encoded();
    }

    /**
     * Create an instance of {@link HashType.HashFunction }
     * 
     */
    public HashType.HashFunction createHashTypeHashFunction() {
        return new HashType.HashFunction();
    }

    /**
     * Create an instance of {@link FilterType.FilterProfile }
     * 
     */
    public FilterType.FilterProfile createFilterTypeFilterProfile() {
        return new FilterType.FilterProfile();
    }

    /**
     * Create an instance of {@link FilterType.FilterSetting }
     * 
     */
    public FilterType.FilterSetting createFilterTypeFilterSetting() {
        return new FilterType.FilterSetting();
    }

    /**
     * Create an instance of {@link AddressType.Country }
     * 
     */
    public AddressType.Country createAddressTypeCountry() {
        return new AddressType.Country();
    }

    /**
     * Create an instance of {@link ContainerFormatType.ContainerEncoding }
     * 
     */
    public ContainerFormatType.ContainerEncoding createContainerFormatTypeContainerEncoding() {
        return new ContainerFormatType.ContainerEncoding();
    }

    /**
     * Create an instance of {@link FormatType.Medium }
     * 
     */
    public FormatType.Medium createFormatTypeMedium() {
        return new FormatType.Medium();
    }

    /**
     * Create an instance of {@link FormatType.MimeType }
     * 
     */
    public FormatType.MimeType createFormatTypeMimeType() {
        return new FormatType.MimeType();
    }

    /**
     * Create an instance of {@link FormatType.Locator }
     * 
     */
    public FormatType.Locator createFormatTypeLocator() {
        return new FormatType.Locator();
    }

    /**
     * Create an instance of {@link FormatType.DateCreated }
     * 
     */
    public FormatType.DateCreated createFormatTypeDateCreated() {
        return new FormatType.DateCreated();
    }

    /**
     * Create an instance of {@link FormatType.DateModified }
     * 
     */
    public FormatType.DateModified createFormatTypeDateModified() {
        return new FormatType.DateModified();
    }

    /**
     * Create an instance of {@link AudioFormatType.AudioEncoding }
     * 
     */
    public AudioFormatType.AudioEncoding createAudioFormatTypeAudioEncoding() {
        return new AudioFormatType.AudioEncoding();
    }

    /**
     * Create an instance of {@link AudioFormatType.AudioTrackConfiguration }
     * 
     */
    public AudioFormatType.AudioTrackConfiguration createAudioFormatTypeAudioTrackConfiguration() {
        return new AudioFormatType.AudioTrackConfiguration();
    }

    /**
     * Create an instance of {@link AudioFormatType.AudioTrack }
     * 
     */
    public AudioFormatType.AudioTrack createAudioFormatTypeAudioTrack() {
        return new AudioFormatType.AudioTrack();
    }

    /**
     * Create an instance of {@link MetadataFormatType.MetadataTrack }
     * 
     */
    public MetadataFormatType.MetadataTrack createMetadataFormatTypeMetadataTrack() {
        return new MetadataFormatType.MetadataTrack();
    }

    /**
     * Create an instance of {@link TimeType.Time }
     * 
     */
    public TimeType.Time createTimeTypeTime() {
        return new TimeType.Time();
    }

    /**
     * Create an instance of {@link AffiliationType.StartDate }
     * 
     */
    public AffiliationType.StartDate createAffiliationTypeStartDate() {
        return new AffiliationType.StartDate();
    }

    /**
     * Create an instance of {@link AffiliationType.EndDate }
     * 
     */
    public AffiliationType.EndDate createAffiliationTypeEndDate() {
        return new AffiliationType.EndDate();
    }

    /**
     * Create an instance of {@link TimecodeFormatType.TimecodeTrack }
     * 
     */
    public TimecodeFormatType.TimecodeTrack createTimecodeFormatTypeTimecodeTrack() {
        return new TimecodeFormatType.TimecodeTrack();
    }

    /**
     * Create an instance of {@link ImageFormatType.ImageEncoding }
     * 
     */
    public ImageFormatType.ImageEncoding createImageFormatTypeImageEncoding() {
        return new ImageFormatType.ImageEncoding();
    }

    /**
     * Create an instance of {@link DurationType.Duration }
     * 
     */
    public DurationType.Duration createDurationTypeDuration() {
        return new DurationType.Duration();
    }

    /**
     * Create an instance of {@link AwardType.Category }
     * 
     */
    public AwardType.Category createAwardTypeCategory() {
        return new AwardType.Category();
    }

    /**
     * Create an instance of {@link AwardType.Date }
     * 
     */
    public AwardType.Date createAwardTypeDate() {
        return new AwardType.Date();
    }

    /**
     * Create an instance of {@link OrganisationDetailsType.RelatedInformationLink }
     * 
     */
    public OrganisationDetailsType.RelatedInformationLink createOrganisationDetailsTypeRelatedInformationLink() {
        return new OrganisationDetailsType.RelatedInformationLink();
    }

    /**
     * Create an instance of {@link TypeType.Genre }
     * 
     */
    public TypeType.Genre createTypeTypeGenre() {
        return new TypeType.Genre();
    }

    /**
     * Create an instance of {@link TypeType.ObjectType }
     * 
     */
    public TypeType.ObjectType createTypeTypeObjectType() {
        return new TypeType.ObjectType();
    }

    /**
     * Create an instance of {@link CoreMetadataType.HasTrackPart }
     * 
     */
    public CoreMetadataType.HasTrackPart createCoreMetadataTypeHasTrackPart() {
        return new CoreMetadataType.HasTrackPart();
    }

    /**
     * Create an instance of {@link RegionType.Country }
     * 
     */
    public RegionType.Country createRegionTypeCountry() {
        return new RegionType.Country();
    }

    /**
     * Create an instance of {@link RegionType.CountryRegion }
     * 
     */
    public RegionType.CountryRegion createRegionTypeCountryRegion() {
        return new RegionType.CountryRegion();
    }

    /**
     * Create an instance of {@link VideoFormatType.Width }
     * 
     */
    public VideoFormatType.Width createVideoFormatTypeWidth() {
        return new VideoFormatType.Width();
    }

    /**
     * Create an instance of {@link VideoFormatType.Height }
     * 
     */
    public VideoFormatType.Height createVideoFormatTypeHeight() {
        return new VideoFormatType.Height();
    }

    /**
     * Create an instance of {@link VideoFormatType.VideoEncoding }
     * 
     */
    public VideoFormatType.VideoEncoding createVideoFormatTypeVideoEncoding() {
        return new VideoFormatType.VideoEncoding();
    }

    /**
     * Create an instance of {@link VideoFormatType.NoiseFilter }
     * 
     */
    public VideoFormatType.NoiseFilter createVideoFormatTypeNoiseFilter() {
        return new VideoFormatType.NoiseFilter();
    }

    /**
     * Create an instance of {@link VideoFormatType.VideoTrack }
     * 
     */
    public VideoFormatType.VideoTrack createVideoFormatTypeVideoTrack() {
        return new VideoFormatType.VideoTrack();
    }

    /**
     * Create an instance of {@link LocationType.Coordinates }
     * 
     */
    public LocationType.Coordinates createLocationTypeCoordinates() {
        return new LocationType.Coordinates();
    }

    /**
     * Create an instance of {@link EntityType.Role }
     * 
     */
    public EntityType.Role createEntityTypeRole() {
        return new EntityType.Role();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioPackFormatIDRef", scope = AudioStreamFormat.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioStreamFormatAudioPackFormatIDRef(Object value) {
        return new JAXBElement<>(_AudioStreamFormatAudioPackFormatIDRef_QNAME, Object.class, AudioStreamFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioChannelFormatIDRef", scope = AudioStreamFormat.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioStreamFormatAudioChannelFormatIDRef(Object value) {
        return new JAXBElement<>(_AudioStreamFormatAudioChannelFormatIDRef_QNAME, Object.class, AudioStreamFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioTrackFormatIDRef", scope = AudioStreamFormat.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioStreamFormatAudioTrackFormatIDRef(Object value) {
        return new JAXBElement<>(_AudioStreamFormatAudioTrackFormatIDRef_QNAME, Object.class, AudioStreamFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioPackFormatIDRef", scope = AudioPackFormat.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioPackFormatAudioPackFormatIDRef(Object value) {
        return new JAXBElement<>(_AudioStreamFormatAudioPackFormatIDRef_QNAME, Object.class, AudioPackFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioChannelFormatIDRef", scope = AudioPackFormat.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioPackFormatAudioChannelFormatIDRef(Object value) {
        return new JAXBElement<>(_AudioStreamFormatAudioChannelFormatIDRef_QNAME, Object.class, AudioPackFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioContentIDRef", scope = AudioProgramme.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioProgrammeAudioContentIDRef(Object value) {
        return new JAXBElement<>(_AudioProgrammeAudioContentIDRef_QNAME, Object.class, AudioProgramme.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "matrix", scope = AudioBlockFormat.class)
    public JAXBElement<MatrixType> createAudioBlockFormatMatrix(MatrixType value) {
        return new JAXBElement<>(_AudioBlockFormatMatrix_QNAME, MatrixType.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "gain", scope = AudioBlockFormat.class)
    public JAXBElement<java.lang.Float> createAudioBlockFormatGain(java.lang.Float value) {
        return new JAXBElement<>(_AudioBlockFormatGain_QNAME, java.lang.Float.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "speakerLabel", scope = AudioBlockFormat.class)
    public JAXBElement<java.lang.String> createAudioBlockFormatSpeakerLabel(java.lang.String value) {
        return new JAXBElement<>(_AudioBlockFormatSpeakerLabel_QNAME, java.lang.String.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "cartesian", scope = AudioBlockFormat.class)
    public JAXBElement<java.lang.Boolean> createAudioBlockFormatCartesian(java.lang.Boolean value) {
        return new JAXBElement<>(_AudioBlockFormatCartesian_QNAME, java.lang.Boolean.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "degree", scope = AudioBlockFormat.class)
    public JAXBElement<Integer> createAudioBlockFormatDegree(Integer value) {
        return new JAXBElement<>(_AudioBlockFormatDegree_QNAME, Integer.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "diffuse", scope = AudioBlockFormat.class)
    public JAXBElement<java.lang.Float> createAudioBlockFormatDiffuse(java.lang.Float value) {
        return new JAXBElement<>(_AudioBlockFormatDiffuse_QNAME, java.lang.Float.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "equation", scope = AudioBlockFormat.class)
    public JAXBElement<java.lang.String> createAudioBlockFormatEquation(java.lang.String value) {
        return new JAXBElement<>(_AudioBlockFormatEquation_QNAME, java.lang.String.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "importance", scope = AudioBlockFormat.class)
    public JAXBElement<Integer> createAudioBlockFormatImportance(Integer value) {
        return new JAXBElement<>(_AudioBlockFormatImportance_QNAME, Integer.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JumpPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "jumpPosition", scope = AudioBlockFormat.class)
    public JAXBElement<JumpPositionType> createAudioBlockFormatJumpPosition(JumpPositionType value) {
        return new JAXBElement<>(_AudioBlockFormatJumpPosition_QNAME, JumpPositionType.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectDivergenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "objectDivergence", scope = AudioBlockFormat.class)
    public JAXBElement<ObjectDivergenceType> createAudioBlockFormatObjectDivergence(ObjectDivergenceType value) {
        return new JAXBElement<>(_AudioBlockFormatObjectDivergence_QNAME, ObjectDivergenceType.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelLockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "channelLock", scope = AudioBlockFormat.class)
    public JAXBElement<ChannelLockType> createAudioBlockFormatChannelLock(ChannelLockType value) {
        return new JAXBElement<>(_AudioBlockFormatChannelLock_QNAME, ChannelLockType.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "height", scope = AudioBlockFormat.class)
    public JAXBElement<java.lang.Float> createAudioBlockFormatHeight(java.lang.Float value) {
        return new JAXBElement<>(_AudioBlockFormatHeight_QNAME, java.lang.Float.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "order", scope = AudioBlockFormat.class)
    public JAXBElement<Integer> createAudioBlockFormatOrder(Integer value) {
        return new JAXBElement<>(_AudioBlockFormatOrder_QNAME, Integer.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "width", scope = AudioBlockFormat.class)
    public JAXBElement<java.lang.Float> createAudioBlockFormatWidth(java.lang.Float value) {
        return new JAXBElement<>(_AudioBlockFormatWidth_QNAME, java.lang.Float.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "position", scope = AudioBlockFormat.class)
    public JAXBElement<PositionType> createAudioBlockFormatPosition(PositionType value) {
        return new JAXBElement<>(_AudioBlockFormatPosition_QNAME, PositionType.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "depth", scope = AudioBlockFormat.class)
    public JAXBElement<java.lang.Float> createAudioBlockFormatDepth(java.lang.Float value) {
        return new JAXBElement<>(_AudioBlockFormatDepth_QNAME, java.lang.Float.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "screenRef", scope = AudioBlockFormat.class)
    public JAXBElement<java.lang.Boolean> createAudioBlockFormatScreenRef(java.lang.Boolean value) {
        return new JAXBElement<>(_AudioBlockFormatScreenRef_QNAME, java.lang.Boolean.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneExclusionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "zoneExclusion", scope = AudioBlockFormat.class)
    public JAXBElement<ZoneExclusionType> createAudioBlockFormatZoneExclusion(ZoneExclusionType value) {
        return new JAXBElement<>(_AudioBlockFormatZoneExclusion_QNAME, ZoneExclusionType.class, AudioBlockFormat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioObjectIDRef", scope = AudioContent.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioContentAudioObjectIDRef(Object value) {
        return new JAXBElement<>(_AudioContentAudioObjectIDRef_QNAME, Object.class, AudioContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioPackFormatIDRef", scope = AudioObject.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioObjectAudioPackFormatIDRef(Object value) {
        return new JAXBElement<>(_AudioStreamFormatAudioPackFormatIDRef_QNAME, Object.class, AudioObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioComplementaryObjectIDRef", scope = AudioObject.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioObjectAudioComplementaryObjectIDRef(Object value) {
        return new JAXBElement<>(_AudioObjectAudioComplementaryObjectIDRef_QNAME, Object.class, AudioObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioTrackUIDRef", scope = AudioObject.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioObjectAudioTrackUIDRef(Object value) {
        return new JAXBElement<>(_AudioObjectAudioTrackUIDRef_QNAME, Object.class, AudioObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioObjectIDRef", scope = AudioObject.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioObjectAudioObjectIDRef(Object value) {
        return new JAXBElement<>(_AudioContentAudioObjectIDRef_QNAME, Object.class, AudioObject.class, value);
    }

}
