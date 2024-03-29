
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
 *         &lt;element name="soldItemsCounter" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="soldItemsList" type="{https://webapi.allegro.pl/service.php}ArrayOfSolditemstruct" minOccurs="0"/&gt;
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
    "soldItemsCounter",
    "soldItemsList"
})
@XmlRootElement(name = "doGetMySoldItemsResponse")
public class DoGetMySoldItemsResponse {

    protected int soldItemsCounter;
    protected ArrayOfSolditemstruct soldItemsList;

    /**
     * Gets the value of the soldItemsCounter property.
     * 
     */
    public int getSoldItemsCounter() {
        return soldItemsCounter;
    }

    /**
     * Sets the value of the soldItemsCounter property.
     * 
     */
    public void setSoldItemsCounter(int value) {
        this.soldItemsCounter = value;
    }

    /**
     * Gets the value of the soldItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSolditemstruct }
     *     
     */
    public ArrayOfSolditemstruct getSoldItemsList() {
        return soldItemsList;
    }

    /**
     * Sets the value of the soldItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSolditemstruct }
     *     
     */
    public void setSoldItemsList(ArrayOfSolditemstruct value) {
        this.soldItemsList = value;
    }

}
