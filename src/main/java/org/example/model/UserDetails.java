package org.example.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
@Builder
@Entity
@Table(name = "user_data", schema = "customSchema")
public class UserDetails implements Serializable {

    @Id
    private Long id;

    private String userFirstName;

    private String userEmail;

    private String userLastName;

    private String userPassword;
}
