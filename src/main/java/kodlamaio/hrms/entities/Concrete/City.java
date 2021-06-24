package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="city")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class City {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="city_id")
  private int id;
  
  @Column(name="city_name")
  private String name;
  
  @JsonIgnore
  @OneToMany(mappedBy = "city")
  private List<JobAdvertisement> jobAdvertisement;
  
  
  
  
  
  
}