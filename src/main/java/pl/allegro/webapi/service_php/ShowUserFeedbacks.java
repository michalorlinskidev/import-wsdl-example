
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShowUserFeedbacks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShowUserFeedbacks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="userFLastWeek" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userFLastMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userFAll" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userFSoldItems" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userFBuyItems" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShowUserFeedbacks", propOrder = {

})
public class ShowUserFeedbacks {

    protected int userFLastWeek;
    protected int userFLastMonth;
    protected int userFAll;
    protected int userFSoldItems;
    protected int userFBuyItems;

    /**
     * Gets the value of the userFLastWeek property.
     * 
     */
    public int getUserFLastWeek() {
        return userFLastWeek;
    }

    /**
     * Sets the value of the userFLastWeek property.
     * 
     */
    public void setUserFLastWeek(int value) {
        this.userFLastWeek = value;
    }

    /**
     * Gets the value of the userFLastMonth property.
     * 
     */
    public int getUserFLastMonth() {
        return userFLastMonth;
    }

    /**
     * Sets the value of the userFLastMonth property.
     * 
     */
    public void setUserFLastMonth(int value) {
        this.userFLastMonth = value;
    }

    /**
     * Gets the value of the userFAll property.
     * 
     */
    public int getUserFAll() {
        return userFAll;
    }

    /**
     * Sets the value of the userFAll property.
     * 
     */
    public void setUserFAll(int value) {
        this.userFAll = value;
    }

    /**
     * Gets the value of the userFSoldItems property.
     * 
     */
    public int getUserFSoldItems() {
        return userFSoldItems;
    }

    /**
     * Sets the value of the userFSoldItems property.
     * 
     */
    public void setUserFSoldItems(int value) {
        this.userFSoldItems = value;
    }

    /**
     * Gets the value of the userFBuyItems property.
     * 
     */
    public int getUserFBuyItems() {
        return userFBuyItems;
    }

    /**
     * Sets the value of the userFBuyItems property.
     * 
     */
    public void setUserFBuyItems(int value) {
        this.userFBuyItems = value;
    }

}
