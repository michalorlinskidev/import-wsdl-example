
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
 *         &lt;element name="biditemList" type="{https://webapi.allegro.pl/service.php}ArrayOfBidliststruct2" minOccurs="0"/&gt;
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
    "biditemList"
})
@XmlRootElement(name = "doGetBidItem2Response")
public class DoGetBidItem2Response {

    protected ArrayOfBidliststruct2 biditemList;

    /**
     * Gets the value of the biditemList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBidliststruct2 }
     *     
     */
    public ArrayOfBidliststruct2 getBiditemList() {
        return biditemList;
    }

    /**
     * Sets the value of the biditemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBidliststruct2 }
     *     
     */
    public void setBiditemList(ArrayOfBidliststruct2 value) {
        this.biditemList = value;
    }

}
