# jebu-core
This project is a Java port of [TECH 3293](https://tech.ebu.ch/publications/tech3294) EBU CORE METADATA SET (EBUCore) SPECIFICATION v. 1.6, including  [Audio Definition Model](https://tech.ebu.ch/docs/tech/tech3364.pdf). It also include commons objects that are described within [R-REC-BS.2094-0](https://www.itu.int/rec/R-REC-BS.2094-0-201604-I/en) Common definitions for the audio definition model.

The current schema version is __2015.06.30__. One can find all of them at [EBU' repository](http://www.ebu.ch/metadata/schemas/EBUCore/).

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
	<version>1.6.1</version>
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
import eu.mikrosimage.xdmat.ebucore.v1_5.*;

public void createSampleEbuCore() {
    	// Use EBU Core Object Factory
		final ObjectFactory ebuCoreFactory = new ObjectFactory();

		//EBUcore root
		final EbuCoreMainType ebuCore = ebuCoreFactory.createEbuCoreMainType();
		final CoreMetadataType ebuCoreMetaData = ebuCoreFactory.createCoreMetadataType();
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
<ebuCoreMainType xmlns:dc="http://purl.org/dc/elements/1.1/" xmlns:ebucore="urn:ebu:metadata-schema:ebuCore_2014">
    <ebucore:coreMetadata>
        <ebucore:part partName="EditorialMetadata">
            <ebucore:title typeLabel="ProgramTitle">
                <dc:title xml:lang="fr">Titre du pogramme</dc:title>
            </ebucore:title>
        </ebucore:part>
    </ebucore:coreMetadata>
</ebuCoreMainType>

```


## EBUCore 1.6

__EBUCore__ has been purposefully designed as a minimum and flexible list of attributes to describe audio and video resources for a wide range of broadcasting applications including archives, exchange and production in the context of a <accronym title="Service Oriented Architecture">SOA</acronym>. It is also a metadata schema with well defined syntax and semantics for easier implementation.
__EBUCore__ is based on the Dublin Core to maximise interoperability with the community of Dublin Core users such as the European Digital Library 'Europeana'.

__EBUCore 1.6__ takes into account latest developments in the Semantic Web and Linked Open Data communities. The __EBU__ ontology (EBUCore RDF implementation) has been updated to complement EBU's CCDM (Tech 3351) and improve mapping with other ontologies of the audiovisual sector such as Mediamap.

__EBUCore 1.6__ also introduces the schema of a new advanced data model for audio defined in Tech 3364.

More information on EBU metadata activities is provided on the EBU TECHNICAL website (http://tech.ebu.ch/metadata).
