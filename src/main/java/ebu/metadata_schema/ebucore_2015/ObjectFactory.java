
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

    private final static QName _AudioObject_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioObject");
    private final static QName _AudioProgramme_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioProgramme");
    private final static QName _EbuCoreMain_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "ebuCoreMain");
    private final static QName _AudioChannelFormat_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioChannelFormat");
    private final static QName _AudioStreamFormat_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioStreamFormat");
    private final static QName _AudioPackFormat_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioPackFormat");
    private final static QName _AudioTrackUID_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioTrackUID");
    private final static QName _AudioTrackFormat_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioTrackFormat");
    private final static QName _AudioBlockFormat_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioBlockFormat");
    private final static QName _AudioContent_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioContent");
    private final static QName _AudioProgrammeTypeAudioContentIDRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioContentIDRef");
    private final static QName _AudioBlockFormatTypeScreenRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "screenRef");
    private final static QName _AudioBlockFormatTypeObjectDivergence_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "objectDivergence");
    private final static QName _AudioBlockFormatTypeJumpPosition_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "jumpPosition");
    private final static QName _AudioBlockFormatTypeOrder_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "order");
    private final static QName _AudioBlockFormatTypeImportance_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "importance");
    private final static QName _AudioBlockFormatTypeEquation_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "equation");
    private final static QName _AudioBlockFormatTypeDegree_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "degree");
    private final static QName _AudioBlockFormatTypeHeight_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "height");
    private final static QName _AudioBlockFormatTypeCartesian_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "cartesian");
    private final static QName _AudioBlockFormatTypeSpeakerLabel_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "speakerLabel");
    private final static QName _AudioBlockFormatTypeDepth_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "depth");
    private final static QName _AudioBlockFormatTypeGain_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "gain");
    private final static QName _AudioBlockFormatTypeDiffuse_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "diffuse");
    private final static QName _AudioBlockFormatTypeMatrix_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "matrix");
    private final static QName _AudioBlockFormatTypeWidth_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "width");
    private final static QName _AudioBlockFormatTypeChannelLock_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "channelLock");
    private final static QName _AudioBlockFormatTypeZoneExclusion_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "zoneExclusion");
    private final static QName _AudioBlockFormatTypePosition_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "position");
    private final static QName _AudioPackFormatTypeAudioChannelFormatIDRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioChannelFormatIDRef");
    private final static QName _AudioPackFormatTypeAudioPackFormatIDRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioPackFormatIDRef");
    private final static QName _AudioObjectTypeAudioComplementaryObjectIDRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioComplementaryObjectIDRef");
    private final static QName _AudioObjectTypeAudioTrackUIDRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioTrackUIDRef");
    private final static QName _AudioObjectTypeAudioObjectIDRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioObjectIDRef");
    private final static QName _AudioStreamFormatTypeAudioTrackFormatIDRef_QNAME = new QName("urn:ebu:metadata-schema:ebuCore_2015", "audioTrackFormatIDRef");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ebu.metadata_schema.ebucore_2015
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TypeType }
     * 
     */
    public TypeType createTypeType() {
        return new TypeType();
    }

    /**
     * Create an instance of {@link DateType }
     * 
     */
    public DateType createDateType() {
        return new DateType();
    }

    /**
     * Create an instance of {@link CoreMetadataType }
     * 
     */
    public CoreMetadataType createCoreMetadataType() {
        return new CoreMetadataType();
    }

    /**
     * Create an instance of {@link ImageFormatType }
     * 
     */
    public ImageFormatType createImageFormatType() {
        return new ImageFormatType();
    }

    /**
     * Create an instance of {@link ContactDetailsType }
     * 
     */
    public ContactDetailsType createContactDetailsType() {
        return new ContactDetailsType();
    }

    /**
     * Create an instance of {@link HashType }
     * 
     */
    public HashType createHashType() {
        return new HashType();
    }

    /**
     * Create an instance of {@link RightsType }
     * 
     */
    public RightsType createRightsType() {
        return new RightsType();
    }

    /**
     * Create an instance of {@link MetadataFormatType }
     * 
     */
    public MetadataFormatType createMetadataFormatType() {
        return new MetadataFormatType();
    }

    /**
     * Create an instance of {@link RegionType }
     * 
     */
    public RegionType createRegionType() {
        return new RegionType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link AudioFormatType }
     * 
     */
    public AudioFormatType createAudioFormatType() {
        return new AudioFormatType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link AwardType }
     * 
     */
    public AwardType createAwardType() {
        return new AwardType();
    }

    /**
     * Create an instance of {@link FilterType }
     * 
     */
    public FilterType createFilterType() {
        return new FilterType();
    }

    /**
     * Create an instance of {@link FormatType }
     * 
     */
    public FormatType createFormatType() {
        return new FormatType();
    }

    /**
     * Create an instance of {@link ContainerFormatType }
     * 
     */
    public ContainerFormatType createContainerFormatType() {
        return new ContainerFormatType();
    }

    /**
     * Create an instance of {@link TimecodeFormatType }
     * 
     */
    public TimecodeFormatType createTimecodeFormatType() {
        return new TimecodeFormatType();
    }

    /**
     * Create an instance of {@link VideoFormatType }
     * 
     */
    public VideoFormatType createVideoFormatType() {
        return new VideoFormatType();
    }

    /**
     * Create an instance of {@link OrganisationDetailsType }
     * 
     */
    public OrganisationDetailsType createOrganisationDetailsType() {
        return new OrganisationDetailsType();
    }

    /**
     * Create an instance of {@link DurationType }
     * 
     */
    public DurationType createDurationType() {
        return new DurationType();
    }

    /**
     * Create an instance of {@link AffiliationType }
     * 
     */
    public AffiliationType createAffiliationType() {
        return new AffiliationType();
    }

    /**
     * Create an instance of {@link TimeType }
     * 
     */
    public TimeType createTimeType() {
        return new TimeType();
    }

    /**
     * Create an instance of {@link EntityType }
     * 
     */
    public EntityType createEntityType() {
        return new EntityType();
    }

    /**
     * Create an instance of {@link AudioContentType }
     * 
     */
    public AudioContentType createAudioContentType() {
        return new AudioContentType();
    }

    /**
     * Create an instance of {@link AudioBlockFormatType }
     * 
     */
    public AudioBlockFormatType createAudioBlockFormatType() {
        return new AudioBlockFormatType();
    }

    /**
     * Create an instance of {@link EbuCoreMainType }
     * 
     */
    public EbuCoreMainType createEbuCoreMainType() {
        return new EbuCoreMainType();
    }

    /**
     * Create an instance of {@link AudioProgrammeType }
     * 
     */
    public AudioProgrammeType createAudioProgrammeType() {
        return new AudioProgrammeType();
    }

    /**
     * Create an instance of {@link Frequency }
     * 
     */
    public Frequency createFrequency() {
        return new Frequency();
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
     * Create an instance of {@link AudioPackFormatType }
     * 
     */
    public AudioPackFormatType createAudioPackFormatType() {
        return new AudioPackFormatType();
    }

    /**
     * Create an instance of {@link AudioTrackUIDType }
     * 
     */
    public AudioTrackUIDType createAudioTrackUIDType() {
        return new AudioTrackUIDType();
    }

    /**
     * Create an instance of {@link AudioTrackFormatType }
     * 
     */
    public AudioTrackFormatType createAudioTrackFormatType() {
        return new AudioTrackFormatType();
    }

    /**
     * Create an instance of {@link AudioObjectType }
     * 
     */
    public AudioObjectType createAudioObjectType() {
        return new AudioObjectType();
    }

    /**
     * Create an instance of {@link AudioChannelFormatType }
     * 
     */
    public AudioChannelFormatType createAudioChannelFormatType() {
        return new AudioChannelFormatType();
    }

    /**
     * Create an instance of {@link AudioStreamFormatType }
     * 
     */
    public AudioStreamFormatType createAudioStreamFormatType() {
        return new AudioStreamFormatType();
    }

    /**
     * Create an instance of {@link AlternativeDateType }
     * 
     */
    public AlternativeDateType createAlternativeDateType() {
        return new AlternativeDateType();
    }

    /**
     * Create an instance of {@link AncillaryDataFormatType }
     * 
     */
    public AncillaryDataFormatType createAncillaryDataFormatType() {
        return new AncillaryDataFormatType();
    }

    /**
     * Create an instance of {@link ScreenCentrePositionType }
     * 
     */
    public ScreenCentrePositionType createScreenCentrePositionType() {
        return new ScreenCentrePositionType();
    }

    /**
     * Create an instance of {@link AudienceLevelType }
     * 
     */
    public AudienceLevelType createAudienceLevelType() {
        return new AudienceLevelType();
    }

    /**
     * Create an instance of {@link DocumentFormatType }
     * 
     */
    public DocumentFormatType createDocumentFormatType() {
        return new DocumentFormatType();
    }

    /**
     * Create an instance of {@link CodecType }
     * 
     */
    public CodecType createCodecType() {
        return new CodecType();
    }

    /**
     * Create an instance of {@link JumpPositionType }
     * 
     */
    public JumpPositionType createJumpPositionType() {
        return new JumpPositionType();
    }

    /**
     * Create an instance of {@link PublicationServiceType }
     * 
     */
    public PublicationServiceType createPublicationServiceType() {
        return new PublicationServiceType();
    }

    /**
     * Create an instance of {@link AspectRatioType }
     * 
     */
    public AspectRatioType createAspectRatioType() {
        return new AspectRatioType();
    }

    /**
     * Create an instance of {@link Int32 }
     * 
     */
    public Int32 createInt32() {
        return new Int32();
    }

    /**
     * Create an instance of {@link TechnicalAttributeUriType }
     * 
     */
    public TechnicalAttributeUriType createTechnicalAttributeUriType() {
        return new TechnicalAttributeUriType();
    }

    /**
     * Create an instance of {@link OrganisationDepartmentType }
     * 
     */
    public OrganisationDepartmentType createOrganisationDepartmentType() {
        return new OrganisationDepartmentType();
    }

    /**
     * Create an instance of {@link DataFormatType }
     * 
     */
    public DataFormatType createDataFormatType() {
        return new DataFormatType();
    }

    /**
     * Create an instance of {@link RatingType }
     * 
     */
    public RatingType createRatingType() {
        return new RatingType();
    }

    /**
     * Create an instance of {@link AudioProgrammeReferenceScreenType }
     * 
     */
    public AudioProgrammeReferenceScreenType createAudioProgrammeReferenceScreenType() {
        return new AudioProgrammeReferenceScreenType();
    }

    /**
     * Create an instance of {@link VersionType }
     * 
     */
    public VersionType createVersionType() {
        return new VersionType();
    }

    /**
     * Create an instance of {@link AudioFormatExtendedType }
     * 
     */
    public AudioFormatExtendedType createAudioFormatExtendedType() {
        return new AudioFormatExtendedType();
    }

    /**
     * Create an instance of {@link DimensionType }
     * 
     */
    public DimensionType createDimensionType() {
        return new DimensionType();
    }

    /**
     * Create an instance of {@link RelationType }
     * 
     */
    public RelationType createRelationType() {
        return new RelationType();
    }

    /**
     * Create an instance of {@link UInt32 }
     * 
     */
    public UInt32 createUInt32() {
        return new UInt32();
    }

    /**
     * Create an instance of {@link RationalType }
     * 
     */
    public RationalType createRationalType() {
        return new RationalType();
    }

    /**
     * Create an instance of {@link SigningFormatType }
     * 
     */
    public SigningFormatType createSigningFormatType() {
        return new SigningFormatType();
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link Int8 }
     * 
     */
    public Int8 createInt8() {
        return new Int8();
    }

    /**
     * Create an instance of {@link TitleType }
     * 
     */
    public TitleType createTitleType() {
        return new TitleType();
    }

    /**
     * Create an instance of {@link SubjectType }
     * 
     */
    public SubjectType createSubjectType() {
        return new SubjectType();
    }

    /**
     * Create an instance of {@link ebu.metadata_schema.ebucore_2015.Float }
     * 
     */
    public ebu.metadata_schema.ebucore_2015.Float createFloat() {
        return new ebu.metadata_schema.ebucore_2015.Float();
    }

    /**
     * Create an instance of {@link AudienceType }
     * 
     */
    public AudienceType createAudienceType() {
        return new AudienceType();
    }

    /**
     * Create an instance of {@link ChannelLockType }
     * 
     */
    public ChannelLockType createChannelLockType() {
        return new ChannelLockType();
    }

    /**
     * Create an instance of {@link PublicationEventType }
     * 
     */
    public PublicationEventType createPublicationEventType() {
        return new PublicationEventType();
    }

    /**
     * Create an instance of {@link Int16 }
     * 
     */
    public Int16 createInt16() {
        return new Int16();
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
     * Create an instance of {@link DetailsType }
     * 
     */
    public DetailsType createDetailsType() {
        return new DetailsType();
    }

    /**
     * Create an instance of {@link PublicationChannelType }
     * 
     */
    public PublicationChannelType createPublicationChannelType() {
        return new PublicationChannelType();
    }

    /**
     * Create an instance of {@link EditUnitNumberType }
     * 
     */
    public EditUnitNumberType createEditUnitNumberType() {
        return new EditUnitNumberType();
    }

    /**
     * Create an instance of {@link LoudnessMetadataType }
     * 
     */
    public LoudnessMetadataType createLoudnessMetadataType() {
        return new LoudnessMetadataType();
    }

    /**
     * Create an instance of {@link AlternativeTitleType }
     * 
     */
    public AlternativeTitleType createAlternativeTitleType() {
        return new AlternativeTitleType();
    }

    /**
     * Create an instance of {@link CompoundNameType }
     * 
     */
    public CompoundNameType createCompoundNameType() {
        return new CompoundNameType();
    }

    /**
     * Create an instance of {@link CoefficientType }
     * 
     */
    public CoefficientType createCoefficientType() {
        return new CoefficientType();
    }

    /**
     * Create an instance of {@link UInt16 }
     * 
     */
    public UInt16 createUInt16() {
        return new UInt16();
    }

    /**
     * Create an instance of {@link TechnicalAttributeRationalType }
     * 
     */
    public TechnicalAttributeRationalType createTechnicalAttributeRationalType() {
        return new TechnicalAttributeRationalType();
    }

    /**
     * Create an instance of {@link AudioObjectInteractionType }
     * 
     */
    public AudioObjectInteractionType createAudioObjectInteractionType() {
        return new AudioObjectInteractionType();
    }

    /**
     * Create an instance of {@link ScreenWidthType }
     * 
     */
    public ScreenWidthType createScreenWidthType() {
        return new ScreenWidthType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link TemporalType }
     * 
     */
    public TemporalType createTemporalType() {
        return new TemporalType();
    }

    /**
     * Create an instance of {@link PlanningType }
     * 
     */
    public PlanningType createPlanningType() {
        return new PlanningType();
    }

    /**
     * Create an instance of {@link ObjectDivergenceType }
     * 
     */
    public ObjectDivergenceType createObjectDivergenceType() {
        return new ObjectDivergenceType();
    }

    /**
     * Create an instance of {@link ebu.metadata_schema.ebucore_2015.String }
     * 
     */
    public ebu.metadata_schema.ebucore_2015.String createString() {
        return new ebu.metadata_schema.ebucore_2015.String();
    }

    /**
     * Create an instance of {@link PublicationMediumType }
     * 
     */
    public PublicationMediumType createPublicationMediumType() {
        return new PublicationMediumType();
    }

    /**
     * Create an instance of {@link GainInteractionRangeType }
     * 
     */
    public GainInteractionRangeType createGainInteractionRangeType() {
        return new GainInteractionRangeType();
    }

    /**
     * Create an instance of {@link PublicationHistoryType }
     * 
     */
    public PublicationHistoryType createPublicationHistoryType() {
        return new PublicationHistoryType();
    }

    /**
     * Create an instance of {@link ZoneType }
     * 
     */
    public ZoneType createZoneType() {
        return new ZoneType();
    }

    /**
     * Create an instance of {@link LanguageType }
     * 
     */
    public LanguageType createLanguageType() {
        return new LanguageType();
    }

    /**
     * Create an instance of {@link UInt8 }
     * 
     */
    public UInt8 createUInt8() {
        return new UInt8();
    }

    /**
     * Create an instance of {@link PositionInteractionRangeType }
     * 
     */
    public PositionInteractionRangeType createPositionInteractionRangeType() {
        return new PositionInteractionRangeType();
    }

    /**
     * Create an instance of {@link AudioMXFLookUpType }
     * 
     */
    public AudioMXFLookUpType createAudioMXFLookUpType() {
        return new AudioMXFLookUpType();
    }

    /**
     * Create an instance of {@link PositionType }
     * 
     */
    public PositionType createPositionType() {
        return new PositionType();
    }

    /**
     * Create an instance of {@link IdentifierType }
     * 
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierType();
    }

    /**
     * Create an instance of {@link PartType }
     * 
     */
    public PartType createPartType() {
        return new PartType();
    }

    /**
     * Create an instance of {@link PeriodOfTimeType }
     * 
     */
    public PeriodOfTimeType createPeriodOfTimeType() {
        return new PeriodOfTimeType();
    }

    /**
     * Create an instance of {@link CaptioningFormatType }
     * 
     */
    public CaptioningFormatType createCaptioningFormatType() {
        return new CaptioningFormatType();
    }

    /**
     * Create an instance of {@link UInt64 }
     * 
     */
    public UInt64 createUInt64() {
        return new UInt64();
    }

    /**
     * Create an instance of {@link MatrixType }
     * 
     */
    public MatrixType createMatrixType() {
        return new MatrixType();
    }

    /**
     * Create an instance of {@link ebu.metadata_schema.ebucore_2015.Boolean }
     * 
     */
    public ebu.metadata_schema.ebucore_2015.Boolean createBoolean() {
        return new ebu.metadata_schema.ebucore_2015.Boolean();
    }

    /**
     * Create an instance of {@link LengthType }
     * 
     */
    public LengthType createLengthType() {
        return new LengthType();
    }

    /**
     * Create an instance of {@link SubtitlingFormatType }
     * 
     */
    public SubtitlingFormatType createSubtitlingFormatType() {
        return new SubtitlingFormatType();
    }

    /**
     * Create an instance of {@link DialogueType }
     * 
     */
    public DialogueType createDialogueType() {
        return new DialogueType();
    }

    /**
     * Create an instance of {@link SpatialType }
     * 
     */
    public SpatialType createSpatialType() {
        return new SpatialType();
    }

    /**
     * Create an instance of {@link ZoneExclusionType }
     * 
     */
    public ZoneExclusionType createZoneExclusionType() {
        return new ZoneExclusionType();
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
     * Create an instance of {@link CoreMetadataType.HasTrackPart }
     * 
     */
    public CoreMetadataType.HasTrackPart createCoreMetadataTypeHasTrackPart() {
        return new CoreMetadataType.HasTrackPart();
    }

    /**
     * Create an instance of {@link ImageFormatType.ImageEncoding }
     * 
     */
    public ImageFormatType.ImageEncoding createImageFormatTypeImageEncoding() {
        return new ImageFormatType.ImageEncoding();
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
     * Create an instance of {@link HashType.HashFunction }
     * 
     */
    public HashType.HashFunction createHashTypeHashFunction() {
        return new HashType.HashFunction();
    }

    /**
     * Create an instance of {@link RightsType.ProcessingRestrictionFlag }
     * 
     */
    public RightsType.ProcessingRestrictionFlag createRightsTypeProcessingRestrictionFlag() {
        return new RightsType.ProcessingRestrictionFlag();
    }

    /**
     * Create an instance of {@link MetadataFormatType.MetadataTrack }
     * 
     */
    public MetadataFormatType.MetadataTrack createMetadataFormatTypeMetadataTrack() {
        return new MetadataFormatType.MetadataTrack();
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
     * Create an instance of {@link AddressType.Country }
     * 
     */
    public AddressType.Country createAddressTypeCountry() {
        return new AddressType.Country();
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
     * Create an instance of {@link LocationType.Coordinates }
     * 
     */
    public LocationType.Coordinates createLocationTypeCoordinates() {
        return new LocationType.Coordinates();
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
     * Create an instance of {@link ContainerFormatType.ContainerEncoding }
     * 
     */
    public ContainerFormatType.ContainerEncoding createContainerFormatTypeContainerEncoding() {
        return new ContainerFormatType.ContainerEncoding();
    }

    /**
     * Create an instance of {@link TimecodeFormatType.TimecodeTrack }
     * 
     */
    public TimecodeFormatType.TimecodeTrack createTimecodeFormatTypeTimecodeTrack() {
        return new TimecodeFormatType.TimecodeTrack();
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
     * Create an instance of {@link OrganisationDetailsType.RelatedInformationLink }
     * 
     */
    public OrganisationDetailsType.RelatedInformationLink createOrganisationDetailsTypeRelatedInformationLink() {
        return new OrganisationDetailsType.RelatedInformationLink();
    }

    /**
     * Create an instance of {@link DurationType.Duration }
     * 
     */
    public DurationType.Duration createDurationTypeDuration() {
        return new DurationType.Duration();
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
     * Create an instance of {@link TimeType.Time }
     * 
     */
    public TimeType.Time createTimeTypeTime() {
        return new TimeType.Time();
    }

    /**
     * Create an instance of {@link EntityType.Role }
     * 
     */
    public EntityType.Role createEntityTypeRole() {
        return new EntityType.Role();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioObject")
    public JAXBElement<AudioObjectType> createAudioObject(AudioObjectType value) {
        return new JAXBElement<>(_AudioObject_QNAME, AudioObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioProgrammeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioProgramme")
    public JAXBElement<AudioProgrammeType> createAudioProgramme(AudioProgrammeType value) {
        return new JAXBElement<>(_AudioProgramme_QNAME, AudioProgrammeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EbuCoreMainType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "ebuCoreMain")
    public JAXBElement<EbuCoreMainType> createEbuCoreMain(EbuCoreMainType value) {
        return new JAXBElement<>(_EbuCoreMain_QNAME, EbuCoreMainType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioChannelFormatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioChannelFormat")
    public JAXBElement<AudioChannelFormatType> createAudioChannelFormat(AudioChannelFormatType value) {
        return new JAXBElement<>(_AudioChannelFormat_QNAME, AudioChannelFormatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioStreamFormatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioStreamFormat")
    public JAXBElement<AudioStreamFormatType> createAudioStreamFormat(AudioStreamFormatType value) {
        return new JAXBElement<>(_AudioStreamFormat_QNAME, AudioStreamFormatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioPackFormatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioPackFormat")
    public JAXBElement<AudioPackFormatType> createAudioPackFormat(AudioPackFormatType value) {
        return new JAXBElement<>(_AudioPackFormat_QNAME, AudioPackFormatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioTrackUIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioTrackUID")
    public JAXBElement<AudioTrackUIDType> createAudioTrackUID(AudioTrackUIDType value) {
        return new JAXBElement<>(_AudioTrackUID_QNAME, AudioTrackUIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioTrackFormatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioTrackFormat")
    public JAXBElement<AudioTrackFormatType> createAudioTrackFormat(AudioTrackFormatType value) {
        return new JAXBElement<>(_AudioTrackFormat_QNAME, AudioTrackFormatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioBlockFormatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioBlockFormat")
    public JAXBElement<AudioBlockFormatType> createAudioBlockFormat(AudioBlockFormatType value) {
        return new JAXBElement<>(_AudioBlockFormat_QNAME, AudioBlockFormatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioContent")
    public JAXBElement<AudioContentType> createAudioContent(AudioContentType value) {
        return new JAXBElement<>(_AudioContent_QNAME, AudioContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioContentIDRef", scope = AudioProgrammeType.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioProgrammeTypeAudioContentIDRef(Object value) {
        return new JAXBElement<>(_AudioProgrammeTypeAudioContentIDRef_QNAME, Object.class, AudioProgrammeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "screenRef", scope = AudioBlockFormatType.class)
    public JAXBElement<java.lang.Boolean> createAudioBlockFormatTypeScreenRef(java.lang.Boolean value) {
        return new JAXBElement<>(_AudioBlockFormatTypeScreenRef_QNAME, java.lang.Boolean.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectDivergenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "objectDivergence", scope = AudioBlockFormatType.class)
    public JAXBElement<ObjectDivergenceType> createAudioBlockFormatTypeObjectDivergence(ObjectDivergenceType value) {
        return new JAXBElement<>(_AudioBlockFormatTypeObjectDivergence_QNAME, ObjectDivergenceType.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JumpPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "jumpPosition", scope = AudioBlockFormatType.class)
    public JAXBElement<JumpPositionType> createAudioBlockFormatTypeJumpPosition(JumpPositionType value) {
        return new JAXBElement<>(_AudioBlockFormatTypeJumpPosition_QNAME, JumpPositionType.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "order", scope = AudioBlockFormatType.class)
    public JAXBElement<Integer> createAudioBlockFormatTypeOrder(Integer value) {
        return new JAXBElement<>(_AudioBlockFormatTypeOrder_QNAME, Integer.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "importance", scope = AudioBlockFormatType.class)
    public JAXBElement<Integer> createAudioBlockFormatTypeImportance(Integer value) {
        return new JAXBElement<>(_AudioBlockFormatTypeImportance_QNAME, Integer.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "equation", scope = AudioBlockFormatType.class)
    public JAXBElement<java.lang.String> createAudioBlockFormatTypeEquation(java.lang.String value) {
        return new JAXBElement<>(_AudioBlockFormatTypeEquation_QNAME, java.lang.String.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "degree", scope = AudioBlockFormatType.class)
    public JAXBElement<Integer> createAudioBlockFormatTypeDegree(Integer value) {
        return new JAXBElement<>(_AudioBlockFormatTypeDegree_QNAME, Integer.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "height", scope = AudioBlockFormatType.class)
    public JAXBElement<java.lang.Float> createAudioBlockFormatTypeHeight(java.lang.Float value) {
        return new JAXBElement<>(_AudioBlockFormatTypeHeight_QNAME, java.lang.Float.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "cartesian", scope = AudioBlockFormatType.class)
    public JAXBElement<java.lang.Boolean> createAudioBlockFormatTypeCartesian(java.lang.Boolean value) {
        return new JAXBElement<>(_AudioBlockFormatTypeCartesian_QNAME, java.lang.Boolean.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "speakerLabel", scope = AudioBlockFormatType.class)
    public JAXBElement<java.lang.String> createAudioBlockFormatTypeSpeakerLabel(java.lang.String value) {
        return new JAXBElement<>(_AudioBlockFormatTypeSpeakerLabel_QNAME, java.lang.String.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "depth", scope = AudioBlockFormatType.class)
    public JAXBElement<java.lang.Float> createAudioBlockFormatTypeDepth(java.lang.Float value) {
        return new JAXBElement<>(_AudioBlockFormatTypeDepth_QNAME, java.lang.Float.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "gain", scope = AudioBlockFormatType.class)
    public JAXBElement<java.lang.Float> createAudioBlockFormatTypeGain(java.lang.Float value) {
        return new JAXBElement<>(_AudioBlockFormatTypeGain_QNAME, java.lang.Float.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "diffuse", scope = AudioBlockFormatType.class)
    public JAXBElement<java.lang.Float> createAudioBlockFormatTypeDiffuse(java.lang.Float value) {
        return new JAXBElement<>(_AudioBlockFormatTypeDiffuse_QNAME, java.lang.Float.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "matrix", scope = AudioBlockFormatType.class)
    public JAXBElement<MatrixType> createAudioBlockFormatTypeMatrix(MatrixType value) {
        return new JAXBElement<>(_AudioBlockFormatTypeMatrix_QNAME, MatrixType.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "width", scope = AudioBlockFormatType.class)
    public JAXBElement<java.lang.Float> createAudioBlockFormatTypeWidth(java.lang.Float value) {
        return new JAXBElement<>(_AudioBlockFormatTypeWidth_QNAME, java.lang.Float.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelLockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "channelLock", scope = AudioBlockFormatType.class)
    public JAXBElement<ChannelLockType> createAudioBlockFormatTypeChannelLock(ChannelLockType value) {
        return new JAXBElement<>(_AudioBlockFormatTypeChannelLock_QNAME, ChannelLockType.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneExclusionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "zoneExclusion", scope = AudioBlockFormatType.class)
    public JAXBElement<ZoneExclusionType> createAudioBlockFormatTypeZoneExclusion(ZoneExclusionType value) {
        return new JAXBElement<>(_AudioBlockFormatTypeZoneExclusion_QNAME, ZoneExclusionType.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "position", scope = AudioBlockFormatType.class)
    public JAXBElement<PositionType> createAudioBlockFormatTypePosition(PositionType value) {
        return new JAXBElement<>(_AudioBlockFormatTypePosition_QNAME, PositionType.class, AudioBlockFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioChannelFormatIDRef", scope = AudioPackFormatType.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioPackFormatTypeAudioChannelFormatIDRef(Object value) {
        return new JAXBElement<>(_AudioPackFormatTypeAudioChannelFormatIDRef_QNAME, Object.class, AudioPackFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioPackFormatIDRef", scope = AudioPackFormatType.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioPackFormatTypeAudioPackFormatIDRef(Object value) {
        return new JAXBElement<>(_AudioPackFormatTypeAudioPackFormatIDRef_QNAME, Object.class, AudioPackFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioComplementaryObjectIDRef", scope = AudioObjectType.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioObjectTypeAudioComplementaryObjectIDRef(Object value) {
        return new JAXBElement<>(_AudioObjectTypeAudioComplementaryObjectIDRef_QNAME, Object.class, AudioObjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioTrackUIDRef", scope = AudioObjectType.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioObjectTypeAudioTrackUIDRef(Object value) {
        return new JAXBElement<>(_AudioObjectTypeAudioTrackUIDRef_QNAME, Object.class, AudioObjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioObjectIDRef", scope = AudioObjectType.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioObjectTypeAudioObjectIDRef(Object value) {
        return new JAXBElement<>(_AudioObjectTypeAudioObjectIDRef_QNAME, Object.class, AudioObjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioPackFormatIDRef", scope = AudioObjectType.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioObjectTypeAudioPackFormatIDRef(Object value) {
        return new JAXBElement<>(_AudioPackFormatTypeAudioPackFormatIDRef_QNAME, Object.class, AudioObjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioObjectIDRef", scope = AudioContentType.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioContentTypeAudioObjectIDRef(Object value) {
        return new JAXBElement<>(_AudioObjectTypeAudioObjectIDRef_QNAME, Object.class, AudioContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioChannelFormatIDRef", scope = AudioStreamFormatType.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioStreamFormatTypeAudioChannelFormatIDRef(Object value) {
        return new JAXBElement<>(_AudioPackFormatTypeAudioChannelFormatIDRef_QNAME, Object.class, AudioStreamFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioTrackFormatIDRef", scope = AudioStreamFormatType.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioStreamFormatTypeAudioTrackFormatIDRef(Object value) {
        return new JAXBElement<>(_AudioStreamFormatTypeAudioTrackFormatIDRef_QNAME, Object.class, AudioStreamFormatType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebu:metadata-schema:ebuCore_2015", name = "audioPackFormatIDRef", scope = AudioStreamFormatType.class)
    @XmlIDREF
    public JAXBElement<Object> createAudioStreamFormatTypeAudioPackFormatIDRef(Object value) {
        return new JAXBElement<>(_AudioPackFormatTypeAudioPackFormatIDRef_QNAME, Object.class, AudioStreamFormatType.class, value);
    }

}
