# jebu-core
This project is a Java port of [TECH 3293](https://tech.ebu.ch/publications/tech3294) EBU CORE METADATA SET (EBUCore) SPECIFICATION v. 1.7, including  [Audio Definition Model](https://tech.ebu.ch/docs/tech/tech3364.pdf). It also include commons objects that are described within [R-REC-BS.2094-0](https://www.itu.int/rec/R-REC-BS.2094-0-201604-I/en) Common definitions for the audio definition model.

The current schema version is __2015.06.30__. One can find all of them at [EBU' repository](http://www.ebu.ch/metadata/schemas/EBUCore/).

## What is new in version 1.7 ?
### GENERAL ENRICHMENT
1. audioDescriptionPresenceFlag attribute added to audioFormat
2. change periodName cardinality to unbounded to allow providing the name in different languages
3. in part, give choice between end time and duration 
4. add date archived 
5. add typeGroup to location/name 
6. add altitude to location 
7. change timecodeType to timecodeStringtype to define a timecode string pattern. Backward compatible when validating instances 
8. redefine timecodeType as an extension of timecodeStringtype with drop frame (flag), editRate + factorNumerator and factorDenominator to support a correcting factor applying to an editRate from which a timecode is derived 
9. add contactDetails/additionalInformation + typeGroup 
10. add typeGroup to ebuCoreMain in prevision of IMF metadata insertion 
11. change cardinality of contact/additionalInformation from "1" to "0/unbounded" 
12. add additionalInformation element to location with cardinality "0/unbounded" ALIGN WITH EBUCore RDF 1. add date ingested

### EBUCORE ROOT PROPERTIES for EBUSPORT 
1. Add Event start/end/description/name (e.g. key personal and career events) in entity 

### FIMS MAPPING 
1. add relations like hasChild, isChildOf, hasParent, isParentOf, hasMaster, isMasterOf 

### SMPTE MAPPING 
1. add "thesaurus" to the type, format and status groups 
2. add "editrate" to the fileInfo element group 
3. add "imageFormatProfileLevel" to imageFormatType 
4. add version, definition and presenceFlag to extendedAudioFormat 

### CORRECTIONS 
1. affiliation type, start and end dates are redundant. remove end date and rename startDate in period

## How it was generated
This code was generated with Java 8 XJC tool:
```
xjc  -no-header -d "src/main/java" -catalog src/main/resources/catalog.dtd -classpath src/main/java -extension src/main/resources/ebucore.xsd -b src/main/resources/bindings.xjb
```
Note that ce resources files are included within this repository.

## How to use

First add jebu-core library to your maven dependencies:
```xml
<dependency>
	<groupId>org.ebu.metadata_schema</groupId>
	<artifactId>jebu-core</artifactId>
	<version>1.7.0</version>
</dependency>
```

Note that jebu-core depends itself on the following libraries:

Some EBUCore entities rely on [jdublin-core](https://github.com/mikrosimage/jdublin-core), the Java port for Dublin Core format.
```xml
<dependency>
	<groupId>org.purl.dc</groupId>
	<artifactId>jdublin-core</artifactId>
	<version>2002.12.12</version>
</dependency>
```
See the [Dublin Core metadata initiative](http://dublincore.org/).
## Sample application
Let's create a sample EbuCoreMain :
```java
import ebu.metadata_schema.ebucore_2016.*;

public void createSampleEbuCore() {
    	// Use EBU Core Object Factory
		final ObjectFactory ebuCoreFactory = new ObjectFactory();

		//EBUcore root
		final EbuCoreMain ebuCore = ebuCoreFactory.createEbuCoreMain();
		final CoreMetadata ebuCoreMetaData = ebuCoreFactory.createCoreMetadata();
		ebuCore.setCoreMetadata(ebuCoreMetaData);
		//... add content

		// Sample : EditorialMetadata part
		final PartType editorialMetadataPart = ebuCoreFactory.createPartType();
		editorialMetadataPart.setPartName("EditorialMetadata");
			final TitleType titleType = ebuCoreFactory.createTitleType();
				titleType.setTypeLabel("ProgramTitle");
				final ElementType titleElementType = ebuCoreFactory.createElementType();
					titleElementType.setLang("fr");
					titleElementType.setValue("Titre du pogramme");
					titleType.getTitle().add(titleElementType);
				editorialMetadataPart.getTitle().add(titleType);
		ebuCoreMetaData.getPart().add(editorialMetadataPart);
	}
```
Then
```java
JAXB.marshal(new EBUCoreFactory().createSampleEbuCore(), System.out);
```
Will produce :
```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<ebuCoreMainType xmlns:dc="http://purl.org/dc/elements/1.1/" xmlns:ebucore="urn:ebu:metadata-schema:ebuCore_2016">
    <ebucore:coreMetadata>
        <ebucore:part partName="EditorialMetadata">
            <ebucore:title typeLabel="ProgramTitle">
                <dc:title xml:lang="fr">Titre du pogramme</dc:title>
            </ebucore:title>
        </ebucore:part>
    </ebucore:coreMetadata>
</ebuCoreMainType>

```


## EBUCore 1.7

This is version 1.7 of the _EBUCore_ metadata set.

__EBUCore__ has been purposefully designed as a minimum and flexible list of attributes to describe audio and video resources for a wide range of broadcasting applications including archives, exchange and production in the context of a Service Oriented Architecture. It is also a metadata schema with well defined syntax and semantics for easier implementation.

__EBUCore__ is based on the __Dublin Core__ to maximise interoperability with the community of Dublin Core users such as the European Digital Library 'Europeana'.

__EBUCore__ 1.7 takes into account latest developments in the Semantic Web and Linked Open Data communities. __EBUCore__ 1.7 is available as a RDF ontology entirely compatible with the W3C Media Annotation Working Group ontology, which model is common and based on the __EBU Class Conceptual Data Model__ (Tech.3351). A link to the RDF/OWL ontology and its documentation is provided in Annex B. The EBUCore ontology has been updated to complement EBU's CCDM (Tech 3351) and improve mapping with other ontologies. EBUCore RDF is listed as Linked Open Vocabulary as well as RDF-Vocab for Ruby developers.

The definitions in __EBUCore__ 1.7 have been refined. The schema structure has been reinforced for registration in EBU's Class 13 in SMPTE.

More information on EBU metadata activities is provided on the EBU TECHNICAL website (http://tech.ebu.ch/metadata).
