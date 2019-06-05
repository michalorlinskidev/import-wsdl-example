
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
 *         &lt;element name="freeDeliveryAmount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="activeFlag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "freeDeliveryAmount",
    "activeFlag"
})
@XmlRootElement(name = "doGetFreeDeliveryAmountResponse")
public class DoGetFreeDeliveryAmountResponse {

    protected float freeDeliveryAmount;
    protected int activeFlag;

    /**
     * Gets the value of the freeDeliveryAmount property.
     * 
     */
    public float getFreeDeliveryAmount() {
        return freeDeliveryAmount;
    }

    /**
     * Sets the value of the freeDeliveryAmount property.
     * 
     */
    public void setFreeDeliveryAmount(float value) {
        this.freeDeliveryAmount = value;
    }

    /**
     * Gets the value of the activeFlag property.
     * 
     */
    public int getActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     */
    public void setActiveFlag(int value) {
        this.activeFlag = value;
    }

}
