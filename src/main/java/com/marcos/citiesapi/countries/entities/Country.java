package com.marcos.citiesapi.countries.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country {
  
  @Id
  private Long id;
  
  @Column(name = "nome")  
  private String name;
  
  @Column(name = "nome_pt")
  private String portuguesName;
 
  @Column(name = "sigla")
  private String code;
  
  private Integer bacen;

  public Country(){

  }

  public Country(Long id, String name, String portuguesName, String code, Integer bacen) {
    this.id = id;
    this.name = name;
    this.portuguesName = portuguesName;
    this.code = code;
    this.bacen = bacen;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPortuguesName() {
    return portuguesName;
  }

  public void setPortuguesName(String portuguesName) {
    this.portuguesName = portuguesName;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Integer getBacen() {
    return bacen;
  }

  public void setBacen(Integer bacen) {
    this.bacen = bacen;
  }
  
  


}
