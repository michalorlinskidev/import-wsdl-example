
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostBuyFormItemDealsVariantStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostBuyFormItemDealsVariantStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="variantName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="variantValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostBuyFormItemDealsVariantStruct", propOrder = {

})
public class PostBuyFormItemDealsVariantStruct {

    @XmlElement(required = true)
    protected String variantName;
    @XmlElement(required = true)
    protected String variantValue;

    /**
     * Gets the value of the variantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantName() {
        return variantName;
    }

    /**
     * Sets the value of the variantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantName(String value) {
        this.variantName = value;
    }

    /**
     * Gets the value of the variantValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantValue() {
        return variantValue;
    }

    /**
     * Sets the value of the variantValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantValue(String value) {
        this.variantValue = value;
    }

}
