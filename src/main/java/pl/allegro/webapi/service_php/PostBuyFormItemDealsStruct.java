
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PostBuyFormItemDealsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostBuyFormItemDealsStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="dealId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dealFinalPrice" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="dealQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dealDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="dealWasDiscounted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dealVariant" type="{https://webapi.allegro.pl/service.php}PostBuyFormItemDealsVariantStruct" minOccurs="0"/&gt;
 *         &lt;element name="dealAdditionalServices" type="{https://webapi.allegro.pl/service.php}ArrayOfPostbuyformitemdealsadditionalservicestruct" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostBuyFormItemDealsStruct", propOrder = {

})
public class PostBuyFormItemDealsStruct {

    protected long dealId;
    protected float dealFinalPrice;
    protected int dealQuantity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dealDate;
    protected boolean dealWasDiscounted;
    protected PostBuyFormItemDealsVariantStruct dealVariant;
    protected ArrayOfPostbuyformitemdealsadditionalservicestruct dealAdditionalServices;

    /**
     * Gets the value of the dealId property.
     * 
     */
    public long getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     * 
     */
    public void setDealId(long value) {
        this.dealId = value;
    }

    /**
     * Gets the value of the dealFinalPrice property.
     * 
     */
    public float getDealFinalPrice() {
        return dealFinalPrice;
    }

    /**
     * Sets the value of the dealFinalPrice property.
     * 
     */
    public void setDealFinalPrice(float value) {
        this.dealFinalPrice = value;
    }

    /**
     * Gets the value of the dealQuantity property.
     * 
     */
    public int getDealQuantity() {
        return dealQuantity;
    }

    /**
     * Sets the value of the dealQuantity property.
     * 
     */
    public void setDealQuantity(int value) {
        this.dealQuantity = value;
    }

    /**
     * Gets the value of the dealDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDealDate() {
        return dealDate;
    }

    /**
     * Sets the value of the dealDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDealDate(XMLGregorianCalendar value) {
        this.dealDate = value;
    }

    /**
     * Gets the value of the dealWasDiscounted property.
     * 
     */
    public boolean isDealWasDiscounted() {
        return dealWasDiscounted;
    }

    /**
     * Sets the value of the dealWasDiscounted property.
     * 
     */
    public void setDealWasDiscounted(boolean value) {
        this.dealWasDiscounted = value;
    }

    /**
     * Gets the value of the dealVariant property.
     * 
     * @return
     *     possible object is
     *     {@link PostBuyFormItemDealsVariantStruct }
     *     
     */
    public PostBuyFormItemDealsVariantStruct getDealVariant() {
        return dealVariant;
    }

    /**
     * Sets the value of the dealVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostBuyFormItemDealsVariantStruct }
     *     
     */
    public void setDealVariant(PostBuyFormItemDealsVariantStruct value) {
        this.dealVariant = value;
    }

    /**
     * Gets the value of the dealAdditionalServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostbuyformitemdealsadditionalservicestruct }
     *     
     */
    public ArrayOfPostbuyformitemdealsadditionalservicestruct getDealAdditionalServices() {
        return dealAdditionalServices;
    }

    /**
     * Sets the value of the dealAdditionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostbuyformitemdealsadditionalservicestruct }
     *     
     */
    public void setDealAdditionalServices(ArrayOfPostbuyformitemdealsadditionalservicestruct value) {
        this.dealAdditionalServices = value;
    }

}
