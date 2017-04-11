//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.04.10 às 08:42:53 PM BRT 
//


package br.com.livre.livraria;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.livre.livraria package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.livre.livraria
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDadosAutorRequest }
     * 
     */
    public GetDadosAutorRequest createGetDadosAutorRequest() {
        return new GetDadosAutorRequest();
    }

    /**
     * Create an instance of {@link GetDadosAutorResponse }
     * 
     */
    public GetDadosAutorResponse createGetDadosAutorResponse() {
        return new GetDadosAutorResponse();
    }

    /**
     * Create an instance of {@link Autor }
     * 
     */
    public Autor createAutor() {
        return new Autor();
    }

    /**
     * Create an instance of {@link GetDadosLivroRequest }
     * 
     */
    public GetDadosLivroRequest createGetDadosLivroRequest() {
        return new GetDadosLivroRequest();
    }

    /**
     * Create an instance of {@link GetDadosLivroResponse }
     * 
     */
    public GetDadosLivroResponse createGetDadosLivroResponse() {
        return new GetDadosLivroResponse();
    }

    /**
     * Create an instance of {@link Livro }
     * 
     */
    public Livro createLivro() {
        return new Livro();
    }

}
