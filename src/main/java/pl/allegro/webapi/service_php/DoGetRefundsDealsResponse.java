
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
 *         &lt;element name="dealsCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dealsList" type="{https://webapi.allegro.pl/service.php}ArrayOfRefundsdealslisttype" minOccurs="0"/&gt;
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
    "dealsCount",
    "dealsList",
    "filtersList"
})
@XmlRootElement(name = "doGetRefundsDealsResponse")
public class DoGetRefundsDealsResponse {

    protected int dealsCount;
    protected ArrayOfRefundsdealslisttype dealsList;
    protected ArrayOfFilterslisttype filtersList;

    /**
     * Gets the value of the dealsCount property.
     * 
     */
    public int getDealsCount() {
        return dealsCount;
    }

    /**
     * Sets the value of the dealsCount property.
     * 
     */
    public void setDealsCount(int value) {
        this.dealsCount = value;
    }

    /**
     * Gets the value of the dealsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRefundsdealslisttype }
     *     
     */
    public ArrayOfRefundsdealslisttype getDealsList() {
        return dealsList;
    }

    /**
     * Sets the value of the dealsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRefundsdealslisttype }
     *     
     */
    public void setDealsList(ArrayOfRefundsdealslisttype value) {
        this.dealsList = value;
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
