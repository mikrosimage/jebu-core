
package ebu.metadata_schema.ebucore_2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for dialogueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dialogueType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *       &lt;attribute name="nonDialogueContentKind" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="dialogueContentKind" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="mixedContentKind" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dialogueType", propOrder = {
    "value"
})
public class DialogueType {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "nonDialogueContentKind")
    protected Integer nonDialogueContentKind;
    @XmlAttribute(name = "dialogueContentKind")
    protected Integer dialogueContentKind;
    @XmlAttribute(name = "mixedContentKind")
    protected Integer mixedContentKind;

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the nonDialogueContentKind property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNonDialogueContentKind() {
        return nonDialogueContentKind;
    }

    /**
     * Sets the value of the nonDialogueContentKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNonDialogueContentKind(Integer value) {
        this.nonDialogueContentKind = value;
    }

    /**
     * Gets the value of the dialogueContentKind property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDialogueContentKind() {
        return dialogueContentKind;
    }

    /**
     * Sets the value of the dialogueContentKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDialogueContentKind(Integer value) {
        this.dialogueContentKind = value;
    }

    /**
     * Gets the value of the mixedContentKind property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMixedContentKind() {
        return mixedContentKind;
    }

    /**
     * Sets the value of the mixedContentKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMixedContentKind(Integer value) {
        this.mixedContentKind = value;
    }

}
