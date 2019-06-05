
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
 *         &lt;element name="itemPrice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="itemPriceDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="itemIsAllegroStandard" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "itemPrice",
    "itemPriceDesc",
    "itemIsAllegroStandard"
})
@XmlRootElement(name = "doCheckNewAuctionExtResponse")
public class DoCheckNewAuctionExtResponse {

    @XmlElement(required = true)
    protected String itemPrice;
    @XmlElement(required = true)
    protected String itemPriceDesc;
    protected int itemIsAllegroStandard;

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPrice(String value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the itemPriceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPriceDesc() {
        return itemPriceDesc;
    }

    /**
     * Sets the value of the itemPriceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPriceDesc(String value) {
        this.itemPriceDesc = value;
    }

    /**
     * Gets the value of the itemIsAllegroStandard property.
     * 
     */
    public int getItemIsAllegroStandard() {
        return itemIsAllegroStandard;
    }

    /**
     * Sets the value of the itemIsAllegroStandard property.
     * 
     */
    public void setItemIsAllegroStandard(int value) {
        this.itemIsAllegroStandard = value;
    }

}
