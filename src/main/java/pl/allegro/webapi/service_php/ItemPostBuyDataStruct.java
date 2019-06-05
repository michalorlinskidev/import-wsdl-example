
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemPostBuyDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemPostBuyDataStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="usersPostBuyData" type="{https://webapi.allegro.pl/service.php}ArrayOfUserpostbuydatastruct" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPostBuyDataStruct", propOrder = {

})
public class ItemPostBuyDataStruct {

    protected long itemId;
    protected ArrayOfUserpostbuydatastruct usersPostBuyData;

    /**
     * Gets the value of the itemId property.
     * 
     */
    public long getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     */
    public void setItemId(long value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the usersPostBuyData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserpostbuydatastruct }
     *     
     */
    public ArrayOfUserpostbuydatastruct getUsersPostBuyData() {
        return usersPostBuyData;
    }

    /**
     * Sets the value of the usersPostBuyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserpostbuydatastruct }
     *     
     */
    public void setUsersPostBuyData(ArrayOfUserpostbuydatastruct value) {
        this.usersPostBuyData = value;
    }

}
