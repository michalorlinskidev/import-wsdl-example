
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeFloatValueStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeFloatValueStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="fvalueRangeFloatMin" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="fvalueRangeFloatMax" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeFloatValueStruct", propOrder = {

})
public class RangeFloatValueStruct {

    protected Float fvalueRangeFloatMin;
    protected Float fvalueRangeFloatMax;

    /**
     * Gets the value of the fvalueRangeFloatMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFvalueRangeFloatMin() {
        return fvalueRangeFloatMin;
    }

    /**
     * Sets the value of the fvalueRangeFloatMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFvalueRangeFloatMin(Float value) {
        this.fvalueRangeFloatMin = value;
    }

    /**
     * Gets the value of the fvalueRangeFloatMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFvalueRangeFloatMax() {
        return fvalueRangeFloatMax;
    }

    /**
     * Sets the value of the fvalueRangeFloatMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFvalueRangeFloatMax(Float value) {
        this.fvalueRangeFloatMax = value;
    }

}
