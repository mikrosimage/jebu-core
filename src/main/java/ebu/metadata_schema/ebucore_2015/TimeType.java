
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour timeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="timeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="timecode" type="{urn:ebu:metadata-schema:ebuCore_2015}timecodeType"/>
 *         &lt;element name="normalPlayTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="editUnitNumber" type="{urn:ebu:metadata-schema:ebuCore_2015}editUnitNumberType"/>
 *         &lt;element name="time">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}formatGroup"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeType", propOrder = {
    "time",
    "editUnitNumber",
    "normalPlayTime",
    "timecode"
})
public class TimeType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected TimeType.Time time;
    protected EditUnitNumberType editUnitNumber;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar normalPlayTime;
    protected java.lang.String timecode;
    @XmlAttribute(name = "typeLabel")
    protected java.lang.String typeLabel;
    @XmlAttribute(name = "typeDefinition")
    protected java.lang.String typeDefinition;
    @XmlAttribute(name = "typeLink")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String typeLink;
    @XmlAttribute(name = "typeSource")
    protected java.lang.String typeSource;
    @XmlAttribute(name = "typeNamespace")
    protected java.lang.String typeNamespace;
    @XmlAttribute(name = "typeLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String typeLanguage;

    /**
     * Obtient la valeur de la propriété time.
     * 
     * @return
     *     possible object is
     *     {@link TimeType.Time }
     *     
     */
    public TimeType.Time getTime() {
        return time;
    }

    /**
     * Définit la valeur de la propriété time.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType.Time }
     *     
     */
    public void setTime(TimeType.Time value) {
        this.time = value;
    }

    /**
     * Obtient la valeur de la propriété editUnitNumber.
     * 
     * @return
     *     possible object is
     *     {@link EditUnitNumberType }
     *     
     */
    public EditUnitNumberType getEditUnitNumber() {
        return editUnitNumber;
    }

    /**
     * Définit la valeur de la propriété editUnitNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link EditUnitNumberType }
     *     
     */
    public void setEditUnitNumber(EditUnitNumberType value) {
        this.editUnitNumber = value;
    }

    /**
     * Obtient la valeur de la propriété normalPlayTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNormalPlayTime() {
        return normalPlayTime;
    }

    /**
     * Définit la valeur de la propriété normalPlayTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNormalPlayTime(XMLGregorianCalendar value) {
        this.normalPlayTime = value;
    }

    /**
     * Obtient la valeur de la propriété timecode.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTimecode() {
        return timecode;
    }

    /**
     * Définit la valeur de la propriété timecode.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTimecode(java.lang.String value) {
        this.timecode = value;
    }

    /**
     * Obtient la valeur de la propriété typeLabel.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLabel() {
        return typeLabel;
    }

    /**
     * Définit la valeur de la propriété typeLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLabel(java.lang.String value) {
        this.typeLabel = value;
    }

    /**
     * Obtient la valeur de la propriété typeDefinition.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeDefinition() {
        return typeDefinition;
    }

    /**
     * Définit la valeur de la propriété typeDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeDefinition(java.lang.String value) {
        this.typeDefinition = value;
    }

    /**
     * Obtient la valeur de la propriété typeLink.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLink() {
        return typeLink;
    }

    /**
     * Définit la valeur de la propriété typeLink.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLink(java.lang.String value) {
        this.typeLink = value;
    }

    /**
     * Obtient la valeur de la propriété typeSource.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeSource() {
        return typeSource;
    }

    /**
     * Définit la valeur de la propriété typeSource.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeSource(java.lang.String value) {
        this.typeSource = value;
    }

    /**
     * Obtient la valeur de la propriété typeNamespace.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeNamespace() {
        return typeNamespace;
    }

    /**
     * Définit la valeur de la propriété typeNamespace.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeNamespace(java.lang.String value) {
        this.typeNamespace = value;
    }

    /**
     * Obtient la valeur de la propriété typeLanguage.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLanguage() {
        return typeLanguage;
    }

    /**
     * Définit la valeur de la propriété typeLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLanguage(java.lang.String value) {
        this.typeLanguage = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}formatGroup"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Time
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlValue
        protected java.lang.String value;
        @XmlAttribute(name = "formatLabel")
        protected java.lang.String formatLabel;
        @XmlAttribute(name = "formatDefinition")
        protected java.lang.String formatDefinition;
        @XmlAttribute(name = "formatLink")
        @XmlSchemaType(name = "anyURI")
        protected java.lang.String formatLink;
        @XmlAttribute(name = "formatSource")
        protected java.lang.String formatSource;
        @XmlAttribute(name = "formatNamespace")
        protected java.lang.String formatNamespace;
        @XmlAttribute(name = "formatLanguage")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected java.lang.String formatLanguage;

        /**
         * Obtient la valeur de la propriété value.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getValue() {
            return value;
        }

        /**
         * Définit la valeur de la propriété value.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setValue(java.lang.String value) {
            this.value = value;
        }

        /**
         * Obtient la valeur de la propriété formatLabel.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getFormatLabel() {
            return formatLabel;
        }

        /**
         * Définit la valeur de la propriété formatLabel.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setFormatLabel(java.lang.String value) {
            this.formatLabel = value;
        }

        /**
         * Obtient la valeur de la propriété formatDefinition.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getFormatDefinition() {
            return formatDefinition;
        }

        /**
         * Définit la valeur de la propriété formatDefinition.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setFormatDefinition(java.lang.String value) {
            this.formatDefinition = value;
        }

        /**
         * Obtient la valeur de la propriété formatLink.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getFormatLink() {
            return formatLink;
        }

        /**
         * Définit la valeur de la propriété formatLink.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setFormatLink(java.lang.String value) {
            this.formatLink = value;
        }

        /**
         * Obtient la valeur de la propriété formatSource.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getFormatSource() {
            return formatSource;
        }

        /**
         * Définit la valeur de la propriété formatSource.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setFormatSource(java.lang.String value) {
            this.formatSource = value;
        }

        /**
         * Obtient la valeur de la propriété formatNamespace.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getFormatNamespace() {
            return formatNamespace;
        }

        /**
         * Définit la valeur de la propriété formatNamespace.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setFormatNamespace(java.lang.String value) {
            this.formatNamespace = value;
        }

        /**
         * Obtient la valeur de la propriété formatLanguage.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getFormatLanguage() {
            return formatLanguage;
        }

        /**
         * Définit la valeur de la propriété formatLanguage.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setFormatLanguage(java.lang.String value) {
            this.formatLanguage = value;
        }

    }

}
