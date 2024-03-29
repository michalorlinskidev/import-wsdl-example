
package pl.allegro.webapi.service_php;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="catId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="catParent" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="catCountry" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="catLevel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="catIsLeaf" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="catName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="catOptions" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryData", propOrder = {

})
public class CategoryData {

    protected int catId;
    protected int catParent;
    protected int catCountry;
    protected int catLevel;
    protected int catIsLeaf;
    @XmlElement(required = true)
    protected String catName;
    protected int catOptions;

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
     * Gets the value of the catCountry property.
     * 
     */
    public int getCatCountry() {
        return catCountry;
    }

    /**
     * Sets the value of the catCountry property.
     * 
     */
    public void setCatCountry(int value) {
        this.catCountry = value;
    }

    /**
     * Gets the value of the catLevel property.
     * 
     */
    public int getCatLevel() {
        return catLevel;
    }

    /**
     * Sets the value of the catLevel property.
     * 
     */
    public void setCatLevel(int value) {
        this.catLevel = value;
    }

    /**
     * Gets the value of the catIsLeaf property.
     * 
     */
    public int getCatIsLeaf() {
        return catIsLeaf;
    }

    /**
     * Sets the value of the catIsLeaf property.
     * 
     */
    public void setCatIsLeaf(int value) {
        this.catIsLeaf = value;
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
     * Gets the value of the catOptions property.
     * 
     */
    public int getCatOptions() {
        return catOptions;
    }

    /**
     * Sets the value of the catOptions property.
     * 
     */
    public void setCatOptions(int value) {
        this.catOptions = value;
    }

}
