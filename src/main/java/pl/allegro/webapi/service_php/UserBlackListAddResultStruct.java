
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserBlackListAddResultStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserBlackListAddResultStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="addToBlackListResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="addToBlackListErrCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="addToBlackListErrMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserBlackListAddResultStruct", propOrder = {

})
public class UserBlackListAddResultStruct {

    protected int userId;
    protected int addToBlackListResult;
    @XmlElement(required = true)
    protected String addToBlackListErrCode;
    @XmlElement(required = true)
    protected String addToBlackListErrMsg;

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Gets the value of the addToBlackListResult property.
     * 
     */
    public int getAddToBlackListResult() {
        return addToBlackListResult;
    }

    /**
     * Sets the value of the addToBlackListResult property.
     * 
     */
    public void setAddToBlackListResult(int value) {
        this.addToBlackListResult = value;
    }

    /**
     * Gets the value of the addToBlackListErrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddToBlackListErrCode() {
        return addToBlackListErrCode;
    }

    /**
     * Sets the value of the addToBlackListErrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddToBlackListErrCode(String value) {
        this.addToBlackListErrCode = value;
    }

    /**
     * Gets the value of the addToBlackListErrMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddToBlackListErrMsg() {
        return addToBlackListErrMsg;
    }

    /**
     * Sets the value of the addToBlackListErrMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddToBlackListErrMsg(String value) {
        this.addToBlackListErrMsg = value;
    }

}
