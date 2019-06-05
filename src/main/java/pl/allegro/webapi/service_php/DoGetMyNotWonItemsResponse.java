
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
 *         &lt;element name="notWonItemsCounter" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="notWonItemsList" type="{https://webapi.allegro.pl/service.php}ArrayOfNotwonitemstruct" minOccurs="0"/&gt;
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
    "notWonItemsCounter",
    "notWonItemsList"
})
@XmlRootElement(name = "doGetMyNotWonItemsResponse")
public class DoGetMyNotWonItemsResponse {

    protected int notWonItemsCounter;
    protected ArrayOfNotwonitemstruct notWonItemsList;

    /**
     * Gets the value of the notWonItemsCounter property.
     * 
     */
    public int getNotWonItemsCounter() {
        return notWonItemsCounter;
    }

    /**
     * Sets the value of the notWonItemsCounter property.
     * 
     */
    public void setNotWonItemsCounter(int value) {
        this.notWonItemsCounter = value;
    }

    /**
     * Gets the value of the notWonItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotwonitemstruct }
     *     
     */
    public ArrayOfNotwonitemstruct getNotWonItemsList() {
        return notWonItemsList;
    }

    /**
     * Sets the value of the notWonItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotwonitemstruct }
     *     
     */
    public void setNotWonItemsList(ArrayOfNotwonitemstruct value) {
        this.notWonItemsList = value;
    }

}
