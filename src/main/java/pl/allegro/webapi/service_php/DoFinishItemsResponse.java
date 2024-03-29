
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
 *         &lt;element name="finishItemsSucceed" type="{https://webapi.allegro.pl/service.php}ArrayOfLong" minOccurs="0"/&gt;
 *         &lt;element name="finishItemsFailed" type="{https://webapi.allegro.pl/service.php}ArrayOfFinishfailurestruct" minOccurs="0"/&gt;
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
    "finishItemsSucceed",
    "finishItemsFailed"
})
@XmlRootElement(name = "doFinishItemsResponse")
public class DoFinishItemsResponse {

    protected ArrayOfLong finishItemsSucceed;
    protected ArrayOfFinishfailurestruct finishItemsFailed;

    /**
     * Gets the value of the finishItemsSucceed property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getFinishItemsSucceed() {
        return finishItemsSucceed;
    }

    /**
     * Sets the value of the finishItemsSucceed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setFinishItemsSucceed(ArrayOfLong value) {
        this.finishItemsSucceed = value;
    }

    /**
     * Gets the value of the finishItemsFailed property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFinishfailurestruct }
     *     
     */
    public ArrayOfFinishfailurestruct getFinishItemsFailed() {
        return finishItemsFailed;
    }

    /**
     * Sets the value of the finishItemsFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFinishfailurestruct }
     *     
     */
    public void setFinishItemsFailed(ArrayOfFinishfailurestruct value) {
        this.finishItemsFailed = value;
    }

}
