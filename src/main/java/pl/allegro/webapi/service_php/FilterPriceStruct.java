
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterPriceStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterPriceStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="filterPriceFrom" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="filterPriceTo" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterPriceStruct", propOrder = {

})
public class FilterPriceStruct {

    protected Float filterPriceFrom;
    protected Float filterPriceTo;

    /**
     * Gets the value of the filterPriceFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFilterPriceFrom() {
        return filterPriceFrom;
    }

    /**
     * Sets the value of the filterPriceFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFilterPriceFrom(Float value) {
        this.filterPriceFrom = value;
    }

    /**
     * Gets the value of the filterPriceTo property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFilterPriceTo() {
        return filterPriceTo;
    }

    /**
     * Sets the value of the filterPriceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFilterPriceTo(Float value) {
        this.filterPriceTo = value;
    }

}
