
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
 *         &lt;element name="mailToUserReceiverId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="mailToUserResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "mailToUserReceiverId",
    "mailToUserResult"
})
@XmlRootElement(name = "doSendEmailToUserResponse")
public class DoSendEmailToUserResponse {

    protected long mailToUserReceiverId;
    @XmlElement(required = true)
    protected String mailToUserResult;

    /**
     * Gets the value of the mailToUserReceiverId property.
     * 
     */
    public long getMailToUserReceiverId() {
        return mailToUserReceiverId;
    }

    /**
     * Sets the value of the mailToUserReceiverId property.
     * 
     */
    public void setMailToUserReceiverId(long value) {
        this.mailToUserReceiverId = value;
    }

    /**
     * Gets the value of the mailToUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailToUserResult() {
        return mailToUserResult;
    }

    /**
     * Sets the value of the mailToUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailToUserResult(String value) {
        this.mailToUserResult = value;
    }

}
