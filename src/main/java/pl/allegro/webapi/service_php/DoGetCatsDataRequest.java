
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
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="localVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="webapiKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="onlyLeaf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "countryId",
    "localVersion",
    "webapiKey",
    "onlyLeaf"
})
@XmlRootElement(name = "DoGetCatsDataRequest")
public class DoGetCatsDataRequest {

    protected int countryId;
    protected Long localVersion;
    @XmlElement(required = true)
    protected String webapiKey;
    protected Boolean onlyLeaf;

    /**
     * Gets the value of the countryId property.
     * 
     */
    public int getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    public void setCountryId(int value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the localVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocalVersion() {
        return localVersion;
    }

    /**
     * Sets the value of the localVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocalVersion(Long value) {
        this.localVersion = value;
    }

    /**
     * Gets the value of the webapiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebapiKey() {
        return webapiKey;
    }

    /**
     * Sets the value of the webapiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebapiKey(String value) {
        this.webapiKey = value;
    }

    /**
     * Gets the value of the onlyLeaf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyLeaf() {
        return onlyLeaf;
    }

    /**
     * Sets the value of the onlyLeaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyLeaf(Boolean value) {
        this.onlyLeaf = value;
    }

}
