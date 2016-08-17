
package ebu.metadata_schema.ebucore_2015;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A complex type to express a number of edit units. An editUnit is the
 * 				inverse of the edit rate, or corrected edit rate as the result of
 * 				editUnit=1/(editrate*(factorNumerator/factorDenominator)).
 * 
 * <p>Java class for editUnitNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editUnitNumberType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>long">
 *       &lt;attribute name="editRate" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="factorNumerator" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
 *       &lt;attribute name="factorDenominator" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editUnitNumberType", propOrder = {
    "value"
})
public class EditUnitNumberType {

    @XmlValue
    protected long value;
    @XmlAttribute(name = "editRate")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger editRate;
    @XmlAttribute(name = "factorNumerator")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger factorNumerator;
    @XmlAttribute(name = "factorDenominator")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger factorDenominator;

    /**
     * Gets the value of the value property.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(long value) {
        this.value = value;
    }

    /**
     * Gets the value of the editRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEditRate() {
        return editRate;
    }

    /**
     * Sets the value of the editRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEditRate(BigInteger value) {
        this.editRate = value;
    }

    /**
     * Gets the value of the factorNumerator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFactorNumerator() {
        if (factorNumerator == null) {
            return new BigInteger("1");
        } else {
            return factorNumerator;
        }
    }

    /**
     * Sets the value of the factorNumerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFactorNumerator(BigInteger value) {
        this.factorNumerator = value;
    }

    /**
     * Gets the value of the factorDenominator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFactorDenominator() {
        if (factorDenominator == null) {
            return new BigInteger("1");
        } else {
            return factorDenominator;
        }
    }

    /**
     * Sets the value of the factorDenominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFactorDenominator(BigInteger value) {
        this.factorDenominator = value;
    }

}
