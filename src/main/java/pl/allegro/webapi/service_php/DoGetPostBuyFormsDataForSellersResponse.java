
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="postBuyFormData" type="{https://webapi.allegro.pl/service.php}ArrayOfPostbuyformdatastruct" minOccurs="0"/&gt;
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
    "postBuyFormData"
})
@XmlRootElement(name = "doGetPostBuyFormsDataForSellersResponse")
public class DoGetPostBuyFormsDataForSellersResponse {

    protected ArrayOfPostbuyformdatastruct postBuyFormData;

    /**
     * Gets the value of the postBuyFormData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostbuyformdatastruct }
     *     
     */
    public ArrayOfPostbuyformdatastruct getPostBuyFormData() {
        return postBuyFormData;
    }

    /**
     * Sets the value of the postBuyFormData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostbuyformdatastruct }
     *     
     */
    public void setPostBuyFormData(ArrayOfPostbuyformdatastruct value) {
        this.postBuyFormData = value;
    }

}
