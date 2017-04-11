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
 *         &lt;element name="livro" type="{http://www.livre.com.br/livraria}livro"/>
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
    "livro"
})
@XmlRootElement(name = "getDadosLivroResponse")
public class GetDadosLivroResponse {

    @XmlElement(required = true)
    protected Livro livro;

    /**
     * Obtém o valor da propriedade livro.
     * 
     * @return
     *     possible object is
     *     {@link Livro }
     *     
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * Define o valor da propriedade livro.
     * 
     * @param value
     *     allowed object is
     *     {@link Livro }
     *     
     */
    public void setLivro(Livro value) {
        this.livro = value;
    }

}
