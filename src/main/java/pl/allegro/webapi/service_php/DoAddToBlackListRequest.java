
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
 *         &lt;element name="sessionHandle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="usersBlackListArray" type="{https://webapi.allegro.pl/service.php}ArrayOfUserblackliststruct" minOccurs="0"/&gt;
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
    "sessionHandle",
    "usersBlackListArray"
})
@XmlRootElement(name = "DoAddToBlackListRequest")
public class DoAddToBlackListRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected ArrayOfUserblackliststruct usersBlackListArray;

    /**
     * Gets the value of the sessionHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionHandle() {
        return sessionHandle;
    }

    /**
     * Sets the value of the sessionHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionHandle(String value) {
        this.sessionHandle = value;
    }

    /**
     * Gets the value of the usersBlackListArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserblackliststruct }
     *     
     */
    public ArrayOfUserblackliststruct getUsersBlackListArray() {
        return usersBlackListArray;
    }

    /**
     * Sets the value of the usersBlackListArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserblackliststruct }
     *     
     */
    public void setUsersBlackListArray(ArrayOfUserblackliststruct value) {
        this.usersBlackListArray = value;
    }

}
