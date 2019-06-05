
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
 *         &lt;element name="userBlackListResultsArr" type="{https://webapi.allegro.pl/service.php}ArrayOfUserblacklistaddresultstruct" minOccurs="0"/&gt;
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
    "userBlackListResultsArr"
})
@XmlRootElement(name = "doAddToBlackListResponse")
public class DoAddToBlackListResponse {

    protected ArrayOfUserblacklistaddresultstruct userBlackListResultsArr;

    /**
     * Gets the value of the userBlackListResultsArr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserblacklistaddresultstruct }
     *     
     */
    public ArrayOfUserblacklistaddresultstruct getUserBlackListResultsArr() {
        return userBlackListResultsArr;
    }

    /**
     * Sets the value of the userBlackListResultsArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserblacklistaddresultstruct }
     *     
     */
    public void setUserBlackListResultsArr(ArrayOfUserblacklistaddresultstruct value) {
        this.userBlackListResultsArr = value;
    }

}
