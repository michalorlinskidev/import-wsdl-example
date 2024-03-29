
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DealsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealsStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="dealId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dealDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dealQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dealAmountOriginal" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="dealAmountDiscounted" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealsStruct", propOrder = {

})
public class DealsStruct {

    protected long dealId;
    protected long dealDate;
    protected int dealQuantity;
    protected float dealAmountOriginal;
    protected float dealAmountDiscounted;

    /**
     * Gets the value of the dealId property.
     * 
     */
    public long getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     * 
     */
    public void setDealId(long value) {
        this.dealId = value;
    }

    /**
     * Gets the value of the dealDate property.
     * 
     */
    public long getDealDate() {
        return dealDate;
    }

    /**
     * Sets the value of the dealDate property.
     * 
     */
    public void setDealDate(long value) {
        this.dealDate = value;
    }

    /**
     * Gets the value of the dealQuantity property.
     * 
     */
    public int getDealQuantity() {
        return dealQuantity;
    }

    /**
     * Sets the value of the dealQuantity property.
     * 
     */
    public void setDealQuantity(int value) {
        this.dealQuantity = value;
    }

    /**
     * Gets the value of the dealAmountOriginal property.
     * 
     */
    public float getDealAmountOriginal() {
        return dealAmountOriginal;
    }

    /**
     * Sets the value of the dealAmountOriginal property.
     * 
     */
    public void setDealAmountOriginal(float value) {
        this.dealAmountOriginal = value;
    }

    /**
     * Gets the value of the dealAmountDiscounted property.
     * 
     */
    public float getDealAmountDiscounted() {
        return dealAmountDiscounted;
    }

    /**
     * Sets the value of the dealAmountDiscounted property.
     * 
     */
    public void setDealAmountDiscounted(float value) {
        this.dealAmountDiscounted = value;
    }

}
