
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
 *         &lt;element name="siteJournalInfo" type="{https://webapi.allegro.pl/service.php}SiteJournalInfo"/&gt;
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
    "siteJournalInfo"
})
@XmlRootElement(name = "doGetSiteJournalInfoResponse")
public class DoGetSiteJournalInfoResponse {

    @XmlElement(required = true)
    protected SiteJournalInfo siteJournalInfo;

    /**
     * Gets the value of the siteJournalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SiteJournalInfo }
     *     
     */
    public SiteJournalInfo getSiteJournalInfo() {
        return siteJournalInfo;
    }

    /**
     * Sets the value of the siteJournalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteJournalInfo }
     *     
     */
    public void setSiteJournalInfo(SiteJournalInfo value) {
        this.siteJournalInfo = value;
    }

}
