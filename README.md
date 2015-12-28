# jebu-core
EBUCore XML Schema Java port.

Java port of [TECH 3293](https://tech.ebu.ch/publications/tech3293) EBU CORE METADATA SET (EBUCore) SPECIFICATION v. 1.5, including new [Audio Definition Model](https://tech.ebu.ch/docs/tech/tech3364.pdf)


##How to use


Let's create a sample EbuCoreMainType :
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


##EBUCore 1.5

__EBUCore__ has been purposefully designed as a minimum and flexible list of attributes to describe audio and video resources for a wide range of broadcasting applications including archives, exchange and production in the context of a <accronym title="Service Oriented Architecture">SOA</acronym>. It is also a metadata schema with well defined syntax and semantics for easier implementation.
__EBUCore__ is based on the Dublin Core to maximise interoperability with the community of Dublin Core users such as the European Digital Library 'Europeana'. 

EBUCore 1.5 takes into account latest developments in the Semantic Web and Linked Open Data communities. The EBU ontology (EBUCore RDF implementation) has been updated to complement EBU's CCDM (Tech 3351) and improve mapping with other ontologies of the audiovisual sector such as Mediamap.

EBUCore 1.5 also introduces the schema of a new advanced data model for audio defined in Tech 3364.

More information on EBU metadata activities is provided on the EBU TECHNICAL website (http://tech.ebu.ch/metadata).