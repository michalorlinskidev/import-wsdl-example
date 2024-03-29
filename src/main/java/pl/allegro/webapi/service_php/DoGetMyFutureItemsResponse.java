
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
 *         &lt;element name="futureItemsCounter" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="futureItemsList" type="{https://webapi.allegro.pl/service.php}ArrayOfFutureitemstruct" minOccurs="0"/&gt;
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
    "futureItemsCounter",
    "futureItemsList"
})
@XmlRootElement(name = "doGetMyFutureItemsResponse")
public class DoGetMyFutureItemsResponse {

    protected int futureItemsCounter;
    protected ArrayOfFutureitemstruct futureItemsList;

    /**
     * Gets the value of the futureItemsCounter property.
     * 
     */
    public int getFutureItemsCounter() {
        return futureItemsCounter;
    }

    /**
     * Sets the value of the futureItemsCounter property.
     * 
     */
    public void setFutureItemsCounter(int value) {
        this.futureItemsCounter = value;
    }

    /**
     * Gets the value of the futureItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFutureitemstruct }
     *     
     */
    public ArrayOfFutureitemstruct getFutureItemsList() {
        return futureItemsList;
    }

    /**
     * Sets the value of the futureItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFutureitemstruct }
     *     
     */
    public void setFutureItemsList(ArrayOfFutureitemstruct value) {
        this.futureItemsList = value;
    }

}
