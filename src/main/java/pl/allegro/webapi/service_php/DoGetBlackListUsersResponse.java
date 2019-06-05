
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
 *         &lt;element name="blackListUsers" type="{https://webapi.allegro.pl/service.php}ArrayOfBlackliststruct" minOccurs="0"/&gt;
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
    "blackListUsers"
})
@XmlRootElement(name = "doGetBlackListUsersResponse")
public class DoGetBlackListUsersResponse {

    protected ArrayOfBlackliststruct blackListUsers;

    /**
     * Gets the value of the blackListUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBlackliststruct }
     *     
     */
    public ArrayOfBlackliststruct getBlackListUsers() {
        return blackListUsers;
    }

    /**
     * Sets the value of the blackListUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBlackliststruct }
     *     
     */
    public void setBlackListUsers(ArrayOfBlackliststruct value) {
        this.blackListUsers = value;
    }

}
