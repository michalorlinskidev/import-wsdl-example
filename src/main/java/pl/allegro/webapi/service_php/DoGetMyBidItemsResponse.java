
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
 *         &lt;element name="bidItemsCounter" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bidItemsList" type="{https://webapi.allegro.pl/service.php}ArrayOfBiditemstruct" minOccurs="0"/&gt;
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
    "bidItemsCounter",
    "bidItemsList"
})
@XmlRootElement(name = "doGetMyBidItemsResponse")
public class DoGetMyBidItemsResponse {

    protected int bidItemsCounter;
    protected ArrayOfBiditemstruct bidItemsList;

    /**
     * Gets the value of the bidItemsCounter property.
     * 
     */
    public int getBidItemsCounter() {
        return bidItemsCounter;
    }

    /**
     * Sets the value of the bidItemsCounter property.
     * 
     */
    public void setBidItemsCounter(int value) {
        this.bidItemsCounter = value;
    }

    /**
     * Gets the value of the bidItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBiditemstruct }
     *     
     */
    public ArrayOfBiditemstruct getBidItemsList() {
        return bidItemsList;
    }

    /**
     * Sets the value of the bidItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBiditemstruct }
     *     
     */
    public void setBidItemsList(ArrayOfBiditemstruct value) {
        this.bidItemsList = value;
    }

}
