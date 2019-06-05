
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayoutAutoSettingsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayoutAutoSettingsStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="payoutAutoAmount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="payoutAutoFrequency" type="{https://webapi.allegro.pl/service.php}PayoutAutoFrequencyStruct"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayoutAutoSettingsStruct", propOrder = {

})
public class PayoutAutoSettingsStruct {

    protected float payoutAutoAmount;
    @XmlElement(required = true)
    protected PayoutAutoFrequencyStruct payoutAutoFrequency;

    /**
     * Gets the value of the payoutAutoAmount property.
     * 
     */
    public float getPayoutAutoAmount() {
        return payoutAutoAmount;
    }

    /**
     * Sets the value of the payoutAutoAmount property.
     * 
     */
    public void setPayoutAutoAmount(float value) {
        this.payoutAutoAmount = value;
    }

    /**
     * Gets the value of the payoutAutoFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutAutoFrequencyStruct }
     *     
     */
    public PayoutAutoFrequencyStruct getPayoutAutoFrequency() {
        return payoutAutoFrequency;
    }

    /**
     * Sets the value of the payoutAutoFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutAutoFrequencyStruct }
     *     
     */
    public void setPayoutAutoFrequency(PayoutAutoFrequencyStruct value) {
        this.payoutAutoFrequency = value;
    }

}
