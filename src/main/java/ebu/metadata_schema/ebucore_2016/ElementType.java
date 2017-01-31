
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour elementType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
    ebu.metadata_schema.ebucore_2016.LocationType.Name.class,
    VersionType.class,
    CompoundNameType.class,
    OrganisationDepartmentType.class,
    ebu.metadata_schema.ebucore_2016.ContactDetailsType.StageName.class,
    Comment.class
})
public class ElementType
    extends org.purl.dc.elements._1.ElementType
    implements Serializable
{

    private final static long serialVersionUID = -1L;

}
