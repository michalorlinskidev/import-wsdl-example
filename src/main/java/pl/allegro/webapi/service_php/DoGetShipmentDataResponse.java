
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="shipmentDataList" type="{https://webapi.allegro.pl/service.php}ArrayOfShipmentdatastruct" minOccurs="0"/&gt;
 *         &lt;element name="localVersion" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "shipmentDataList",
    "localVersion"
})
@XmlRootElement(name = "doGetShipmentDataResponse")
public class DoGetShipmentDataResponse {

    protected ArrayOfShipmentdatastruct shipmentDataList;
    protected long localVersion;

    /**
     * Gets the value of the shipmentDataList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShipmentdatastruct }
     *     
     */
    public ArrayOfShipmentdatastruct getShipmentDataList() {
        return shipmentDataList;
    }

    /**
     * Sets the value of the shipmentDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShipmentdatastruct }
     *     
     */
    public void setShipmentDataList(ArrayOfShipmentdatastruct value) {
        this.shipmentDataList = value;
    }

    /**
     * Gets the value of the localVersion property.
     * 
     */
    public long getLocalVersion() {
        return localVersion;
    }

    /**
     * Sets the value of the localVersion property.
     * 
     */
    public void setLocalVersion(long value) {
        this.localVersion = value;
    }

}
