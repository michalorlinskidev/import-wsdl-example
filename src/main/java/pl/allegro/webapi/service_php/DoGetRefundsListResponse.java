
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
 *         &lt;element name="refundsCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="refundsList" type="{https://webapi.allegro.pl/service.php}ArrayOfRefundlisttype" minOccurs="0"/&gt;
 *         &lt;element name="filtersList" type="{https://webapi.allegro.pl/service.php}ArrayOfFilterslisttype" minOccurs="0"/&gt;
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
    "refundsCount",
    "refundsList",
    "filtersList"
})
@XmlRootElement(name = "doGetRefundsListResponse")
public class DoGetRefundsListResponse {

    protected int refundsCount;
    protected ArrayOfRefundlisttype refundsList;
    protected ArrayOfFilterslisttype filtersList;

    /**
     * Gets the value of the refundsCount property.
     * 
     */
    public int getRefundsCount() {
        return refundsCount;
    }

    /**
     * Sets the value of the refundsCount property.
     * 
     */
    public void setRefundsCount(int value) {
        this.refundsCount = value;
    }

    /**
     * Gets the value of the refundsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRefundlisttype }
     *     
     */
    public ArrayOfRefundlisttype getRefundsList() {
        return refundsList;
    }

    /**
     * Sets the value of the refundsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRefundlisttype }
     *     
     */
    public void setRefundsList(ArrayOfRefundlisttype value) {
        this.refundsList = value;
    }

    /**
     * Gets the value of the filtersList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFilterslisttype }
     *     
     */
    public ArrayOfFilterslisttype getFiltersList() {
        return filtersList;
    }

    /**
     * Sets the value of the filtersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFilterslisttype }
     *     
     */
    public void setFiltersList(ArrayOfFilterslisttype value) {
        this.filtersList = value;
    }

}
