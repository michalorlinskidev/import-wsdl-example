
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductParametersStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductParametersStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="productParameterName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productParameterValues" type="{https://webapi.allegro.pl/service.php}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="productParameterDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductParametersStruct", propOrder = {

})
public class ProductParametersStruct {

    @XmlElement(required = true)
    protected String productParameterName;
    protected ArrayOfString productParameterValues;
    @XmlElement(required = true)
    protected String productParameterDescription;

    /**
     * Gets the value of the productParameterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductParameterName() {
        return productParameterName;
    }

    /**
     * Sets the value of the productParameterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductParameterName(String value) {
        this.productParameterName = value;
    }

    /**
     * Gets the value of the productParameterValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getProductParameterValues() {
        return productParameterValues;
    }

    /**
     * Sets the value of the productParameterValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setProductParameterValues(ArrayOfString value) {
        this.productParameterValues = value;
    }

    /**
     * Gets the value of the productParameterDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductParameterDescription() {
        return productParameterDescription;
    }

    /**
     * Sets the value of the productParameterDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductParameterDescription(String value) {
        this.productParameterDescription = value;
    }

}
