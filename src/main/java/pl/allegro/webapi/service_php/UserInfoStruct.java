
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserInfoStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userLogin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userRating" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userIcons" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userCountry" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInfoStruct", propOrder = {

})
public class UserInfoStruct {

    protected int userId;
    @XmlElement(required = true)
    protected String userLogin;
    protected int userRating;
    protected int userIcons;
    protected int userCountry;

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
     * Gets the value of the userLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLogin() {
        return userLogin;
    }

    /**
     * Sets the value of the userLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLogin(String value) {
        this.userLogin = value;
    }

    /**
     * Gets the value of the userRating property.
     * 
     */
    public int getUserRating() {
        return userRating;
    }

    /**
     * Sets the value of the userRating property.
     * 
     */
    public void setUserRating(int value) {
        this.userRating = value;
    }

    /**
     * Gets the value of the userIcons property.
     * 
     */
    public int getUserIcons() {
        return userIcons;
    }

    /**
     * Sets the value of the userIcons property.
     * 
     */
    public void setUserIcons(int value) {
        this.userIcons = value;
    }

    /**
     * Gets the value of the userCountry property.
     * 
     */
    public int getUserCountry() {
        return userCountry;
    }

    /**
     * Sets the value of the userCountry property.
     * 
     */
    public void setUserCountry(int value) {
        this.userCountry = value;
    }

}
