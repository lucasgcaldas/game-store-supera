package br.com.supera.gamestore.entities;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "tb_product")
public class Product {

   @Id
   @GeneratedValue
   public Long id;
   public String name;
   public BigDecimal price;
   public Integer score;
   public String image;

   @Deprecated // only JPA will use
   public Product(){
   }

   public Product(Long id,String name, BigDecimal price, Integer score, String image) {
      this.id = id;
      this.name = name;
      this.price = price;
      this.score = score;
      this.image = image;
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

   public BigDecimal getPrice() {
      return price;
   }

   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   public Integer getScore() {
      return score;
   }

   public void setScore(Integer score) {
      this.score = score;
   }

   public String getImage() {
      return image;
   }

   public void setImage(String image) {
      this.image = image;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Product product = (Product) o;
      return Objects.equals(id, product.id);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id);
   }
}