
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
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="getDesc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="getImageUrl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="getAttribs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="getPostageOptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="getCompanyInfo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="getProductInfo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="getAfterSalesServiceConditions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="getEan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="getAdditionalServicesGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "itemId",
    "getDesc",
    "getImageUrl",
    "getAttribs",
    "getPostageOptions",
    "getCompanyInfo",
    "getProductInfo",
    "getAfterSalesServiceConditions",
    "getEan",
    "getAdditionalServicesGroup"
})
@XmlRootElement(name = "DoShowItemInfoExtRequest")
public class DoShowItemInfoExtRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected long itemId;
    protected Integer getDesc;
    protected Integer getImageUrl;
    protected Integer getAttribs;
    protected Integer getPostageOptions;
    protected Integer getCompanyInfo;
    protected Integer getProductInfo;
    protected Integer getAfterSalesServiceConditions;
    protected Integer getEan;
    protected Integer getAdditionalServicesGroup;

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
     * Gets the value of the getDesc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetDesc() {
        return getDesc;
    }

    /**
     * Sets the value of the getDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetDesc(Integer value) {
        this.getDesc = value;
    }

    /**
     * Gets the value of the getImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetImageUrl() {
        return getImageUrl;
    }

    /**
     * Sets the value of the getImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetImageUrl(Integer value) {
        this.getImageUrl = value;
    }

    /**
     * Gets the value of the getAttribs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetAttribs() {
        return getAttribs;
    }

    /**
     * Sets the value of the getAttribs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetAttribs(Integer value) {
        this.getAttribs = value;
    }

    /**
     * Gets the value of the getPostageOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetPostageOptions() {
        return getPostageOptions;
    }

    /**
     * Sets the value of the getPostageOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetPostageOptions(Integer value) {
        this.getPostageOptions = value;
    }

    /**
     * Gets the value of the getCompanyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetCompanyInfo() {
        return getCompanyInfo;
    }

    /**
     * Sets the value of the getCompanyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetCompanyInfo(Integer value) {
        this.getCompanyInfo = value;
    }

    /**
     * Gets the value of the getProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetProductInfo() {
        return getProductInfo;
    }

    /**
     * Sets the value of the getProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetProductInfo(Integer value) {
        this.getProductInfo = value;
    }

    /**
     * Gets the value of the getAfterSalesServiceConditions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetAfterSalesServiceConditions() {
        return getAfterSalesServiceConditions;
    }

    /**
     * Sets the value of the getAfterSalesServiceConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetAfterSalesServiceConditions(Integer value) {
        this.getAfterSalesServiceConditions = value;
    }

    /**
     * Gets the value of the getEan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetEan() {
        return getEan;
    }

    /**
     * Sets the value of the getEan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetEan(Integer value) {
        this.getEan = value;
    }

    /**
     * Gets the value of the getAdditionalServicesGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetAdditionalServicesGroup() {
        return getAdditionalServicesGroup;
    }

    /**
     * Sets the value of the getAdditionalServicesGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetAdditionalServicesGroup(Integer value) {
        this.getAdditionalServicesGroup = value;
    }

}
