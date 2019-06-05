
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserPostBuyDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserPostBuyDataStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="userData" type="{https://webapi.allegro.pl/service.php}UserDataStruct"/&gt;
 *         &lt;element name="userSentToData" type="{https://webapi.allegro.pl/service.php}UserSentToDataStruct"/&gt;
 *         &lt;element name="userBankAccounts" type="{https://webapi.allegro.pl/service.php}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="companySecondAddress" type="{https://webapi.allegro.pl/service.php}CompanySecondAddressStruct"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPostBuyDataStruct", propOrder = {

})
public class UserPostBuyDataStruct {

    @XmlElement(required = true)
    protected UserDataStruct userData;
    @XmlElement(required = true)
    protected UserSentToDataStruct userSentToData;
    protected ArrayOfString userBankAccounts;
    @XmlElement(required = true)
    protected CompanySecondAddressStruct companySecondAddress;

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link UserDataStruct }
     *     
     */
    public UserDataStruct getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDataStruct }
     *     
     */
    public void setUserData(UserDataStruct value) {
        this.userData = value;
    }

    /**
     * Gets the value of the userSentToData property.
     * 
     * @return
     *     possible object is
     *     {@link UserSentToDataStruct }
     *     
     */
    public UserSentToDataStruct getUserSentToData() {
        return userSentToData;
    }

    /**
     * Sets the value of the userSentToData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSentToDataStruct }
     *     
     */
    public void setUserSentToData(UserSentToDataStruct value) {
        this.userSentToData = value;
    }

    /**
     * Gets the value of the userBankAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getUserBankAccounts() {
        return userBankAccounts;
    }

    /**
     * Sets the value of the userBankAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setUserBankAccounts(ArrayOfString value) {
        this.userBankAccounts = value;
    }

    /**
     * Gets the value of the companySecondAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CompanySecondAddressStruct }
     *     
     */
    public CompanySecondAddressStruct getCompanySecondAddress() {
        return companySecondAddress;
    }

    /**
     * Sets the value of the companySecondAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanySecondAddressStruct }
     *     
     */
    public void setCompanySecondAddress(CompanySecondAddressStruct value) {
        this.companySecondAddress = value;
    }

}
