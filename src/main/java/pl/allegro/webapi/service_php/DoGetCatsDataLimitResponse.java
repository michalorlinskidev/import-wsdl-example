
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
 *         &lt;element name="catsList" type="{https://webapi.allegro.pl/service.php}ArrayOfCatinfotype" minOccurs="0"/&gt;
 *         &lt;element name="verKey" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="verStr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "catsList",
    "verKey",
    "verStr"
})
@XmlRootElement(name = "doGetCatsDataLimitResponse")
public class DoGetCatsDataLimitResponse {

    protected ArrayOfCatinfotype catsList;
    protected long verKey;
    @XmlElement(required = true)
    protected String verStr;

    /**
     * Gets the value of the catsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCatinfotype }
     *     
     */
    public ArrayOfCatinfotype getCatsList() {
        return catsList;
    }

    /**
     * Sets the value of the catsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCatinfotype }
     *     
     */
    public void setCatsList(ArrayOfCatinfotype value) {
        this.catsList = value;
    }

    /**
     * Gets the value of the verKey property.
     * 
     */
    public long getVerKey() {
        return verKey;
    }

    /**
     * Sets the value of the verKey property.
     * 
     */
    public void setVerKey(long value) {
        this.verKey = value;
    }

    /**
     * Gets the value of the verStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerStr() {
        return verStr;
    }

    /**
     * Sets the value of the verStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerStr(String value) {
        this.verStr = value;
    }

}
