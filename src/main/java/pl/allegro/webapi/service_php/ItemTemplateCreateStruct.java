
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemTemplateCreateStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemTemplateCreateStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="itemTemplateOption" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="itemTemplateName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemTemplateCreateStruct", propOrder = {

})
public class ItemTemplateCreateStruct {

    protected int itemTemplateOption;
    @XmlElement(required = true)
    protected String itemTemplateName;

    /**
     * Gets the value of the itemTemplateOption property.
     * 
     */
    public int getItemTemplateOption() {
        return itemTemplateOption;
    }

    /**
     * Sets the value of the itemTemplateOption property.
     * 
     */
    public void setItemTemplateOption(int value) {
        this.itemTemplateOption = value;
    }

    /**
     * Gets the value of the itemTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTemplateName() {
        return itemTemplateName;
    }

    /**
     * Sets the value of the itemTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTemplateName(String value) {
        this.itemTemplateName = value;
    }

}
