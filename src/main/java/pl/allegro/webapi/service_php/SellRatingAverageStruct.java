
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellRatingAverageStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellRatingAverageStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="sellRatingGroupTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sellRatingGroupAverage" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellRatingAverageStruct", propOrder = {

})
public class SellRatingAverageStruct {

    @XmlElement(required = true)
    protected String sellRatingGroupTitle;
    protected float sellRatingGroupAverage;

    /**
     * Gets the value of the sellRatingGroupTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellRatingGroupTitle() {
        return sellRatingGroupTitle;
    }

    /**
     * Sets the value of the sellRatingGroupTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellRatingGroupTitle(String value) {
        this.sellRatingGroupTitle = value;
    }

    /**
     * Gets the value of the sellRatingGroupAverage property.
     * 
     */
    public float getSellRatingGroupAverage() {
        return sellRatingGroupAverage;
    }

    /**
     * Sets the value of the sellRatingGroupAverage property.
     * 
     */
    public void setSellRatingGroupAverage(float value) {
        this.sellRatingGroupAverage = value;
    }

}
