
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
 *         &lt;element name="payTransPayout" type="{https://webapi.allegro.pl/service.php}ArrayOfUserpayoutstruct" minOccurs="0"/&gt;
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
    "payTransPayout"
})
@XmlRootElement(name = "doGetMyPayoutsResponse")
public class DoGetMyPayoutsResponse {

    protected ArrayOfUserpayoutstruct payTransPayout;

    /**
     * Gets the value of the payTransPayout property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserpayoutstruct }
     *     
     */
    public ArrayOfUserpayoutstruct getPayTransPayout() {
        return payTransPayout;
    }

    /**
     * Sets the value of the payTransPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserpayoutstruct }
     *     
     */
    public void setPayTransPayout(ArrayOfUserpayoutstruct value) {
        this.payTransPayout = value;
    }

}
