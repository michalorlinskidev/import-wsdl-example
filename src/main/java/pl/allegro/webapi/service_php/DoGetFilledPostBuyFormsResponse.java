
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filledPostBuyForms" type="{https://webapi.allegro.pl/service.php}FilledPostBuyFormsStruct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filledPostBuyForms"
})
@XmlRootElement(name = "doGetFilledPostBuyFormsResponse")
public class DoGetFilledPostBuyFormsResponse {

    @XmlElement(required = true)
    protected FilledPostBuyFormsStruct filledPostBuyForms;

    /**
     * Gets the value of the filledPostBuyForms property.
     * 
     * @return
     *     possible object is
     *     {@link FilledPostBuyFormsStruct }
     *     
     */
    public FilledPostBuyFormsStruct getFilledPostBuyForms() {
        return filledPostBuyForms;
    }

    /**
     * Sets the value of the filledPostBuyForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilledPostBuyFormsStruct }
     *     
     */
    public void setFilledPostBuyForms(FilledPostBuyFormsStruct value) {
        this.filledPostBuyForms = value;
    }

}
