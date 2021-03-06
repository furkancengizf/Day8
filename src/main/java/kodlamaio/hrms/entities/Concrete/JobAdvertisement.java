package kodlamaio.hrms.entities.concretes;


import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="job_advertisement")
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisement{
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="job_advertisement_id")
  private int id;
  @Column(name="job_description")
  private String jobDescription;
  @Column(name="min_salary")
  private int minSalary;
  @Column(name="max_salary")
  private int maxSalary;
  @Column(name="number_of_position")
  private int numberOfPosition;
  @Column(name="application_date")
  private LocalDate applicationDate;
  @Column(name="created_at")
  private LocalDate createdAt;
  @Column(name="enable")
  private boolean enable;
  
  @ManyToOne
  @JoinColumn(name="city_id")
  private City City;
  @ManyToOne
  @JoinColumn(name="employer_id")
  private Employer Employer;
  @ManyToOne
  @JoinColumn(name="job_position_id")
  private JobPosition JobPosition;
  
  
  
  
  
}