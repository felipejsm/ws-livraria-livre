//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.04.10 às 08:42:53 PM BRT 
//


package br.com.livre.livraria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autor" type="{http://www.livre.com.br/livraria}autor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "autor"
})
@XmlRootElement(name = "getDadosAutorResponse")
public class GetDadosAutorResponse {

    @XmlElement(required = true)
    protected Autor autor;

    /**
     * Obtém o valor da propriedade autor.
     * 
     * @return
     *     possible object is
     *     {@link Autor }
     *     
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * Define o valor da propriedade autor.
     * 
     * @param value
     *     allowed object is
     *     {@link Autor }
     *     
     */
    public void setAutor(Autor value) {
        this.autor = value;
    }

}
