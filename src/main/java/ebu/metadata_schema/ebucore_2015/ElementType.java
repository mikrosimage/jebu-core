
package ebu.metadata_schema.ebucore_2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for elementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elementType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://purl.org/dc/elements/1.1/>elementType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elementType")
@XmlSeeAlso({
    OrganisationDepartmentType.class,
    VersionType.class,
    CompoundNameType.class,
    ebu.metadata_schema.ebucore_2015.ContactDetailsType.StageName.class,
    Comment.class
})
public class ElementType
    extends org.purl.dc.elements._1.ElementType
{


}
