
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
 *         &lt;element name="myaccountList" type="{https://webapi.allegro.pl/service.php}ArrayOfMyaccountstruct2" minOccurs="0"/&gt;
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
    "myaccountList"
})
@XmlRootElement(name = "doMyAccount2Response")
public class DoMyAccount2Response {

    protected ArrayOfMyaccountstruct2 myaccountList;

    /**
     * Gets the value of the myaccountList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMyaccountstruct2 }
     *     
     */
    public ArrayOfMyaccountstruct2 getMyaccountList() {
        return myaccountList;
    }

    /**
     * Sets the value of the myaccountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMyaccountstruct2 }
     *     
     */
    public void setMyaccountList(ArrayOfMyaccountstruct2 value) {
        this.myaccountList = value;
    }

}
