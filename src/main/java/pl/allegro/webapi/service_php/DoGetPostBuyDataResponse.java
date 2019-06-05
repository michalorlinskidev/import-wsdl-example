
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
 *         &lt;element name="itemsPostBuyData" type="{https://webapi.allegro.pl/service.php}ArrayOfItempostbuydatastruct" minOccurs="0"/&gt;
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
    "itemsPostBuyData"
})
@XmlRootElement(name = "doGetPostBuyDataResponse")
public class DoGetPostBuyDataResponse {

    protected ArrayOfItempostbuydatastruct itemsPostBuyData;

    /**
     * Gets the value of the itemsPostBuyData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItempostbuydatastruct }
     *     
     */
    public ArrayOfItempostbuydatastruct getItemsPostBuyData() {
        return itemsPostBuyData;
    }

    /**
     * Sets the value of the itemsPostBuyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItempostbuydatastruct }
     *     
     */
    public void setItemsPostBuyData(ArrayOfItempostbuydatastruct value) {
        this.itemsPostBuyData = value;
    }

}
