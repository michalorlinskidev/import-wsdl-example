
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostBuyFormPackageInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostBuyFormPackageInfoStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="packageIdsAdded" type="{https://webapi.allegro.pl/service.php}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="packageIdsNotAddedIncorrectOperatorId" type="{https://webapi.allegro.pl/service.php}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="packageIdsNotAddedIncorrectPackageId" type="{https://webapi.allegro.pl/service.php}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostBuyFormPackageInfoStruct", propOrder = {

})
public class PostBuyFormPackageInfoStruct {

    protected ArrayOfString packageIdsAdded;
    protected ArrayOfString packageIdsNotAddedIncorrectOperatorId;
    protected ArrayOfString packageIdsNotAddedIncorrectPackageId;

    /**
     * Gets the value of the packageIdsAdded property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPackageIdsAdded() {
        return packageIdsAdded;
    }

    /**
     * Sets the value of the packageIdsAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPackageIdsAdded(ArrayOfString value) {
        this.packageIdsAdded = value;
    }

    /**
     * Gets the value of the packageIdsNotAddedIncorrectOperatorId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPackageIdsNotAddedIncorrectOperatorId() {
        return packageIdsNotAddedIncorrectOperatorId;
    }

    /**
     * Sets the value of the packageIdsNotAddedIncorrectOperatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPackageIdsNotAddedIncorrectOperatorId(ArrayOfString value) {
        this.packageIdsNotAddedIncorrectOperatorId = value;
    }

    /**
     * Gets the value of the packageIdsNotAddedIncorrectPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPackageIdsNotAddedIncorrectPackageId() {
        return packageIdsNotAddedIncorrectPackageId;
    }

    /**
     * Sets the value of the packageIdsNotAddedIncorrectPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPackageIdsNotAddedIncorrectPackageId(ArrayOfString value) {
        this.packageIdsNotAddedIncorrectPackageId = value;
    }

}
