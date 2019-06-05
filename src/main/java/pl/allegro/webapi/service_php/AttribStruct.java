
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttribStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttribStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="attribName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attribValues" type="{https://webapi.allegro.pl/service.php}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttribStruct", propOrder = {

})
public class AttribStruct {

    @XmlElement(required = true)
    protected String attribName;
    protected ArrayOfString attribValues;

    /**
     * Gets the value of the attribName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribName() {
        return attribName;
    }

    /**
     * Sets the value of the attribName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribName(String value) {
        this.attribName = value;
    }

    /**
     * Gets the value of the attribValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAttribValues() {
        return attribValues;
    }

    /**
     * Sets the value of the attribValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAttribValues(ArrayOfString value) {
        this.attribValues = value;
    }

}
