
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
 *         &lt;element name="shipmentPriceTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "shipmentPriceTypeId"
})
@XmlRootElement(name = "doGetMyCurrentShipmentPriceTypeResponse")
public class DoGetMyCurrentShipmentPriceTypeResponse {

    protected int shipmentPriceTypeId;

    /**
     * Gets the value of the shipmentPriceTypeId property.
     * 
     */
    public int getShipmentPriceTypeId() {
        return shipmentPriceTypeId;
    }

    /**
     * Sets the value of the shipmentPriceTypeId property.
     * 
     */
    public void setShipmentPriceTypeId(int value) {
        this.shipmentPriceTypeId = value;
    }

}