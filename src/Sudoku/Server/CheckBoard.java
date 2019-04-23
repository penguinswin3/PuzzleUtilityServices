
package Sudoku.Server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkBoard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkBoard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkBoardInput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkBoard", propOrder = {
    "checkBoardInput"
})
public class CheckBoard {

    @XmlElement(namespace = "Sudoku")
    protected String checkBoardInput;

    /**
     * Gets the value of the checkBoardInput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckBoardInput() {
        return checkBoardInput;
    }

    /**
     * Sets the value of the checkBoardInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckBoardInput(String value) {
        this.checkBoardInput = value;
    }

}
