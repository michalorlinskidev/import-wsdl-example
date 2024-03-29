
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="catId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="catName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="catParent" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="catPosition" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="catIsProductCatalogueEnabled" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="catIsLeaf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatInfoType", propOrder = {

})
public class CatInfoType {

    protected int catId;
    @XmlElement(required = true)
    protected String catName;
    protected int catParent;
    protected int catPosition;
    protected int catIsProductCatalogueEnabled;
    protected Boolean catIsLeaf;

    /**
     * Gets the value of the catId property.
     * 
     */
    public int getCatId() {
        return catId;
    }

    /**
     * Sets the value of the catId property.
     * 
     */
    public void setCatId(int value) {
        this.catId = value;
    }

    /**
     * Gets the value of the catName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatName() {
        return catName;
    }

    /**
     * Sets the value of the catName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatName(String value) {
        this.catName = value;
    }

    /**
     * Gets the value of the catParent property.
     * 
     */
    public int getCatParent() {
        return catParent;
    }

    /**
     * Sets the value of the catParent property.
     * 
     */
    public void setCatParent(int value) {
        this.catParent = value;
    }

    /**
     * Gets the value of the catPosition property.
     * 
     */
    public int getCatPosition() {
        return catPosition;
    }

    /**
     * Sets the value of the catPosition property.
     * 
     */
    public void setCatPosition(int value) {
        this.catPosition = value;
    }

    /**
     * Gets the value of the catIsProductCatalogueEnabled property.
     * 
     */
    public int getCatIsProductCatalogueEnabled() {
        return catIsProductCatalogueEnabled;
    }

    /**
     * Sets the value of the catIsProductCatalogueEnabled property.
     * 
     */
    public void setCatIsProductCatalogueEnabled(int value) {
        this.catIsProductCatalogueEnabled = value;
    }

    /**
     * Gets the value of the catIsLeaf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCatIsLeaf() {
        return catIsLeaf;
    }

    /**
     * Sets the value of the catIsLeaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCatIsLeaf(Boolean value) {
        this.catIsLeaf = value;
    }

}
