
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour organisationDepartmentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="organisationDepartmentType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:ebu:metadata-schema:ebuCore_2015>elementType">
 *       &lt;attribute name="departmentId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationDepartmentType")
public class OrganisationDepartmentType
    extends ElementType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlAttribute(name = "departmentId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String departmentId;

    /**
     * Obtient la valeur de la propriété departmentId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDepartmentId() {
        return departmentId;
    }

    /**
     * Définit la valeur de la propriété departmentId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDepartmentId(java.lang.String value) {
        this.departmentId = value;
    }

}
