package com.poc.liquibasedemo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sample", schema = "ats")
public class Sample {
  @Id
  @GeneratedValue
  private Long sampleId;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "emp_id")
  @JsonBackReference
  private Employee emp;
}
