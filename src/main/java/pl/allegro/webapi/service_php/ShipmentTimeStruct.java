
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentTimeStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentTimeStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="shipmentTimeFrom" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="shipmentTimeTo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentTimeStruct", propOrder = {

})
public class ShipmentTimeStruct {

    protected int shipmentTimeFrom;
    protected int shipmentTimeTo;

    /**
     * Gets the value of the shipmentTimeFrom property.
     * 
     */
    public int getShipmentTimeFrom() {
        return shipmentTimeFrom;
    }

    /**
     * Sets the value of the shipmentTimeFrom property.
     * 
     */
    public void setShipmentTimeFrom(int value) {
        this.shipmentTimeFrom = value;
    }

    /**
     * Gets the value of the shipmentTimeTo property.
     * 
     */
    public int getShipmentTimeTo() {
        return shipmentTimeTo;
    }

    /**
     * Sets the value of the shipmentTimeTo property.
     * 
     */
    public void setShipmentTimeTo(int value) {
        this.shipmentTimeTo = value;
    }

}
