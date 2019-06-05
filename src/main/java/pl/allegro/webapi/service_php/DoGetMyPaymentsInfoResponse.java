
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="paymentsInfo" type="{https://webapi.allegro.pl/service.php}PaymentsInfoStruct"/&gt;
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
    "paymentsInfo"
})
@XmlRootElement(name = "doGetMyPaymentsInfoResponse")
public class DoGetMyPaymentsInfoResponse {

    @XmlElement(required = true)
    protected PaymentsInfoStruct paymentsInfo;

    /**
     * Gets the value of the paymentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentsInfoStruct }
     *     
     */
    public PaymentsInfoStruct getPaymentsInfo() {
        return paymentsInfo;
    }

    /**
     * Sets the value of the paymentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentsInfoStruct }
     *     
     */
    public void setPaymentsInfo(PaymentsInfoStruct value) {
        this.paymentsInfo = value;
    }

}
