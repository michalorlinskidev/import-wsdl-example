
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayoutRefundToStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayoutRefundToStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="tranasctionId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="refundId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="refundReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="toUserId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="paidDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayoutRefundToStruct", propOrder = {

})
public class PayoutRefundToStruct {

    protected long tranasctionId;
    protected long refundId;
    @XmlElement(required = true)
    protected String refundReason;
    protected long itemId;
    protected long toUserId;
    protected float amount;
    @XmlElement(required = true)
    protected String paidDate;

    /**
     * Gets the value of the tranasctionId property.
     * 
     */
    public long getTranasctionId() {
        return tranasctionId;
    }

    /**
     * Sets the value of the tranasctionId property.
     * 
     */
    public void setTranasctionId(long value) {
        this.tranasctionId = value;
    }

    /**
     * Gets the value of the refundId property.
     * 
     */
    public long getRefundId() {
        return refundId;
    }

    /**
     * Sets the value of the refundId property.
     * 
     */
    public void setRefundId(long value) {
        this.refundId = value;
    }

    /**
     * Gets the value of the refundReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * Sets the value of the refundReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundReason(String value) {
        this.refundReason = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     */
    public long getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     */
    public void setItemId(long value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the toUserId property.
     * 
     */
    public long getToUserId() {
        return toUserId;
    }

    /**
     * Sets the value of the toUserId property.
     * 
     */
    public void setToUserId(long value) {
        this.toUserId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(float value) {
        this.amount = value;
    }

    /**
     * Gets the value of the paidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidDate() {
        return paidDate;
    }

    /**
     * Sets the value of the paidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidDate(String value) {
        this.paidDate = value;
    }

}
