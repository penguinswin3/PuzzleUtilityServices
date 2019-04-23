
package Sudoku.Server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkBoardResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkBoardResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkBoardOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkBoardResponse", propOrder = {
    "checkBoardOut"
})
public class CheckBoardResponse {

    @XmlElement(namespace = "Sudoku")
    protected String checkBoardOut;

    /**
     * Gets the value of the checkBoardOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckBoardOut() {
        return checkBoardOut;
    }

    /**
     * Sets the value of the checkBoardOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckBoardOut(String value) {
        this.checkBoardOut = value;
    }

}
